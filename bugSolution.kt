fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) //Correctly prints [1, 3, 5]
    
    //Another solution
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()){
        if (iterator.next() % 2 == 0){
            iterator.remove()
        }
    }
    println(list2) //Correctly prints [1, 3, 5]
}
This corrected code first filters the even numbers and then removes them from the original list. This avoids issues caused by modifying the list while iterating. The second approach uses an iterator which allows for safe removal during iteration.