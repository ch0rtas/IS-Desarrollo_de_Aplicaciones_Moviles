// Archivo: clase01.kt

fun main(args: Array<String>) {

    // Variables básicas
    val DNI = "1234A"
    var nombre = "Manu"
    var edad: Int = 40
    var correo: String? = null

    // Imprimir información básica
    println("Hola, mi nombre es $nombre, tengo $edad y mi DNI es $DNI")
    println("Mi correo es $correo")

    // Usar una función para saludar
    saludar("Carlos", 3)

    // Ejemplo de uso de clases
    val persona = Persona(nombre, edad, DNI)
    persona.mostrarInformacion()

    // Ejemplo de manejo de listas
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = sumaNumeros(numeros)
    println("La suma de los números es: $resultado")

    // Ejemplo de manejo de nullables
    val email = obtenerCorreo()
    println("Correo obtenido: ${email ?: "No se proporcionó un correo"}")

    // Ejemplo de una función con default argument
    saludar() // Usando el valor por defecto
}

// Función para saludar, donde "veces" tiene un valor por defecto
fun saludar(nombre: String = "Manu", veces: Int = 1) {
    for (i in 1..veces) {
        println("Hola $nombre, te saludo desde Kotlin!")
    }
}

// Clase Persona
class Persona(var nombre: String, var edad: Int, var DNI: String) {
    fun mostrarInformacion() {
        println("Información de la persona: Nombre: $nombre, Edad: $edad, DNI: $DNI")
    }
}

// Función para sumar números de una lista
fun sumaNumeros(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

// Función nullable para simular obtener un correo
fun obtenerCorreo(): String? {
    // Simulando la obtención de un correo, puede ser nulo
    return null
}
