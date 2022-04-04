fun main() {
    val postOne = Post(id = 1, text = "First post", ownerId=337)
    val postTwo = Post(id = 1, text = "Second post", ownerId=37)
    println(WallService.add(postOne))
    println(WallService.add(postTwo))
    println(WallService.update(postOne))
    println(WallService.update(postTwo))
    WallService.print()
}