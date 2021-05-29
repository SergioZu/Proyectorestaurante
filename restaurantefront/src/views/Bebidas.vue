<template>
  <h2> La Clasificacion de la liga:</h2>
  <div class="clasificacion">
    <table style="width:100%">
      <tr>
        <th>Nombre</th>
        <th>Precios</th> 
      </tr>
    </table>
  </div>
</template>

<script>

</script>
import axios from "axios";

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