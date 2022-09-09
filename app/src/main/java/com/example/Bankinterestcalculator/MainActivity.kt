package com.example.Bankinterestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: Int
        button_showpric.setOnClickListener {

            if (editTextTextPric.text.length == 0) {

                Toast.makeText(this, "لطفا مقدار ورودی را برسی نمایید", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                val pric = editTextTextPric.text.toString().toInt()

                if (radioButton_onemonth.isChecked) {
                    result = pric * 10 / 100
                } else {
                    result = (pric * 12 / 100) * 3
                }

                val df = DecimalFormat("0,000 تومان")
                val count = result


                Toast.makeText(
                    this,
                    "سود شما برابر است با : " + df.format(count),
                    Toast.LENGTH_SHORT
                ).show()


            }
        }

}