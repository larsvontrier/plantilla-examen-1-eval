package local.sanclemente.dailycafe.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categoria(
    @PrimaryKey(autoGenerate = true) val idCategoria: Int = 0,
    val nombre: String
)