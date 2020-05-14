package ilapin.common

import java.util.*

class ObjectPool<T>(private val createObject: () -> T) {

    private val pool = LinkedList<T>()

    fun obtain(): T {
        return if (pool.isEmpty()) {
            createObject()
        } else {
            pool.removeFirst()
        }
    }

    fun recycle(o: T) {
        pool += o
    }
}