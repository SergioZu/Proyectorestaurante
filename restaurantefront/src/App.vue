<template>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
    <!-- Navigation
    ==========================================-->
    <nav id="menu" class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                <a class="navbar-brand page-scroll" href="#page-top">CometeloTó</a> </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#about" class="page-scroll">Nosotros</a></li>
                    <li><a href="#restaurant-menu" class="page-scroll">Menu</a></li>
                    <li><a href="#portfolio" class="page-scroll">Platos</a></li>
                    <li><a href="#call-reservation" class="page-scroll">Contactos</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
    </nav>
    <!-- Header -->
    <header id="header">
        <div class="intro">
            <div class="overlay">
                <div class="container">
                    <div class="row">
                        <div class="intro-text">
                            <h1>CometeloTó</h1>
                            <p>Restaurante</p>
                            <a href="#about" class="btn btn-custom btn-lg page-scroll">Descubrenos</a> </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- About Section -->
    <div id="about">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-md-6 ">
                    <div class="about-img"><img src="img/about.jpg" class="img-responsive" alt=""></div>
                </div>
                <div class="col-xs-12 col-md-6">
                    <div class="about-text">
                        <h2>Nuestro Restaurante</h2>
                        <hr>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam. Sed commodo nibh ante facilisis bibendum dolor feugiat at. Duis sed dapibus leo nec ornare diam commodo nibh.</p>
                        <h3>Awarded Chefs</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam. Sed commodo nibh ante facilisis bibendum dolor feugiat at. Duis sed dapibus leo nec ornare.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Restaurant Menu Section -->
    <div id="restaurant-menu">
        <div class="section-title text-center center">
            <div class="overlay">
                <h2>Menu</h2>
                <hr>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed.</p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="menu-section">
                        <h2 class="menu-section-title">Entrante</h2>
                        <hr>
                        <div class="menu-item" v-for="entrante in entrantes" :key="entrante">
                            <div class="menu-item-name"> {{ entrante.nombre }}</div>
                            <div class="menu-item-price">{{ entrante.precio }} </div>
                            <div class="menu-item-description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, duis sed dapibus leo nec ornare diam. </div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="menu-section">
                        <h2 class="menu-section-title">Primer Plato</h2>
                        <hr>
                        <div class="menu-item" v-for="primerplato in primerplatos" :key="primerplato">
                            <div class="menu-item-name"> {{ primerplato.nombre }} </div>
                            <div class="menu-item-price">{{ primerplato.precio }} </div>
                            <div class="menu-item-description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, duis sed dapibus leo nec ornare diam. </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="menu-section">
                        <h2 class="menu-section-title">Segundo Plato</h2>
                        <hr>
                        <div class="menu-item" v-for="segundoplato in segundoplatos" :key="segundoplato">
                            <div class="menu-item-name"> {{ segundoplato.nombre }} </div>
                            <div class="menu-item-price">{{ segundoplato.precio }} </div>
                            <div class="menu-item-description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, duis sed dapibus leo nec ornare diam. </div>
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="menu-section">
                        <h2 class="menu-section-title">Postre</h2>
                        <hr>
                        <div class="menu-item"  v-for="postre in postres" :key="postre">
                            <div class="menu-item-name"> {{ postre.nombre }} </div>
                            <div class="menu-item-price">{{ postre.precio }}</div>
                            <div class="menu-item-description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, duis sed dapibus leo nec ornare diam. </div>
                        </div>
                        
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="menu-section">
                        <h2 class="menu-section-title">Bebidas</h2>
                        <hr>
                        <div class="menu-item"  v-for="bebida in bebidas" :key="bebida">
                            <div class="menu-item-name"> {{ bebida.nombre }} </div>
                            <div class="menu-item-price">{{ bebida.precio }}</div>
                            <div class="menu-item-description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, duis sed dapibus leo nec ornare diam. </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Portfolio Section -->
    <div id="portfolio">
        <div class="section-title text-center center">
            <div class="overlay">
                <h2>Gallery</h2>
                <hr>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed.</p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="categories">
                    <ul class="cat">
                        <li>
                            <ol class="type">
                                <li><a href="#" data-filter="*" class="active">Todos</a></li>
                                 <li><a href="#" data-filter=".dinner">Entrante</a></li>
                                <li><a href="#" data-filter=".breakfast">Primer Plato</a></li>
                                <li><a href="#" data-filter=".lunch">Segundo Plato</a></li>
                                <li><a href="#" data-filter=".dinner">Postre</a></li>
                            </ol>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="row">
                <div class="portfolio-items">
                    <div class="col-sm-6 col-md-4 col-lg-4 breakfast">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/01-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/01-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 dinner">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/02-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/02-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 breakfast">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/03-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/03-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 breakfast">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/04-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/04-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 dinner">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/05-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/05-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 lunch">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/06-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/06-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 lunch">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/07-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/07-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 breakfast">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/08-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/08-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 dinner">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/09-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/09-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 lunch">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/10-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/10-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 lunch">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/11-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/11-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-4 breakfast">
                        <div class="portfolio-item">
                            <div class="hover-bg">
                                <a href="img/portfolio/12-large.jpg" title="Dish Name" data-lightbox-gallery="gallery1">
                                    <div class="hover-text">
                                        <h4>Dish Name</h4>
                                    </div>
                                    <img src="img/portfolio/12-small.jpg" class="img-responsive" alt="Project Title"> </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div id="call-reservation" class="text-center">
        <div class="container">
            <h2>Numero de contacto para reservar una mesa.  <strong>1-887-654-3210</strong></h2>
        </div>
    </div>
    <!-- Contact Section -->
    <div id="contact" class="text-center">
        <div class="container">
            <div class="section-title text-center">
                <h2>Contacta con nosotros</h2>
                <hr>
                <p>Danos tu feedback.</p>
            </div>
            <div class="col-md-10 col-md-offset-1">
                <form name="sentMessage" id="contactForm" novalidate>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" id="name" class="form-control" placeholder="Name" required="required">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="email" id="email" class="form-control" placeholder="Email" required="required">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <textarea name="message" id="message" class="form-control" rows="4" placeholder="Message" required></textarea>
                        <p class="help-block text-danger"></p>
                    </div>
                    <div id="success"></div>
                    <button type="submit" class="btn btn-custom btn-lg">Enviar</button>
                </form>
            </div>
        </div>
    </div>
    <div id="footer">
        <div class="container text-center">
            <div class="col-md-4">
                <h3>Localización</h3>
                <div class="contact-item">
                    <p>4321 California St,</p>
                    <p>San Francisco, CA 12345</p>
                </div>
            </div>
            <div class="col-md-4">
                <h3>Horario</h3>
                <div class="contact-item">
                    <p>Mon-Thurs: 10:00 AM - 11:00 PM</p>
                    <p>Fri-Sun: 11:00 AM - 02:00 AM</p>
                </div>
            </div>
            <div class="col-md-4">
                <h3>Datos de Contactos</h3>
                <div class="contact-item">
                    <p>Phone: +1 123 456 1234</p>
                    <p>Email: info@company.com</p>
                </div>
            </div>
        </div>
        <div class="container-fluid text-center copyrights">
            <div class="col-md-8 col-md-offset-2">
                <div class="social">
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    </ul>
                </div>
                <p>&copy; 2016 Touché. All rights reserved. Designed by <a href="http://www.templatewire.com" rel="nofollow">TemplateWire</a></p>
            </div>
        </div>
    </div>

    
</body>

<div class="container">
            <div class="row">
                <div class="categories">
                    <ul class="cat">
                        <li>
                            <ol class="type">
                                <li><router-link to="/">Inicio</router-link></li>
                                <li><router-link to="/bebidas">Bebida</router-link></li>
                                <li><router-link to="/entrantes">Entrantes</router-link></li>
                                <li><router-link to="/primerplato">Primer Plato</router-link></li>
                                <li><router-link to="/segundoplato">Segundo Plato</router-link></li>
                                <li><router-link to="/postre">Postre</router-link></li>
                                <li><router-link to="/salas">Salas</router-link></li>
                            </ol>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
            </div>
 </div>
  <router-view/>
</template>


<script>

import axios from "axios";

export default {
  data() {
        return {
            bebidas: [],
            entrantes:[],
            postres:[],
            primerplatos:[],
            segundoplatos:[]
        }
    },
  methods:{
    obtenerBebidas: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/bebidas")
        .then(response => {
          this.bebidas = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
       obtenerEntrantes: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/entrante")
        .then(response => {
          this.entrantes = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
        obtenerPostre: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/postre")
        .then(response => {
          this.postres = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
       obtenerPrimerPlato: function(){
      axios
        .get("http://localhost:8080/restaurante/v1/primerplato")
        .then(response => {
          this.primerplatos = response.data;
        })
        .catch(response=>alert("Error al recuperar datos "+response.status));
      },
       obtenerSegundoPlato: function(){
        axios
            .get("http://localhost:8080/restaurante/v1/segundoplato")
            .then(response => {
            this.segundoplatos = response.data;
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
</style>
