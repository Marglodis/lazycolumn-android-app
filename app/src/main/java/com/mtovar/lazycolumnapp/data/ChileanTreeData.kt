package com.mtovar.lazycolumnapp.data

import com.mtovar.lazycolumnapp.R

object ChileanTreeData {
    val chileanTreeList = listOf(
        ChileanTree("1", "Arrayán", "Luma apiculata", R.drawable.arrayan),
        ChileanTree("2", "Calafate", "Berberis microphylla", R.drawable.calafate),
        ChileanTree("3", "Chilco", "Fuchsia magellanica", R.drawable.chilco),
        ChileanTree("4", "Coligue", "Chusquea culeou", R.drawable.coligue),
        ChileanTree("5", "Maqui", "Aristotelia chilensis", R.drawable.maqui),
        ChileanTree("6", "Lenga", "Nothofagus pumilio", null),
        ChileanTree("7", "Manzano", "Malus domestica", null),
        ChileanTree("8", "Meli", "Amomyrtus meli", R.drawable.meli),
        ChileanTree("9", "Murta", "Ugni molinae", R.drawable.murta),
        ChileanTree("10", "Nalca", "Gunnera tinctoria", R.drawable.nalca),
        ChileanTree("11", "Quila", "Chusquea quila", R.drawable.quila),
        ChileanTree("12", "Sauco", "Sambucus nigra", R.drawable.sauco),
        ChileanTree("13", "Tapuco", "Dasyphyllum diacanthoides",null),
        ChileanTree("14", "Tejoco", "Crataegus mexicana", null)
    ).sortedBy { it.name }

}