package org.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.example.service.NumService


@RestController
class NumController(
    val service: NumService
){
    @GetMapping("increase")
    fun increase(@RequestParam number: Long){
        service.increase(number)
    }
}