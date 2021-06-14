<template>

  <div class="eliminarEntrantes">
      <h2>Eliminar</h2>
    <form>
      <label >Entrante:</label><br>
        <select name="select" v-model="idEntrante" >
        <option >...</option>
        <option v-for="entrante in entrantes" :key="entrante" >{{entrante.id}}</option>
      </select><br>
      <button type="button"  @click="eliminarEntrantes()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            entrantes:[],
            idEntrante:""
        }
    },
  
    methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/entrante")
        .then(response => {
          this.entrantes = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarEntrantes: function(){
        axios.delete("http://localhost:8080/restaurante/v1/entrante/"+this.idEntrante).then((result) => {
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

.eliminarEntrantes{
   width: 40%;
    position: absolute;
    left: 1300px;
}

input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
