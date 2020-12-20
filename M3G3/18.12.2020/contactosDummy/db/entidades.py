from db.conexion_db import Base, motor
from sqlalchemy import Column, Integer, String, ForeignKey
from sqlalchemy.orm import relationship


class Contacto(Base):
    __tablename__ = "contacto"
    id = Column(String, primary_key=True)
    nombre = Column(String)
    direccion = Column(String)
    #telefonos = relationship("Telefono", back_populates="propietario")


class Telefono(Base):
    __tablename__ = "telefono"
    id = Column(Integer, primary_key=True, autoincrement=True)
    codigo_pais = Column(String)
    numero_telefono = Column(String)
    contacto_id = Column(String, ForeignKey("contacto.id"))
    #propietario = relationship("Contacto", back_populates="telefonos")


Base.metadata.create_all(bind=motor)
