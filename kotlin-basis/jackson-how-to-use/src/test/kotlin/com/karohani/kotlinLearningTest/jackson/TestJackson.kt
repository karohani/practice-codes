package com.karohani.kotlinLearningTest.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class TestJackson {

    data class Person(val name: String, val age: Int)
    @Test
    fun a() {
        val objectMapper = ObjectMapper()
        val parse = """
            {
                "name": "jae",
                "age": 20
            }
        """.trimIndent()
        assertDoesNotThrow { objectMapper.readValue(parse, Person::class.java) }
    }
}