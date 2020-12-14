<template>
  <div id="contendio">
    <h2 v-if="varibaleBooleana">Resumen de sus contactos</h2>
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
import axios from "axios";
export default {
  name: "VerContactos",
  data: function() {
    return {
      varibaleBooleana: true,
      lista_contactos_resumida: []
    };
  },
  beforeCreate: function() {
    axios
      .get("http://127.0.0.1:8000/contactos/resumen/")
      .then(response => {
        this.lista_contactos_resumida = response.data;
      })
      .catch(error => {
        console.log(error);
        alert("Error del servidor");
      });
  }
};
</script>

<style scoped>
table,
th,
td {
  border: 1px solid black;
}

table {
  margin: auto;
}
</style>
