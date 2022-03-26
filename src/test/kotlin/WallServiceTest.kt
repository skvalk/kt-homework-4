import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
       for (i in 1..10) {
           val result = WallService.add(Post(text = "test")).id
           println(result)
           assertNotEquals(0, result)
       }
    }

    @Test
    fun updateTrue() {
        WallService.add(Post(text = "test"))
        WallService.add(Post(text = "test"))
        val result = WallService.update(Post(id = 2, text = "Update TEST"))
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.add(Post(text = "test"))
        WallService.add(Post(text = "test"))
        val result = WallService.update(Post(id = 3, text = "Update TEST"))
        assertFalse(result)
    }
}