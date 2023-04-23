package com.hae.web

import com.hae.model.ShelterDataApiRequest
import com.hae.service.ShelterDataService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.*
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpResponse


private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/api/v1/shelter")
class ShelterDataController(
        private val shelterDataService: ShelterDataService,
        private val restTemplate: RestTemplate,
        @Value("\${custom.api.service-key}") private val serviceKey: String,
        @Value("\${custom.api.shelter-data-url}") private val shelterDataUrl: String,
        @Value("\${custom.api.animal-kind-url}") private val animalKindUrl: String,
        @Value("\${custom.api.city-url}") private val cityUrl: String,
        @Value("\${custom.api.district-url}") private val districtUrl: String,

) {

    @PostMapping("/create")
    fun create(@RequestBody shelterDataApiRequest: ShelterDataApiRequest) {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        var builder = UriComponentsBuilder.fromHttpUrl(shelterDataUrl)
            .queryParam("ServiceKey", serviceKey)
            .queryParam("up_kind_cd", "417000")
            .queryParam("_type", "json")
            .build(true)

        var uri = URI(builder.toUriString())

        val response: ResponseEntity<String> = restTemplate.exchange(
            uri,
            HttpMethod.GET,
            HttpEntity<String>(headers),
            String::class.java
        )

        logger.info(serviceKey)
        logger.info(uri.toString())
        if (response.statusCode.is2xxSuccessful) {
            logger.info(response.body)
        } else {
            // ...
        }
    }
}
