## 🚀 How to Use in Android (Kotlin)

### 1. Add JitPack to your repositories
...

### ✅ Summary

| Task                     | How to do it                              |
|--------------------------|-------------------------------------------|
| Validate user input      | `VehicleNumberValidator.isValid(input)`   |
| Use in Android project   | Add JitPack repo + SDK dependency         |
| Real-time feedback       | Use `TextWatcher`                         |


```
dependencies {
    implementation("com.github.yourusername:vehicle-number-validator:1.0")
}
```
 ## Validate a Vehicle Number
```
import com.yourcompany.vehiclenumber.VehicleNumberValidator

val vehicleInput = findViewById<EditText>(R.id.editTextVehicleNumber)
val submitBtn = findViewById<Button>(R.id.btnSubmit)

submitBtn.setOnClickListener {
    val input = vehicleInput.text.toString().trim()

    if (VehicleNumberValidator.isValid(input)) {
        Toast.makeText(this, "Valid Vehicle Number", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(this, "Invalid Vehicle Number", Toast.LENGTH_SHORT).show()
    }
}
 
```
## Optional: Live Validation as User Types

```
vehicleInput.addTextChangedListener(object : TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        val isValid = VehicleNumberValidator.isValid(s.toString())
        vehicleInput.setTextColor(
            if (isValid) Color.GREEN else Color.RED
        )
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
})

```
