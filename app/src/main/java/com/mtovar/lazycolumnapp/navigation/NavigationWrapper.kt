package com.mtovar.lazycolumnapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.mtovar.lazycolumnapp.ui.theme.screens.TreeDetailScreen
import com.mtovar.lazycolumnapp.ui.theme.screens.TreeListScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TreeList) {

        composable<TreeList> {
            TreeListScreen(
                modifier = Modifier,
                onNavigateBack = { navController.popBackStack() },
                onNavigateToDetail = { treeId -> navController.navigate(TreeDetail(treeId)) }
            )
        }
        composable<TreeDetail> { backStackEntry ->
            val id = backStackEntry.toRoute<TreeDetail>().treeId
            TreeDetailScreen(treeId = id, modifier = Modifier, onNavigateBack = { navController.popBackStack() })
        }
    }
}

