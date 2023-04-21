package com.hae.domain.enums

enum class AnimalKindCode(val code: String) {
    DOG("417000"),
    CAT("422400"),
    ETC("429900");

    companion object {
        fun getCode(value: AnimalKindCode): String = value.code
    }
}