package com.hae

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing //해당 어노테이션이 있어야 AuditingEntityListener가 동작
class KotlinFindPetApplication

fun main(args: Array<String>) {
//    System.setProperty("spring.config.name", "application")
    runApplication<KotlinFindPetApplication>(*args)
}
//dd: