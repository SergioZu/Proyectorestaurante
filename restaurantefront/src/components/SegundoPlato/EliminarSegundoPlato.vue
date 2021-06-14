<template>

  <div class="eliminarSegundoPlato">
      <h2>Eliminar</h2>
    <form>
      <label >Segundo Plato:</label><br>
        <select name="select" v-model="idSegundoPlato" >
        <option >...</option>
        <option v-for="segundoplato in segundoplatos" :key="segundoplato" >{{segundoplato.id}}</option>
      </select><br>
      <button type="button"  @click="eliminarSegundoPlato()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            segundoplatos:[],
            idSegundoPlato:""
        }
    },
  
    methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/segundoplato")
        .then(response => {
          this.segundoplatos = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      eliminarSegundoPlato: function(){
        axios.delete("http://localhost:8080/restaurante/v1/segundoplato/"+this.idSegundoPlato).then((result) => {
            alert("Se ha eliminado la Bebida Correctamente");
            });
        }
    },
     created(){
     this.obtenerBebidas();
    }
  
}
</script>

<style>

.eliminarSegundoPlato{
   width: 40%;
    position: absolute;
    left: 1300px;
}

input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
