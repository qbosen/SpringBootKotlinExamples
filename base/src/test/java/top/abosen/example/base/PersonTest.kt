package top.abosen.example.base

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDate

/**
 * @author qiubaisen
 * @date 2020/8/5
 */
internal class PersonTest{
    @Test
    fun test(){
        assertEquals(LocalDate.now().year - 20, Person("张三", 20).birthYear)
    }
}