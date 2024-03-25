fun main(args: Array<String>) {
    println(integer(arrayOf(2,6,4,6)))

    sphere(8)

    buns("Barnie bakes brwon bagels and buns")



}



fun integer(num: Array<Int>):Int{
   return(num.sum())

    return (num.count())


     return (num.sum()/num.count())



}

fun sphere(num1:Int):Double{
    var vol =4/3
    var prod = vol* 3.14159
    var radius = num1*num1*num1
    var volume = prod*radius
    println(volume)
    return volume

}

//fun ispalindrome(word:String):Boolean{
 //   if()
//}

fun buns(sentences:String) {
    var spliting = sentences.lowercase()
    var b = spliting.replace("b"," ")
    println(b)
}
