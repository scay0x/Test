fun main() {
    var max1 = 0
    var max2 = 0

    val arr = intArrayOf(17,11,10,19,15,23,1,9,100)
    for(valoare_i in arr) {
        if(valoare_i > max1) {
            max1 = valoare_i
        }else {
            max1 = max1
        }
    }
    for(valoare_j in arr) {
        if (valoare_j > max2 && valoare_j != max1) {
            max2 = valoare_j
        } else {
            max2 = max2
        }
    }
    println("max1 = " + max1)
    println("max2 = " + max2)
}