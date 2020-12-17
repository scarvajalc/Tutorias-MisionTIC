from fastapi import APIRouter
from fastapi import HTTPException
import db

router = APIRouter()


@router.post("/ordenes/crear/")
async def crear_orden(orden: db.Orden):
    creada_exitosamente = db.crear_orden(orden)
    if creada_exitosamente:
        return {"mensaje": "Orden creada correctamenteo"}
    else:
        raise HTTPException(
            status_code=400, detail="error, orden con ese id ya exisitia")
