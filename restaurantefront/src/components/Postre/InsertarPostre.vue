<template>

  <div class="nuevaBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Entrante:</label><br>
      <input type="text"  v-model="nombrePostre"><br>
      <label >Precio del Entrante:</label><br>
      <input type="number" v-model="precioPostre"><br>
      <button type="button"  @click="crearBebida()">enviar</button>
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
      crearBebida: function(){
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

.nuevaBebidas{
  width: 100%;
  position: absolute;
  top:500px;
}

</style>
