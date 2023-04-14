package com.example.rpncalculator

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var firstTextView: TextView
    lateinit var secondTextView: TextView
    lateinit var thirdTextView: TextView
    lateinit var fourthTextView: TextView

    lateinit var button1: android.widget.Button
    lateinit var button2: android.widget.Button
    lateinit var button3: android.widget.Button
    lateinit var button4: android.widget.Button
    lateinit var button5: android.widget.Button
    lateinit var button6: android.widget.Button
    lateinit var button7: android.widget.Button
    lateinit var button8: android.widget.Button
    lateinit var button9: android.widget.Button
    lateinit var button0: android.widget.Button
    lateinit var buttonAC: android.widget.Button
    lateinit var buttonC: android.widget.Button
    lateinit var buttondivide: android.widget.Button
    lateinit var buttonminus: android.widget.Button
    lateinit var buttonplus: android.widget.Button
    lateinit var buttonmultiply: android.widget.Button
    lateinit var buttonmodulus: android.widget.Button
    lateinit var buttonenter: android.widget.Button
    lateinit var buttonsqrt: android.widget.Button
    lateinit var buttonsi: android.widget.Button
    lateinit var buttonmin: android.widget.Button
    lateinit var buttonmax: android.widget.Button
    lateinit var buttonpow: android.widget.Button
    lateinit var buttoninv: android.widget.Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        firstTextView = findViewById(R.id.editText3)
        secondTextView = findViewById(R.id.editText2)
        thirdTextView = findViewById(R.id.editText1)
        fourthTextView = findViewById(R.id.editText)

        button0 = findViewById(R.id.bu0)
        button1 = findViewById(R.id.bu1)
        button2 = findViewById(R.id.bu2)
        button3 = findViewById(R.id.bu3)
        button4 = findViewById(R.id.bu4)
        button5 = findViewById(R.id.bu5)
        button6 = findViewById(R.id.bu6)
        button7 = findViewById(R.id.bu7)
        button8 = findViewById(R.id.bu8)
        button9 = findViewById(R.id.bu9)
        buttonsqrt = findViewById(R.id.busqrt)
        buttonsi = findViewById(R.id.buSI)
        buttonmin = findViewById(R.id.buMIN)
        buttonmax = findViewById(R.id.buMAX)
        buttonpow = findViewById(R.id.buPOW)
        buttonAC = findViewById(R.id.buclearall)
        buttonC = findViewById(R.id.buC)
        buttondivide = findViewById(R.id.budivide)
        buttonminus = findViewById(R.id.buminus)
        buttonplus = findViewById(R.id.buplus)
        buttonenter = findViewById(R.id.buENTER)
        buttonmultiply = findViewById(R.id.bumultiply)
        buttonmodulus = findViewById(R.id.bumodulus)
        buttoninv = findViewById(R.id.buINV)

        var text: String

        button1.setOnClickListener {
            text = firstTextView.text.toString() + "1"
            firstTextView.setText(text)
            result(text)
        }
        button2.setOnClickListener {
            text = firstTextView.text.toString() + "2"
            firstTextView.setText(text)
            result(text)
        }
        button3.setOnClickListener {
            text = firstTextView.text.toString() + "3"
            firstTextView.setText(text)
            result(text)
        }
        button4.setOnClickListener {
            text = firstTextView.text.toString() + "4"
            firstTextView.setText(text)
            result(text)
        }
        button5.setOnClickListener {
            text = firstTextView.text.toString() + "5"
            firstTextView.setText(text)
            result(text)
        }
        button6.setOnClickListener {
            text = firstTextView.text.toString() + "6"
            firstTextView.setText(text)
            result(text)
        }
        button7.setOnClickListener {
            text = firstTextView.text.toString() + "7"
            firstTextView.setText(text)
            result(text)
        }
        button8.setOnClickListener {
            text = firstTextView.text.toString() + "8"
            firstTextView.setText(text)
            result(text)
        }
        button9.setOnClickListener {
            text = firstTextView.text.toString() + "9"
            firstTextView.setText(text)
            result(text)
        }
        button0.setOnClickListener {
            text = firstTextView.text.toString() + "0"
            firstTextView.setText(text)
            result(text)
        }

        buttonplus.setOnClickListener {
            result("+")
        }
        buttonminus.setOnClickListener {
            result("-")
        }
        buttonmultiply.setOnClickListener {
            result("×")
        }
        buttondivide.setOnClickListener {
            result("÷")
        }
        buttonmodulus.setOnClickListener {
            result("%")
        }
        buttonmax.setOnClickListener {
            val list = mutableListOf<Double>()

            if (fourthTextView.text.isNotEmpty()) {
                list.add(fourthTextView.text.toString().toDouble())
            }
            if (thirdTextView.text.isNotEmpty()) {
                list.add(thirdTextView.text.toString().toDouble())
            }
            if (secondTextView.text.isNotEmpty()) {
                list.add(secondTextView.text.toString().toDouble())
            }
            if (firstTextView.text.isNotEmpty()) {
                list.add(firstTextView.text.toString().toDouble())
            }
            if (list.isEmpty()) {
                Toast.makeText(this, "Please enter some numbers", Toast.LENGTH_SHORT).show()
            } else {
                val max = list.maxOrNull()
                firstTextView.setText(max.toString())
            }
        }
        buttonmin.setOnClickListener {
            val list = mutableListOf<Double>()

            if (fourthTextView.text.isNotEmpty()) {
                list.add(fourthTextView.text.toString().toDouble())
            }
            if (thirdTextView.text.isNotEmpty()) {
                list.add(thirdTextView.text.toString().toDouble())
            }
            if (secondTextView.text.isNotEmpty()) {
                list.add(secondTextView.text.toString().toDouble())
            }
            if (firstTextView.text.isNotEmpty()) {
                list.add(firstTextView.text.toString().toDouble())
            }
            if (list.isEmpty()) {
                Toast.makeText(this, "Please enter some numbers", Toast.LENGTH_SHORT).show()
            } else {
                val min = list.minOrNull()
                firstTextView.setText(min.toString())
            }
        }
        buttonsqrt.setOnClickListener {
            if (firstTextView.text.isNotEmpty()) {
                val num = firstTextView.text.toString().toDouble()
                val sqrt = Math.sqrt(num)
                firstTextView.setText(sqrt.toString())
            } else {
                Toast.makeText(this, "Please enter some numbers", Toast.LENGTH_SHORT).show()
            }
        }
        buttonsi.setOnClickListener {
            if (thirdTextView.text.isNotEmpty() && secondTextView.text.isNotEmpty() && firstTextView.text.isNotEmpty()) {
                val principal = thirdTextView.text.toString().toDouble()
                val rate = secondTextView.text.toString().toDouble()
                val time = firstTextView.text.toString().toDouble()
                val interest = (principal * rate * time) / 100
                firstTextView.setText(interest.toString())
            } else {
                Toast.makeText(this, "Please enter all values", Toast.LENGTH_SHORT).show()
            }
        }
        buttonpow.setOnClickListener {
            if (firstTextView.text.isNotEmpty()) {
                val inputValue = secondTextView.text.toString().toDouble()
                val result = Math.pow(inputValue, firstTextView.text.toString().toDouble())
                firstTextView.setText(result.toString())
            } else {
                Toast.makeText(this, "result", Toast.LENGTH_SHORT).show()
            }
        }
        buttoninv.setOnClickListener {
            if (firstTextView.text.isNotEmpty()) {
                val currentValue = firstTextView.text.toString().toDouble()

                val inverseValue = 1.0 / currentValue

                firstTextView.setText(inverseValue.toString())
            } else {
                Toast.makeText(this, "Please enter some numbers", Toast.LENGTH_SHORT).show()
            }
        }
        buttonAC.setOnClickListener {
            firstTextView.setText(null)
            secondTextView.setText(null)
            thirdTextView.setText(null)
            fourthTextView.setText(null)
        }
        buttonenter.setOnClickListener {
            handlingTextView()
        }

        buttonC.setOnClickListener {

            val backSpace: String?
            if (firstTextView.text.isNotEmpty()) {
                val stringBuilder: java.lang.StringBuilder = StringBuilder(firstTextView.text)

                stringBuilder.deleteCharAt(firstTextView.text.length - 1)
                backSpace = stringBuilder.toString()
                firstTextView.setText(backSpace)
                result(backSpace)
            }

        }
    }

    private fun handlingTextView() {
        if (firstTextView.text.isNotEmpty()) {
            if (secondTextView.text.isEmpty()) {
                secondTextView.text = firstTextView.text
                firstTextView.text = ""
            } else {
                if (thirdTextView.text.isNotEmpty()) {
                    thirdTextView.text = secondTextView.text
                    secondTextView.text = firstTextView.text
                    firstTextView.text = ""
                } else {
                    fourthTextView.text = thirdTextView.text
                    thirdTextView.text = secondTextView.text
                    secondTextView.text = firstTextView.text
                    firstTextView.text = ""
                }
            }
        } else {
            Log.d("Error", "Ensure there is a value in the firstTextView")
        }
    }

    private fun result(operator: String) {
        if (firstTextView.text.isEmpty() or secondTextView.text.isEmpty()) {
            Toast.makeText(this, "Please enter all values", Toast.LENGTH_SHORT).show()
        } else if (firstTextView.text.isEmpty() and secondTextView.text.isEmpty()) {
            Toast.makeText(this, "Please enter all values", Toast.LENGTH_SHORT).show()
        } else {
            when (operator) {
                "+" -> {
                    val firstOperand = secondTextView.text.toString().toDouble()
                    val secondOperand = firstTextView.text.toString().toDouble()

                    val sum = firstOperand + secondOperand
                    textViewHandling(sum)
                }
                "-" -> {
                    val firstOperand = firstTextView.text.toString().toDouble()
                    val secondOperand = secondTextView.text.toString().toDouble()

                    val sub = firstOperand - secondOperand
                    textViewHandling(sub)
                }
                "×" -> {
                    val firstOperand = firstTextView.text.toString().toDouble()
                    val secondOperand = secondTextView.text.toString().toDouble()

                    val multiplication = firstOperand * secondOperand
                    textViewHandling(multiplication)
                }
                "÷" -> {
                    val firstOperand = firstTextView.text.toString().toDouble()
                    val secondOperand = secondTextView.text.toString().toDouble()

                    val division = firstOperand / secondOperand
                    textViewHandling(division)
                }
                "%" -> {
                    val firstOperand = firstTextView.text.toString().toDouble()
                    val secondOperand = secondTextView.text.toString().toDouble()

                    val modulus = firstOperand % secondOperand
                    textViewHandling(modulus)
                }
            }
        }
    }

    private fun textViewHandling(operation: Double) {
        if (thirdTextView.text.isEmpty()) {
            secondTextView.text = ""
        } else {
            secondTextView.text = thirdTextView.text

            if (fourthTextView.text.isEmpty()) {
                thirdTextView.text = ""
                fourthTextView.text = ""
            } else {
                thirdTextView.text = fourthTextView.text
                fourthTextView.text = ""
            }
        }

        firstTextView.text = operation.toString()
    }
}
