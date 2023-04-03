package com.hae.domain

import jakarta.persistence.*

@Entity
@Table
class City ( //½Ã, µµ
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column
        val code: String,

        @Column
        val name: String,

        @OneToMany(fetch = FetchType.LAZY)
        val districts: MutableList<District> = mutableListOf(),

): BaseEntity()