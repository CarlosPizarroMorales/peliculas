// URL de la API
const apiUrlCrear = "http://localhost:8080/cine/actores";

// Instancia de Vue
new Vue({
  el: "#app",
  data: {
    nuevoEmpleado: {
      nombre: "",
    }
  },
  methods: {
    guardarEmpleado() {
      // Llamada a la API para guardar el empleado utilizando el método POST
      axios.post(apiUrlCrear, this.nuevoEmpleado)
        .then(response => {
          console.log("Empleado guardado:", response.data);
          Swal.fire({
            icon: "success",
            title: "Actor creado",
            text: "El Actor se creó correctamente."
          }).then(() => {
            // Redirigir a la página de empleados.html después de aceptar
            window.location.href = "actores.html";
          });
        })
        .catch(error => {
          console.error(error);
          Swal.fire({
            icon: "error",
            title: "Error al crear actor",
            text: "Ocurrió un error al crear el actor."
          });
        });
    }
  }
});
