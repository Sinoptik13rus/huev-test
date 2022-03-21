import org.junit.Test

import org.junit.Assert.*

class VisaMirTest {

    @Test
    fun visaMir() {
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir1() {
        val amount = 10000000
        val expectedComission = 75000

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }


    @Test
    fun visaMir2() {
        val amount = 100_000_000
        val expectedComission = -1

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir4() {
        val amount = 10000
        val expectedComission = 3500

        val actualComission = (visaMir(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }

    @Test
    fun visaMir5() {
        val amount = 10000000
        val expectedComission = 62000

        val actualComission = (mastercardMaestro(amount)).toInt()
        assertEquals(expectedComission, actualComission)
    }
}
