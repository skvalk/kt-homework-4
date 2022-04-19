import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val result = WallService.add(Post(id = 0, text = "test")).id
        assertNotEquals(0, result)
    }

    @Test
    fun updateTrue() {
        WallService.clear()
        WallService.add(Post(text = "test"))
        WallService.add(Post(text = "test"))
        val result = WallService.update(Post(id = 2, text = "Update TEST"))
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.clear()
        WallService.add(Post(text = "test"))
        WallService.add(Post(text = "test"))
        val result = WallService.update(Post(id = 3, text = "Update TEST"))
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        WallService.clear()
        WallService.add(Post(text = "test"))
        WallService.add(Post(text = "test"))
        WallService.createComment(Comment(postId = 3))
    }
}