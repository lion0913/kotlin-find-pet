package com.hae.service

import com.hae.domain.ShelterDataRepository
import org.springframework.stereotype.Service

@Service
class ShelterDataService(
        private val shelterDataRepository: ShelterDataRepository,
) {

}