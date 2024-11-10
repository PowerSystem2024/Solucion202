<script setup>

import proyecto1 from '/src/assets/restaurant.png';
import proyecto2 from '/src/assets/e-learning.png';
import proyecto3 from '/src/assets/blog.png';
import proyecto4 from '/src/assets/e-learning.png';

// Este componente muestra una galería de proyectos con información detallada sobre cada uno.
// Importamos 'ref' de Vue para crear referencias reactivas.
import { ref } from 'vue';

// 'misProyectos' es una referencia reactiva que contiene la lista de proyectos.
var misProyectos = ref([]);

// Asignamos un array de objetos a 'misProyectos.value', donde cada objeto representa un proyecto con sus detalles.
misProyectos.value = [
    {
        id: 1,
        src: proyecto1,
        titulo: "Aplicación de Reservas para Restaurantes (2023)",
        descripcion: "Creé una aplicación móvil con Flutter que permite a los usuarios reservar mesas en restaurantes locales.",
        proyectoLink: "https://www.google.com.ar",
        gitHubLink: "https://github.com/usuario/proyecto1"
    },
    {
        id: 2,
        src: proyecto2,
        titulo: "Plataforma de E-Learning (2023)",
        descripcion: "Diseñé y desarrollé una plataforma de educación en línea utilizando Django y React.",
        proyectoLink: "https://www.google.com.ar",
        gitHubLink: "https://github.com/usuario/proyecto2"
    },
    {
        id: 3,
        src: proyecto3,
        titulo: "Blog personal con CMS (2022)",
        descripcion: "Desarrollé un blog personal con un sistema de gestión de contenidos (CMS) personalizado en WordPress.",
        proyectoLink: "https://www.google.com.ar",
        gitHubLink: "https://github.com/usuario/proyecto2"
    },
    {
        id: 4,
        src: proyecto4,
        titulo: "Plataforma de E-Learning (2023)",
        descripcion: "Diseñe y desarrolle una pa}lataforma de educacion en linea utilizando Django y React. Con diferentes funcionalidades",
        proyectoLink: "https://www.google.com.ar",
        gitHubLink: "https://github.com/usuario/proyecto2"
    }
];
</script>

<template>
  <!-- HTML para mostrar la galería de proyectos -->
  <div class="galeria">
        <!-- Iteramos sobre cada proyecto en 'misProyectos' -->
        <!-- 'key' es una propiedad especial que permite identificar cada elemento en la lista de forma única -->
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <!-- Mostramos la imagen del proyecto con enlace reactivo a 'src' y texto alternativo 'alt' -->
            <img :src="proyecto.src" :alt="proyecto.titulo">
            <div class="proyecto-info">
                <!-- Mostramos el título y la descripción del proyecto -->
                <h3>{{ proyecto.titulo }}</h3>
                <p>{{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.proyectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver Proyecto</a>
                    <a :href="proyecto.gitHubLink" class="github-link" target="_blank" rel="noopener noreferrer">Ver Código en GitHub</a>
                </div>
            </div>
        </li>
    </div>
</template>

<style scoped>
/* Estilos para la galería de proyectos */
.galeria {
    /* Contenedor principal de la galería */
    width: 100%;
    height: 100%;
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    padding: 20px;
    justify-content: center;
    background: linear-gradient(-45deg, #021526, #03346E, #6EACDA, #E2E2B6);
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

/* Animación del fondo de la galería */
@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

/* Estilos para el contenedor individual de cada proyecto */
.proyecto {
    display: flex;
    flex-direction: column;
    border: 2px solid #ddd;
    border-radius: 8px;
    overflow: hidden;
    background-color: #f9f9f9;
    max-width: 222px;
    flex: 1 1 300px;
}

/* Estilo de las imágenes del proyecto */
.proyecto img {
    width: 100%;
    height: auto;
    display: block;
}

/* Estilos para la información del proyecto */
.proyecto-info {
    padding: 15px;
    text-align: center;
}

/* Estilos para el título del proyecto */
.proyecto-info h3 {
    margin: 10px 0;
    font-size: 1.3em;
    color: #333;
}

/* Estilos para la descripción del proyecto */
.proyecto-info p {
    margin: 10px 0;
    font-size: 1em;
    color: #666;
}

/* Contenedor de enlaces y botones del proyecto */
.proyecto-links {
    display: flex;
    flex-direction: column;
    gap: 10px;
    margin-top: 10px;
}

/* Estilo del botón "Ver Más" */
.proyecto-links .btn-ver-mas {
    background-color: #007BFF;
    color: #fff;
    padding: 10px 15px;
    border-radius: 5px;
    text-decoration: none;
    transition: background-color 0.3s;
}

/* Estilo al pasar el cursor sobre el botón "Ver Más" */
.proyecto-links .btn-ver-mas:hover {
    background-color: #0056b3;
}

/* Estilo del enlace a GitHub */
.proyecto-links .github-link {
    color: #333;
    text-decoration: none;
    font-size: 0.9em;
}

/* Estilo al pasar el cursor sobre el enlace a GitHub */
.proyecto-links .github-link:hover {
    text-decoration: underline;
}
</style>