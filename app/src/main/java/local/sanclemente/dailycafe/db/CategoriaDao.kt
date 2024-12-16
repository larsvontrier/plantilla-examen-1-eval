package local.sanclemente.dailycafe.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import local.sanclemente.dailycafe.model.Categoria
import local.sanclemente.dailycafe.model.CategoriaCafe

@Dao
interface CategoriaDao {

    @Insert
    suspend fun insert(categoria: Categoria)

    @Query("SELECT * FROM Categoria")
    suspend fun getAll(): List<Categoria>

    @Query("SELECT * FROM Categoria WHERE idCategoria = :idCategoria")
    suspend fun getCategoriaById(idCategoria: Int): Categoria

    //
    @Query("SELECT * FROM Categoria ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandom(): Categoria

    @Transaction
    @Query("Select * from Categoria")
    fun getCategoriaCafes(): List<CategoriaCafe>

}