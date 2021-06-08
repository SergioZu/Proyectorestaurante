<template>
 
  <div class="clasificacion">
     <h2> Entrantes:</h2>
    <ListarPostre/>
    <InsertarPostre/>
    <ModificarPostre/>
    <EliminarPostre/>
  </div>
</template>

<script>
import ListarPostre from '@/components/Postre/ListarPostre.vue'
import InsertarPostre from '@/components/Postre/InsertarPostre.vue'
import ModificarPostre from '@/components/Postre/ModificarPostre.vue'
import EliminarPostre from '@/components/Postre/EliminarPostre.vue'

export default {
   
    components: {
    ListarPostre,
    InsertarPostre,
    ModificarPostre,
    EliminarPostre
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