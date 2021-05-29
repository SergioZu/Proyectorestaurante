<template>
  <h2> Bebidas:</h2>
  <div class="clasificacion">
    <table style="width:100%">
      <tr>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
       <tr v-for="bebida in bebidas" :key="bebida">
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

.clasificacion{
  width: 30%;
  margin-left: 20%;
  position: absolute;
 
}
.datosJugador{
  width: 30%;
  margin-left: 60%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}

</style>