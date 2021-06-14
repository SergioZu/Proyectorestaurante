<template>

  <div class="nuevaPostre">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Entrante:</label><br>
      <input type="text"  v-model="nombrePostre"><br>
      <label >Precio del Entrante:</label><br>
      <input type="number" v-model="precioPostre"><br>
      <button type="button"  @click="nuevaPostre()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            nombrePostre:"",
            precioPostre:""
        }
    },
  
    methods:{
      nuevaPostre: function(){
        let postres={
          nombre:this.nombrePostre,
          precio:this.precioPostre,
        }
        axios.post("http://localhost:8080/restaurante/v1/postre", postres).then((result) => {
            alert("Se ha insertado la Bebida Correctamente");
            });
        }
    }
  
}
</script>

<style>

.nuevaPostre{
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
