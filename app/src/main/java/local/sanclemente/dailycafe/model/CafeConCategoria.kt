package local.sanclemente.dailycafe.model

import androidx.room.Embedded
import androidx.room.Relation

data class CafeConCategoria (
    @Embedded val cafe: Cafe,
    @Relation(
        parentColumn = "idCategoria",
        entityColumn = "idCategoria"
    )
    val categoria: Categoria

)