package org.example.service

import demo.application.client.IncClient
import org.springframework.stereotype.Service

@Service
class Service (
    private val incClient: IncClient
){
    fun increase(number: Long) = incClient.increase(number + 1)
}