# EJERCLASS---ARREGLOS

## VentasJava:

**insertarVentas():**
Este método permite ingresar las ventas para cada departamento (Ropa, Deportes y Juguetería) mes por mes.
Usa un bucle for para recorrer los departamentos y los meses, solicitando al usuario que ingrese un valor de ventas para cada mes.
Se valida que las entradas sean números positivos, y en caso de error, pide nuevamente la entrada.

**buscarVenta():**
Este método permite buscar la venta de un departamento específico en un mes determinado.
Solicita al usuario el número del departamento (0, 1, 2) y el mes (1 a 12), y muestra la venta correspondiente si los valores ingresados son válidos.
Si el usuario ingresa valores incorrectos, solicita que intente nuevamente hasta obtener datos correctos.

**eliminarVentas():**
Elimina las ventas de un departamento completo, es decir, pone todas las ventas de los 12 meses en "0".
El usuario debe ingresar el número del departamento, y una vez validado, las ventas se eliminan.
Si el usuario introduce un número incorrecto, el programa solicita una nueva entrada hasta que sea válida.

**menu():**
Este método es el punto de entrada principal y muestra un menú interactivo.
Permite al usuario seleccionar entre las opciones de insertar ventas, buscar una venta, eliminar ventas o salir del programa.
Según la elección del usuario, llama a los métodos correspondientes.

## VentasPython:

**insertar_ventas():**
Este método permite que el usuario ingrese las ventas mensuales de cada departamento (Ropa, Deportes y Juguetería).
Utiliza un bucle for que recorre los departamentos y los meses, pidiendo al usuario que ingrese una venta para cada mes.
Se valida que el valor ingresado sea un número entero y mayor o igual a 0. En caso de error, el programa solicita que el usuario vuelva a intentarlo.

**buscar_venta():**
Este método permite buscar y mostrar la venta de un departamento específico en un mes particular.
El usuario debe ingresar el número correspondiente al departamento (0 para Ropa, 1 para Deportes, 2 para Juguetería) y el número del mes (del 1 al 12).
Si los datos ingresados están dentro de los rangos válidos, el programa muestra la venta; si no, solicita que el usuario lo intente nuevamente.

**eliminar_ventas():**
Elimina todas las ventas de un departamento seleccionado, es decir, pone a cero las ventas de los 12 meses.
El usuario debe ingresar el número del departamento, y si es válido, se eliminan las ventas. Si no, se pide que ingrese una entrada válida.

**menu():**
Este es el menú principal del programa. Permite al usuario elegir entre varias opciones: insertar ventas, buscar una venta, eliminar ventas o salir del programa.
Dependiendo de la opción seleccionada, se llama a los métodos correspondientes para realizar la acción deseada.
El menú sigue repitiéndose hasta que el usuario elige la opción de salir.
