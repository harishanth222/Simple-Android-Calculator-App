package com.example.calexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calexample.Model.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNum1:EditText
    lateinit var edtNum2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNum1 = findViewById(R.id.edtNum1)
        edtNum2 = findViewById(R.id.edtNum2)



    }

    fun buttonClick(v:View){

        var ans = 0.0;
        val calculator = Calculator(
                edtNum1.text.toString().toDouble(),
                edtNum2.text.toString().toDouble()
                )

        when(v.id){
            R.id.btnAdd -> ans=calculator.add()
            R.id.btnSub -> ans=calculator.sub()
            R.id.btnMul -> ans=calculator.mul()
            R.id.btnDiv -> ans=calculator.divide()
        }

        Toast.makeText(this,"Answer is $ans",Toast.LENGTH_SHORT).show()
    }
}