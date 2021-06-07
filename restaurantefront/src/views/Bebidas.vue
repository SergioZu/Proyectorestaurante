<template>
  <h2> Bebidas:</h2>
  <div class="clasificacion">
  <ListarBebidas/>
  <InsertarBebidas/>
  </div>
</template>

<script>
import ListarBebidas from '@/components/Bebidas/ListarBebidas.vue'
import InsertarBebidas from '@/components/Bebidas/InsertarBebidas.vue'

export default {
   
    components: {
    ListarBebidas,
    InsertarBebidas
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