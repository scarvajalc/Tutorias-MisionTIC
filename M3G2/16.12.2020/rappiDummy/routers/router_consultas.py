from fastapi import APIRouter
from fastapi import HTTPException
import db

router = APIRouter()


@router.get("/ordenes/")
async def obtener_ordenes():
    ordenes = db.obtener_ordenes()
    return ordenes
