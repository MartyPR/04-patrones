# Patrón Builder

El patrón **Builder** es un patrón de diseño creacional que se utiliza para construir objetos complejos paso a paso. Este patrón permite que el proceso de construcción sea flexible y que las diferentes representaciones de un objeto sean creadas sin alterar su implementación interna.

---

## Características Principales

- **Separación de la construcción:** La lógica para construir un objeto está separada de su representación final.
- **Control paso a paso:** Los objetos pueden ser construidos mediante pasos opcionales o personalizados.
- **Reusabilidad:** Facilita la reutilización de código al permitir diferentes configuraciones con el mismo código base.

---

## Componentes del Patrón Builder

1. **Producto**:
   El objeto complejo que queremos construir. En este caso, `Employee`.

2. **Builder**:
   La interfaz o clase abstracta que define los pasos necesarios para construir el producto. En este ejemplo, es `EmployeeBuilder`.

3. **Director**:
   Coordina los pasos de construcción del objeto utilizando el Builder. En este caso, `EmployeeDirector`.

4. **Cliente**:
   Usa el Director para construir el producto.

---

## Ejemplo en el Proyecto

### Clase `Employee`
Representa el producto que queremos construir. Contiene propiedades como `age`, `name`, `gender`, `address`, `phoneList` y `contacts`.

### Clase `Employee.EmployeeBuilder`
Implementa el Builder y proporciona métodos para configurar cada una de las propiedades del objeto `Employee`:

```java
EmployeeBuilder builder = new Employee.EmployeeBuilder()
    .setName("John Doe")
    .setAge(30)
    .setGender("Male")
    .setAddress("123 Main St", "New York", "USA", "10001")
    .setPhone("1234567890", "001", "Mobile");

Employee employee = builder.Build();
```

### Clase `EmployeeDirector`
El Director simplifica el proceso de construcción mediante métodos predefinidos que aplican configuraciones específicas:

```java
        Employee defaultEmployeeFemale = director.createDefaultEmployeeFemale("Luis","4123123132");
        System.out.println(defaultEmployeeFemale);

        Employee defaultEmployeeMale = director.createDefaultEmployeeFemale("Luis","4123123132");
        System.out.println(defaultEmployeeMale);
```

---

## Ventajas del Patrón Builder

- **Flexibilidad:** Permite construir objetos paso a paso, ignorando propiedades innecesarias.
- **Inmutabilidad:** Los objetos creados pueden ser inmutables si no se exponen métodos "setter" en la clase producto.
- **Legibilidad:** Facilita la comprensión del código al utilizar métodos encadenados (“fluent interface”).

---

## Casos de Uso

- Cuando se necesita construir un objeto complejo con muchas propiedades opcionales o configuraciones.
- Cuando el mismo proceso de construcción debe producir diferentes representaciones del objeto.
- Cuando se busca mejorar la legibilidad y el mantenimiento del código.

---

## Diagrama UML

```plaintext
    +----------------+            +-------------------+        +-------------+
    |     Client     |            |      Director     |        |   Builder   |
    +----------------+            +-------------------+        +-------------+
             |                             |                         |
             |  --------------------->     |                         |
             |   (set Builder)             |                         |
             |                             |                         |
             |                             | ---------------------> |
             |                             |  call build steps       |
             |                             |                         |
             | <---------------------      | <---------------------  |
             |   get Product               |   (create Product)      |
    +----------------+            +-------------------+        +-------------+
    |    Product     |
    +----------------+
```

---

## Conclusión

El patrón Builder es una herramienta poderosa para manejar la complejidad en la creación de objetos, ofreciendo flexibilidad y control. Este patrón es especialmente útil en proyectos donde los objetos tienen muchas propiedades opcionales o necesitan configuraciones diferentes según el contexto.

