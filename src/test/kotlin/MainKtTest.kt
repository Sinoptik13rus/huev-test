import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun mainTest() {
        val cardName = "Mastercard"
        val amount = 10000
        val finishResult = amountCalculation(cardName, amount)
        assertTrue(main(finishResult))

    }
}