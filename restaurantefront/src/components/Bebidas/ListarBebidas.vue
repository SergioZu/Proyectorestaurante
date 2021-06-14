<template>
<div class="listarBebidas">
  <h2>Listado</h2>
  <table style="width:100%">
      <tr>
        <th>id</th>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
       <tr v-for="bebida in bebidas" :key="bebida">
          <td>{{ bebida.id }}</td>
          <td>{{ bebida.nombre }}</td>
           <td>{{ bebida.precio }}</td>
        </tr>
    </table>
  </div>
 
</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            bebidas: []
        }
    },
  methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/bebidas")
        .then(response => {
          this.bebidas = response.data;
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

.listarBebidas{
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