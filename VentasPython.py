# Crear un arreglo bidimensional para 3 departamentos y 12 meses
ventas = [[0] * 12 for _ in range(3)]
departamentos = ["Ropa", "Deportes", "Juguetería"]

# Función para insertar ventas por departamento
def insertar_ventas():
    for i, departamento in enumerate(departamentos):
        print(f"Inserte las ventas del departamento de {departamento}:")
        for j in range(12):
            while True:
                try:
                    venta = int(input(f"Mes {j + 1}: "))
                    if venta >= 0:
                        ventas[i][j] = venta
                        break
                    else:
                        print("Por favor, ingrese un valor válido (venta positiva).")
                except ValueError:
                    print("Por favor, ingrese un número válido.")

# Función para buscar una venta específica por departamento y mes
def buscar_venta():
    while True:
        try:
            departamento = int(input("Ingrese el número del departamento (0=Ropa, 1=Deportes, 2=Juguetería): "))
            mes = int(input("Ingrese el número del mes (1-12): "))
            if 0 <= departamento < len(ventas) and 1 <= mes <= 12:
                print(f"La venta del departamento de {departamentos[departamento]} en el mes {mes} es: {ventas[departamento][mes - 1]}")
                break
            else:
                print("Datos incorrectos, por favor inténtelo de nuevo.")
        except ValueError:
            print("Por favor, ingrese números válidos.")

# Función para eliminar (poner a 0) todas las ventas de un departamento
def eliminar_ventas():
    while True:
        try:
            departamento = int(input("Ingrese el número del departamento que desea eliminar (0=Ropa, 1=Deportes, 2=Juguetería): "))
            if 0 <= departamento < len(ventas):
                ventas[departamento] = [0] * 12
                print(f"Las ventas del departamento de {departamentos[departamento]} han sido eliminadas.")
                break
            else:
                print("Departamento no encontrado, por favor inténtelo de nuevo.")
        except ValueError:
            print("Por favor, ingrese un número válido.")

# Menú principal para ejecutar las funciones
def menu():
    while True:
        print("\n--- Menú de Ventas ---")
        print("1. Insertar ventas")
        print("2. Buscar venta")
        print("3. Eliminar ventas de un departamento")
        print("4. Salir")
        
        opcion = input("Seleccione una opción: ")
        
        if opcion == '1':
            insertar_ventas()
        elif opcion == '2':
            buscar_venta()
        elif opcion == '3':
            eliminar_ventas()
        elif opcion == '4':
            print("Saliendo del programa...")
            break
        else:
            print("Opción inválida, por favor elija una opción correcta.")

# Ejecutar el menú
menu()
