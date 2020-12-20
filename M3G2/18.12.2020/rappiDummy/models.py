from pydantic import BaseModel


class OrdenResumida(BaseModel):
    usuario: str
    valor: int

    class Config:
        orm_mode = True
