package com.mtovar.lazycolumnapp.navigation

import kotlinx.serialization.Serializable

@Serializable
object TreeList

@Serializable
data class TreeDetail(
    val treeId: String,
)


