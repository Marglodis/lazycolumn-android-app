package com.mtovar.lazycolumnapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mtovar.lazycolumnapp.data.ChileanTree
import com.mtovar.lazycolumnapp.ui.theme.screens.CreamWhite
import com.mtovar.lazycolumnapp.ui.theme.screens.DeepGreen
import com.mtovar.lazycolumnapp.ui.theme.screens.ForestGreen
import com.mtovar.lazycolumnapp.ui.theme.screens.LightGreen
import com.mtovar.lazycolumnapp.ui.theme.screens.SageGreen
import com.mtovar.lazycolumnapp.ui.theme.screens.SoftMint

@Preview
@Composable
fun TreeItem(
    modifier: Modifier = Modifier,
    chileanTree: ChileanTree =
        ChileanTree(
            id = "1",
            name = "Testing Tree",
            latinName = "Testing Latin Name",
            image = 3,
            description = null
        ),
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            modifier = modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color.White,
                            SoftMint.copy(alpha = 0.15f)
                        )
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // Avatar con borde decorativo
            Box(
                modifier = Modifier.size(90.dp),
            ) {
                // Borde exterior con gradiente
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(SageGreen, LightGreen)
                            ),
                            shape = CircleShape
                        )
                )

                // Avatar interior
                Card(
                    modifier = Modifier
                        .size(82.dp)
                        .align(Alignment.Center)
                        .shadow(6.dp, CircleShape),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = CreamWhite
                    )
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        if (chileanTree.image != null) {
                            Image(
                                painter = painterResource(id = chileanTree.image),
                                contentDescription = chileanTree.name,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            // Fondo con gradiente cuando no hay imagen
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
                                    text = chileanTree.name.first().uppercase(),
                                    color = ForestGreen,
                                    style = MaterialTheme.typography.headlineMedium,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(18.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = chileanTree.name,
                    color = DeepGreen,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2
                )
                chileanTree.latinName?.let {
                    Text(
                        text = it,
                        color = SageGreen,
                        style = MaterialTheme.typography.bodyMedium,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Normal,
                        maxLines = 1
                    )
                }

            }
        }
    }
}





