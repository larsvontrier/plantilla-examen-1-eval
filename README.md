
# _Daily Coffee_


La empresa **Stardust Coffee** ha decidido lanzar una aplicación móvil Android para la **recomendación de un café al día**, así como la _compra y pedidos de la tienda online_. La aplicación mostrará un café recomendado para el día, elegido aleatoriamente de una lista de cafés guardados en la base de datos de la aplicación.

De momento, nos limitaremos a la parte de **recomendación de un café al día** y mostrar la información de los cafés en la aplicación, así como una calculadora de calorías de los cafés.

> [!NOTE]
> Toda la **parte del modelo de datos (`Cafe`, `Categoria`, `CategoriaCafe`) y la base de datos (`CoffeeDatabase`, `CafeDao`, `CategoriaDao`, `CafeRepository` y `CategoriaRepository`)** **ya está implementada en el proyecto**. No es necesario modificarla.
> 
> Limítate a **trabajar con las entidades y los repositorios que ya están implementados**.
> 
> **El tema de la aplicación y las dependencias necesarias (Room, material, ...) ya están añadidas en el proyecto**. En cualquier caso, no te preocupes por el aspecto de la aplicación no se ajuste exactamente a lo que muestra el enunciado (he hecho elementos de mejora). Lo importante es que la aplicación, compile y funcione correctamente, tal y como se pide.
Se han **añadido tres fuentes personalizadas a la carpeta `res/font`** que puedes utilizar en la aplicación: `merienda_variable.ttf`, `pacifico_regular.ttf` y `sodo_sans.ttf`.

La aplicación se llamará **Daily Coffee** y estará compuesta por tres actividades (la **información en cursiva con "Futuras implementaciones" no se debe implantar, es para futuras implementaciones y retos durante las vacaciones de Navidad**):

1. **MainActivity**: pantalla de inicio de la aplicación, que **mostrará un café recomendado para el día**, elegido aleatoriamente de una lista de cafés guardados en la base de datos de la aplicación. Dispone de un menú superior con 3 opciones:
    - **Quiero otro**: muestra un café aleatorio de la base de datos.
    - **Categorías**: muestra una lista de categorías de café.
    - **Calorie Calculator**: calculadora de calorías de los cafés, que lleva a una actividad que permite calcular las calorías del café que aparece en pantalla. Le pasa las calorías del café a la actividad de cálculo.
2. **CalorieCalculatorActivity**: calculadora de calorías de los cafés. Recibe las calorías del café que se muestra en la actividad principal y permite al usuario introducir sel número de tazas. **Calcula las calorías** y el **porcentaje** de la cantidad diaria recomendada de calorías **que aporta el café**, dependiendo de si es hombre (2500 kcal) o mujer (2000 kcal). Los datos se muestran en un EditText o un TextView (usa el que prefieras).
3. **CategoriasActivity**: pantalla que muestra una **lista de categorías de café** (por ejemplo, "Americanos", "Brewed Coffees", "Cappuccinos", etc.). _(Futuras implementaciones: al hacer clic en una categoría, se abrirá una nueva actividad que mostrará una lista de cafés de esa categoría o las mostrará en la propia actividad)._ _Lo recomendable sería que la lista de categorías se muestre en un `RecyclerView`, pero como todavía no lo hemos visto (no he querido cargar mucho la materia durante las últimas semanas)_, se debe **mostrar en un `ListView`** que requiere de un **ArrayAdapter** para mostrar los datos de la lista de categorías.
4. _(Futuras implementaciones) **AddCoffeeActivity**: pantalla para agregar un nuevo café a la lista de cafés recomendados._

## Tareas

- [x] Ajustes de la aplicación
- [ ] `MainActivity`
- [ ] `CalorieCalculatorActivity`
- [ ] `CategoriasActivity` (con `RecyclerView`)
- [ ] Implantar un `ViewModel`: `CoffeeListViewModel`, empleando Flow y LiveData.
- [ ] Crear un Fragmento para mostrar la lista de cafés del flujo y actualizar la UI.
