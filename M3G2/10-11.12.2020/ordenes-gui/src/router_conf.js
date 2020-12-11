import VueRouter from "vue-router";
import AgregarOrden from "./components/AgregarOrden";
import VerOrdenes from "./components/VerOrdenes";

const router = new VueRouter({
  mode: "history",
  routes: [
    {
      name: "agregar",
      path: "/agregar",
      component: AgregarOrden
    },
    {
      name: "verOrdenes",
      path: "/ver",
      component: VerOrdenes
    }
  ]
});

export default router;
