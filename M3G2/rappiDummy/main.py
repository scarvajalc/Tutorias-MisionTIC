from fastapi import FastAPI, HTTPException, Depends
from fastapi.middleware.cors import CORSMiddleware
from routers.router_gestion_ordenes import router as router_gestion
from routers.router_consultas import router as router_consultas
from db.conexion_db import obtener_sesion
from db.entidades import Orden
from sqlalchemy.orm import Session
from models import OrdenResumida

app = FastAPI()


@app.get("/prueba")
async def prueba(sesion: Session = Depends(obtener_sesion)):
    nueva_orden = Orden(usuario="Pepe",
                        fecha="2020-10-12", tienda="D1", valor=300)
    sesion.add(nueva_orden)
    sesion.commit()
    return {"mensaje": "Orden creada correctamente"}


@app.get("/prueba2", response_model=OrdenResumida)
async def prueba(sesion: Session = Depends(obtener_sesion)):
    ordenes = sesion.query(Orden).all()
    orden_por_id = sesion.query(Orden).get(6)
    ordenes_fitradas = sesion.query(Orden).filter(Orden.valor > 100).all()
    return orden_por_id


app.include_router(router_gestion)
app.include_router(router_consultas)

origins = [
    "http://localhost:8080"
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)
