<template>
<div class="listarPrimerPlato">
<h2>Listado</h2>
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
</div>
 
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
    listarPrimerPlato: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/primerplato")
        .then(response => {
          this.primerplatos = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      }
  },
   created(){
     this.listarPrimerPlato();
    }
    
}

</script>

<style scoped>

.listarPrimerPlato{
   width: 75%;
  position: absolute;
}


table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

tr:hover {background-color:#f5f5f5;}

</style>