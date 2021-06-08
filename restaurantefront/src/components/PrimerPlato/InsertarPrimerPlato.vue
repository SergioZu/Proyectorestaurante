<template>

  <div class="nuevaBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Primer Plato:</label><br>
      <input type="text"  v-model="nombrePrimerPlato"><br>
      <label >Precio del Primer Plato:</label><br>
      <input type="number" v-model="precioPrimerPlato"><br>
      <button type="button"  @click="crearBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            nombrePrimerPlato:"",
            precioPrimerPlato:""
        }
    },
  
    methods:{
      crearBebida: function(){
        let primerplatos={
          nombre:this.nombrePrimerPlato,
          precio:this.precioPrimerPlato,
        }
        axios.post("http://localhost:8080/restaurante/v1/primerplato", primerplatos).then((result) => {
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
