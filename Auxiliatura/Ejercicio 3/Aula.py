from multimethod import multimethod
class Aula:

    def __init__(self, nombreAula:str, piso:int, estudiantes:list):
        self.nombreAula = nombreAula
        self.piso = piso
        self.estudiantes = estudiantes

    @multimethod
    def mostrar(self):
        print("Nombre del aula:", self.nombreAula)
        print("Piso:", self.piso)
        print("Estudiantes y notas:")

        for e in self.estudiantes:
            print(e[0], "-", e[1])

        print("---------------------------")

    @multimethod
    def mostrar(self, estado:str):

        print("Estado de los estudiantes")

        for e in self.estudiantes:

            if e[1] >= 51:
                print(e[0], "-", e[1], "-", "APROBADO")
            else:
                print(e[0], "-", e[1], "-", "REPROBADO")

        print("--------------------------")


estudiantes = [
    ["Paola", 77],
    ["Melany", 89]
]

aula1 = Aula("Lasin", 2, estudiantes)

aula1.mostrar()
aula1.mostrar("estado")