package com.hae.domain

import jakarta.persistence.*

@Entity
@Table
class City ( //��, ��
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column
        val code: String,

        @Column
        val name: String,

        @OneToMany(mappedBy = "city", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        val districts: MutableList<District> = mutableListOf(),

): BaseEntity()
