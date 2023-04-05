package com.hae.domain.enums

enum class ShelterState(s: String) {
    PROTECTED("보호중"),
    RETURN("종료(반환)"),
    EUTHANASIA("종료(안락사)"),
    NATURAL_DEATH("종료(자연사)");

    companion object {
        operator fun invoke(code: String) = NeuterCode.valueOf(code.uppercase())
    }
}
