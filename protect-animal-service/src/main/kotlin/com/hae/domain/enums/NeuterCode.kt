package com.hae.domain.enums

enum class NeuterCode {
    Y, N, U;

    companion object {
        operator fun invoke(code: String) = valueOf(code.uppercase())
    }
}
