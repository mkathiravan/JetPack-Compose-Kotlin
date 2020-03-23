package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                App()
            }
        }
    }

    @Preview
    @Composable
    private fun App() {

        var click = ClickCount()
        Column {
            TopAppBar(title = {
                Text(text = "This is toolbar")
            },color = Color.Blue)
            Text(text = "Hi JetPack Compose")
            
            Button {
                Clickable(onClick = {
                    click.count++
                }) {
                    Text(text = "Click ${click.count}")
                }
            }

            Button{
                Clickable(onClick = {startActivity(Intent(this@MainActivity,UserActivity::class.java))}) {
                    Text(text = "Open User Activity")
                }
            }
        }
    }

    @Model
    class ClickCount(var count: Int = 0)
}