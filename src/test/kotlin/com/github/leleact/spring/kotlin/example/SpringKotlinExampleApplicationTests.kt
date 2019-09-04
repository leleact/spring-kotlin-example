package com.github.leleact.spring.kotlin.example

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.leleact.spring.kotlin.example.model.UserLoginData
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringKotlinExampleApplicationTests {

    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var mapper: ObjectMapper

    @Test
    fun contextLoads() {
    }

    @Test
    fun loginTest() {
        val request = UserLoginData("x", "abc@xzy.com", "password")
        val result = mockMvc.perform(post("/login").content(mapper.writeValueAsString(request)).contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk).andReturn().response.contentAsString
        log.info("result: {}", result)
    }

    @Test
    fun `Anonymous function test`() {
        log.info("log a anonymous function test")
    }

}
