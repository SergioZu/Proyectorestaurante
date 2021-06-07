<template>

  <div class="eliminarBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Bebida:</label><br>
        <select name="select" v-model="idBebida" >
        <option >...</option>
        <option v-for="bebida in bebidas" :key="bebida" >{{bebida.id}}</option>
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
          alert(this.idBebida);
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
  width: 100%;
  position: absolute;
  top:500px;
  left: 400px;
}

</style>
