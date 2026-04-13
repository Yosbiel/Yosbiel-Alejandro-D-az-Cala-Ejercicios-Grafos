# Ejercicios de Grafos - Estructura de Datos II

Son dos ejercicios de grafos en Java, hechos desde cero sin usar librerías externas.

---

## ¿Qué hay aquí?

- **GrafoLista** - Implementación con lista de adyacencia.  
  Sirve para grafos dirigidos y ponderados.  
  Tiene BFS con cola (hecha a mano, `LinkedQueue`) y DFS recursivo.

- **GrafoMatriz** - Implementación con matriz de adyacencia.  
  Para grafos no dirigidos.  
  El constructor recibe la matriz directamente, como pedían los ejercicios.  
  También tiene BFS con cola y DFS recursivo.

---

## ¿Cómo se corre?

Cada proyecto está separado en su carpeta.  
Abrís el que quieras en NetBeans (o cualquier IDE) y ejecutás la clase que termina en `Main`.

Ejemplo:  
`GrafoListaMain` para el primer ejercicio.  
`GrafoMatrizMain` para el segundo.

---

## ¿Qué problemas resuelven?

### Ejercicio 1 (dirigido y ponderado)
El grafo tiene flechas y pesos.  
Los datos son estos:

A→B (20)   A→D (50)   B→C (10)   C→A (25)   C→F (45)
D→C (30)   D→E (10)   E→F (5)    F→D (25)   F→A (30)

El programa muestra:
- La lista de adyacencia con los pesos
- BFS desde A
- DFS desde A
- El grado de salida de cada vértice

### Ejercicio 2 (no dirigido)
Las conexiones son estas:

A: B, C, D  
B: A, C, E, G  
C: A, B, D, F  
D: A, C, G  
E: B, F, G  
F: C, E, G  
G: B, D, E, F

El programa muestra:
- Lista de adyacencia
- Matriz de adyacencia
- BFS desde A
- DFS desde A
- El grado de cada vértice

---

## ¿Por qué hice dos implementaciones?

Porque los ejercicios pedían una con lista de adyacencia y otra con matriz.  
Además, así se entiende mejor cómo funcionan las dos formas de representar un grafo.

---

## ¿Se puede reutilizar?

Sí.  
`GrafoLista` se puede usar para cualquier grafo dirigido o no dirigido, ponderado o no.  
Solo hay que cambiar los datos en la controladora (`CGrafoLista` o `CGrafoMatriz`).

---

## ¿Qué aprendí?

- A implementar grafos desde cero sin usar librerías de Java.
- La diferencia entre lista y matriz de adyacencia.
- Cómo funcionan BFS y DFS.
- A separar el código en capas: la estructura del grafo, la interfaz, la controladora y el main.

---

## Autor

Yosbiel Alejandro Díaz Cala  
Ingeniería Informática - Universidad de Pinar del Río  
Segundo año
