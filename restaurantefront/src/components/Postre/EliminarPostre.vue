<template>

  <div class="eliminarPostre">
      <h2>Eliminar</h2>
    <form>
      <label >Postres:</label><br>
        <select name="select" v-model="idPostres" >
        <option >...</option>
        <option v-for="postre in postres" :key="postre" :value='postre.id'>{{postre.nombre}}</option>
      </select><br>
      <button type="button"  @click="eliminarPostre()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            postres:[],
            idPostres:""
        }
    },
  
    methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/postre")
        .then(response => {
          this.postres = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarPostre: function(){
        axios.delete("http://localhost:8080/restaurante/v1/postre/"+this.idPostres).then((result) => {
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

.eliminarPostre{
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
