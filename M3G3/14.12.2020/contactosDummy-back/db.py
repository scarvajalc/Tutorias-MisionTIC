from pydantic import BaseModel
from datetime import datetime
from typing import Dict


class Contacto(BaseModel):
    id: str
    nombre: str
    direccion: str


class Telefono(BaseModel):
    id: int
    codigo_pais: str
    numero_telefono: str
    contacto_id: str


contactos: Dict[str, Contacto]

contactos = {
    "1": Contacto(id="1", nombre="pepe", direccion="cll3242"),
    "2": Contacto(id="2", nombre="maria", direccion="cll3242324"),
}

telefonos: Dict[int, Telefono]

telefonos = {
    1: Telefono(**{"id": 1, "codigo_pais": "571", "numero_telefono": "56678", "contacto_id": "1"}),
    2: Telefono(**{"id": 2, "codigo_pais": "57", "numero_telefono": "31098773", "contacto_id": "2"}),
    3: Telefono(**{"id": 3, "codigo_pais": "57", "numero_telefono": "31092373", "contacto_id": "1"}),

}


def obtener_telefonos_de_contacto(id: str):
    lista_telefonos = []
    for telefono in telefonos.values():
        if telefono.contacto_id == id:
            lista_telefonos.append(telefono)
    return lista_telefonos


def obtener_contactos():
    return contactos


def obtener_lista_contactos():
    lista_contactos = []
    for contacto in contactos:
        lista_contactos.append(contactos[contacto])
    return lista_contactos


def obtener_contacto_por_id(id: str):
    if id in contactos:
        return contactos[id]
    else:
        return None


def crear_contacto(contacto: Contacto):
    if contacto.id in contactos:
        return False
    else:
        contactos[contacto.id] = contacto
        return True
