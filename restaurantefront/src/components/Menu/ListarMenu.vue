<template>
<div class="listarEntrantes">
<h2>Listado</h2>
 <table style="width:100%">
      <tr>
        <th>id</th>
        <th>Entrante</th>
        <th>Plato Principal</th>
        <th>Segundo Plato</th>
        <th>Postre</th>
        <th>Bebida</th>
        <th>Salas</th>
        <th>Precio</th>
      </tr>
       <tr v-for="menu in menus" :key="menu">
          <td>{{ menu.id }}</td>
          <td>{{ menu.id_entrantes }}</td>
           <td>{{ menu.id_platosprincipal }}</td>
           <td>{{ menu.id_platosecundario }}</td>
           <td>{{ menu.id_postre }}</td>
           <td>{{ menu.id_bebidas }}</td>
           <td>{{ menu.id_salas }}</td>
           <td>{{ menu.precio }}€</td>
        </tr>
    </table>
</div>

</template>

<script>

import axios from "axios";

export default {
  data() {
        return {
            menus: []
        }
    },
  methods:{
    listarEntrantes: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/menu")
        .then(response => {
          this.menus = response.data;
          console.log(this.menus);
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