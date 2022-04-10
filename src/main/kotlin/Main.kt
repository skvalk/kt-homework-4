fun main() {
    val audio = AudioAttachments(type = "Audio", Audio(title = "hello"))
    val doc = DocumentAttachments(type = "Document", Document(title = "First DOC"))
    val attachment: Array<Attachments> = arrayOf(audio, doc)
    val postOne = Post(id = 1, text = "First post", ownerId = 337)
    val postTwo = Post(
        id = 1,
        text = "Second post",
        ownerId = 37,
        attachment = attachment
    )
    println(WallService.add(postOne))
    println(WallService.add(postTwo))
    println(WallService.update(postOne))
    println(WallService.update(postTwo))
    WallService.print()
}