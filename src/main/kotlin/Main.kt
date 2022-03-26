fun main() {
     postOne = Post(id = 1, text = "First post")
    val postTwo = Post(id = 2, text = "Second post")
    println(WallService.add(postOne))
    println(WallService.add(postTwo))
    println(WallService.update(postOne))
    println(WallService.update(postTwo))
}