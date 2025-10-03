package com.mtovar.lazycolumnapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mtovar.lazycolumnapp.components.TreeItem
import com.mtovar.lazycolumnapp.data.ChileanTreeData

// Paleta de colores

val SoftMint = Color(0xFFD4E7C5)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreeListScreen(
    modifier: Modifier,
    onNavigateToDetail: (String) -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Árboles Navitos de Chile") },
                /*navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "Back"
                        )
                    }
                },*/
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = ForestGreen
                )
            )
        },
        containerColor = CreamWhite
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(SoftMint.copy(alpha = 0.3f), Color.Transparent)
                        )
                    )
            )


            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 16.dp)
                ) {
                    Text(
                        text = "Descubre",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = ForestGreen
                    )
                    Text(
                        text = "${ChileanTreeData.chileanTreeList.size} especies nativas",
                        color = SageGreen,
                        fontWeight = FontWeight.Medium
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))

                LazyColumn(
                    contentPadding = PaddingValues(bottom = 16.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    items(ChileanTreeData.chileanTreeList) { tree ->
                        TreeItem(modifier, tree, onClick = { onNavigateToDetail(tree.id) })
                    }
                }

            }
        }
    }
}