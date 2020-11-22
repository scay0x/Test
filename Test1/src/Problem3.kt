// Am incercat sa rezolv in mai multe metode problema deorece nu eram sigur daca prima solutie era cea ideala
// Rezolvarea ideala cu Stringuri
fun main() {
    var a = intArrayOf(1204, 66, 7423, 1, 4, 850, 4, 55, 10003, 55, 78364, 93, 403, 1789, 1, 3850, 778, 850)

    var distincte = ""
    var duplicate = ""

    for(i in a.indices) {
        if(i == 0) {
            distincte += (a[i].toString() + " ")
        } else if(distincte.contains(" " + a[i])) {
            duplicate += (a[i].toString() + " ")
        } else {
            distincte += (a[i].toString() + " ")
        }
    }
    if (duplicate != "") {
        println("S-au gasit duplicatele : " + duplicate)
    }else {
        println("Nu s-au gasit duplicate")
    }
}



//Rezolvare cu functie implicita
/*fun main() {
    var arr = intArrayOf(1204, 66, 7423, 1, 4, 850, 4, 55, 10003, 55, 78364, 93, 403, 1789, 1, 3850, 778, 850)
    for(i in arr) {
      if((arr.count{i == it}) > 1) {
          println("S-au gasit duplicate")
          return
      }
    }
    println("Nu s-au gasit duplicate")
}*/



//Rezolvare cu for in for
/*fun main() {
    var arr = intArrayOf(1204, 66, 7423, 1, 4, 850, 4, 55, 10003, 55, 78364, 93, 403, 1789, 1, 3850, 778, 850)

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                println("S-au gasit duplicate")
                return
            }
        }
    }
    println("Nu s-au gasit duplicate")
}*/


