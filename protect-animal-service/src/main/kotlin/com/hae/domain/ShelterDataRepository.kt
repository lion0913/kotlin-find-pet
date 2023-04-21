package com.hae.domain

import org.springframework.data.jpa.repository.JpaRepository

interface ShelterDataRepository: JpaRepository<ShelterData, Long> {
}