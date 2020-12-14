from pydantic import BaseModel
import db
from typing import List


class ContactoResumen(BaseModel):
    id: str
    nombre: str


class ContactoIn(BaseModel):
    id: str
    nombre: str


class ContactoConTelefono(db.Contacto):
    telefonos: List[db.Telefono]
