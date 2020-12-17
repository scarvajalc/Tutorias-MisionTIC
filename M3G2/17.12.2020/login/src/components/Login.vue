<template>
  <div>
    <h2>Login</h2>
    <label>Username</label><br />
    <input v-model="user" type="text" /><br /><br />
    <p>{{ user }}</p>
    <label>Password</label><br />
    <input
      v-model="pass"
      v-bind:type="showPassword"
      v-bind:placeholder="x"
    /><br /><br />
    <label for="">Mostrar Contraseña</label>
    <input type="checkbox" />
    <br /><br />

    <button v-on:click="hacerLogin">Login</button>
    <p>{{ mensaje }}</p>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "Login",
  data: function() {
    return {
      user: "",
      pass: "",
      mensaje: "",
      auth: false,
      showPassword: "password",
      x: "contraseñaasdf"
    };
  },
  methods: {
    hacerLogin: function() {
      var datosJson = {
        username: this.user,
        password: this.pass
      };
      axios
        .post("http://127.0.0.1:8000/user/auth/", datosJson)
        .then(respuesta => {
          if (respuesta.data.Autenticado) {
            this.mensaje = "Login correcto";
            this.auth = true;
          } else {
            this.mensaje = "Uusario o contraseña incorrectos";
          }
        })
        .catch(err => {
          console.log(err);
          //console.log(err.response.detail);
          alert("Error del servidor");
        });
    }
  }
};
</script>

<style scoped>
div {
  background-color: black;
  color: white;
}
p {
  color: red;
}
</style>
