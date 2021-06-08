<template>

  <div class="nuevaBebidas">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Segundo Plato:</label><br>
      <input type="text"  v-model="nombreSegundoPlato"><br>
      <label >Precio del Segundo Plato:</label><br>
      <input type="number" v-model="precioSegundoPlato"><br>
      <button type="button"  @click="crearBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            nombreSegundoPlato:"",
            precioSegundoPlato:""
        }
    },
  
    methods:{
      crearBebida: function(){
        let segundoplatos={
          nombre:this.nombreSegundoPlato,
          precio:this.precioSegundoPlato,
        }
        axios.post("http://localhost:8080/restaurante/v1/segundoplato", segundoplatos).then((result) => {
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
