package demo.project.client


import feign.Headers
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "UserClient", url = "http://localhost:8080/")
interface UserClient {
    @RequestMapping(method = [RequestMethod.POST], value = ["/users"])
    @Headers("Content-Type: application/json")
    fun authorization(
        @RequestParam("login") login: String,
        @RequestParam("password") password: String,
   ): Unit
}
