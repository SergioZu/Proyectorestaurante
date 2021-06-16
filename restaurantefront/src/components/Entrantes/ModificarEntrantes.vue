<template>

  <div class="modificarEntrantes">
      <h2> Modificar Entrante:</h2>
    <form>
     
      <select name="select" v-model="idEntrante">
        <option >...</option>
        <option v-for="entrante in entrantes" :key="entrante" :value='entrante.id'>{{entrante.nombre}}</option>
      </select><br>
       <label >Nombre del Entrante:</label><br>
      <input type="text" v-model="nombreEntrante"><br>
      <label >Precio del Entrante:</label><br>
      <input type="number" v-model="precioEntrante"><br>
      <button type="button"  @click="modificarEntrante()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            entrantes: [],
            idEntrante:"",
            nombreEntrante:"",
            precioEntrante:""
        }
    },
  
    methods:{
      obtenerEntrantes: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/entrante")
        .then(response => {
          this.entrantes = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      modificarEntrante: function(){
        let entrantes={
          id:this.idEntrante,
          nombre:this.nombreEntrante,
          precio:this.precioEntrante,
        }
        axios.put("http://localhost:8080/restaurante/v1/entrante/"+this.idEntrante, entrantes).then((result) => {
            alert("Se ha modificado la Bebida Correctamente");
            });
        }
    },
     created(){
     this.obtenerEntrantes();
    }
  
}
</script>

<style>

.modificarEntrantes{
 width: 45%;
  position: absolute;
  left: 500px;
 font-size:10px;
}

input[type=text] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
