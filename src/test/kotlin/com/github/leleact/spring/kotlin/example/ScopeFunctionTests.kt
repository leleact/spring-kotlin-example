package com.github.leleact.spring.kotlin.example

import org.junit.Test

class ScopeFunctionTests {

    @Test
    fun `let`() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.let {
            println(it)
        }
    }

    @Test
    fun `apply`() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.apply {
            println(this)
        }
    }
}