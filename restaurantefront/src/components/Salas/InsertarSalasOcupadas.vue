<template>

  <div class="nuevaSalas">
      <h2>Insertar</h2>
    <form>
        <label >Sala Disponible:</label><br>
       <select name="select" v-model="idDisponible">
        <option v-for="salasdisponible in salasdisponibles" :key="salasdisponible" :value='salasdisponible.id'> {{salasdisponible.nombre}}</option>
      </select><br>
      <label >Nombre del cliente:</label><br>
      <input type="text" v-model="nombreCliente"><br>
      <button type="button"  @click="crearSala()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            salasdisponibles:[],
            idDisponible:0,
            nombreCliente:""
        }
    },
  
    methods:{
        obtenerSalas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/salasdisponible")
        .then(response => {
          this.salasdisponibles = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      crearSala: function(){
       
        
        for (var i = 0; i <= this.salasdisponibles.length; i++) {
          
          if(this.salasdisponibles[i].id==this.idDisponible){
             let salasOcupadas={
                id:this.salasdisponibles[i].id,
                nombre:this.salasdisponibles[i].nombre,
                nombreOcupante:this.nombreCliente
              }
            axios.delete("http://localhost:8080/restaurante/v1/salasdisponible/"+this.idDisponible).then((result) => {
            alert("Se ha eliminado la Bebida Correctamente");
            });
            axios.post("http://localhost:8080/restaurante/v1/salasocupadas", salasOcupadas).then((result) => {
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

.nuevaSalas{
  width: 100%;
  position: absolute;
  top:300px;
}

</style>
