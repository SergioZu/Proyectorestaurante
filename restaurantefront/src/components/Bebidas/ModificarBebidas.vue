<template>

  <div class="modificarBebidas">
      <h2> Modificar </h2>
    <form>
       <label >Id de  bebidas:</label><br>
      <select name="select" v-model="idBebida">
        <option >...</option>
        <option v-for="bebida in bebidas" :key="bebida" :value='bebida.id'>{{bebida.nombre}}</option>
      </select><br>
       <label >Nombre de la bebidas:</label><br>
      <input type="text" v-model="nombreBebida"><br>
      <label >Precio de la bebidas:</label><br>
      <input type="number" v-model="precioBebidas"><br><br>
      <button type="button"  @click="modificarBebida()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            bebidas: [],
            idBebida:"",
            nombreBebida:"",
            precioBebidas:""
        }
    },
  
    methods:{
      obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/bebidas")
        .then(response => {
          this.bebidas = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      modificarBebida: function(){
        let bebidas={
          id:this.idBebida,
          nombre:this.nombreBebida,
          precio:this.precioBebidas,
        }
        axios.put("http://localhost:8080/restaurante/v1/bebidas/"+this.idBebida, bebidas).then((result) => {
            alert("Se ha modificado la Bebida Correctamente");
            });
        }
    },
     created(){
     this.obtenerBebidas();
    }
  
}
</script>

<style>

.modificarBebidas{
 width: 45%;
  position: absolute;
  left: 500px;
}

input[type=text] {
  width: 75%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
