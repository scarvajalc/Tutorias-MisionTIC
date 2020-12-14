import VueRouter from "vue-router";
import VerContactos from "./components/VerContactos";
import AgregarContacto from "./components/AgregarContacto";

const router = new VueRouter({
  routes: [
    { name: "verResumen", path: "/ver", component: VerContactos },
    {
      name: "agregarContacto",
      path: "/agregar",
      component: AgregarContacto
    }
  ]
});

export default router;
