<template>
  <div id="agregarOrden">
    <h3>Agregar Orden</h3>
    <label for="id">Id</label>
    <input v-model="id" id="id" />
    <label for="fecha">Fecha</label>
    <input v-model="fecha" id="fecha" type="date" />
    <label for="usuario">Usuario</label>
    <input v-model="usuario" id="usuario" />
    <label for="tienda">Tienda</label>
    <input v-model="tienda" id="tienda" />
    <label for="valor" type="numeric">Valor</label>
    <input v-model="valor" id="valor" />
    <button v-on:click="agregarOrden">Agregar Orden</button>
    <p>El dato recibido fue {{ datoRecibido }}</p>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "AgregarOrden",
  data: function() {
    return {
      id: "",
      fecha: "",
      usuario: "",
      tienda: "",
      valor: "",
      datoRecibido: 0
    };
  },
  methods: {
    mostrarId: function() {
      alert(this.id);
    },
    agregarOrden: function() {
      var datosJSON = {
        id: this.id,
        fecha: this.fecha,
        usuario: this.usuario,
        tienda: this.tienda,
        valor: this.valor
      };
      axios
        .post("http://127.0.0.1:8000/ordenes/crear/", datosJSON)
        .then(respuesta => {
          alert(respuesta.data.mensaje);
        })
        .catch(error => {
          alert("error en el servidor");
        });
    }
  },
  created: function() {
    this.datoRecibido = this.$route.params.dato;
  }
};
</script>

<style scoped>
#agregarOrden {
  background-color: beige;
}
</style>
