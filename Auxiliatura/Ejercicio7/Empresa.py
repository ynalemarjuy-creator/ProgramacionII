class SueldoInvalidoException(Exception):
    pass


class CargoInvalidoException(Exception):
    pass


class Empleado:
    def __init__(self, nombre, cargo, sueldo):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo = sueldo

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Cargo:", self.cargo)
        print("Sueldo:", self.sueldo)
        print("----------------------")


class Empresa:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.empleados = [None] * tamaño
        self.contador = 0

    def registrar_empleado(self):
        try:
            nombre = input("Nombre: ")

            # Validar cargo
            while True:
                try:
                    cargo = input("Cargo: ")
                    if any(c.isdigit() for c in cargo):
                        raise CargoInvalidoException("El cargo no debe tener números")
                    break
                except CargoInvalidoException as e:
                    print("Error:", e)

            # Validar sueldo
            try:
                sueldo = float(input("Sueldo: "))
                if sueldo < 2500:
                    raise SueldoInvalidoException("Sueldo menor al mínimo")
            except SueldoInvalidoException as e:
                print("Error:", e)
                sueldo = 2500
                print("Se asignó automáticamente 2500 Bs.")

            # Guardar empleado
            self.empleados[self.contador] = Empleado(nombre, cargo, sueldo)
            self.contador += 1

        except Exception as e:
            print("Error inesperado:", e)

    def mostrar_empleados(self):
        for i in range(self.contador):
            self.empleados[i].mostrar()


# Programa principal
empresa = Empresa("Mi Empresa", 5)

for i in range(2):
    print("\nRegistro de empleado", i + 1)
    empresa.registrar_empleado()

print("\n--- Lista de empleados ---")
empresa.mostrar_empleados()