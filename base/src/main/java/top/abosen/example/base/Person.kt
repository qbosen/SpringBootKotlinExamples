package top.abosen.example.base

import java.time.LocalDate

/**
 * @author qiubaisen
 * @date 2020/8/5
 */


internal data class Person(val name: String, val age: Int)

internal val Person.birthYear: Int
    get() = LocalDate.now().year - this.age

fun main() {
    println(Person("张三", 20).birthYear)
}