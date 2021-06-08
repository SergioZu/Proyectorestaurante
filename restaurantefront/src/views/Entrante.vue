<template>
 
  <div class="clasificacion">
     <h2> Entrantes:</h2>
    <ListarEntrantes/>
  </div>
</template>

<script>
import ListarEntrantes from '@/components/Entrantes/ListarEntrantes.vue'

export default {
   
    components: {
    ListarEntrantes
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