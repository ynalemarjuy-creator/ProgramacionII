from multimethod import multimethod
class Videojuego:

    @multimethod
    def __init__(self, nombre:str, plataforma:str):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = 0

    @multimethod
    def __init__(self, nombre:str, plataforma:str, jugadores:int):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores

    @multimethod
    def agregarJugadores(self):
        self.jugadores += 1

    @multimethod
    def agregarJugadores(self, cantidad:int):
        self.jugadores += cantidad

    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Plataforma:", self.plataforma)
        print("Jugadores:", self.jugadores)
        print("----------------------------")


juego1 = Videojuego("Fortnite", "PlayStation")
juego2 = Videojuego("Minecraft", "PC", 3)

juego1.agregarJugadores()      
juego2.agregarJugadores(4)     

juego1.mostrar()
juego2.mostrar()