package com.hae.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "custom")
class AppProperties {
    lateinit var api: ApiUrl
    lateinit var job: JobCron

    class ApiUrl {
        lateinit var serviceKey: String
        lateinit var shelterDataUrl: String
        lateinit var animalKindUrl: String
        lateinit var cityUrl: String
        lateinit var districtUrl: String
    }

    class JobCron {
        lateinit var updateAnimal: String
    }


}
