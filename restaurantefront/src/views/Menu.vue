<template>
 
  <div class="clasificacion">
     <h2> Menu:</h2>
    <ListarMenu/>
    <InsertarMenu/>
    <ModificarMenu/>
    <EliminarMenu/>
  </div>
</template>

<script>
import ListarMenu from '@/components/Menu/ListarMenu.vue'
import InsertarMenu from '@/components/Menu/InsertarMenu.vue'
import ModificarMenu from '@/components/Menu/ModificarMenu.vue'
import EliminarMenu from '@/components/Menu/EliminarMenu.vue'

export default {
   
    components: {
    ListarMenu,
    InsertarMenu,
    ModificarMenu,
    EliminarMenu
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