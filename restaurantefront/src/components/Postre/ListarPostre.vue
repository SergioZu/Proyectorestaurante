<template>
 <table style="width:100%">
      <tr>
        <th>id</th>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
       <tr v-for="postre in postres" :key="postre">
          <td>{{ postre.id }}</td>
          <td>{{ postre.nombre }}</td>
           <td>{{ postre.precio }}</td>
        </tr>
    </table>
</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            postres: []
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