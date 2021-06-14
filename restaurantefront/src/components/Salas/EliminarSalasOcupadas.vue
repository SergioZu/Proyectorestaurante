<template>

  <div class="eliminarSalas">
      <h2>Eliminar Salas Ocupadas</h2>
    <form>
        <label >Sala Disponible:</label><br>
       <select name="select" v-model="idDisponible">
        <option v-for="salasocupada in salasocupadas" :key="salasocupada" :value='salasocupada.id'> {{salasocupada.nombre}}</option>
      </select><br>
      <button type="button"  @click="eliminarSala()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            salasocupadas:[],
            idDisponible:0,
            nombreCliente:""
        }
    },
  
    methods:{
        obtenerSalas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/salasocupadas")
        .then(response => {
          this.salasocupadas = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarSala: function(){
          for (var i = 0; i <= this.salasocupadas.length; i++) {
          
          if(this.salasocupadas[i].id==this.idDisponible){
             let salasDisponibles={
                id:this.salasocupadas[i].id,
                nombre:this.salasocupadas[i].nombre,
                nombreOcupante:this.nombreCliente
              }
            axios.delete("http://localhost:8080/restaurante/v1/salasocupadas/"+this.idDisponible).then((result) => {
            alert("Se ha eliminado la Bebida Correctamente");
            });
            axios.post("http://localhost:8080/restaurante/v1/salasdisponible", salasDisponibles).then((result) => {
              alert("Se ha insertado la Sala Ocupada Correctamente");
              });
            }
        }
      }
        
      },
    created(){
     this.obtenerSalas();
     }
    
}
</script>

<style>

.eliminarSalas{
  width: 100%;
  position: absolute;
  top:300px;
  left:700px;
}

</style>
