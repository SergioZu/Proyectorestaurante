<template>
 
  <div class="clasificacion">
     <h2> Entrantes:</h2>
    <ListarEntrantes/>
    <InsertarEntrantes/>
    <ModificarEntrantes/>
    <EliminarEntrantes/>
  </div>
</template>

<script>
import ListarEntrantes from '@/components/Entrantes/ListarEntrantes.vue'
import InsertarEntrantes from '@/components/Entrantes/InsertarEntrantes.vue'
import ModificarEntrantes from '@/components/Entrantes/ModificarEntrantes.vue'
import EliminarEntrantes from '@/components/Entrantes/EliminarEntrantes.vue'

export default {
   
    components: {
    ListarEntrantes,
    InsertarEntrantes,
    ModificarEntrantes,
    EliminarEntrantes
  }
}
</script>


<style scoped>

.clasificacion{
  width: 30%;
  margin-left: 20%;
  position: absolute;
 
}


</style>