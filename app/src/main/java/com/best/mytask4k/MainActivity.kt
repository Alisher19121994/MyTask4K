package com.best.mytask4k

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.best.mytask4k.Users.User

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var TAG = MainActivity::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            val user = User("Alisher", 1234)
            openPage(user)
        }
        accept()
    }

     private val launcher = registerForActivityResult(
         ActivityResultContracts.StartActivityForResult()
     ) {
         if (it.resultCode == Activity.RESULT_OK) {
             val data: Intent? = it.data
             val results = data!!.getSerializableExtra("user")
             textView.text = results.toString()
         }
     }

    private fun accept() {
        textView = findViewById(R.id.txtbtnn1)
        val user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())
        textView.text = user.toString()
    }

    private fun openPage(user: User) {
        val intent = Intent(this, SecondActivity2::class.java)
        intent.putExtra("user", user)
        launcher.launch(intent)
    }

}