package com.munozcristhian.pholapsc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

import com.munozcristhian.pholapsc.ui.main.SectionsPagerAdapter
import com.munozcristhian.pholapsc.databinding.ActivityCategoryBinding
import com.munozcristhian.pholapsc.model.Usuario

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding
    private lateinit var usuario: Usuario

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras != null) {
            usuario = extras.get(CURRENT_USER) as Usuario
        }else{
            Log.d("CATEGORY_LOG", "No hay extras para Category")
        }


        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        binding.floatingActionButtonConfiguraciones.setOnClickListener(){
            val intent = Intent(this, ConfiguracionesActivity::class.java)
            intent.putExtra(CURRENT_USER, usuario)
            startActivity(intent)

        }
        binding.floatingActionButtonAgendarSesion.setOnClickListener(){
            val intent = Intent(this, SessionActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.floatingActionButtonCerrarSesion.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.floatingActionButtonImprimir.setOnClickListener(){
            val intent = Intent(this, SeleccionActivity::class.java).also {
                startActivity(it)
            }
        }



    }
}