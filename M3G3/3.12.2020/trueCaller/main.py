from fastapi import FastAPI
from fastapi import HTTPException
from pydantic import BaseModel
from typing import Optional

app = FastAPI()


class Contacto(BaseModel):
    nombre: str
    telefono: int
    spam: Optional[bool] = False


lista_contactos_bd = {"jaimito": Contacto(nombre="jaimito", telefono=324445),
                      "pedrito": Contacto(**{"nombre": "pedrito", "telefono": 23434, "spam": True})
                      }


@app.get("/")
async def home():
    return {"mensaje": "Bienvenido a la API ir a /docs para ver el manual de usuario"}


@app.post("/contactos/agregar/")
async def agregar_contacto(contacto: Contacto):
    if contacto.nombre in lista_contactos_bd:
        raise HTTPException(status_code=406, detail="El contacto ya existe!")
    else:
        lista_contactos_bd[contacto.nombre] = contacto
        return {"mensaje": "contacto creado!!"}
