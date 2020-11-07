package com.android.academy.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val stringFromFirstActivity = intent.getStringExtra(TRANSMITTED_STRING)
        val intFromFirstActivity = intent.getIntExtra(TRANSMITTED_INT, 0)
        val booeanFromFirstActivity = intent.getBooleanExtra(TRANSMITTED_BOOLEAN, false)

        val textView = findViewById<TextView>(R.id.second_activity_text_view)
        textView.text = "stringFromFirstActivity $stringFromFirstActivity \nintFromFirstActivity $intFromFirstActivity \nbooeanFromFirstActivity $booeanFromFirstActivity"

        Log.i("MyTag", "stringFromFirstActivity $stringFromFirstActivity " +
                "\nintFromFirstActivity $intFromFirstActivity \nbooeanFromFirstActivity $booeanFromFirstActivity")

    }

}