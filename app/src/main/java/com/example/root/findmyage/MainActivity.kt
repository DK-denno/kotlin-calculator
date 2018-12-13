package com.example.root.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun buNumberEvent(view: View) {
        if (isNewOp){
            display.setText("")
        }
        isNewOp = false
        var buSelect = view as Button
        var buClickValue = display.text.toString()
        when (buSelect.id) {
            bu0.id -> {
                buClickValue += "0"
            }
            bu1.id -> {
                buClickValue += "1"
            }
            bu2.id -> {
                buClickValue += "2"
            }
            bu3.id -> {
                buClickValue += "3"
            }
            bu4.id -> {
                buClickValue += "4"
            }
            bu5.id -> {
                buClickValue += "5"
            }
            bu6.id -> {
                buClickValue += "6"
            }
            bu7.id -> {
                buClickValue += "7"
            }
            bu8.id -> {
                buClickValue += "8"
            }
            bu9.id -> {
                buClickValue += "9"
            }budot.id -> {
                buClickValue += "."
            }buplusMin.id -> {
                var x = 0 - buClickValue.toInt()
                buClickValue = x.toString()
            }
        }
        display.setText(buClickValue)
    }

    var op = "*"
    var isNewOp = true
    var oldNumber:String=""

    fun buOp(view:View) {
        var buSelected = view as Button
        when (buSelected.id) {
            budiv.id -> {
                op = "/"
            }
            bumul.id -> {
                op = "*"
            }
            busub.id -> {
                op = "-"
            }
            busum.id -> {
                op = "+"
            }
        }
        oldNumber = display.text.toString()
        isNewOp = true
    }
     fun buEqual(view:View){
         var newNumber = display.text.toString().toDouble()
         var result:Double?=null
         when(op){
             "*"->{
                 result = oldNumber.toDouble() * newNumber
             }"/"->{
                 result = oldNumber.toDouble() / newNumber
             }"+"->{
                result = oldNumber.toDouble() + newNumber
             }"-"->{
                result = oldNumber.toDouble() - newNumber
             }
         }
         display.setText(result.toString())
         isNewOp = true
     }
    fun buClear(view:View){
        display.setText("0")
    }
    fun bupercent(view:View){
        var number:Double = display.text.toString().toDouble()/100
        display.setText(number.toString())
        isNewOp = true

    }
}

