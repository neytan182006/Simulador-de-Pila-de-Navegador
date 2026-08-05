# Simulador de Pila de Navegador

Simulación del botón "Atrás" de un navegador usando una **Pila (LIFO)** implementada a mano con nodos (sin `java.util.Stack`), para el curso de **Estructuras de Datos**.

## Estructura

```
src/
├── NodoPagina.java       → nodo de la pila (url + referencia al siguiente)
├── PilaNavegacion.java   → push/pop/peek/estaVacia, valida underflow
└── Main.java              → menú de consola (visitar página, atrás, ver historial)
```

## Cómo ejecutarlo

```bash
javac -d bin src/*.java
java -cp bin Main
```

> Compilado y verificado con `javac` sin errores.

## Capturas

_Pendiente: agregar capturas en `capturas/`._

## Licencia

MIT — ver [LICENSE](LICENSE).
