<template>
<div class="listarSalasDisponibles">
<h2>Salas Disponibles</h2>
<table style="width:100%">
      <tr>
        <th>id</th>
        <th>Nombre</th>
        <th>Disponible</th>
      </tr>
       <tr v-for="sala in salas" :key="sala" >
          <td v-if="sala.disponible==true">{{ sala.id }}</td>
          <td v-if="sala.disponible==true">{{ sala.nombre }}</td>
          <td v-if="sala.disponible==true">Si</td>
        </tr>
    </table>
</div>
 
</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            salas: []
        }
    },
  methods:{
    listarSalasDisponibles: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/salas")
        .then(response => {
          this.salas = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      }
  },
   created(){
     this.listarSalasDisponibles();
    }
    
}

</script>

<style scoped>

.listarSalasDisponibles{
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