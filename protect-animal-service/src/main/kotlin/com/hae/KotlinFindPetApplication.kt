package com.hae

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableBatchProcessing //배치 프로세싱 허용
@SpringBootApplication
@EnableJpaAuditing //해당 어노테이션이 있어야 AuditingEntityListener가 동작
class KotlinFindPetApplication

fun main(args: Array<String>) {
    runApplication<KotlinFindPetApplication>(*args)
}