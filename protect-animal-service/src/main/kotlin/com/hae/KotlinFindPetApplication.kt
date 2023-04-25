package com.hae

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling //spring scheduling 기능 사용
//@EnableBatchProcessing
class KotlinFindPetApplication

fun main(args: Array<String>) {
    runApplication<KotlinFindPetApplication>(*args)
}
