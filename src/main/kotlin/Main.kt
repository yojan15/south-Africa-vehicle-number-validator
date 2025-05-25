package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(VehicleNumberValidator.isValid("CA 123-456"))     // true
    println(VehicleNumberValidator.isValid("AB 12 CD GP"))    // true
    println(VehicleNumberValidator.isValid("NPN 12345"))      // true
    println(VehicleNumberValidator.isValid("JOE GP"))         // true
    println(VehicleNumberValidator.isValid("XYZ123 GP"))      // true
    println(VehicleNumberValidator.isValid("ABC123XYZ"))      // false
}
