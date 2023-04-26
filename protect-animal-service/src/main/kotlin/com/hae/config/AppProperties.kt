package com.hae.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "custom")
class AppProperties {
    var api: ApiUrl? = null
    var job: JobCron? = null

    class ApiUrl {
        var serviceKey: String? = null
        var shelterDataUrl: String? = null
        var animalKindUrl: String? = null
        var cityUrl: String? = null
        var districtUrl: String? = null
    }

    class JobCron {
        var test: String? = null
        var updateAnimal: String? = null
    }
}
