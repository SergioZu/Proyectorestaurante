<template>
<h2> Nueva Bebida:</h2>
  <div class="nuevaBebidas">
    <form>
      <label >Nombre de la Bebida:</label><br>
      <input type="text"  v-model="nombreBebida"><br>
      <label >Precio de la bebidas:</label><br>
      <input type="number" v-model="precioBebidas"><br>
      <button type="button"  @click="crearBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            equipos: [],
            nombreBebida:"",
            precioBebidas:""
        }
    },
  
    methods:{
      crearBebida: function(){
        let bebidas={
          nombre:this.nombreBebida,
          precio:this.precioBebidas,
        }
        axios.post("http://localhost:8080/restaurante/v1/bebidas", bebidas).then((result) => {
            alert("Se ha insertado la Bebida Correctamente");
            });
        }
    }
  
}
</script>

<style>

.nuevaBebidas{
  width: 100%;
}

</style>
