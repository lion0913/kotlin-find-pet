package com.hae.domain

import com.hae.domain.enums.NeuterCode
import com.hae.domain.enums.SexCode
import com.hae.domain.enums.ShelterState
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table
class ShelterData (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val desertionNo: String,

    @Column
    val imgLink: String,

    @Column
    val findAt: LocalDate? = null,

    @Column
    val findPlace: String,

    @Column
    val kind: String,

    @Column
    val color: String,

    @Column
    val age: String,

    @Column
    val weight: String,

    @Column
    val noticeNo: String,

    @Column
    val startDate: LocalDate,

    @Column
    val endDate: LocalDate,

    @Column
    var state: ShelterState,

    @Column
    val sexCode: SexCode,

    @Column
    val neuterCode : NeuterCode,

    @Column
    val mark: String,

    //보호소 정보
    @Column
    val careName: String,

    @Column
    val careTel: String,

    @Column
    val careAddr : String,

    //담당자
    @Column
    val manager: String,

    @Column
    val managerTel: String,

    )
