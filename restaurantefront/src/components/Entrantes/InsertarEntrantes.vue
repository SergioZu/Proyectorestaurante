<template>

  <div class="nuevaBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Entrante:</label><br>
      <input type="text"  v-model="nombreEntrante"><br>
      <label >Precio del Entrante:</label><br>
      <input type="number" v-model="precioEntrante"><br>
      <button type="button"  @click="crearBebida()">enviar</button>
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
      crearBebida: function(){
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

.nuevaBebidas{
  width: 100%;
  position: absolute;
  top:500px;
}

</style>
