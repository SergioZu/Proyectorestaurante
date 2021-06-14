<template>

  <div class="eliminarBebidas">
      <h2>Eliminar</h2>
    <form>
      <label >Bebida:</label><br>
        <select name="select" v-model="idBebida" >
        <option >...</option>
        <option v-for="bebida in bebidas" :key="bebida" :value='bebida.id'>{{bebida.nombre}}</option>
      </select><br><br>
      <button type="button"  @click="eliminarBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            bebidas:[],
            idBebida:""
        }
    },
  
    methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/bebidas")
        .then(response => {
          this.bebidas = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarBebida: function(){
        axios.delete("http://localhost:8080/restaurante/v1/bebidas/"+this.idBebida).then((result) => {
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
