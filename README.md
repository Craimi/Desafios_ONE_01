# Desafios de Logica

## TwoSum (Easy 🟢)

### Reto:
Dado un `array` de enteros nums y un entero `target`, encuentra los `índices` de los `dos números que suman target`.

### Como utilizar:
El usuario deberá ingresar el numero `target`, en caso de que el input ingresado no sea un numero, se lanzará una excepcion.
> [!NOTE]
> Para comodidad del usuario, el array ya está preestablecido dentro del codigo.

### Funcionamiento
Aprovechamos los metodos que vienen por defecto con la interfaz `List` y de la clase `Collections` para consultar si el array contiene el valor faltante para nuestra respuesta, y en caso de tener, hayar los `índices` correspondientes.


## Palindrome (Easy 🟢)

### Reto:
Dado un número entero `x`, determina si es un `palíndromo`.

### Como utilizar:
El usuario deberá ingresar el numero que quiera `analizar`, en caso de que el input ingresado no sea un numero, se lanzará una excepcion.

### Funcionamiento
Utilizamos matematicas (Evitando convertir el numero original en un string) acompañado de varios castings (Cambios a los tipos de datos) numericos para poco a poco ir generando un nuevo numero a partir del numero original, para al final comparar el resultado con el numero original y ahi determinar si el numero ES o NO ES `palindromo`.

## Estructura

Cada reto tiene su propia carpeta dentro de la ruta `Desafios_One_01/src`, dentro se encuentra el `.java` con toda la logica de programación de ambos problemas.
