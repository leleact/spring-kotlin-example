package com.github.leleact.spring.kotlin.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinExampleApplication>(*args)
}
