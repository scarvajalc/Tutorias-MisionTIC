<template>
  <div>
    <h2>Resumen de sus contactos</h2>
    <table>
      <tr>
        <th>Id del contacto</th>
        <th>nombre del contacto</th>
      </tr>
      <tr v-for="contacto in lista_contactos_resumida">
        <td>{{ contacto.id }}</td>
        <td>{{ contacto.nombre }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "VerContactos",
  data: function() {
    return {
      lista_contactos_resumida: [
        {
          id: 1,
          nombre: "Pepe"
        },
        { id: 2, nombre: "Maria" }
      ]
    };
  }
};
</script>

<style></style>
