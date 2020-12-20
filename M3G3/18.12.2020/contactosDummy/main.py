from fastapi import FastAPI, HTTPException, Depends
import db_dummy
import models
import repositorio
from fastapi.middleware.cors import CORSMiddleware
from db.conexion_db import obtener_db
from sqlalchemy.orm import Session
from db.entidades import Contacto, Telefono
from typing import List

app = FastAPI()

origins = [
    "*"
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

contador = 3


@app.get("/prueba/")
async def prueba(db=Depends(obtener_db)):
    global contador
    nuevo_contacto = Contacto(
        id=str(contador), nombre="Juan", direccion="Cll 1234")
    db.add(nuevo_contacto)
    db.commit()
    contador += 1
    return {"mensaje": "Prueba exitosa"}
# Agregar
# db.add(entidad)
# db.commit()
# db.refresh(entitad)
# Delete
# entidad_a_borrar = query...
# db.delete(entidad_a_borrar)
# db.commit()
# Update
# entidad = db.query....
#entidad.atributo = "nuevo valor"
# db.commit()
# Consultas
# db.query(Telefono).get(id)
# db.query(Telefono).all()
#db.query(Telefono).filter(Telefono.codigo_pais == "57").first()
#db.query(Telefono).filter(Telefono.codigo_pais == "57").all()


@app.get("/prueba2/", response_model=List[models.ContactoResumen])
async def prueba(db: Session = Depends(obtener_db)):
    resultado = db.query(Contacto).all()
    return resultado


@app.get("/contactos/resumen/", response_model=List[models.ContactoResumen])
async def obtener_lista_contactos(db: Session = Depends(obtener_db)):
    return repositorio.lista_contactos(db)
#[{"id": 1, "nombre": "Juan"}, {"id": 2, "nombre": "Juan"}]


@app.post("/contactos/crear/")
async def crear_contacto(contacto: db_dummy.Contacto, db: Session = Depends(obtener_db)):

    operacion_exitosa = repositorio.crear_contacto(
        db, Contacto(**contacto.dict()))
    if operacion_exitosa:
        return {"mensaje": "contacto creado correctamente"}
    else:
        raise HTTPException(
            status_code=400, detail="Contacto no pudo ser creado: ya existía un contacto con ")
#{"mensaje": "contacto creado correctamente"}


@app.post("/ordenes/crear/solo-nombre/")
async def crear_contacto_solo_nombre(contacto: models.ContactoIn):
    pass


@app.get("/contacto/")
async def obtener_contacto(id: str):
    contacto = repositorio.obtener_contacto_con_telefonos(id)
    if contacto is None:
        raise HTTPException(status_code=400, detail='Usuario no encontrado')
    else:
        return contacto
