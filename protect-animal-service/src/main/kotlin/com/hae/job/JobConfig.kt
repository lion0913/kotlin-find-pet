package com.hae.job


import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.core.repository.JobRepository
import org.springframework.batch.core.step.builder.StepBuilder

import org.springframework.batch.item.ItemProcessor
import org.springframework.batch.item.ItemReader
import org.springframework.batch.item.ItemWriter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableBatchProcessing
class JobConfig {

    @Autowired
    lateinit var jobRepository: JobRepository

    @Bean
    fun simpleJob(step: Step): Job {
        return JobBuilder("simpleJob")
                .repository(jobRepository)
                .start(step)
                .build()
    }

    @Bean
    fun simpleStep(reader: ItemReader<String>, processor: ItemProcessor<String, String>, writer: ItemWriter<String>): Step {
        return StepBuilder("simpleStep")
                .chunk<String, String>(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build()
    }

    // Define your ItemReader, ItemProcessor, and ItemWriter beans here.
}