fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}


data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

fun main() {
    val date = MyDate(2023, 6, 15)
    val start = MyDate(2023, 1, 1)
    val end = MyDate(2023, 12, 31)

    println(checkInRange(date, start, end))
}