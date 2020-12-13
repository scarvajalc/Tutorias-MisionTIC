<template>
  <div>
    <h2>Información de todas las Ordenes</h2>
    <table>
      <tr>
        <th>id</th>
        <th>fecha</th>
        <th>usuario</th>
        <th>tienda</th>
        <th>valor</th>
      </tr>
      <tr v-for="orden in ordenes" v-bind:key="orden.id">
        <td>{{ orden.id }}</td>
        <td>{{ orden.fecha }}</td>
        <td>{{ orden.usuario }}</td>
        <td>{{ orden.tienda }}</td>
        <td>{{ orden.valor }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "VerOrdenes",
  data: function() {
    return {
      ordenes: []
    };
  },
  beforeCreate: function() {
    axios
      .get("http://127.0.0.1:8000/ordenes")
      .then(respuesta => {
        this.ordenes = respuesta.data;
      })
      .catch(error => {
        console.log(error);
        alert("Error en la peticion con codigo" + error.response.status);
      });
  }
};
</script>

<style scoped></style>
