package com.mtovar.lazycolumnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mtovar.lazycolumnapp.navigation.NavigationWrapper
import com.mtovar.lazycolumnapp.ui.theme.LazyColumnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnAppTheme {
                NavigationWrapper()
            }
        }
    }
}
