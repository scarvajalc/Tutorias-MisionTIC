from fastapi import FastAPI, HTTPException
import db
import models
import repositorio

app = FastAPI()


@app.get("/contactos/resumen/")
async def obtener_lista_contactos():
    return repositorio.lista_contactos_resumen()


@app.post("/ordenes/crear/")
async def crear_contacto(contacto: db.Contacto):
    operacion_exitosa = db.crear_contacto(contacto)
    if operacion_exitosa:
        return {"mensaje": "contacto creado correctamente"}
    else:
        raise HTTPException(
            status_code=400, detail="Contacto no pudo ser creado: ya existía un contacto con ")


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
