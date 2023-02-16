fun main() {
    println("${text()[0].toString()}${text()[2]}${text()[3]}")
    println(parameter("June","65"))
    println(length("Banana"))
    print1("Purity")
}
fun text():String {
    val text1 = "Akirachix"
    return (text1)
}
fun parameter(x: String, y: String):String{
    val sent = "My name is $x and I am $y years old"
    return sent
}
fun length(b: String): Int{
    val result = (b.length)
    return result
}
fun print1(name: String){
    val z = "Purity"
    if (z==(name))
        println("That`s me!")
    else
        println("I don`t know who that is")

}








