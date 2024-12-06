package demo.application.client

import feign.Headers
import org.example.number
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

// клиент для получения клиентов в корпоративное CRM по id
@FeignClient(name = "crmClient", url = "http://localhost:8080/")
interface CrmClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["number/{number}"])
    @Headers("Content-Type: application/json")
    fun increase(@PathVariable number: Int): number
}