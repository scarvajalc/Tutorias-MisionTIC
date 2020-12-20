from db.conexion_db import Base
from sqlalchemy import Boolean, Column, ForeignKey, Integer, String, Date
from db.conexion_db import engine


class Orden(Base):
    __tablename__ = "orden"
    id = Column(Integer, primary_key=True, autoincrement=True)
    fecha = Column(Date)
    usuario = Column(String)
    tienda = Column(String)
    valor = Column(Integer)


Base.metadata.create_all(bind=engine)
