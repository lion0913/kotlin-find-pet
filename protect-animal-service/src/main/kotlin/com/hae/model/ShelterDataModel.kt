package com.hae.model

import com.hae.domain.enums.AnimalKindCode

data class ShelterDataApiRequest (
        val kindCode: AnimalKindCode,
)
data class ShelterApiResponse(
        val response: ShelterResponse
)

data class ShelterResponse(
        val header: ShelterHeader,
        val body: ShelterBody
)

data class ShelterHeader(
        val reqNo: Long,
        val resultCode: String,
        val resultMsg: String
)

data class ShelterBody(
        val items: ShelterItems,
        val numOfRows: Int,
        val pageNo: Int,
        val totalCount: Int
)

data class ShelterItems(
        val item: List<ShelterItem>
)

data class ShelterItem(
        val desertionNo: String,
        val filename: String,
        val happenDt: String,
        val happenPlace: String,
        val kindCd: String,
        val colorCd: String,
        val age: String,
        val weight: String,
        val noticeNo: String,
        val noticeSdt: String,
        val noticeEdt: String,
        val popfile: String,
        val processState: String,
        val sexCd: String,
        val neuterYn: String,
        val specialMark: String,
        val careNm: String,
        val careTel: String,
        val careAddr: String,
        val orgNm: String,
        val chargeNm: String,
        val officetel: String
)