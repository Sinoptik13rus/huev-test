import org.junit.Test

import org.junit.Assert.*

class MasterMaestroTest {

    @Test
    fun mastercardMaestro() {
        val amount = 10000
        val expectedComission = 2060.0

        val actualComission = mastercardMaestro(amount)
        expectedComission == actualComission
    }

    @Test
    fun mastercardMaestro1() {
        val amount = 40000
        val expectedComission = 0.00

        val actualComission = mastercardMaestro(amount)
        expectedComission == actualComission
    }

    @Test
    fun mastercardMaestro2() {
        val amount = 100_000_000
        val expectedComission = -1.00

        val actualComission = mastercardMaestro(amount)
        expectedComission == actualComission
    }

}