<template>

  <div class="eliminarBebidas">
      <h2>Eliminar</h2>
    <form>
      <label >Primer Plato:</label><br>
        <select name="select" v-model="idPrimerPlato" >
        <option >...</option>
        <option v-for="primerplato in primerplatos" :key="primerplato" >{{primerplato.id}}</option>
      </select><br>
      <button type="button"  @click="eliminarBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            primerplatos:[],
            idPrimerPlato:""
        }
    },
  
    methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/primerplato")
        .then(response => {
          this.primerplatos = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarBebida: function(){
        axios.delete("http://localhost:8080/restaurante/v1/primerplato/"+this.idPrimerPlato).then((result) => {
            alert("Se ha eliminado la Bebida Correctamente");
            });
        }
    },
     created(){
     this.obtenerBebidas();
    }
  
}
</script>

<style>

.eliminarBebidas{
  width: 100%;
  position: absolute;
  top:500px;
  left: 400px;
}

</style>
