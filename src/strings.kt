import java.util.*

fun main() {
   array()
    nairobi()
    number()
    println(Arrays.toString(nounsArray(arrayOf("Achol","Deng","Chol"))))

}
fun array (){
    var nameArray=arrayOf("Achol","Chol","Deng","Marial")
    println (Arrays.toString(nameArray))

}
fun nairobi() {
    var citiesArray=arrayOf("harare","mumbai","dodoma","jakarta",)
    for (cities in citiesArray){
        println(cities.capitalize())

        }
    }
    fun number(){
        var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
        var total=numbers.get(0)+numbers.get(4)
        println(total)
        var index=numbers.indexOf(158)
        println(index)
        var sortedNumbers=numbers.sortedArray()
        sortedNumbers.forEach { number ->
            println(number)
        }
    }




fun nounsArray(names:Array<String>):Array<String> {
    return names

}
