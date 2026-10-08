# 🎴 Sistema de Construcción y Simulación de Mazos

Aplicación de consola desarrollada en **Java** para gestionar, construir y simular un mazo de cartas dentro de un contexto de videojuego.

Este proyecto fue desarrollado como práctica de **Programación Orientada a Objetos (POO)** y tiene como objetivo integrar diferentes conceptos fundamentales de Java dentro de un único sistema.

---

## 📖 Descripción

El sistema permite registrar diferentes tipos de cartas, consultar información, construir un mazo, eliminar cartas, controlar la energía disponible y activar cartas según su comportamiento.

El proyecto utiliza una clase abstracta `Carta` como base para diferentes tipos de cartas:

- ⚔️ Carta de Ataque
- 🛡️ Carta de Defensa
- ✨ Carta de Habilidad

Cada tipo de carta posee sus propios atributos y comportamientos.

---

## 🚀 Funcionalidades

### 📋 Gestión de cartas

- Registrar nuevas cartas.
- Registrar cartas de ataque.
- Registrar cartas de defensa.
- Registrar cartas de habilidad.
- Evitar identificadores duplicados.
- Limitar el catálogo a un máximo de 20 cartas.
- Mostrar todas las cartas registradas.
- Buscar cartas por identificador.
- Buscar cartas por nombre.

### 🎴 Gestión del mazo

- Agregar cartas al mazo.
- Evitar cartas duplicadas.
- Eliminar cartas del mazo.
- Mostrar el mazo actual.
- Limitar el mazo a 8 cartas.

### ⚡ Sistema de energía

- Mostrar energía actual.
- Definir energía máxima.
- Consultar el costo de energía de una carta.
- Verificar si existe energía suficiente.
- Consumir energía al activar una carta.
- Evitar energía negativa.

### 🎮 Activación de cartas

Cada tipo de carta posee un comportamiento diferente:

**Carta de Ataque**
- Genera daño.
- Tiene tipo de ataque.
- Define un objetivo.

**Carta de Defensa**
- Proporciona defensa.
- Define el tipo de defensa.
- Tiene una duración.

**Carta de Habilidad**
- Ejecuta una habilidad.
- Aplica un efecto.
- Tiene una duración.

### 📊 Estadísticas

El sistema permite consultar:

- Número total de cartas.
- Cantidad de cartas de ataque.
- Cantidad de cartas de defensa.
- Cantidad de cartas de habilidad.
- Cantidad de cartas por rareza.
- Costo total de energía.
- Costo promedio de energía.

---

## 🧠 Conceptos de Java utilizados

Este proyecto integra los siguientes conceptos:

### Fundamentos

- Variables
- Tipos de datos
- Operadores
- Condicionales
- `if / else`
- `switch`
- `while`
- `for`
- `break`
- `continue`
- Entrada y salida de datos
- Conversión de datos
- `String`
- Arreglos

### Programación Orientada a Objetos

- Clases
- Objetos
- Atributos
- Métodos
- Constructores
- Constructores sobrecargados
- `this`
- Encapsulamiento
- Getters y setters
- Herencia
- `super`
- Sobrecarga de métodos
- Sobrescritura de métodos
- `@Override`
- Clases abstractas
- Métodos abstractos
- Interfaces
- Polimorfismo
- Casting
- `instanceof`

---

## 🏗️ Arquitectura del proyecto

```text
Sistema_Simulacion_Mazos
│
├── src
│   └── codigo
│       ├── Activable.java
│       ├── Carta.java
│       ├── CartaAtaque.java
│       ├── CartaDefensa.java
│       ├── CartaHabilidad.java
│       ├── Funciones.java
│       └── Programa.java
│
└── Ejercicio.txt
```

---

## 🧩 Estructura de clases

La clase abstracta `Carta` funciona como clase base:

```text
                    Carta
                  (abstracta)
                      │
          ┌───────────┼───────────┐
          │           │           │
          ▼           ▼           ▼
   CartaAtaque  CartaDefensa  CartaHabilidad
```

La interfaz `Activable` define el comportamiento común de activación:

```text
              Activable
                  │
        ┌─────────┼─────────┐
        │         │         │
        ▼         ▼         ▼
      Ataque   Defensa   Habilidad
```

---

## 🎴 Ejemplo de cartas

### ⚔️ Espada de Fuego

```text
ID: A001
Tipo: Ataque
Costo: 3
Rareza: Rara
Daño: 25
Tipo de ataque: Fuego
Objetivo: Enemigo
```

### 🛡️ Escudo de Acero

```text
ID: D001
Tipo: Defensa
Costo: 2
Rareza: Común
Defensa: 20
Tipo de defensa: Física
Duración: 2 turnos
```

### ✨ Curación Divina

```text
ID: H001
Tipo: Habilidad
Costo: 4
Rareza: Épica
Efecto: 30
Duración: 2 turnos
```

---

## 🎮 Menú principal

```text
===== MENÚ DE OPCIONES =====

1. Registrar carta
2. Mostrar todas las cartas
3. Buscar carta
4. Agregar carta al mazo
5. Eliminar carta del mazo
6. Mostrar mazo del jugador
7. Mostrar energía actual
8. Activar carta
9. Mostrar estadísticas del mazo
0. Salir
```

---

## 🔄 Flujo general del sistema

```text
              INICIO
                 │
                 ▼
              MENÚ
                 │
       ┌─────────┼─────────┐
       │         │         │
       ▼         ▼         ▼
   Registrar   Buscar    Mostrar
     cartas    cartas     cartas
       │
       ▼
   Catálogo
   máximo 20
       │
       ▼
   Seleccionar
      carta
       │
       ▼
      Mazo
   máximo 8
       │
       ├──────────────┐
       │              │
       ▼              ▼
   Eliminar       Activar
                    carta
                      │
                      ▼
                  Verificar
                   energía
                      │
              ┌───────┴───────┐
              │               │
             NO              SÍ
              │               │
              ▼               ▼
           Rechazar       Consumir
                          energía
                              │
                              ▼
                         Ejecutar
                        comportamiento
```

---

## 🛠️ Tecnologías

- **Lenguaje:** Java
- **Tipo de aplicación:** Consola
- **Paradigma:** Programación Orientada a Objetos
- **Entrada de datos:** `Scanner`
- **Estructuras principales:** Arreglos
- **Colecciones:** No se utilizan `ArrayList` ni `HashMap`

---

## 🎯 Objetivos de aprendizaje

Este proyecto fue desarrollado para practicar la integración de diferentes conceptos de Java dentro de un sistema más completo.

Los principales objetivos fueron:

1. Aplicar Programación Orientada a Objetos.
2. Diseñar una jerarquía de clases.
3. Utilizar clases abstractas.
4. Implementar interfaces.
5. Aplicar herencia y polimorfismo.
6. Practicar encapsulamiento.
7. Utilizar arreglos para administrar información.
8. Implementar validaciones.
9. Crear un sistema de menú interactivo.
10. Separar la lógica del programa principal.
11. Resolver problemas mediante métodos reutilizables.
12. Integrar múltiples conceptos dentro de un proyecto funcional.

---

## 📚 Aprendizajes obtenidos

Durante el desarrollo del proyecto reforcé especialmente:

- Cómo diseñar una clase base.
- Cuándo utilizar una clase abstracta.
- Cómo aplicar herencia.
- Cómo utilizar interfaces.
- Cómo funciona el polimorfismo.
- Cómo realizar casting entre tipos.
- Cómo proteger atributos mediante encapsulamiento.
- Cómo trabajar con arreglos de objetos.
- Cómo validar entradas del usuario.
- Cómo dividir la lógica en diferentes métodos y clases.
- Cómo conectar diferentes componentes dentro de una aplicación.

---

## 🔮 Posibles mejoras futuras

El proyecto puede evolucionar incorporando:

- Guardado de cartas en archivos.
- Carga automática de cartas.
- Sistema de jugadores.
- Puntos de vida.
- Sistema de turnos.
- Combate entre jugadores.
- Sistema de experiencia.
- Más tipos de cartas.
- Efectos especiales.
- Sistema de estados.
- Historial de partidas.
- Base de datos.
- Interfaz gráfica.
- Aplicación web.
- Persistencia de información.

---

## 👨‍💻 Autor

**Francisco Castillo**

Proyecto desarrollado como parte de mi proceso de aprendizaje en **Java y Programación Orientada a Objetos**.

---

## 📌 Estado del proyecto

🟡 **En desarrollo / aprendizaje**

El proyecto continúa evolucionando a medida que se incorporan nuevos conceptos de Java y Programación Orientada a Objetos.