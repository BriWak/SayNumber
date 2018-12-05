
object SayNumber extends App {

  case class Negative(indicator: String, number: String)

  def speak(number: String): String = {

    val isNegative = handleNegative(number)

    val numberByThousands = isNegative.number.reverse.grouped(3).toList.map(_.reverse)

    val andOrNot = if (isNegative.number.length > 3 && isNegative.number.charAt(isNegative.number.length-3).toString == "0"){
      "and "
    } else {
      ""
    }

    val separators = List("", " Thousand ", " Million ", " Billion ", " Trillion ")

    val hundredsAsWords = numberByThousands.map(trebles)

    val filteredList = hundredsAsWords.zip(separators).reverse.filterNot(_._1 == "").flatMap(_.productIterator.toList)

    val withAnd = filteredList.patch(filteredList.length - 2,  List(andOrNot), 0)

    isNegative.indicator + withAnd.mkString("").replace("  "," ").trim
  }

  private def handleNegative(number: String): Negative = {
    if (number.startsWith("-")) {
      Negative("Minus ", number.tail)
    } else {
      Negative("", number)
    }
  }

  private def singles(number: String): String = number match {
      case "1" => "One"
      case "2" => "Two"
      case "3" => "Three"
      case "4" => "Four"
      case "5" => "Five"
      case "6" => "Six"
      case "7" => "Seven"
      case "8" => "Eight"
      case "9" => "Nine"
      case _   => ""
  }

  private def doubles(number: String): String = number match {
    case "10" => "Ten"
    case "11" => "Eleven"
    case "12" => "Twelve"
    case "13" => "Thirteen"
    case "14" => "Fourteen"
    case "15" => "Fifteen"
    case "16" => "Sixteen"
    case "17" => "Seventeen"
    case "18" => "Eighteen"
    case "19" => "Nineteen"
    case _ => number.head.toString match {
      case "0" => singles(number.last.toString)
      case "2" => "Twenty " + singles(number.last.toString)
      case "3" => "Thirty " + singles(number.last.toString)
      case "4" => "Forty " + singles(number.last.toString)
      case "5" => "Fifty " + singles(number.last.toString)
      case "6" => "Sixty " + singles(number.last.toString)
      case "7" => "Seventy " + singles(number.last.toString)
      case "8" => "Eighty " + singles(number.last.toString)
      case "9" => "Ninety " + singles(number.last.toString)
    }
  }

  private def trebles(number: String): String = number.length match {
    case 1 if number == "0" => "Zero"
    case 1 => singles(number)
    case 2 => doubles(number)
    case 3  if number.head.toString == "0" => doubles(number.tail)
    case 3  if number.tail.toString == "00" => singles(number.head.toString) + " Hundred"
    case _  => singles(number.head.toString) + " Hundred and " + doubles(number.tail)
  }
  
}
