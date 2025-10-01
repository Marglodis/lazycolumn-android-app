package com.mtovar.lazycolumnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.mtovar.lazycolumnapp.ui.theme.LazyColumnAppTheme
import com.mtovar.lazycolumnapp.ui.theme.screens.TreeListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TreeListScreen(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
