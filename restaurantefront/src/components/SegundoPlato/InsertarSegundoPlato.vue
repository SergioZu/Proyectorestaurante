<template>

  <div class="nuevaSegundoPlato">
      <h2>Insertar</h2>
    <form>
      <label >Nombre del Segundo Plato:</label><br>
      <input type="text"  v-model="nombreSegundoPlato"><br>
      <label >Precio del Segundo Plato:</label><br>
      <input type="number" v-model="precioSegundoPlato"><br>
      <button type="button"  @click="nuevaSegundoPlato()">enviar</button>
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
      nuevaSegundoPlato: function(){
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

.nuevaSegundoPlato{
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
