package org.example

object VehicleNumberValidator {
    private val regexPatterns = listOf(
        // Gauteng style: AB 12 CD GP
        Regex("^[A-Z]{2} \\d{2} [A-Z]{2} GP$", RegexOption.IGNORE_CASE),

        // Cape Town, EC, etc.: CA 123-456
        Regex("^[A-Z]{2} \\d{3}-\\d{3}$", RegexOption.IGNORE_CASE),

        // KZN/NPN style: NPN 12345
        Regex("^[A-Z]{2,3} \\d{3,5}$", RegexOption.IGNORE_CASE),

        // Limpopo (same as GP-style)
        Regex("^[A-Z]{2} \\d{2} [A-Z]{2} [A-Z]{2}$", RegexOption.IGNORE_CASE),

        // Personalized: e.g. JOE GP or 123ABC GP
        Regex("^[A-Z0-9]{1,7} [A-Z]{2}$", RegexOption.IGNORE_CASE)
    )
    fun isValid(plateNumber: String) : Boolean {
        val trimmed = plateNumber.trim()
        return regexPatterns.any() {it.matches(trimmed)}
    }
}