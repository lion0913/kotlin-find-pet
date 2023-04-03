package com.hae

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinFindPetApplication

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "application")
    runApplication<KotlinFindPetApplication>(*args)
}
