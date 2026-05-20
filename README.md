# Lectura de Datos Relacionales con ResultSet (Repaso 18)

Programa en Java que implementa la recuperación de registros desde una base de datos Oracle, utilizando cursores de datos para procesar y mostrar la información de forma estructurada.

## 🚀 Funcionalidades
* **Consulta de Datos (Select):** Ejecuta sentencias SQL para extraer de forma masiva los nombres y salarios de todos los trabajadores registrados en la tabla `EMPLEADO`.
* **Procesamiento de Resultados:** Utiliza un objeto `ResultSet` para iterar a través de los registros devueltos por el motor de base de datos, transformando datos relacionales en variables legibles por Java.
* **Presentación Formateada:** Emplea el método `printf` para generar una salida en consola alineada y profesional, facilitando la lectura de la información mediante el uso de tablas visuales.
* **Manejo de Tipos de Datos:** Recupera de forma específica cadenas de texto (`getString`) y valores numéricos (`getInt`), respetando la integridad de los datos definidos en el esquema SQL.

## 🛠️ Estructura técnica
El código demuestra el dominio de la lectura de flujos de datos en JDBC:
* **`Statement`**: Utilizado para enviar comandos SQL estáticos de consulta al servidor.
* **`ResultSet` y el puntero `next()`**: Mecanismo fundamental que permite recorrer fila por fila el conjunto de resultados, devolviendo `false` automáticamente al alcanzar el final de la tabla.
* **Formateo de Salida (`%-10s`)**: Técnica de alineación a la izquierda con reserva de espacios fijos, ideal para la creación de reportes por terminal.
* **Eficiencia de Recursos**: Implementa el cierre manual del `ResultSet` y el cierre automático de la conexión mediante el patrón *try-with-resources*.