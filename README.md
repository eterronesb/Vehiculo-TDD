# 🚗 Diseño de la clase `VehiculoElectrico`

Este proyecto define una clase `VehiculoElectrico` utilizando el enfoque de desarrollo guiado por pruebas (**TDD - Test Driven Development**).

---

## 🧩 Atributos

- `marca` (`String`): Marca del vehículo.
- `modelo` (`String`): Modelo del vehículo.
- `velocidadActual` (`int`): Velocidad actual en km/h.
- `velocidadMaxima` (`int`): Velocidad máxima en km/h.
- `nivelBateria` (`int`): Porcentaje de batería (0–100).
- `autonomiaRestante` (`int`): Kilómetros que puede recorrer con la batería actual.

---

## ⚙️ Métodos

- `acelerar(int incremento)`: Aumenta la velocidad actual sin superar la velocidad máxima. Solo se puede acelerar si hay batería suficiente.
- `frenar(int decremento)`: Reduce la velocidad actual. No puede ser menor que 0.
- `parar()`: Establece la velocidad actual a 0.
- `recargarBateria()`: Rellena la batería al 100% y recalcula la autonomía.
- `esDeportivo()`: Devuelve `true` si la velocidad máxima supera los 180 km/h.
- `consumirBateria(int km)`: Simula el consumo de batería y disminuye la autonomía restante.

---

## 💡 Notas

- La autonomía se calcula con una regla simple: **cada 1% de batería equivale a 4 km**.
- Si la batería está en 0%, no se puede acelerar.
