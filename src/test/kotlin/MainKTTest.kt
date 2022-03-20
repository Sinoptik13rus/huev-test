import org.junit.Assert.assertEquals
import org.junit.Test

class MainKTTest {

    @Test
    fun amountCalculationVK() {
        val cardName = "VK Pay"
        val amount = 10000
        val expectedComission = 0.0

        val actualComission = amountCalculation(cardName, amount)
        expectedComission == actualComission

    }

    @Test
    fun amountCalculationMasterCard() {
        val cardName = "Mastercard"
        val amount = 10000
        val expectedComission = 80.00

        val actualComission = amountCalculation(cardName, amount)
        expectedComission == actualComission

    }

    @Test
    fun amountCalculationMaestro() {
        val cardName = "Maestro"
        val amount = 10000
        val expectedComission = 80.00

        val actualComission = amountCalculation(cardName, amount)
        expectedComission == actualComission

    }

    @Test
    fun amountCalculationVisa() {
        val cardName = "Visa"
        val amount = 10000
        val expectedComission = 3500.00

        val actualComission = amountCalculation(cardName, amount)
        expectedComission == actualComission

    }

    @Test
    fun amountCalculationMir() {
        val cardName = "Мир"
        val amount = 10000
        val expectedComission = 3500.00

        val actualComission = amountCalculation(cardName, amount)
        expectedComission == actualComission

    }

}