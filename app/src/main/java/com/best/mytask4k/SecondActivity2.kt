package com.best.mytask4k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.best.mytask4k.Users.Member

class SecondActivity2 : AppCompatActivity() {
    private var TAG = SecondActivity2::class.java.toString()
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        open()
    }

    private fun open() {
        val button = findViewById<Button>(R.id.btn2)
        button.setOnClickListener {
            val member = Member("Abbos", 1247)
            getBack(member)
        }
        textView = findViewById(R.id.txtbtnn2)
        val user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())
        textView.text = user.toString()
    }

    private fun getBack(member: Member) {
        val intent = Intent()
        intent.putExtra("user", member)
        setResult(RESULT_OK, intent)
        finish()
    }
}