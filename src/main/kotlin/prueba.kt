
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun rand(): String {
    val hora = (0..24).random()
    val minuto = (0..60).random()
    var rh = hora.toString()
    var rm = minuto.toString()
    if (hora<10)  rh = "0"+hora.toString()
    if (minuto<10)  rm = "0"+minuto.toString()
    return rh+":"+rm
}

fun main(args: Array<String>) {
    val dateString = "07:34:27 pm"

    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss a")
    val date = dateString.format(formatter)

    println(date)
    println(rand())

    val paises: MutableMap<String, Int> = mutableMapOf( Pair("argentina", 40000000),
        Pair("españa", 46000000),
        Pair("uruguay", 3400000))
    val paises2: MutableMap<String, Int> = mutableMapOf( Pair("peru", 150000000),
        Pair("chile", 62000000),
        Pair("colombia", 100000000))

    val lista_paises: MutableList<MutableMap<String, Int>> =
        mutableListOf(paises, paises2)

    println(lista_paises[0]["españa"])


    println("Listado completo del Map")
    println(paises)
    for ((clave, valor) in paises)
        println("Para la clave $clave tenemos almacenado $valor")
    println("La cantidad de elementos del mapa es ${paises.size}")
    val cantHabitantes1: Int? = paises["argentina"]
    if (cantHabitantes1 != null)
        println("La cantidad de habitantes de argentina es $cantHabitantes1")
    val cantHabitantes2: Int = 5000000
    paises["brasil"] = cantHabitantes2
    if (cantHabitantes2 != null)
        println("La cantidad de habitantes de brasil es $cantHabitantes2")
    else
        println("brasil no se encuentra cargado en el Map")
}