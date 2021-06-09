package com.aman.foodordering

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.foodordering.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.activity_telp.*

class telp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telp)

        btntelp.setOnClickListener{
            val intent = Intent(this, Order::class.java)
            startActivity(intent)
        }
    }

}