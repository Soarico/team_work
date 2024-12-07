package demo.project.controller

import demo.application.service.IncService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val service: UserService
) {
    @GetMapping("/users")
    fun authorisation(@RequestParam login: String, password: String): Unit {
        return service.authorisation(login, password)
    }
}