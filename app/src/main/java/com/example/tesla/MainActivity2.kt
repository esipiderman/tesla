package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.tesla.databinding.ActivityMain2Binding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.battery.setOnClickListener {
            changeView(binding.battery)
        }
        binding.dry.setOnClickListener {
            changeView(binding.dry)
        }
        binding.range.setOnClickListener {
            changeView(binding.range)
        }
        binding.program.setOnClickListener {
            changeView(binding.program)
        }
    }

    private fun changeView(view: NeumorphImageView) {
        if (view.getShapeType() == ShapeType.FLAT){
            view.setShapeType(ShapeType.PRESSED)
            view.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN)

        }else{
            view.setShapeType(ShapeType.FLAT)
            view.setColorFilter(
                ContextCompat.getColor(this, R.color.text_gray),
                android.graphics.PorterDuff.Mode.SRC_IN)
        }
    }
}