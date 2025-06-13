package com.aistudio.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogAssistantApplication

fun main(args: Array<String>) {
    runApplication<BlogAssistantApplication>(*args)
}
