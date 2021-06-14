<template>

  <div class="nuevaBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Nombre de la Bebida:</label><br>
      <input type="text"  v-model="nombreBebida"><br>
      <label >Precio de la bebidas:</label><br>
      <input type="number" v-model="precioBebidas"><br><br>
      <button type="button"  @click="nuevaBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            nombreBebida:"",
            precioBebidas:""
        }
    },
  
    methods:{
      nuevaBebida: function(){
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
 width: 45%;
  position: absolute;
  left:900px;
}

input[type=text] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
