import kotlin.test.Test
import kotlin.test.assertEquals

class MultiplyTest {
    @Test
    fun `test multiply *3`() = assertEquals(166833, Multiply().Operation(3))

    @Test
    fun `test multiply *5`() = assertEquals(99500, Multiply().Operation(5))

}