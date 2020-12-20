from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

# Creando Motor y Conexion con la Base de Datos
SQLALCHEMY_DATABASE_URL = "postgresql://postgres:postgres@localhost:5432/MISIONTIC"
engine = create_engine(SQLALCHEMY_DATABASE_URL)

# Creacion de un creador de sesiones
SessionLocal = sessionmaker(autocommit=False,
                            autoflush=False,
                            bind=engine)


def obtener_sesion():
    db = SessionLocal()
    try:
        yield db
    finally:
        db.close()


# Creando Base para la creacion de los modelos
Base = declarative_base()
Base.metadata.schema = "ordenes"
