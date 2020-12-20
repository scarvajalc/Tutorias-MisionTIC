from pydantic import BaseModel
from datetime import date


class Orden(BaseModel):
    id: int
    fecha: date
    usuario: str
    tienda: str
    valor: float


ordenes = {
    1: Orden(id=1, fecha="2020-11-20", usuario="pepe", tienda="dominos", valor=2000),
    2: Orden(id=2, fecha="2020-11-20", usuario="juan", tienda="pizzhut", valor=3000),
    3: Orden(id=3, fecha="2020-11-20", usuario="Carlos", tienda="La Sangucheria", valor=3000)
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
