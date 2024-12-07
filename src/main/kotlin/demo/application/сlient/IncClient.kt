package demo.application.client

import feign.Headers
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "incClient", url = "http://localhost:8080/")
interface IncClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["number/{number}"])
    @Headers("Content-Type: application/json")
    fun increase(@RequestParam("number") number: Long): Long
}
