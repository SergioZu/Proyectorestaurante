<template>

  <div class="nuevoMenu">
      <h2>Insertar</h2>
    <form>
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
      </select><br><br>
      <button type="button"  @click="nuevaEntrante()">enviar</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
        return {
          bebidasA:[],
          entrantesA:[],
          postresA:[],
          primerplatosA:[],
          segundoplatosA:[],
          entrante:null,
          platoprincipal:null,
          platosecundario:null,
          postre:null,
          bebida:null,
          precioTotal:0
        }
    },
  
    methods:{
      nuevaEntrante: function(){
        let menu={
          id_entrantes:this.entrante.id,
          id_platosprincipal:this.platoprincipal.id,
          id_platosecundario:this.platosecundario.id,
          id_postre:this.postre.id,
          id_bebidas:this.bebida.id,
          precio:this.entrante.precio+this.entrante.precio+this.platoprincipal.precio+this.postre.precio+this.bebida.precio,
          
        }
        console.log(menu);
        axios.post("http://localhost:8080/restaurante/v1/menu", menu).then((result) => {
            alert("Se ha insertado la Bebida Correctamente");
            });
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
        }
    },
   created(){
     this.obtenerBebidas();
     this.obtenerEntrantes();
     this.obtenerPostre();
     this.obtenerPrimerPlato();
     this.obtenerSegundoPlato();
    }
   
  
}
</script>

<style>
.nuevoMenu{
 width: 45%;
  position: absolute;
  left:800px;
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
