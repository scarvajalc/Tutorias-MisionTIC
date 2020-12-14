<template>
  <div>
    <h2>Agregar contacto</h2>
    <label for="">id</label>
    <input type="text" v-model="id" />
    <label for="">nombre</label>
    <input type="text" v-model="nombre" />
    <label for="">direccion</label>
    <input type="text" v-model="direccion" />
    <button v-on:click="agregarContacto">Agregar Contacto</button>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "AgregarContacto",
  data: function() {
    return {
      id: "",
      nombre: "",
      direccion: ""
    };
  },
  methods: {
    agregarContacto: function() {
      var datosJson = {
        id: this.id,
        nombre: this.nombre,
        direccion: this.direccion
      };
      axios
        .post("http://127.0.0.1:8000/contactos/crear/", datosJson)
        .then(response => {
          alert(response.data.mensaje);
        })
        .catch(err => {
          console.log(err);
          alert("error en el servidor");
        });
    }
  }
};
</script>

<style></style>
