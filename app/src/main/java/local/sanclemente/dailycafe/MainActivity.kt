package local.sanclemente.dailycafe

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
// Corrutinas: para que las consultas a la base de datos se hagan en un hilo secundario
// (sin bloquear la interfaz de usuario)
import androidx.lifecycle.lifecycleScope
import com.pepinho.dailycafe.R
import kotlinx.coroutines.launch

// Importaciones del modelo y para asignar imágenes a partir de array de bytes
import local.sanclemente.dailycafe.db.CafeRepository


class MainActivity : AppCompatActivity() {

    lateinit var repository: CafeRepository
    // TAREA: declara el binding y el cafeConCategoria

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // TAREA: inicializa el binding y cambia el setContentView,
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Creo el repositorio y cargo un café
        repository = CafeRepository.get()
        getCoffee()

        // TAREA: asigna los eventos a los botones:
        // - Calcular calorías
        // - Obtener otro café
        // - Ver categorías

    }





    private fun getCoffee(){
        lifecycleScope.launch {
            // TAREA : habilita esta línea para obtener un café aleatorio cuando hayas declarado el
            // cafeConCategoria
//            cafeConCategoria = repository.getCafeConCategoriaRandom()
            updateUI()
        }
    }

    private fun updateUI(){
        /* TAREA:
        Actualiza los campos de la interfaz de usuario con los datos del café de obtenido de
        la base de datos: nombre, imagen, tipo, calorías y descripción.
        La imagen se asigna con setImageFromBytes a partir del array de bytes que se obtiene
        en cafeConCategoria.cafe.foto
         */
    }

}