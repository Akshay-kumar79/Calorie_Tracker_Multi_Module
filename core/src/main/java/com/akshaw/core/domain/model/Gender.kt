package com.akshaw.core.domain.model

sealed class Gender(val name: String) {
    object Male : Gender("male")
    object Female : Gender("female")

    companion object {
        fun fromString(name: String?): Gender {
            return when (name) {
                null -> Male
                "male" -> Male
                "female" -> Female
                else -> Female
            }
        }
    }
}
