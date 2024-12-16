package local.sanclemente.dailycafe.db

import android.content.Context
import androidx.room.Room
import local.sanclemente.dailycafe.model.Cafe

private const val NOMBRE_BASE_DATOS = "starbuckscaffee.db"

class CafeRepository private constructor(context: Context) {
    private val baseDeDatos: CafeDatabase = Room
        .databaseBuilder(
            context.applicationContext,
            CafeDatabase::class.java,
            NOMBRE_BASE_DATOS
        )
        .createFromAsset(NOMBRE_BASE_DATOS)
        .build()

    companion object {
        private var INSTANCE: CafeRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CafeRepository(context)
            }
        }

        fun get(): CafeRepository {
            return INSTANCE
                ?: throw IllegalStateException("Debes inicializar el repositorio de cafés")
        }
    }

    suspend fun getCafes() = baseDeDatos.cafeDao().getAll()
    suspend fun insertCafe(cafe: Cafe) = baseDeDatos.cafeDao().insert(cafe)
    suspend fun getCafeById(id: Int) = baseDeDatos.cafeDao().getCafeById(id)
    suspend fun getCafeRandom() = baseDeDatos.cafeDao().getRandom()
    suspend fun findCafeByNombre(nombre: String) = baseDeDatos.cafeDao().findByNome(nombre)
    suspend fun deleteCafe(cafe: Cafe) = baseDeDatos.cafeDao().delete(cafe)
    suspend fun getCafeConCategoriaById(id: Int) = baseDeDatos.cafeDao().getCafeConCategoriaById(id)
    suspend fun getCafeConCategoriaRandom() = baseDeDatos.cafeDao().getRandomCafeConCategoria()
    suspend fun getCategorias() = baseDeDatos.categoriaDao().getAll()

}