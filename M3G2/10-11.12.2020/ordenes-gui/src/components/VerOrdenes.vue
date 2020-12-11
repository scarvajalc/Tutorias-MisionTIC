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
      <tr>
        <td>{{ ordenes[0].id }}</td>
        <td>{{ ordenes[0].fecha }}</td>
        <td>{{ ordenes[0].usuario }}</td>
        <td>{{ ordenes[0].tienda }}</td>
        <td>{{ ordenes[0].valor }}</td>
      </tr>
      <tr>
        <td>{{ ordenes[1].id }}</td>
        <td>{{ ordenes[1].fecha }}</td>
        <td>{{ ordenes[1].usuario }}</td>
        <td>{{ ordenes[1].tienda }}</td>
        <td>{{ ordenes[1].valor }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "VerOrdenes",
  data: function() {
    return {
      ordenes: [
        {
          id: "1",
          fecha: "12-12-2020",
          usuario: "Pepe",
          tienda: "Dominos",
          valor: 20000
        },
        {
          id: "2",
          fecha: "12-12-2020",
          usuario: "Juan",
          tienda: "Pizza Hut",
          valor: 30000
        }
      ]
    };
  }
};
</script>

<style scoped></style>
