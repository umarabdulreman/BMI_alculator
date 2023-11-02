package com.example.bmicalculator
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val weightInput: EditText = findViewById(R.id.weightInput)
        val heightInput: EditText = findViewById(R.id.heightInput)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val bmiResult: TextView = findViewById(R.id.bmiResult)

        calculateButton.setOnClickListener {
            if (TextUtils.isEmpty(weightInput.text) || TextUtils.isEmpty(heightInput.text)) {
                bmiResult.text = "Please enter valid values"
                return@setOnClickListener
            }

            val weight = weightInput.text.toString().toFloat()
            val height = heightInput.text.toString().toFloat()
0
            if (height == 0f) {
                bmiResult.text = "Height cannot be zero"
                return@setOnClickListener
            }

            val bmi = weight / (height * height)
            bmiResult.text = "Your BMI: %.2f".format(bmi)
        }
    }
}
