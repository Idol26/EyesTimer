package com.eyestimer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val work = PeriodicWorkRequestBuilder<ReminderWorker>(
            20, TimeUnit.MINUTES
        ).build()

        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            "eye_timer",
            ExistingPeriodicWorkPolicy.KEEP,
            work
        )

        finish()
    }
}
