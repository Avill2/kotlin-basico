import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hola, mundo")
    println(sumarDosNumeros(numeroUno = 1, numeroDos = 2))
    var nombre: String = " Andrea"
    val edad = 25
    var casado = true

    when (casado) {
        true -> {
            println("esta casado")
        }
        else -> {
            println("No esta casado")
        }
    }
    val superheroe = if (casado) {
        "supermandarina"
    } else {
        "superman"
    }
    //template strings
    println("superheroe: ${superheroe}")

    //crear instancias
    //no existe la palabra new y le llama a la clase
    var andrea = Persona(Integer(28), "Andrea")
    println(andrea.toString())
}

class Persona {
    lateinit var edadactual: Integer
    var nNombre: String

    constructor (edad: Integer, nombre: String) {
        iniciar(edad)
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadactual = edad
    }

    //sobre escribimos un metodo que ya existe
    //el q sobre escribimso la clase es el toString de todas las clases que realizamos en
    //este momento
    override fun toString(): String {
        return "la edad actual es $edadactual y el nombre es $nNombre"
    }

}

class Persona2(edad: Integer, nombre: String) {
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null
    var nCasado: Boolean? = null

    //en este caso primero se ejecuta el primer constructor
    //entonces coje la edad del segundo constructor y lo manda al primero luego el nombre y le manda
    //al primer contructor y luego comeinza con los atributos del segudno constructor
    constructor (edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        nCedula = cedula
    }

    constructor (edad3: Integer, nombre3: String, cedula2: String, casado: Boolean) : this(edad3, nombre3) {
        nCedula = cedula2
        nCasado = casado
    }

    override fun toString(): String {
        return "la edad actual es $nEdad el nombre es $nNombre el numero de cedula es $nCedula" +
                "es casado $nCasado"
    }
}

class Persona3(edad: Integer, nombre: String) {
    lateinit var nEdad: Integer
    var nNombre = nombre

    init {
        //escribir codigo despues del cosntructor
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }
}

//es herencia en al clase cuadrado despues del primer cosntructor
//llamamos al contructor de la open class
open class Figura(nombre: String) {
    val nNombre = nombre
}

class cuadrado(nombre: String, valorLado: Integer) : Figura(nombre) {
    var nvalorLado = valorLado
}