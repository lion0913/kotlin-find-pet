package com.hae.domain

import jakarta.persistence.*

@Table
@Entity
class AnimalKind (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val code: String,

    @Column
    val name: String,

) : BaseEntity()
