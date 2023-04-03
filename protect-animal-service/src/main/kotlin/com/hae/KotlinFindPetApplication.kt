package com.hae

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing //�ش� ������̼��� �־�� AuditingEntityListener�� ����
class KotlinFindPetApplication

fun main(args: Array<String>) {
//    System.setProperty("spring.config.name", "application")
    runApplication<KotlinFindPetApplication>(*args)
}
//dd: