<template>
 
  <div class="clasificacion">
     <h2> Bebidas:</h2>
    <ListarBebidas/>
    <InsertarBebidas/>
    <ModificarBebidas/>
    <EliminarBebidas/>
  </div>
</template>

<script>
import ListarBebidas from '@/components/Bebidas/ListarBebidas.vue'
import InsertarBebidas from '@/components/Bebidas/InsertarBebidas.vue'
import ModificarBebidas from '@/components/Bebidas/ModificarBebidas.vue'
import EliminarBebidas from '@/components/Bebidas/EliminarBebidas.vue'

export default {
   
    components: {
    ListarBebidas,
    InsertarBebidas,
    ModificarBebidas,
    EliminarBebidas
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