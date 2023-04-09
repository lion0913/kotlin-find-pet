package com.hae

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableBatchProcessing //��ġ ���μ��� ���
@SpringBootApplication
@EnableJpaAuditing //�ش� ������̼��� �־�� AuditingEntityListener�� ����
class KotlinFindPetApplication

fun main(args: Array<String>) {
    runApplication<KotlinFindPetApplication>(*args)
}
