
# Fundamentos de Java

Java es un lenguaje de programación **orientado a objetos**, multiplataforma y fuertemente tipado. Su filosofía es **"write once, run anywhere" (WORA)**.

---

## 1. Estructura básica de un programa en Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

**Explicación:**
- `public class Main`: clase pública llamada `Main`.
- `public static void main(String[] args)`: método principal ejecutado al iniciar el programa.
- `System.out.println()`: imprime texto en la consola.

---

## 2. Tipos de datos

### Primitivos
| Tipo      | Tamaño | Valores permitidos            |
|-----------|--------|-------------------------------|
| `byte`    | 1 byte | -128 a 127                    |
| `short`   | 2 bytes| -32,768 a 32,767              |
| `int`     | 4 bytes| -2,147,483,648 a 2,147,483,647|
| `long`    | 8 bytes| -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| `float`   | 4 bytes| Decimal simple precisión       |
| `double`  | 8 bytes| Decimal doble precisión        |
| `char`    | 2 bytes| Caracter Unicode              |
| `boolean` | 1 bit  | `true` o `false`             |

### Referenciados
- `String`: cadena de texto.
- Arrays y objetos (`Integer`, `Double`, etc.).

---

## 3. Variables y constantes

```java
int edad = 25;               // Variable entera
final double PI = 3.1416;    // Constante
String nombre = "Pipo";
```

---

## 4. Operadores

### Aritméticos
`+`, `-`, `*`, `/`, `%`  

### Relacionales
`==`, `!=`, `>`, `<`, `>=`, `<=`  

### Lógicos
`&&` (AND), `||` (OR), `!` (NOT)

### Asignación
`=`, `+=`, `-=`, `*=`, `/=`, `%=`  

---

## 5. Condicionales

### If - Else

```java
int numero = 10;

if(numero > 0){
    System.out.println("Número positivo");
} else if(numero < 0){
    System.out.println("Número negativo");
} else {
    System.out.println("Cero");
}
```

### Switch

```java
int dia = 3;

switch(dia){
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}
```

---

## 6. Ciclos

### While

```java
int i = 0;
while(i < 5){
    System.out.println(i);
    i++;
}
```

### Do-While

```java
int j = 0;
do{
    System.out.println(j);
    j++;
} while(j < 5);
```

### For

```java
for(int k = 0; k < 5; k++){
    System.out.println(k);
}

// For-each (arrays)
int[] numeros = {1,2,3,4,5};
for(int n : numeros){
    System.out.println(n);
}
```

---

## 7. Métodos (Funciones)

```java
public class Main {

    // Método que suma dos números
    public static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

---

## 8. Clases y Objetos

```java
class Persona {
    String nombre;
    int edad;

    // Constructor
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    void saludar(){
        System.out.println("Hola, soy " + nombre);
    }
}

public class Main {
    public static void main(String[] args){
        Persona p = new Persona("Pipo", 25);
        p.saludar();
    }
}
```

---

## 9. Arrays

```java
int[] numeros = {1, 2, 3, 4, 5};

// Acceder a un elemento
System.out.println(numeros[2]); // 3

// Modificar un elemento
numeros[0] = 10;

// Cantidad
numeros.length;
```

### Métodos

Los arreglos no tienen método propios, se usa `import java.util.Arrays`.

| Método                              | Descripción                                                                        | 
| ----------------------------------- | ---------------------------------------------------------------------------------- | 
| `Arrays.toString(arr)`              | Convierte el arreglo en una cadena legible.                                        | 
| `Arrays.sort(arr)`                  | Ordena el arreglo (ascendente).                                                    | 
| `Arrays.sort(arr, from, to)`        | Ordena solo un rango del arreglo.                                                  | 
| `Arrays.binarySearch(arr, key)`     | Busca un elemento en un arreglo ORDENADO. Devuelve índice o negativo si no existe. | 
| `Arrays.equals(arr1, arr2)`         | Compara si dos arreglos son iguales (mismos elementos en orden).                   | 
| `Arrays.deepEquals(arr1, arr2)`     | Compara arreglos de varias dimensiones.                                            | 
| `Arrays.copyOf(arr, newLength)`     | Copia el arreglo con un tamaño nuevo.                                              | 
| `Arrays.copyOfRange(arr, from, to)` | Copia un rango de índices.                                                         | 
| `Arrays.fill(arr, value)`           | Llena todo el arreglo con un valor.                                                | 
| `Arrays.fill(arr, from, to, value)` | Llena un rango del arreglo.                                                        | 
| `Arrays.hashCode(arr)`              | Devuelve un hash basado en los valores del arreglo.                                | 
| `Arrays.deepHashCode(arr)`          | Igual que `hashCode` pero para arreglos de varias dimensiones.                     | 
| `Arrays.asList(T... a)`             | Convierte un arreglo en una lista (no redimensionable).                            | 
| `Arrays.stream(arr)`                | Convierte un arreglo en un **Stream** para programación funcional.                 | 
| `Arrays.parallelSort(arr)`          | Ordena usando múltiples hilos (más rápido en arreglos grandes).                    | 
| `Arrays.spliterator(arr)`           | Devuelve un **Spliterator** para recorrer el arreglo.                              | 
| `Arrays.setAll(arr, i -> f(i))`     | Llena el arreglo con valores generados por una función.                            |

---
## Colecciones en Java

En Java, las **colecciones** son estructuras de datos dinámicas que permiten **almacenar, manipular y recorrer** elementos de manera más flexible que los arreglos.

Se encuentran en el **paquete `java.util`** y están organizadas en **interfaces y clases**.

### Métodos comunes
| Método | Descripción |
|--------|-------------|
| `add(e)` | Añade un elemento. |
| `addAll(c)` | Añade todos los elementos de otra colección. |
| `remove(e)` | Elimina un elemento. |
| `removeAll(c)` | Elimina todos los elementos de otra colección. |
| `clear()` | Elimina todos los elementos. |
| `contains(e)` | Verifica si un elemento existe. |
| `containsAll(c)` | Verifica si existen todos los elementos de otra colección. |
| `isEmpty()` | Comprueba si está vacía. |
| `size()` | Devuelve el número de elementos. |
| `iterator()` | Devuelve un iterador para recorrer la colección. |
| `forEach(action)` | Ejecuta una acción sobre cada elemento (Java 8+). |

### List

Elementos ordenados, permite duplicados

| Tipo | Características principales | Declaración |
|------|------------------------------|-------------|
| **ArrayList** | Basado en un array dinámico. Muy rápido en **acceso por índice** y recorrido. Inserciones y eliminaciones en medio de la lista son más lentas. | `List<T> lista = new ArrayList<>();` |
| **LinkedList** | Basado en lista doblemente enlazada. Más lento en acceso por índice, pero rápido en **inserciones y eliminaciones** en cualquier posición. | `List<T> lista = new LinkedList<>();` |
| **Vector** | Similar a `ArrayList`, pero **sincronizado** (seguro para hilos). Generalmente más lento por la sincronización. | `List<T> lista = new Vector<>();` |
| **Stack** | Hereda de `Vector`. Implementa una **pila (LIFO)** con métodos `push()` y `pop()`. | `Stack<T> pila = new Stack<>();` |

**List** → `ArrayList` (rápido en lectura), `LinkedList` (rápido en inserciones), `Stack` (pila), `Vector` (sincronizado).

#### Métodos comunes de `List` (ArrayList, LinkedList)
| Método              | Descripción                                        |
| ------------------- | -------------------------------------------------- |
| `get(index)`        | Devuelve el elemento en una posición.              |
| `set(index, e)`     | Reemplaza el elemento en una posición.             |
| `add(e)`            | Agrega un elemento al final de la lista.           |
| `add(index, e)`     | Inserta un elemento en una posición específica.    |
| `remove(index)`     | Elimina el elemento en la posición indicada.       |
| `remove(Object o)`  | Elimina la primera ocurrencia del objeto indicado. |
| `indexOf(e)`        | Devuelve el índice de la primera ocurrencia.       |
| `lastIndexOf(e)`    | Devuelve el índice de la última ocurrencia.        |
| `subList(from, to)` | Devuelve una vista de una parte de la lista.       |
| `clear()`           | Elimina todos los elementos de la lista.           |
| `size()`            | Devuelve el número de elementos.                   |
| `isEmpty()`         | Devuelve `true` si la lista está vacía.            |

### Set

No permite duplicados

| Tipo | Características principales | Declaración |
|------|------------------------------|-------------|
| **HashSet** | No mantiene orden. Muy eficiente en operaciones básicas (`add`, `remove`, `contains`). | `Set<T> set = new HashSet<>();` |
| **LinkedHashSet** | Mantiene el **orden de inserción** de los elementos. | `Set<T> set = new LinkedHashSet<>();` |
| **TreeSet** | Mantiene los elementos **ordenados automáticamente** (por orden natural o comparador). Más lento que `HashSet`. | `Set<T> set = new TreeSet<>();` |

**Set** → `HashSet` (rápido, sin orden), `LinkedHashSet` (conserva orden de inserción), `TreeSet` (mantiene orden natural).

*(Recordar: `Set` no admite elementos duplicados y algunos no mantienen orden).*

#### Métodos comunes de `Set` (HashSet, TreeSet)

| Método | Descripción |
|--------|-------------|
| `add(e)` | Añade un elemento (si no existe). |
| `remove(e)` | Elimina un elemento. |
| `contains(e)` | Verifica si el elemento está presente. |
| `size()` | Devuelve el número de elementos. |
| `isEmpty()` | Comprueba si está vacío. |
| `clear()` | Elimina todos los elementos. |

### Queue / Deque

Colas y estructuras FIFO/LIFO

| Tipo | Características principales | Declaración |
|------|------------------------------|-------------|
| **LinkedList** | Implementa tanto `List` como `Queue`. Funciona como una cola **FIFO**. Permite `null`. | `Queue<T> cola = new LinkedList<>();` |
| **PriorityQueue** | Cola que ordena elementos por **prioridad** (orden natural o un `Comparator`). No permite `null`. | `Queue<T> cola = new PriorityQueue<>();` |

**Queue** → `LinkedList` (cola simple), `PriorityQueue` (por prioridad).

| Tipo | Características principales | Declaración |
|------|------------------------------|-------------|
| **ArrayDeque** | Implementación eficiente de **doble cola**. No permite `null`. Más rápida que `Stack` como pila y que `LinkedList` como cola. | `Deque<T> deque = new ArrayDeque<>();` |
| **LinkedList** | También implementa `Deque`. Más flexible, pero menos eficiente que `ArrayDeque`. | `Deque<T> deque = new LinkedList<>();` |

**Deque** → `ArrayDeque` (más eficiente), `LinkedList` (más flexible).

#### Métodos comunes de `Queue` / `Deque`

| Método | Descripción |
|--------|-------------|
| `offer(e)` | Inserta un elemento (similar a `add`). |
| `poll()` | Devuelve y elimina el primer elemento (o `null` si está vacío). |
| `peek()` | Devuelve el primer elemento sin eliminarlo. |
| `remove()` | Elimina el primer elemento (lanza excepción si está vacío). |
| `element()` | Devuelve el primer elemento (lanza excepción si está vacío). |
| `push(e)` | Inserta al inicio (solo en `Deque`). |
| `pop()` | Elimina y devuelve el primero (solo en `Deque`). |

---

## Map

Colecciones de pares *clave-valor*

| Tipo | Características principales | Declaración |
|------|------------------------------|-------------|
| **HashMap** | No garantiza orden. Muy eficiente en operaciones de inserción, búsqueda y eliminación. Permite una clave `null`. | `Map<K,V> mapa = new HashMap<>();` |
| **LinkedHashMap** | Mantiene el **orden de inserción** de las claves. Útil si necesitas iterar en ese orden. | `Map<K,V> mapa = new LinkedHashMap<>();` |
| **TreeMap** | Mantiene las claves **ordenadas automáticamente**. No permite `null` como clave. Más lento que `HashMap`. | `Map<K,V> mapa = new TreeMap<>();` |
| **Hashtable** | Similar a `HashMap`, pero **sincronizado** (seguro para hilos). No permite `null` ni en claves ni en valores. | `Map<K,V> mapa = new Hashtable<>();` |

**Map** → `HashMap` (rápido), `LinkedHashMap` (mantiene orden), `TreeMap` (claves ordenadas), `Hashtable` (sincronizado).

### Métodos comunes de `Map` (HashMap, TreeMap)

| Método | Descripción |
|--------|-------------|
| `put(key, value)` | Inserta un par clave-valor. |
| `putAll(m)` | Inserta todos los pares de otro mapa. |
| `get(key)` | Devuelve el valor asociado a una clave. |
| `getOrDefault(key, default)` | Devuelve el valor o un valor por defecto si no existe. |
| `remove(key)` | Elimina una entrada por clave. |
| `containsKey(key)` | Verifica si existe una clave. |
| `containsValue(value)` | Verifica si existe un valor. |
| `keySet()` | Devuelve todas las claves en un `Set`. |
| `values()` | Devuelve todos los valores en una colección. |
| `entrySet()` | Devuelve todos los pares clave-valor. |
| `replace(key, value)` | Reemplaza el valor asociado a una clave. |
| `size()` | Devuelve el número de pares clave-valor. |
| `clear()` | Elimina todas las entradas. |

---
## Recorrido de colecciones

### Con bucle `for-each`:
```java
for (String nombre : lista) {
        System.out.println(nombre);
}
```

### Con `iterator`:
```java
Iterator<String> it = lista.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

### Con `forEach` y expresión lambda (Java 8+):
`lista.forEach(n -> System.out.println(n));`

---

## 10. Comentarios

```java
// Comentario de una línea

/*
Comentario
de varias líneas
*/
```

---

## 11. Entrada de datos

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = sc.nextLine();
System.out.println("Hola " + nombre);
```

---

## 12. Buenas prácticas

- Nombre de clases en **mayúscula inicial** (`Persona`, `Main`).
- Variables y métodos en **camelCase** (`miVariable`, `calcularSuma()`).
- Evitar código duplicado, usar métodos.
- Documentar el código con comentarios claros.

---

## 13. Excepciones (Opcional)

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Bloque finalizado");
}
```

---

## 14. Herencia y Polimorfismo (Opcional)

```java
class Animal {
    void hablar(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hablar(){
        System.out.println("El perro ladra");
    }
}

public class Main {
    public static void main(String[] args){
        Animal a = new Perro();
        a.hablar(); // Polimorfismo
    }
}
```
## System.out

```Java
System.out.print("Hola ");
```
Imprime texto sin salto de línea, lo siguiente seguirá en la misma línea

```java
System.out.println("Hola");
```
Imprime el texto y agrega un salto de línea al final.
```java
System.out.printf("Mi nombre es %s y tengo %d años.", nombre, edad);
```
Permite formatear la salida usando placeholders (%s, %d, %f, etc.).

%s → cadena (String)

%d → entero (int)

%f → decimal (float o double)

Puedes controlar decimales: %.2f → dos decimales

---

> Este documento resume los fundamentos de Java, incluyendo teoría, sintaxis y ejemplos prácticos para iniciarse en programación orientada a objetos.