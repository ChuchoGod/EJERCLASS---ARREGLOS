# EJERCLASS---ARREGLOS

## VentasJava:

**insertarVentas():**
Este método permite ingresar las ventas para cada departamento (Ropa, Deportes y Juguetería) mes por mes.  
Usa un bucle for para recorrer los departamentos y los meses, solicitando al usuario que ingrese un valor de ventas para cada mes.  
Se valida que las entradas sean números positivos, y en caso de error, pide nuevamente la entrada.

**Estructura usadas:**
- **Bucle for anidado**: El primer bucle recorre los departamentos (`for (int i = 0; i < departamentos.length; i++)`), mientras que el segundo bucle recorre los meses (`for (int j = 0; j < 12; j++)`).
- **Bucle while (true)**: Se utiliza dentro del segundo bucle para validar la entrada del usuario, asegurando que el valor sea un número entero positivo.
- **Validación de entrada**: Se utiliza `try-catch` para manejar posibles errores en la conversión de texto a número, repitiendo el proceso hasta que el usuario ingrese un valor válido.

**buscarVenta():**
Este método permite buscar la venta de un departamento específico en un mes determinado.  
Solicita al usuario el número del departamento (0, 1, 2) y el mes (1 a 12), y muestra la venta correspondiente si los valores ingresados son válidos.  
Si el usuario ingresa valores incorrectos, solicita que intente nuevamente hasta obtener datos correctos.

**Estructura usadas:**
- **Bucle while (true)**: El método sigue solicitando entradas hasta que el usuario ingrese valores válidos.
- **Condicionales if**: Se utilizan para verificar que el número del departamento y del mes estén dentro de los rangos permitidos antes de acceder a la venta correspondiente.

**eliminarVentas():**
Elimina las ventas de un departamento completo, es decir, pone todas las ventas de los 12 meses en "0".  
El usuario debe ingresar el número del departamento, y una vez validado, las ventas se eliminan.  
Si el usuario introduce un número incorrecto, el programa solicita una nueva entrada hasta que sea válida.

**Estructura usadas:**
- **Bucle while (true)**: Solicita el número del departamento hasta que el usuario ingrese un valor válido.
- **Bucle for**: Recorre los 12 meses del departamento y los pone en 0 (`ventas[departamento][mes] = 0`).

**menu():**
Este método es el punto de entrada principal y muestra un menú interactivo.  
Permite al usuario seleccionar entre las opciones de insertar ventas, buscar una venta, eliminar ventas o salir del programa.  
Según la elección del usuario, llama a los métodos correspondientes.

**Estructura usadas:**
- **Bucle while (true)**: El menú sigue repitiéndose hasta que el usuario elige salir.
- **Condicionales if-elif-else**: Según la opción seleccionada por el usuario, se llama al método adecuado.

## VentasPython:

**insertar_ventas():**
Este método permite que el usuario ingrese las ventas mensuales de cada departamento (Ropa, Deportes y Juguetería).  
Utiliza un bucle for que recorre los departamentos y los meses, pidiendo al usuario que ingrese una venta para cada mes.  
Se valida que el valor ingresado sea un número entero y mayor o igual a 0. En caso de error, el programa solicita que el usuario vuelva a intentarlo.

**Estructura usadas:**
- **Bucle for anidado**: El primer bucle recorre los departamentos (`for i, departamento in enumerate(departamentos)`), mientras que el segundo recorre los 12 meses (`for j in range(12)`).
- **Bucle while True**: Se utiliza para validar la entrada del usuario y repetir la solicitud hasta que se ingrese un valor válido.
- **Try-except**: Se usa para manejar posibles errores de conversión y asegurarse de que el valor ingresado sea un número entero.

**buscar_venta():**
Este método permite buscar y mostrar la venta de un departamento específico en un mes particular.  
El usuario debe ingresar el número correspondiente al departamento (0 para Ropa, 1 para Deportes, 2 para Juguetería) y el número del mes (del 1 al 12).  
Si los datos ingresados están dentro de los rangos válidos, el programa muestra la venta; si no, solicita que el usuario lo intente nuevamente.

**Estructura usadas:**
- **Bucle while True**: El método sigue solicitando los valores hasta que se ingresen datos válidos.
- **Condicionales if**: Se utilizan para validar que los valores del departamento y mes estén en el rango correcto.

**eliminar_ventas():**
Elimina todas las ventas de un departamento seleccionado, es decir, pone a cero las ventas de los 12 meses.  
El usuario debe ingresar el número del departamento, y si es válido, se eliminan las ventas. Si no, se pide que ingrese una entrada válida.

**Estructura usadas:**
- **Bucle while True**: Solicita el número del departamento hasta que el usuario ingrese un valor válido.
- **Lista por comprensión**: Reemplaza las ventas de los 12 meses con ceros utilizando la expresión `[0] * 12`.

**menu():**
Este es el menú principal del programa. Permite al usuario elegir entre varias opciones: insertar ventas, buscar una venta, eliminar ventas o salir del programa.  
Dependiendo de la opción seleccionada, se llama a los métodos correspondientes para realizar la acción deseada.  
El menú sigue repitiéndose hasta que el usuario elige la opción de salir.

**Estructura usadas:**
- **Bucle while True**: El menú se repite hasta que el usuario selecciona salir.
- **Condicionales if-elif-else**: Según la opción elegida, se ejecuta la acción correspondiente.
