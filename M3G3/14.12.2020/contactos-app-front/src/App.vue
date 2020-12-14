<template>
  <div id="app">
    <nav>
      <button v-on:click="navegarContactos">Ver Contactos</button>
      <button v-on:click="navegarCreaContacto">Agregar Contacto</button>
    </nav>

    <router-view />
    <p>{{ eldato }}</p>
    <button v-on:click="cambiarMensaje">Cambiar el mensaje</button>
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld";
import VerContactos from "./components/VerContactos";
import AgregarContacto from "./components/AgregarContacto";

export default {
  name: "App",
  data: function() {
    return {
      eldato: 3
    };
  },
  methods: {
    cambiarMensaje: function() {
      this.eldato++;
    },
    navegarCreaContacto: function() {
      this.$router.push({ name: "agregarContacto" });
    },
    navegarContactos: function() {
      this.$router.push({ name: "verResumen" });
    }
  },
  components: { VerContactos, AgregarContacto },
  beforeCreate: function() {
    this.$router.push({ name: "verResumen" });
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
