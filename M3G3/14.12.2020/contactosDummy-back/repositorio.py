import models
import db


def lista_contactos_resumen():
    lista_contactos_resumen = []
    contactos = db.obtener_contactos()
    for id, contacto in contactos.items():
        contacto_resumen = models.ContactoResumen(
            id=contacto.id, nombre=contacto.nombre)
        lista_contactos_resumen.append(contacto_resumen)
    return lista_contactos_resumen


def obtener_contacto_con_telefonos(id: str):
    contacto = db.obtener_contacto_por_id(id)
    if contacto is None:
        return None
    telefonos = db.obtener_telefonos_de_contacto(id)
    #contacto_con_telefonos = models.ContactoConTelefono(id=contacto.id, nombre=contacto.nombre, direccion=contacto.direccion, telefonos=telefonos)
    contacto_con_telefonos = models.ContactoConTelefono(
        **contacto.dict(), telefonos=telefonos)
    return contacto_con_telefonos
