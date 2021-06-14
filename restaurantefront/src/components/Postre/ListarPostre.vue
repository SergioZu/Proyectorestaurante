<template>
<div class="listarPostre">
<h2>Listado</h2>
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
</div>
 
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
    listarPostre: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/postre")
        .then(response => {
          this.postres = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      }
  },
   created(){
     this.listarPostre();
    }
    
}

</script>

<style scoped>

.listarPostre{
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