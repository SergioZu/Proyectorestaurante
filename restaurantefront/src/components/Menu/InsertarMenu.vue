<template>

  <div class="nuevaEntrantes">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Entrante:</label><br>
      <input type="text"  v-model="nombreEntrante"><br>
      <label >Precio del Entrante:</label><br>
      <input type="number" v-model="precioEntrante"><br>
      <button type="button"  @click="nuevaEntrante()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            nombreEntrante:"",
            precioEntrante:""
        }
    },
  
    methods:{
      nuevaEntrante: function(){
        let entrantes={
          nombre:this.nombreEntrante,
          precio:this.precioEntrante,
        }
        axios.post("http://localhost:8080/restaurante/v1/entrante", entrantes).then((result) => {
            alert("Se ha insertado la Bebida Correctamente");
            });
        }
    }
  
}
</script>

<style>
.nuevaEntrantes{
 width: 45%;
  position: absolute;
  left:800px;
}

input[type=text] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
