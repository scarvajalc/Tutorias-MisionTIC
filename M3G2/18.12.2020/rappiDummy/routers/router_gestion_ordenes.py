from fastapi import APIRouter
from fastapi import HTTPException
import db_dummy

router = APIRouter()


@router.post("/ordenes/crear/")
async def crear_orden(orden: db_dummy.Orden):
    creada_exitosamente = db_dummy.crear_orden(orden)
    if creada_exitosamente:
        return {"mensaje": "Orden creada correctamenteo"}
    else:
        raise HTTPException(
            status_code=400, detail="error, orden con ese id ya exisitia")
