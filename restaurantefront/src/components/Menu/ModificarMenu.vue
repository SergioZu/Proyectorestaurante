<template>

  <div class="modificarMenu">
      <h2>Modificar</h2>
    <form>
    <label >Id:</label><br>
       <select name="select" v-model="id">
        <option >...</option>
        <option v-for="menu in menuA" :key="menu" :value='menu.id'>{{menu.id}}</option>
      </select><br>

      <label >Entrante:</label><br>
       <select name="select" v-model="entrante">
        <option >...</option>
        <option v-for="ent in entrantesA" :key="ent" :value='ent'>{{ent.nombre}}</option>
      </select><br>

       <label >Primer Plato:</label><br>
       <select name="select" v-model="platoprincipal" >
        <option >...</option>
        <option v-for="primerplato in primerplatosA" :key="primerplato" :value='primerplato'>{{primerplato.nombre}}</option>
      </select><br>

       <label >Segundo Plato:</label><br>
       <select name="select" v-model="platosecundario" >
        <option >...</option>
        <option v-for="segundoplato in segundoplatosA" :key="segundoplato" :value='segundoplato'>{{segundoplato.nombre}}</option>
      </select><br>

       <label >Postre:</label><br>
       <select name="select" v-model="postre" >
        <option >...</option>
        <option v-for="postr in postresA" :key="postr" :value='postr'>{{postr.nombre}}</option>
      </select><br>

       <label >Bebida:</label><br>
       <select name="select" v-model="bebida" >
        <option >...</option>
        <option v-for="bebida in bebidasA" :key="bebida" :value='bebida'>{{bebida.nombre}}</option>
      </select><br>

      <label >Sala:</label><br>
       <select name="select" v-model="salas" >
        <option >...</option>
        <option v-for="salas in salasA" :key="salas" :value='salas'>{{salas.nombre}}</option>
      </select><br><br>
      <button type="button"  @click="modificarMenu()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
          menuA:[],
          bebidasA:[],
          entrantesA:[],
          postresA:[],
          primerplatosA:[],
          segundoplatosA:[],
          salasA:[],
          id:null,
          entrante:null,
          platoprincipal:null,
          platosecundario:null,
          postre:null,
          bebida:null,
          salas:null,
          precioTotal:0
        }
    },
  
    methods:{
      modificarMenu: function(){
        let menu={
          id:this.id,
          id_entrantes:this.entrante.id,
          id_platosprincipal:this.platoprincipal.id,
          id_platosecundario:this.platosecundario.id,
          id_postre:this.postre.id,
          id_bebidas:this.bebida.id,
          id_salas:this.salas.id,
          precio:this.entrante.precio+this.entrante.precio+this.platoprincipal.precio+this.postre.precio+this.bebida.precio,
          
        }
        axios.put("http://localhost:8080/restaurante/v1/menu/"+this.id, menu).then((result) => {
            alert("Se ha modificado el menu Correctamente");
            });
        },obtenerMenus: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/menu")
            .then(response => {
              this.menuA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
         obtenerBebidas: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/bebidas")
            .then(response => {
              this.bebidasA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
          obtenerEntrantes: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/entrante")
            .then(response => {
              this.entrantesA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
            obtenerPostre: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/postre")
            .then(response => {
              this.postresA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
          obtenerPrimerPlato: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/primerplato")
            .then(response => {
              this.primerplatosA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          },
       obtenerSegundoPlato: function(){
        axios
            .get("http://localhost:8080/restaurante/v1/segundoplato")
            .then(response => {
            this.segundoplatosA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
        },listarSalasDisponibles: function(){
          axios
            .get("http://localhost:8080/restaurante/v1/salas")
            .then(response => {
              this.salasA = response.data;
            })
            .catch(response=>alert("Error al recuperar datos "+response.status));
          }
    },
   created(){
     this.obtenerMenus();
     this.obtenerBebidas();
     this.obtenerEntrantes();
     this.obtenerPostre();
     this.obtenerPrimerPlato();
     this.obtenerSegundoPlato();
     this.listarSalasDisponibles();
    }
   
  
}
</script>

<style>
.modificarMenu{
 width: 45%;
  position: absolute;
  left:500px;
  font-size:10px;
  top: 60px;
}

input[type=text] {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
