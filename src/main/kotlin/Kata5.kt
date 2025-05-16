fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {

    val number = 1
    val pair = Pair(1, 2)
    println(number.r())
    println(pair.r())
}

/**data class Pair<out A, out B>(
val first: A,
val second: B
)*/
