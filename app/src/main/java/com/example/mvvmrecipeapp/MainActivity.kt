package com.example.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = null,
                )
            }
        }
    }
}