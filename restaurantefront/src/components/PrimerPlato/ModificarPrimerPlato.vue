<template>

  <div class="modificarPrimerPlato">
      <h2> Modificar Primer Plato:</h2>
    <form>
     
      <select name="select" v-model="idPrimerPlato">
        <option >...</option>
        <option v-for="primerplato in primerplatos" :key="primerplato" :value='primerplato.id'>{{primerplato.nombre}}</option>
      </select><br>
       <label >Nombre delPrimerPlato:</label><br>
      <input type="text" v-model="nombrePrimerPlato"><br>
      <label >Precio del PrimerPlato:</label><br>
      <input type="number" v-model="precioPrimerPlato"><br>
      <button type="button"  @click="modificarPrimerPlato()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            primerplatos: [],
            idPrimerPlato:"",
            nombrePrimerPlato:"",
            precioPrimerPlato:""
        }
    },
  
    methods:{
      obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/primerplato")
        .then(response => {
          this.primerplatos = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
      modificarPrimerPlato: function(){
        let primerplatos={
          id:this.idPrimerPlato,
          nombre:this.nombrePrimerPlato,
          precio:this.precioPrimerPlato,
        }
        axios.put("http://localhost:8080/restaurante/v1/primerplato/"+this.idPrimerPlato, primerplatos).then((result) => {
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

.modificarPrimerPlato{
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
