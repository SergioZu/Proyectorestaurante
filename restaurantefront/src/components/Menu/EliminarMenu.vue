<template>

  <div class="eliminarEntrantes">
      <h2>Eliminar</h2>
    <form>
      <label >Menu:</label><br>
        <select name="select" v-model="idMenu" >
        <option >...</option>
        <option v-for="menu in menuA" :key="menu" :value='menu.id'>{{menu.id}}</option>
      </select><br>
      <button type="button"  @click="eliminarMenu()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
            menuA:[],
            idMenu:""
        }
    },
  
    methods:{
    obtenerMenus: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/menu")
            .then(response => {
              this.menuA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
      eliminarMenu: function(){
        axios.delete("http://localhost:8080/restaurante/v1/menu/"+this.idMenu).then((result) => {
            alert("Se ha eliminado el menu Correctamente");
            });
        }
    },
     created(){
     this.obtenerMenus();
    }
  
}
</script>

<style>

.eliminarEntrantes{
   width: 40%;
    position: absolute;
    left: 1100px;
 font-size:10px;
}

input[type=text] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
