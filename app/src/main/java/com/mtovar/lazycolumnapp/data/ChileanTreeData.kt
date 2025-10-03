package com.mtovar.lazycolumnapp.data

import com.mtovar.lazycolumnapp.R

object ChileanTreeData {
    val chileanTreeList = listOf(
        ChileanTree(
            id = "1",
            name = "Arrayán",
            latinName = "Luma apiculata",
            description = "Árbol nativo del sur de Chile y Argentina, reconocido por su corteza lisa y rojiza con manchas blancas. Sus flores blancas son muy aromáticas y su madera se utiliza en artesanías.",
            image = R.drawable.arrayan
        ),
        ChileanTree(
            id = "2",
            name = "Calafate",
            latinName = "Berberis microphylla",
            description = "Arbusto espinoso típico de la Patagonia. Produce frutos azul oscuro comestibles y muy apreciados en mermeladas y licores. Existe una leyenda que dice que quien come calafate siempre vuelve a la Patagonia.",
            image = R.drawable.calafate
        ),
        ChileanTree(
            id = "3",
            name = "Chilco",
            latinName = "Fuchsia magellanica",
            description = "Arbusto ornamental con flores colgantes rojas y violetas, muy atractivas para los colibríes. Crece en zonas húmedas del sur de Chile y Argentina.",
            image = R.drawable.chilco
        ),
        ChileanTree(
            id = "4",
            name = "Coligue",
            latinName = "Chusquea culeou",
            description = "Bambú nativo de Chile y Argentina, de tallos gruesos y resistentes. Es usado tradicionalmente para construcción rústica, cercos y artesanía.",
            image = R.drawable.coligue
        ),
        ChileanTree(
            id = "5",
            name = "Maqui",
            latinName = "Aristotelia chilensis",
            description = "Arbusto siempreverde cuyas bayas negras son consideradas un superalimento por su alto contenido de antioxidantes. Crece en la zona centro-sur de Chile.",
            image = R.drawable.maqui
        ),
        ChileanTree(
            id = "6",
            name = "Lenga",
            latinName = "Nothofagus pumilio",
            description = "Árbol caducifolio de los bosques australes, muy resistente al frío. Su madera se utiliza en carpintería y calefacción. Forma extensos bosques en la Patagonia.",
            image = null
        ),
        ChileanTree(
            id = "7",
            name = "Manzano",
            latinName = "Malus domestica",
            description = "Árbol frutal ampliamente cultivado en Chile. Produce manzanas de distintas variedades que son base de la industria frutícola nacional.",
            image = null
        ),
        ChileanTree(
            id = "8",
            name = "Meli",
            latinName = "Amomyrtus meli",
            description = "Árbol nativo de los bosques templados del sur de Chile. De follaje denso y madera dura, es apreciado por su resistencia y valor ecológico.",
            image = R.drawable.meli
        ),
        ChileanTree(
            id = "9",
            name = "Murta",
            latinName = "Ugni molinae",
            description = "Arbusto endémico de Chile, conocido por sus pequeños frutos rojos y dulces, muy utilizados en mermeladas, licores y repostería. También llamada guayabo chileno.",
            image = R.drawable.murta
        ),
        ChileanTree(
            id = "10",
            name = "Nalca",
            latinName = "Gunnera tinctoria",
            description = "Planta de gran tamaño con hojas enormes, usadas tradicionalmente como plato natural en fiestas costumbristas. Sus tallos carnosos se consumen frescos con sal.",
            image = R.drawable.nalca
        ),
        ChileanTree(
            id = "11",
            name = "Quila",
            latinName = "Chusquea quila",
            description = "Bambú nativo que crece en forma de matorrales densos en zonas húmedas. Sus tallos son más delgados que el coligue y forman parte esencial de los bosques valdivianos.",
            image = R.drawable.quila
        ),
        ChileanTree(
            id = "12",
            name = "Sauco",
            latinName = "Sambucus nigra",
            description = "Arbusto de rápido crecimiento, muy común en el sur de Chile. Sus flores blancas y frutos negros se utilizan en preparaciones medicinales y culinarias.",
            image = R.drawable.sauco
        ),
        ChileanTree(
            id = "13",
            name = "Tapuco",
            latinName = "Dasyphyllum diacanthoides",
            description = "Árbol nativo de follaje perenne y espinas características. Sus flores son pequeñas y blancas. Crece en bosques húmedos del centro-sur de Chile.",
            image = null
        ),
        ChileanTree(
            id = "14",
            name = "Tejoco",
            latinName = "Crataegus mexicana",
            description = "Árbol originario de México pero introducido en Chile. Produce frutos amarillos o anaranjados que se consumen frescos o en preparaciones tradicionales.",
            image = null
        )
    ).sortedBy { it.name }


}