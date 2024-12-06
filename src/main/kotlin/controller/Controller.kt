import org.example.service.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    val service: Service
) {
    @GetMapping("/plus")
    fun plus(@RequestParam number: Long): Unit {
        return service.increase(number)
    }
}