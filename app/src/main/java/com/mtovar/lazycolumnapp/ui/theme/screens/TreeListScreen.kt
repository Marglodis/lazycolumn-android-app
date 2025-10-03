package com.mtovar.lazycolumnapp.ui.theme.screens

import android.text.style.IconMarginSpan
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.test.espresso.base.Default
import com.mtovar.lazycolumnapp.R
import com.mtovar.lazycolumnapp.components.TreeItem
import com.mtovar.lazycolumnapp.data.ChileanTree
import com.mtovar.lazycolumnapp.data.ChileanTreeData
import com.mtovar.lazycolumnapp.navigation.TreeDetail


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TreeListScreen (modifier: Modifier,
                    onNavigateBack: () -> Unit,
                    onNavigateToDetail: (String) -> Unit){

    val context = LocalContext.current

    var trees by remember { mutableStateOf<List<ChileanTree>>(ChileanTreeData.chileanTreeList) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Árboles Navitos de Chile") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.statusBarsPadding().fillMaxSize().padding(innerPadding)
        ) {
            LazyColumn {
                items(ChileanTreeData.chileanTreeList) { tree ->
                    TreeItem(modifier, tree, onClick = {onNavigateToDetail(tree.id)})
                }
            }

        }
    }
}