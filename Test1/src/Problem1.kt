fun main() {
    val N = 10
    var sum = 0
    val arr = IntArray(N) { i -> i }
    for(i in arr) {
        if (i % 2 == 0) {
            sum += arr[i]
        }
    }
    println(sum)
}