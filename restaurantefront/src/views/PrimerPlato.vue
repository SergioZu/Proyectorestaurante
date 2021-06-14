<template>
 
  <div class="clasificacion">
     <h2> Primer Plato:</h2>
    <ListarPrimerPlato/>
    <InsertarPrimerPlato/>
    <ModificarPrimerPlato/>
    <EliminarPrimerPlato/>
  </div>
</template>

<script>
import ListarPrimerPlato from '@/components/PrimerPlato/ListarPrimerPlato.vue'
import InsertarPrimerPlato from '@/components/PrimerPlato/InsertarPrimerPlato.vue'
import ModificarPrimerPlato from '@/components/PrimerPlato/ModificarPrimerPlato.vue'
import EliminarPrimerPlato from '@/components/PrimerPlato/EliminarPrimerPlato.vue'

export default {
   
    components: {
    ListarPrimerPlato,
    InsertarPrimerPlato,
    ModificarPrimerPlato,
    EliminarPrimerPlato
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