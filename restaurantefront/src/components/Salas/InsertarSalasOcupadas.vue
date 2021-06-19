<template>

  <div class="nuevaSalas">
      <h2>Insertar</h2>
    <form>
        <label >Sala Disponible:</label><br>
        <select name="select" v-model="idDisponible"><br>
       
       <option v-for="salasdisponible in salasdisponibles" :key="salasdisponible"  :value='salasdisponible.id'>
          <span v-if="salasdisponible.disponible==true" >{{salasdisponible.nombre}}</span>
         </option> 
      
      </select>
      <br>
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
            idDisponible:0
        }
    },
  
    methods:{
        obtenerSalas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/salas")
        .then(response => {
          this.salasdisponibles = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      crearSala: function(){

        for (var i = 0; i < this.salasdisponibles.length; i++) {
          console.log(this.salasdisponibles[i]);
          if(this.salasdisponibles[i].id==this.idDisponible){
            
             let salasOcupadas={
                id:this.salasdisponibles[i].id,
                nombre:this.salasdisponibles[i].nombre,
                disponible:false
              }
              axios.put("http://localhost:8080/restaurante/v1/salas/"+this.idDisponible, salasOcupadas).then((result) => {
              alert("Se ha modificado la Sala Correctamente");
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
