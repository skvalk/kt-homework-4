object WallService {
    private var posts = emptyArray<Post>()
    private var postId: Int = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(ownerId = item.ownerId, date = item.date)
                return true
            }
        }
        return false
    }

    fun print() {
        for (post in posts) {
            println(post)
        }
    }

    fun createComment(comment: Comment) {

        for ((index, item) in posts.withIndex()) {
            if (item.id == comment.postId) {
                val newId = if (comments.isEmpty()) 1 else comments.last().guid + 1
                comments += comment.copy(guid = newId)
                return
            }
        }
        throw PostNotFoundException("Не найден пост с id: ${comment.postId}")
    }

    fun clear() {
        posts = emptyArray<Post>()
        comments = emptyArray<Comment>()
        postId = 1
    }
}