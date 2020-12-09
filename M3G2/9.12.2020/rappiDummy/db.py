from pydantic import BaseModel


class Orden(BaseModel):
    id: int
    fecha: str
    usuario: str
    tienda: str
    valor: float


ordenes = {
    1: Orden(id=1, fecha="20-11-2020", usuario="pepe", tienda="dominos", valor=2000),
    2: Orden(id=2, fecha="20-11-2020", usuario="juan", tienda="pizzhut", valor=3000)
}


def obtener_ordenes():
    # Haga lo que tenga que hacer para conectarse a la base de datos y obtener todas las ordenes
    lista_ordenes = []
    for e in ordenes:
        lista_ordenes.append(ordenes[e])
    return lista_ordenes


def crear_orden(orden: Orden):
    if orden.id in ordenes:
        return False
    else:
        ordenes[orden.id] = orden
        return True
