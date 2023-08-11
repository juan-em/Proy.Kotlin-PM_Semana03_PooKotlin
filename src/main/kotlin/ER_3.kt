fun invertir(lista:List<Any>):List<Any>{
    val nLista = lista.reversed()
    return nLista
}
fun mostrarLista(lista: List<Any>){
    println("Elementos:")
    for(i in 0..(lista.count()-1)){
        print(lista.get(i))
    }
}
fun  esNumero(n1:Any):Boolean{
    if (n1 is Int){
        return true
    }
    return false
}

fun soloNumeros(lista:List<Any>):List<Any>{
    var nLista:MutableList<Any> = arrayListOf()
    for (i in lista){
        if (esNumero(i) == true){
            nLista.add(i)
        }
    }
    return nLista
}
fun main(args: Array<String>) {
    val lista = mutableListOf(1,'k',2,'o',3,'t',4,'l',5,"in")
    val verNumeros = soloNumeros(lista)
    println("")
    mostrarLista(verNumeros)
    /*
    val lista = mutableListOf(1,'k',2,'o',3,'t',4,'l',5,"in")
    val iLista = invertir(lista)
    mostrarLista(iLista)*/
}
