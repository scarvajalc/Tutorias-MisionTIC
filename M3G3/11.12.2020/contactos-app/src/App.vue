<template>
  <div id="app">
    <img src="./assets/logo.png" />
    <p>{{ mensaje }}</p>
    <button v-on:click="cambiarMensaje">Cambiar el mensaje</button>
    <VerContactos />
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld";
import VerContactos from "./components/VerContactos";

export default {
  name: "App",
  components: {
    HelloWorld,
    VerContactos
  },
  data: function() {
    return {
      mensaje: "Hola Mundo",
      lista: ["a", "b", "c"]
    };
  },
  methods: {
    cambiarMensaje: function() {
      this.mensaje = "Chao Mundo";
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
