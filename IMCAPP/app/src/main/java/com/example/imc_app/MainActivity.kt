package com.example.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ** Clique no card IMC
        val cardImc = findViewById<CardView>()

        card_imc.setOnClickListener {

            val abrirImcActivity = Intent(this, ImcActivity::class.java)
            startActivity(abrirImcActivity)
        }
    }
}