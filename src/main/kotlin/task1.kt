import kotlin.math.roundToInt

fun main()
{

}

fun SomeItem(itemOfOnechar:List<String> ,char:String): Double {
        var count: Double = 0.0
        if (itemOfOnechar.isEmpty())
            return -1.0
            else {
                    for (i in 0 until itemOfOnechar.size)
                    {
                        if (itemOfOnechar[i].length == 1 && itemOfOnechar[i].isNotBlank()  && char in itemOfOnechar) {
                            if (itemOfOnechar[i] == char) count++
                        } else return -1.0
                    }
                 }
            return (((count / itemOfOnechar.size) * 100).roundToInt()).toDouble()

}

