fun Int.r(): RationalNumber = TODO()

fun Pair<Int, Int>.r(): RationalNumber = TODO()

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    val rationalNumber = 1.r()
}

/**data class Pair<out A, out B>(
    val first: A,
    val second: B
)*/