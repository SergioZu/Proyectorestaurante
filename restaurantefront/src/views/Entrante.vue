<template>
 
  <div class="clasificacion">
     <h2> Entrantes:</h2>
    <ListarEntrantes/>
    <InsertarEntrantes/>
  </div>
</template>

<script>
import ListarEntrantes from '@/components/Entrantes/ListarEntrantes.vue'
import InsertarEntrantes from '@/components/Entrantes/InsertarEntrantes.vue'

export default {
   
    components: {
    ListarEntrantes,
    InsertarEntrantes
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