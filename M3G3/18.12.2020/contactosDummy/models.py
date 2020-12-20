from pydantic import BaseModel
import db_dummy
from typing import List


class ContactoResumen(BaseModel):
    id: str
    nombre: str

    class Config:
        orm_mode = True


class ContactoIn(BaseModel):
    id: str
    nombre: str


class ContactoConTelefono(db_dummy.Contacto):
    telefonos: List[db_dummy.Telefono]
