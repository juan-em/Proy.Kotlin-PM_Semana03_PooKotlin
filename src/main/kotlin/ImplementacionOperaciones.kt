import kotlin.math.*
class ImplementacionOperaciones:
    OperacionesBasicas,OperacionesAvanzadas{

    //OperacionesAvanzadas
    override fun Potencia(numero: Double, potencia: Double)
    : Double = numero.pow(potencia)

    override fun Raiz(numero: Double, raiz: Double)
    : Double = numero.pow(raiz.pow(-1))

    override fun Factorial(numero: Int)
    : Int { var r = 1; for (i in 1..numero) r *= i ;return r }

    override fun Sumatoria(numero: Int)
    : Int { var r = 1; r = numero*(numero+1)/2 ;return r }

    //OperacionesBasicas
    override fun Suma(num1: Double, num2: Double)
    : Double = num1 + num2

    override fun Resta(num1: Double, num2: Double)
    : Double = num1 - num2

    override fun Multiplicacion(num1: Double, num2: Double)
    : Double = num1 * num2

    override fun Division(num1: Double, num2: Double)
    : Double = num1 / num2

    fun mostraMenu(){
        print("=======================================\n" +
                "Indique la acción que desea realizar:\n" +
                "\t1. Suma\n" +
                "\t2. Resta\n" +
                "\t3. Multiplicación\n" +
                "\t4. División\n" +
                "\t5. Potencia\n" +
                "\t6. Raíz\n" +
                "\t7. Factorial\n" +
                "\t8. Sumatoria\n" +
                "\t9. Salir\n")
    }
}