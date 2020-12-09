from fastapi import FastAPI, HTTPException
import db

app = FastAPI()


@app.get("/ordenes/")
async def obtener_ordenes():
    ordenes = db.obtener_ordenes()
    return ordenes


@app.post("/ordenes/crear/")
async def crear_orden(orden: db.Orden):
    creada_exitosamente = db.crear_orden(orden)
    if creada_exitosamente:
        return {"mensaje": "Orden creada correctamenteo"}
    else:
        raise HTTPException(
            status_code=400, detail="error, orden con ese id ya exisitia")
