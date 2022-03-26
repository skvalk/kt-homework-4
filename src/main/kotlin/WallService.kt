object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post{
        posts += post.copy(id = posts.size)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()){
            if(item.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

}