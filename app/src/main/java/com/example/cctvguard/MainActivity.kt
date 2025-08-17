package com.example.cctvguard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cctvguard.screens.CCTVApp
import com.example.cctvguard.ui.theme.CCTVGuardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CCTVGuardTheme {
                CCTVApp()
            }
            }
        }
    }


