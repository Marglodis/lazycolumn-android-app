package com.mtovar.lazycolumnapp.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mtovar.lazycolumnapp.components.TreeItem

@Composable
fun TreeListScreen (modifier: Modifier){
    val chileanTreeList =
        listOf("arrayan", "calafate", "chilco",
            "coligue", "maqui","lengo", "manzano","meli", "murta",
            "nalca", "quila", "sauco","tapuco","tejoco").sorted()
    Column (modifier = modifier){
        LazyColumn(modifier = modifier) {
            items(chileanTreeList) { tree ->
               // Text(text = tree, modifier = Modifier.padding(20.dp), fontSize = 18.sp)
               /* Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
                    Text(text = tree)

                }*/
                TreeItem()
            }
        }

    }
}