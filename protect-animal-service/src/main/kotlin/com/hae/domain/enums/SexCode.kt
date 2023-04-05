package com.hae.domain.enums

enum class SexCode {
    M, F, Q;

    companion object {
        operator fun invoke(code: String) = NeuterCode.valueOf(code.uppercase())
    }
}
