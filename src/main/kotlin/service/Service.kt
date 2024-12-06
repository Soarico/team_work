package org.example.service


import org.springframework.stereotype.Service
import org.example.client.IncClient
@Service
class NumService (
    private val incClient: IncClient
){
    fun increase(number: Long){
        incClient.increase(number + 1)
    }
}