abstract class Attachments() {
    abstract val type: String
}

//Audio
data class AudioAttachments(
    override val type: String = "Audio",
    val audio: Audio = Audio()
) : Attachments()

data class Audio(
    val id: Int = 0,
    val ownerId: Int = 0,
    val artist: String = "",
    val title: String = "",
    val duration: Int = 0,
    val url: String = "",
    val date: Int = 0
)

//Document
data class DocumentAttachments(
    override val type: String = "Document",
    val document: Document = Document()
) : Attachments()

data class Document(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val size: Int = 0,
    val ext: String = "",
    val url: String = "",
    val date: Int = 0
)

//Link
data class LinkAttachment(
    override val type: String = "Link",
    val link: Link = Link()
) : Attachments()

data class Link(
    val url: String = "",
    val title: String = "",
    val caption: String = "",
    val description: String = ""
)

//Photo
data class PhotoAttachments(
    override val type: String = "Photo",
    val photo: Photo = Photo()
) : Attachments()

data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "",
    val date: Int = 0
)

//Video
data class VideoAttachments(
    override val type: String = "Video",
    val video: Video = Video()
) : Attachments()

data class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val duration: Int = 0,
    val url: String = "",
    val date: Int = 0,
    val views: Int = 0,
    val comments: Int = 0,
    val player: String = ""
)
