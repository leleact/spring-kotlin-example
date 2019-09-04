package com.github.leleact.spring.kotlin.example.controller

import com.github.leleact.spring.kotlin.example.model.UserLoginData
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @PostMapping("/login")
    fun login(@RequestBody request: UserLoginData): ResponseEntity<String> {
        log.info("user: {}", request)
        return ResponseEntity.ok("登录成功")
    }
}