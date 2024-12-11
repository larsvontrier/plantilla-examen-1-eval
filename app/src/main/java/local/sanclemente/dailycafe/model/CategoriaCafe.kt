package local.sanclemente.dailycafe.model

import androidx.room.Embedded
import androidx.room.Relation


data class CategoriaCafe (
    @Embedded val categoria: Categoria,
    @Relation(
        parentColumn = "idCategoria",
        entityColumn = "idCategoria"
    )
    val cafes: List<Cafe>
)