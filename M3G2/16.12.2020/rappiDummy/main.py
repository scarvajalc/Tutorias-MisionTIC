from fastapi import FastAPI, HTTPException
import db
from fastapi.middleware.cors import CORSMiddleware
from routers.router_gestion_ordenes import router as router_gestion
from routers.router_consultas import router as router_consultas

app = FastAPI()

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
