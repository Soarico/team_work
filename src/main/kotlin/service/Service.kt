package org.example.service

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable


@Service
class Service {
    fun increase(number: Int): Int{
        val n_new = number+1;
        return n_new;
    }
}