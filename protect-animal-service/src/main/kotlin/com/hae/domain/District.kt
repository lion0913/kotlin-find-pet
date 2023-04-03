package com.hae.domain

import jakarta.persistence.*

@Entity
@Table
class District ( //½Ã, ±º, ±¸
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "city_id")
        val city: City,

        @Column
        var name: String,

        @Column
        var code: String,
): BaseEntity()