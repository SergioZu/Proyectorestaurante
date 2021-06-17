<template>
<div class="listarEntrantes">
<h2>Listado</h2>
 <table style="width:100%">
      <tr>
        <th>id</th>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
       <tr v-for="entrante in entrantes" :key="entrante">
          <td>{{ entrante.id }}</td>
          <td>{{ entrante.nombre }}</td>
           <td>{{ entrante.precio }}</td>
        </tr>
    </table>
</div>

</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            entrantes: []
        }
    },
  methods:{
    listarEntrantes: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/entrante")
        .then(response => {
          this.entrantes = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      }
  },
   created(){
     this.listarEntrantes();
    }
    
}

</script>

<style scoped>

.listarEntrantes{
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