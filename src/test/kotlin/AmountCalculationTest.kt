import org.junit.Assert.assertEquals
import org.junit.Test

class AmountCalculationTest {

    @Test
    fun amountCalculationVK() {
        val cardName = "VK Pay"
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (amountCalculation(cardName, amount)).toInt()
        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun amountCalculationMasterCard() {
        val cardName = "Mastercard"
        val amount = 10000
        val expectedComission = 2060

        val actualComission = (amountCalculation(cardName, amount)).toInt()
        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun amountCalculationMaestro() {
        val cardName = "Maestro"
        val amount = 10000
        val expectedComission = 2060

        val actualComission = (amountCalculation(cardName, amount)).toInt()
        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun amountCalculationVisa() {
        val cardName = "Visa"
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (amountCalculation(cardName, amount)).toInt()
        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun amountCalculationMir() {
        val cardName = "Мир"
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (amountCalculation(cardName, amount)).toInt()
        assertEquals(expectedComission, actualComission)

    }

}