data class Comment(
    val ownerId: Int = 0,
    val postId: Int = 0,
    val fromGroup: Int = 0,
    val message: String = "",
    val replyToComment: Int = 0,
    val attachments: Array<Attachments>? = null,
    val stickerId: Int = 0,
    val guid: Int = 0
)