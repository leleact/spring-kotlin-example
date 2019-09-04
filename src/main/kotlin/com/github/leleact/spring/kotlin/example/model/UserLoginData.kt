package com.github.leleact.spring.kotlin.example.model

data class UserLoginData(var name: String, val email: String, val password: String) {

    var firstName: String? = null
        private set


    var lastName: String? = null
        private set


    var fullName: String
        get() = name
        set(value) {
            val nameArray = value.split(" ".toRegex())
            firstName = nameArray[0]
            lastName = nameArray[1]
            name = value
        }

}