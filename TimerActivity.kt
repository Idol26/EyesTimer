package com.eyestimer

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.textSize = 32f
        setContentView(text)

        object : CountDownTimer(20000, 1000) {
            override fun onTick(ms: Long) {
                text.text = "Смотри вдаль 👀\n${ms / 1000}"
            }

            override fun onFinish() {
                finish()
            }
        }.start()
    }
}
