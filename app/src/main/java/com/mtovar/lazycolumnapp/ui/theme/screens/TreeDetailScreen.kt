package com.mtovar.lazycolumnapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mtovar.lazycolumnapp.R
import com.mtovar.lazycolumnapp.data.ChileanTreeData

// Paleta de colores inspirada en la naturaleza
val ForestGreen = Color(0xFF2D5016)
val SageGreen = Color(0xFF87A96B)
val LightGreen = Color(0xFFB8C5A8)
val CreamWhite = Color(0xFFFAF8F3)
val EarthBrown = Color(0xFF8B7355)
val DeepGreen = Color(0xFF1B3409)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreeDetailScreen(modifier: Modifier, treeId: String, onNavigateBack: () -> Unit) {

    val tree = ChileanTreeData.chileanTreeList.find { it.id == treeId }
        ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = tree.name,
                        fontWeight = FontWeight.Bold,
                        color = CreamWhite
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_arrrow_back),
                            contentDescription = "Volver",
                            tint = CreamWhite
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = ForestGreen
                )
            )
        },
        containerColor = CreamWhite
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header con gradiente
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(ForestGreen, SageGreen)
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .size(200.dp)
                        .shadow(12.dp, CircleShape),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = CreamWhite
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        if (tree.image != null) {
                            Image(
                                painter = painterResource(id = tree.image),
                                contentDescription = tree.name,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.radialGradient(
                                            colors = listOf(LightGreen, SageGreen)
                                        )
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = tree.name.first().uppercase(),
                                    style = MaterialTheme.typography.displayLarge,
                                    color = ForestGreen,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }

            // Contenido principal
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Nombre

                    Text(
                        text = tree.name,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp,
                        color = DeepGreen,
                        modifier = Modifier.padding(16.dp)
                    )

                // Nombre científico
                tree.latinName?.let {

                        Text(
                            text = it,
                            style = MaterialTheme.typography.titleLarge,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Normal,
                            color = DeepGreen,
                        )

                }

                Spacer(modifier = Modifier.height(24.dp))

                // Descripción
                tree.description?.let {

                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color(0xFF2D3436),
                            lineHeight = MaterialTheme.typography.bodyLarge.lineHeight.times(1.2f),
                            modifier = Modifier.padding(20.dp)
                        )

                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}