package demo.project.service

import demo.project.client.UserClient
import org.springframework.stereotype.Service

@Service
class UserService (
    private val userClient: UserClient
){
    fun authorisation(login: String, password: String) {
        userClient.authorization(login, password)
    }
}