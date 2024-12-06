package org.example.service

import demo.application.client.CrmClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class Service (
    private val crmClient: CrmClient
){
    fun increase(number: Int): Int{
        val n_new = number + 1
        return n_new
    }
}