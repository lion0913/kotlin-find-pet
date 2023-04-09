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

    @OneToMany(mappedBy = "kind", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var shelterData: List<ShelterData> = mutableListOf(),

) : BaseEntity()
