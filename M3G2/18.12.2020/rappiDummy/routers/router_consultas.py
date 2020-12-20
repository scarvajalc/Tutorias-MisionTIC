from fastapi import APIRouter
from fastapi import HTTPException
import db_dummy

router = APIRouter()


@router.get("/ordenes/")
async def obtener_ordenes():
    ordenes = db_dummy.obtener_ordenes()
    return ordenes
