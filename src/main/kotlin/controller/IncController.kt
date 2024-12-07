import org.example.service.IncService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class IncController(
    val service: IncService
) {
    @GetMapping("/increase")
    fun increase(@RequestParam number: Long): Unit {
        return service.increase(number)
    }
 }