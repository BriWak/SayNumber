import org.scalatest.{MustMatchers, WordSpec}

class SayNumberSpec extends WordSpec with MustMatchers {

  "speak" should {
    "return 'Zero' when given 0" in {
      SayNumber.speak("0") mustBe "Zero"
    }

    "return 'One' when given 1" in {
      SayNumber.speak("1") mustBe "One"
    }

    "return 'Ten' when given 10" in {
      SayNumber.speak("10") mustBe "Ten"
    }

    "return 'Eighteen' when given 18" in {
      SayNumber.speak("18") mustBe "Eighteen"
    }

    "return 'Twenty' when given 20" in {
      SayNumber.speak("20") mustBe "Twenty"
    }

    "return 'Twenty Seven' when given 27" in {
      SayNumber.speak("27") mustBe "Twenty Seven"
    }

    "return 'Fifty Nine' when given 59" in {
      SayNumber.speak("59") mustBe "Fifty Nine"
    }

    "return 'Ninety' when given 90" in {
      SayNumber.speak("90") mustBe "Ninety"
    }

    "return 'Ninety Nine' when given 99" in {
      SayNumber.speak("99") mustBe "Ninety Nine"
    }

    "return 'One Hundred' when given 100" in {
      SayNumber.speak("100") mustBe "One Hundred"
    }

    "return 'One Hundred and Three' when given 103" in {
      SayNumber.speak("103") mustBe "One Hundred and Three"
    }

    "return 'One Hundred and Ten' when given 110" in {
      SayNumber.speak("110") mustBe "One Hundred and Ten"
    }

    "return 'One Hundred and Forty Seven' when given 147" in {
      SayNumber.speak("147") mustBe "One Hundred and Forty Seven"
    }

    "return 'Eight Hundred and Eighty Eight' when given 888" in {
      SayNumber.speak("888") mustBe "Eight Hundred and Eighty Eight"
    }

    "return 'One Thousand Two Hundred and Fifty Three' when given 1253" in {
      SayNumber.speak("1253") mustBe "One Thousand Two Hundred and Fifty Three"
    }

    "return 'One Hundred and Seventy Six Million Nine Hundred Thousand Two Hundred and Fourteen' when given 176900214" in {
      SayNumber.speak("176900214") mustBe "One Hundred and Seventy Six Million Nine Hundred Thousand Two Hundred and Fourteen"
    }

    "return 'One Billion and Forty Thousand' when given 1000040000" in {
      SayNumber.speak("1000040000") mustBe "One Billion and Forty Thousand"
    }

    "return 'Five Billion Six Hundred and Seventy Eight Million Nine Hundred and One Thousand Two Hundred and Three' when given 5678901203" in {
      SayNumber.speak("5678901203") mustBe "Five Billion Six Hundred and Seventy Eight Million Nine Hundred and One Thousand Two Hundred and Three"
    }

    "return 'Minus One' when given -1" in {
      SayNumber.speak("-1") mustBe "Minus One"
    }

    "return 'Minus Ten' when given -10" in {
      SayNumber.speak("-10") mustBe "Minus Ten"
    }

    "return 'Minus Eighteen' when given -18" in {
      SayNumber.speak("-18") mustBe "Minus Eighteen"
    }

    "return 'Minus Twenty' when given -20" in {
      SayNumber.speak("-20") mustBe "Minus Twenty"
    }

    "return 'Minus Twenty Seven' when given -27" in {
      SayNumber.speak("-27") mustBe "Minus Twenty Seven"
    }

    "return 'Minus Fifty Nine' when given -59" in {
      SayNumber.speak("-59") mustBe "Minus Fifty Nine"
    }

    "return 'Minus 6 Trillion Five Billion Six Hundred and Seventy Eight Million Nine Hundred and One Thousand Two Hundred and Three' when given -6005678901203" in {
      SayNumber.speak("-6005678901203") mustBe "Minus Six Trillion Five Billion Six Hundred and Seventy Eight Million Nine Hundred and One Thousand Two Hundred and Three"
    }
  }
}
