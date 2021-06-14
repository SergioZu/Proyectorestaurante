<template>

  <div class="modificarPostre">
      <h2> Modificar Postre:</h2>
    <form>
     
      <select name="select" v-model="idPostre">
        <option >...</option>
        <option v-for="postre in postres" :key="postre" :value='postre.id'>{{postre.nombre}}</option>
      </select><br>
       <label >Nombre del Postre:</label><br>
      <input type="text" v-model="nombrePostre"><br>
      <label >Precio del Postre:</label><br>
      <input type="number" v-model="precioPostre"><br>
      <button type="button"  @click="modificarPostre()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            postres: [],
            idPostre:"",
            nombrePostre:"",
            precioPostre:""
        }
    },
  
    methods:{
      obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/postre")
        .then(response => {
          this.postres = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      modificarPostre: function(){
        let postres={
          id:this.idPostre,
          nombre:this.nombrePostre,
          precio:this.precioPostre,
        }
        axios.put("http://localhost:8080/restaurante/v1/postre/"+this.idPostre, postres).then((result) => {
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

.modificarPostre{
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
