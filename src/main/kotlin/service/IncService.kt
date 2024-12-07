package org.example.service

import demo.application.client.IncClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.stereotype.Service

@Service
class IncService (
    private val incClient: IncClient
){
    fun increase(number: Long) {
        incClient.increase(number + 1)
    }
}