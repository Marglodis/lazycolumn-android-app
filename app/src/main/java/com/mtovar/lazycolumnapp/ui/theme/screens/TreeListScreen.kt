package com.mtovar.lazycolumnapp.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mtovar.lazycolumnapp.components.TreeItem
import com.mtovar.lazycolumnapp.data.ChileanTreeData

@Composable
fun TreeListScreen (modifier: Modifier){

    Column {
        LazyColumn {
            items(ChileanTreeData.chileanTreeList) { tree ->
                TreeItem(modifier, tree)
            }
        }

    }
}