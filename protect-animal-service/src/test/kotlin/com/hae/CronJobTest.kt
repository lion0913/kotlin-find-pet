package com.hae

import com.hae.config.AppProperties
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@SpringBootTest
@ExtendWith(SpringExtension::class)
class CronJobTest {

    @Autowired
    lateinit var properties: AppProperties

    var counter: Int = 0

    @Test
    fun testCronJob() {
        // Wait for the scheduled task to run 5 times
        Thread.sleep(5000)

        // Check that the task has run 5 times
        try {
            assertEquals(5, counter, "Task did not run 5 times")
        } catch (e: AssertionError) {
            fail<String>(e.message)
        }
    }

    @Scheduled(cron = "\${custom.job.test}")
    fun myScheduledTask() {
        // Increment the counter
        counter++

        // Log the current time
        val now = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val formatted = now.format(formatter)
        println("Scheduled task ran at $formatted")
    }
}
