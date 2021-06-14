<template>
 
  <div class="clasificacion">
     <h2> Segundo Plato:</h2>
    <ListarSegundoPlato/>
    <InsertarSegundoPlato/>
    <ModificarSegundoPlato/>
    <EliminarSegundoPlato/>
  </div>
</template>

<script>
import ListarSegundoPlato from '@/components/SegundoPlato/ListarSegundoPlato.vue'
import InsertarSegundoPlato from '@/components/SegundoPlato/InsertarSegundoPlato.vue'
import ModificarSegundoPlato from '@/components/SegundoPlato/ModificarSegundoPlato.vue'
import EliminarSegundoPlato from '@/components/SegundoPlato/EliminarSegundoPlato.vue'

export default {
   
    components: {
    ListarSegundoPlato,
    InsertarSegundoPlato,
    ModificarSegundoPlato,
    EliminarSegundoPlato
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