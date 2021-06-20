<template>

  <div class="nuevaPrimerPlato">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Primer Plato:</label><br>
      <input type="text"  v-model="nombrePrimerPlato"><br>
      <label >Precio del Primer Plato:</label><br>
      <input type="number" v-model="precioPrimerPlato"><br>
      <button type="button"  @click="nuevaPrimerPlato()">enviar</button>
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
      nuevaPrimerPlato: function(){
        let primerplatos={
          nombre:this.nombrePrimerPlato,
          precio:this.precioPrimerPlato,
        }
        axios.post("http://localhost:8080/restaurante/v1/primerplato", primerplatos).then((result) => {
            alert("Se ha insertado el Primer Plato Correctamente");
            });
        }
    }
  
}
</script>

<style>

.nuevaPrimerPlato{
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
