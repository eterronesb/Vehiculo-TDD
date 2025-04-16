# Diseño de la clase VehiculoElectrico

Este proyecto define una clase `VehiculoElectrico` utilizando el enfoque TDD (Test Driven Development).

## 🧩 Atributos

- `marca` (String): Marca del vehículo.
- `modelo` (String): Modelo del vehículo.
- `velocidadActual` (int): Velocidad actual en km/h.
- `velocidadMaxima` (int): Velocidad máxima en km/h.
- `nivelBateria` (int): Porcentaje de batería (0-100).
- `autonomiaRestante` (int): Kilómetros que puede recorrer con la batería actual.

## ⚙️ Métodos

- `acelerar(int incremento)`: Aumenta la velocidad actual. No puede superar la velocidad máxima ni reducir la batería por debajo de 0.
- `frenar(int decremento)`: Reduce la velocidad actual. No puede bajar de 0.
- `parar()`: Establece la velocidad actual a 0.
- `recargarBateria()`: Rellena la batería al 100% y recalcula la autonomía.
- `esDeportivo()`: Retorna `true` si la velocidad máxima supera los 180 km/h.
- `consumirBateria(int km)`: Reduce la batería y autonomía según los km recorridos (simulado).

## 💡 Notas

- La autonomía se calcula con una regla simple: cada 1% de batería equivale a 4 km.
- Se incluye un control para evitar acelerar con batería a 0.
