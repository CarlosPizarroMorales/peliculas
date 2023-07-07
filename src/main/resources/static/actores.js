// URL de la API
const apiUrlListar = "http://localhost:8080/cine/actores";
const apiUrlMostrar = "http://localhost:8080/cine/actores/";
const apiUrlEliminar = "http://localhost:8080/cine/actores?id=";

// Instancia de Vue
new Vue({
  el: "#app",
  data: {
    actores: [],
    detalleActor: null
  },
  mounted() {
    // Llamada a la API para obtener la lista de empleados
    axios.get(apiUrlListar)
      .then(response => {
        this.actores = response.data;
      })
      .catch(error => {
        console.error(error);
      });
  },
  methods: {
    mostrarDetalle(id) {
      // Llamada a la API para obtener el detalle del empleado
      axios.get(apiUrlMostrar + id)
        .then(response => {
          this.detalleActor = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    },
      eliminar(id) {
      // Llamada a la API para obtener el detalle del empleado
      axios.delete(apiUrlEliminar + id)
        .then(response => {
    
     	Swal.fire({
            icon: "success",
            title: "actores Eliminado",
            text: "El actores se eliminó correctamente."
          }).then(() => {
            // Redirigir a la página de empleados.html después de aceptar
            window.location.href = "actores.html";
          });    
    
        })
        .catch(error => {         
            Swal.fire({
            icon: "error",
            title: "Error al eliminar actores",
            text: "Ocurrió un error al eliminar el actores."
          });        
         
        });
    }
  }
});
