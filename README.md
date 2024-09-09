# EJERCLASS---ARREGLOS

VentasJava:

insertarVentas():
Este método permite ingresar las ventas para cada departamento (Ropa, Deportes y Juguetería) mes por mes.
Usa un bucle for para recorrer los departamentos y los meses, solicitando al usuario que ingrese un valor de ventas para cada mes.
Se valida que las entradas sean números positivos, y en caso de error, pide nuevamente la entrada.

buscarVenta():
Este método permite buscar la venta de un departamento específico en un mes determinado.
Solicita al usuario el número del departamento (0, 1, 2) y el mes (1 a 12), y muestra la venta correspondiente si los valores ingresados son válidos.
Si el usuario ingresa valores incorrectos, solicita que intente nuevamente hasta obtener datos correctos.

eliminarVentas():
Elimina las ventas de un departamento completo, es decir, pone todas las ventas de los 12 meses en "0".
El usuario debe ingresar el número del departamento, y una vez validado, las ventas se eliminan.
Si el usuario introduce un número incorrecto, el programa solicita una nueva entrada hasta que sea válida.

menu():
Este método es el punto de entrada principal y muestra un menú interactivo.
Permite al usuario seleccionar entre las opciones de insertar ventas, buscar una venta, eliminar ventas o salir del programa.
Según la elección del usuario, llama a los métodos correspondientes.
