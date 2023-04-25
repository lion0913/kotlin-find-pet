package com.hae.domain.job

import com.hae.config.AppProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ShelterDataJob {
    @Autowired
    lateinit var appProperties: AppProperties

    @Scheduled(cron = "\${custom.job.update-animal}")
    fun updateAnimalData() {

    }
}
