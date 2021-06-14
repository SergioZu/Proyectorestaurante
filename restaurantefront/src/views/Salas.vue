<template>
 
  <div class="clasificacion">
    <ListarSalasDisponibles/>
    <ListarSalasOcupadas/>
    <InsertarSalasOcupadas/>
    <EliminarSalasOcupadas/>
  </div>
</template>

<script>
import ListarSalasDisponibles from '@/components/Salas/ListarSalasDisponibles.vue'
import ListarSalasOcupadas from '@/components/Salas/ListarSalasOcupadas.vue'
import InsertarSalasOcupadas from '@/components/Salas/InsertarSalasOcupadas.vue'
import EliminarSalasOcupadas from '@/components/Salas/EliminarSalasOcupadas.vue'

export default {
   
    components: {
    ListarSalasDisponibles,
    ListarSalasOcupadas,
    InsertarSalasOcupadas,
    EliminarSalasOcupadas
  }
}
</script>


<style scoped>

.clasificacion{
   width: 30%;
  margin-left: 10%;
  position: absolute;
  padding-bottom:20%;
 
}


</style>