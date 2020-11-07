package com.android.academy.fundamentals

import android.content.Intent
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import org.w3c.dom.Text
const val TRANSMITTED_STRING = "transmitted_string"
const val TRANSMITTED_INT = "transmitted_int"
const val TRANSMITTED_BOOLEAN = "transmitted_boolean"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val string = "string to transmit"
            val int = 12
            val boolean = true
            intent.putExtra(TRANSMITTED_STRING, string)
            intent.putExtra(TRANSMITTED_INT, int)
            intent.putExtra(TRANSMITTED_BOOLEAN, boolean)
            startActivity(intent)
        }

    }
}
