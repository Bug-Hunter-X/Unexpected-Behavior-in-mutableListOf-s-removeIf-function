fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code snippet intends to remove even numbers from a list.  However, modifying a list while iterating over it with removeIf can lead to unexpected behavior and potential index out of bounds exceptions, especially when the order of removal is not predictable.

The problem stems from the fact that `removeIf` internally modifies the list's indices as it removes elements.  If the condition `it % 2 == 0` is true for consecutive elements, the indices might get shifted unexpectedly, resulting in elements being skipped or incorrect removal.
