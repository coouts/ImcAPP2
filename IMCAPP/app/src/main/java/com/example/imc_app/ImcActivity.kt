package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        //** Clique no card IMC
        card_imc.setOnClickListener {
            Toast.makeText(this, "Imc foi clicado", Toast.LENGTH_LONG).show()

        }
    }
}