
# Conversor de Moneda 💱

¡Bienvenido/a al Conversor de Moneda! 🎉 Este proyecto te permite convertir entre diferentes monedas utilizando una API de tasas de cambio. ¡Es fácil, rápido y divertido! 😄

## Características 🌟

- **Conversión entre múltiples monedas**: Convierte entre Dólar (USD), Peso Argentino (ARS), Real Brasileño (BRL), Peso Colombiano (COP) y más.
- **Interfaz amigable**: Menú interactivo con emojis para una experiencia de usuario agradable.
- **Manejo de errores**: Captura y muestra errores de la API de manera clara.
- **Modular y organizado**: El código está organizado utilizando el patrón MVC y se ha modularizado para facilitar la mantenibilidad.

## Requisitos 📋

- **Java SDK 17** o superior.
- **API Key de ExchangeRate-API**: Necesitarás una clave de API para acceder a las tasas de cambio. Puedes obtener una [aquí](https://www.exchangerate-api.com/).

## Configuración 🛠️

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-moneda.git
   cd conversor-de-moneda
   ```

2. **Configura la variable de entorno**:
    - En tu sistema, establece la variable de entorno `EXCHANGERATE_API_KEY` con tu clave de API.
    - Ejemplo en Linux/MacOS:
      ```bash
      export EXCHANGERATE_API_KEY=tu_clave_de_api
      ```
    - Ejemplo en Windows:
      ```cmd
      set EXCHANGERATE_API_KEY=tu_clave_de_api
      ```

3. **Compila y ejecuta el proyecto**:
   ```bash
   ./gradlew build
   ./gradlew run
   ```

## Uso 🚀

1. **Ejecuta el programa**:
   ```bash
   ./gradlew run
   ```

2. **Sigue las instrucciones en pantalla**:
    - El programa te mostrará un menú con opciones de conversión.
    - Ingresa el número correspondiente a la conversión que deseas realizar.
    - Ingresa la cantidad de dinero que deseas convertir.
    - El programa mostrará el resultado de la conversión.

## Ejemplo de Uso 📝

```
👋 Sea bienvenido/a al Conversor de Moneda 💱

1) 🇺🇸 Dólar =>> 🇦🇷 Peso Argentino
2) 🇦🇷 Peso argentino =>> 🇺🇸 Dólar
3) 🇺🇸 Dólar =>> 🇧🇷 Real brasileño
4) 🇧🇷 Real brasileño =>> 🇺🇸 Dólar
5) 🇺🇸 Dólar =>> 🇨🇴 Peso colombiano
6) 🇨🇴 Peso colombiano =>> 🇺🇸 Dólar
7) 🚪 Salir

Elija una opción válida: 1
Ingrese la cantidad a convertir: 100
100.00 USD = 98175.00 ARS
```

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si encuentras un error o tienes una mejora, no dudes en abrir un issue o enviar un pull request.

## Licencia 📄

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

¡Gracias por usar el Conversor de Moneda! Si tienes alguna pregunta o sugerencia, no dudes en contactarme. ¡Happy Coding! 🚀
