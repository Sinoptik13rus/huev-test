import org.junit.Test

import org.junit.Assert.*

class MasterMaestroTest {

    @Test
    fun mastercardMaestro_comission() {
        val amount = 10000
        val expectedComission = 2060

        val actualComission = (mastercardMaestro(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun mastercardMaestro_comission1() {
        val amount = 40000
        val expectedComission = 2060

        val actualComission = (mastercardMaestro(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun mastercardMaestro_comission2() {
        val amount = 100_000_000
        val expectedComission = -1

        val actualComission = (mastercardMaestro(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

}