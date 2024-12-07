package demo.application

import demo.application.controller.IncController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    lateinit var incController: IncController

    @Test
    fun Test1() {
        val number = 0L
        val result = incController.increase(number)
        Assertions.assertEquals(1L, result)
    }

    @Test
    fun Test2() {
        val number = 100L
        val result = incController.increase(number)
        Assertions.assertEquals(101L, result)
    }

    @Test
    fun Test3() {
        val number = 1337L
        val result = incController.increase(number)
        Assertions.assertEquals(1338L, result)
    }

    @Test
    fun Test4() {
        val number = 87L
        val result = incController.increase(number)
        Assertions.assertEquals(88L, result)
    }

    @Test
    fun Test5() {
        val number = 56L
        val result = incController.increase(number)
        Assertions.assertEquals(57L, result)
    }
}
