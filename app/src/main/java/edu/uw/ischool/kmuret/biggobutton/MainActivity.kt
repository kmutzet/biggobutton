package edu.uw.ischool.kmuret.biggobutton

import android.os.Bundle
import android.widget.Button
import android.graphics.Color
import kotlin.random.Random
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gButton = findViewById<Button>(R.id.gButton)
        gButton.setOnClickListener {
            counter++
            if (counter == 1) {
                gButton.text = getString(R.string.button_text_pushed_once)
            } else {
                gButton.text = "You have pushed me $counter times!"
            }
            val randBackground = Color.argb(255,Random.nextInt(256),Random.nextInt(256), Random.nextInt(256))
            gButton.setBackgroundColor(randBackground)
            val randomColor = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            gButton.setTextColor(randomColor)
        }
    }
}