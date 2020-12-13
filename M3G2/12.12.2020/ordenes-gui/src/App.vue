<template>
  <div id="app">
    <h1>Rappi - Modulo de ordenes</h1>
    <nav>
      <button v-on:click="cambiarOrdenes">Ordenes</button>
      <button v-on:click="cambiarAgregarOrden">Agregar Orden</button>
      <button v-on:click="holaMundo">Detalles Orden</button>
      <h2>{{ nombre }}</h2>
      <router-view></router-view>
    </nav>
  </div>
</template>

<script>
import AgregarOrden from "./components/AgregarOrden";
import VerOrdenes from "./components/VerOrdenes";

export default {
  name: "App",
  components: { AgregarOrden, VerOrdenes },
  data: function() {
    return {
      nombre: 2
    };
  },
  methods: {
    holaMundo: function() {
      this.nombre++;
    },
    cambiarOrdenes: function() {
      if (this.$route.name != "verOrdenes") {
        this.$router.push({ name: "verOrdenes" });
      }
    },
    cambiarAgregarOrden: function() {
      if (this.$route.name != "agregar") {
        this.$router.push({
          name: "agregar",
          params: { dato: "Soy un dato que vengo de el componente raiz" }
        });
      }
    }
  },
  beforeCreate: function() {
    if (this.$route.name != "verOrdenes") {
      this.$router.push({ name: "verOrdenes" });
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
