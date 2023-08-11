fun saludo(){
    println("Bienvenido a kotlin")
}
fun suma(n1:Int, n2:Int, n3:Int = 0){
    val sum = n1 + n2 + n3
    println("La suma de $n1 y $n2 es $sum")
}

fun suma2(vararg n1:Int){
    var suma = 0
    for (i in n1){
        suma += i
    }
    println("La suma de los numeros es $suma")
}
/*
fun main(args: Array<String>) {
    suma2(1, 2, 3, 4, 5)
    saludo()
    print("Ingrese numero 1: ")
    val num1 = readLine().toString().toInt()
    print("Ingrese numero 2: ")
    val num2 = readLine().toString().toInt()
    suma(num1,num2)
    suma(num1,num2,10)
}*/

fun main(args: Array<String>) {
    var p1 = Profesor("Pepe Perez","Ing. Sistemas","ACME")
    p1.verDatos()
    p1.correr()
    p1.dormir()
}
/*
fun main(args: Array<String>) {
    var p1 = Funciones()
    p1.funA()
    p1.funB()
}

*/



