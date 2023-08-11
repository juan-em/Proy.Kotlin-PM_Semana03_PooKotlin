fun main(args: Array<String>) {
    var oper = ImplementacionOperaciones()
    while (true){
        oper.mostraMenu()
        print("Elija una opción: ")
        var opcion = readLine().toString().toInt()
        println("=======================================")
        when (opcion){
            in 1..6 ->{
                println("Ingrese el primer número: "); var n1 = readLine().toString().toDouble()
                println("Ingrese el segundo número: "); var n2 = readLine().toString().toDouble()
                when (opcion){
                    1 -> println("=> $n1 + $n2 = ${oper.Suma(n1,n2)}")
                    2 -> println("=> $n1 - $n2 = ${oper.Resta(n1,n2)}")
                    3 -> println("=> $n1 * $n2 = ${oper.Multiplicacion(n1,n2)}")
                    4 -> println("=> $n1 / $n2 = ${oper.Division(n1,n2)}")
                    5 -> println("=> $n1 ^ $n2 = ${oper.Potencia(n1,n2)}")
                    6 -> println("=> $n2 √ $n1 = ${oper.Raiz(n1,n2)}")
                }
            }
            in 7..8 ->{
                println("Ingrese un número: "); var n = readLine().toString().toInt()
                when (opcion){
                    7 -> println("=> $n ! = ${oper.Factorial(n)}")
                    8 -> println("=> Σ $n = ${oper.Sumatoria(n)}")
                }
            }
            9 -> break
        }
        println("¿Desea realizar más operaciones?"); var r = readLine().toString()
        if (r=="SI" || r=="si"){continue} else if(r=="NO" || r=="no"){break}
        else {println("Opcion NO válida");continue}
    }
}














