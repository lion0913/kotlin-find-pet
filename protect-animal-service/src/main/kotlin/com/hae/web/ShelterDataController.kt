package com.hae.web

import com.hae.model.ShelterApiResponse
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
import java.net.URI
import java.net.URLEncoder


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

        val queryParams = LinkedMultiValueMap<String, String>()
        queryParams.add("serviceKey", serviceKey)
        queryParams.add("_type", "json")

        logger.info(serviceKey)

        // 요청 엔티티 생성
        val requestEntity = HttpEntity<Any>(headers)

        val uri = URI.create(shelterDataUrl)
        // 요청 보내기
        val response: ResponseEntity<String> = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                requestEntity,
                String::class.java
        )


        // 응답 결과 처리
        if (response.statusCode.is2xxSuccessful) {
            logger.info(response.body)
        } else {
            // ...
        }
    }
}