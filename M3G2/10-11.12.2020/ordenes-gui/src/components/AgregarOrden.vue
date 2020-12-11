<template>
  <div id="agregarOrden">
    <h3>Agregar Orden</h3>
    <label for="id">Id</label>
    <input v-model="id" id="id" />
    <label for="fecha">Fecha</label>
    <input id="fecha" type="date" />
    <label for="usuario">Usuario</label>
    <input id="usuario" />
    <label for="tienda">Tienda</label>
    <input id="tienda" />
    <label for="valor" type="numeric">Valor</label>
    <input id="valor" />
    <button v-on:click="mostrarId">Agregar Orden</button>
  </div>
</template>

<script>
export default {
  name: "AgregarOrden",
  data: function() {
    return {
      id: ""
    };
  },
  methods: {
    mostrarId: function() {
      alert(this.id);
    }
  },
  beforeCreate: function() {}
};
</script>

<style scoped>
#agregarOrden {
  background-color: beige;
}
</style>
