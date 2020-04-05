package net.codeinreal.amriahmadadibi.projects.samples.chaboktestimp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adpdigital.push.AdpPushClient
import com.adpdigital.push.config.Environment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AdpPushClient.configureEnvironment(Environment.SANDBOX);

        val intent = intent
        val uriData = intent.data
    }
}
