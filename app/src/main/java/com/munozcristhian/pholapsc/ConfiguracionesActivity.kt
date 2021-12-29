package com.munozcristhian.pholapsc

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Button

class ConfiguracionesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuraciones)
        var btnPerfil = findViewById<Button>(R.id.btnPerfilConfiguraciones)
        btnPerfil.setOnClickListener {
            val intention = Intent(this, Perfil_Activity::class.java)
            startActivity(intention)
        }

    }
}