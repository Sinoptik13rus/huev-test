import org.junit.Test

import org.junit.Assert.*

class VisaMirTest {

    @Test
    fun visaMir_comission() {
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir_comission1() {
        val amount = 10000000
        val expectedComission = 75000

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }


    @Test
    fun visaMir_comission2() {
        val amount = 100_000_000
        val expectedComission = -1

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir_comission3() {
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir_comission4() {
        val amount = 10000000
        val expectedComission = 62000

        val actualComission = (mastercardMaestro(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }
}
