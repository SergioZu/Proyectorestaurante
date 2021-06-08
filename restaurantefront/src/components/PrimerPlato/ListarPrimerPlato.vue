<template>
 <table style="width:100%">
      <tr>
        <th>id</th>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
       <tr v-for="primerplato in primerplatos" :key="primerplato">
          <td>{{ primerplato.id }}</td>
          <td>{{ primerplato.nombre }}</td>
           <td>{{ primerplato.precio }}</td>
        </tr>
    </table>
</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            primerplatos: []
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
      }
  },
   created(){
     this.obtenerBebidas();
    }
    
}

</script>

<style scoped>

table{
   position: absolute;
}

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
 
}
th, td {
  padding: 15px;
}

</style>