<template>

  <div class="modificarSegundoPlato">
      <h2> Modificar Segundo Plato:</h2>
    <form>
     
      <select name="select" v-model="idSegundoPlato">
        <option >...</option>
        <option v-for="segundoplato in segundoplatos" :key="segundoplato" :value='segundoplato.id'>{{segundoplato.nombre}}</option>
      </select><br>
       <label >Nombre del  Segundo Plato:</label><br>
      <input type="text" v-model="nombreSegundoPlato"><br>
      <label >Precio del Segundo Plato:</label><br>
      <input type="number" v-model="precioSegundoPlato"><br>
      <button type="button"  @click="modificarSegundoPlato()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            segundoplatos: [],
            idSegundoPlato:"",
            nombreSegundoPlato:"",
            precioSegundoPlato:""
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
      modificarSegundoPlato: function(){
        let segundoplatos={
          id:this.idSegundoPlato,
          nombre:this.nombreSegundoPlato,
          precio:this.precioSegundoPlato,
        }
        console.log(segundoplatos);
        axios.put("http://localhost:8080/restaurante/v1/segundoplato/"+this.idSegundoPlato, segundoplatos).then((result) => {
            alert("Se ha modificado el Segundo Plato Correctamente");
            });
        }
    },
     created(){
     this.obtenerBebidas();
    }
  
}
</script>

<style>

.modificarSegundoPlato{
 width: 45%;
  position: absolute;
  left: 500px;
  
 font-size:10px;
}

input[type=text] {
  width: 75%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}
</style>
