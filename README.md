# 🚗 VehiculoElectrico – Desarrollo con TDD y GitHub Actions

Este proyecto implementa una clase `VehiculoElectrico` utilizando **Desarrollo Guiado por Pruebas (TDD)**, control de versiones con **Git y GitHub**, e integración continua mediante **GitHub Actions**.

---

## 🧩 Atributos

- `marca (String)`: Marca del vehiculo
- `modelo (String)`: Modelo del vehiculo
- `velocidadActual (int)`: Velocidad actual (km/h)
- `velocidadMaxima (int)`: Velocidad máxima (km/h)
- `nivelBateria (int)`: Nivel de batería (0–100%)
- `autonomiaRestante (int)`: Kilometros disponibles segun batería

---

## ⚙️ Métodos principales

- `acelerar(int incremento)`: Aumenta la velocidad actual si hay batería y no se supera el limite.
- `frenar(int decremento)`: Reduce la velocidad sin bajar de 0.
- `parar()`: Detiene completamente el vehiculo.
- `recargarBateria()`: Restaura la batería al 100% y actualiza autonomia.
- `consumirBateria(int km)`: Simula el consumo de batería y reduce la autonomia.
- `esDeportivo()`: Retorna `true` si la velocidad maxima supera los 180 km/h.

---

## ✅ Reglas del sistema

- La **autonomia** se calcula como `nivelBateria × 4` (1% batería = 4 km).
- No es posible acelerar con batería en 0%.
- El sistema impide valores negativos de batería o velocidad.

---

## 🧪 Enfoque TDD y pruebas

  - Se desarrollaron **11 casos de prueba (TC01 – TC11)** cubriendo:
  - Casos positivos y negativos por funcionalidad
  - Validación de límites, reglas de negocio y comportamiento esperado
  - Las pruebas están implementadas con **JUnit 5** y se ubican en `src/test/java`.

📄 Además se diseñó una hoja de cálculo con los **casos de prueba detallados**, disponible en la carpeta `/docs`.

---

## 🔁 Flujo de trabajo con Git y GitHub

- Se siguió la convención de ramas: `feature/nombre-funcionalidad`
- Cada funcionalidad se desarrolló en su propia rama, con su **Pull Request**
- Se resolvieron conflictos de forma colaborativa
- Los commits fueron claros, frecuentes y representativos

---

## ⚙️ GitHub Actions (CI)

El repositorio cuenta con integración continua:
- Todos los tests se ejecutan automáticamente en cada PR o push a `main`
- Configurado mediante `maven.yml` en `.github/workflows`

🔧 Tecnologías: **Java 17 + Maven + JUnit 5 + GitHub Actions**

---

## 👥 Equipo

- 👤 Alumno 1: (GitHub: MarvinVeroes)
- 👤 Alumno 2: (GitHub: @eterronesb)

---

## 📦 Estructura del proyecto

Vehiculo-TDD/ -> src/ | main/java/VehiculoElectrico.java │ test/java/VehiculoElectricoTest.java | docs/test-cases-vehiculo-electrico.xlsx | .github/workflows/maven.yml | pom.xml | README.md


---

## 🎯 Estado del proyecto

✅ Finalizado y probado con éxito.  
Todos los requisitos del trabajo han sido implementados y validados.
