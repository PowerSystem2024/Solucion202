<script setup>

import { ref } from 'vue';
// import MatrixBackground from './Fondo/MatrixBackground.vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Desarrollo de proyectos personales: Trabajar en proyectos personales que te apasionen, como crear herramientas de automatización para tareas diarias, juegos, aplicaciones web o análisis de datos. Esto te permite explorar nuevas bibliotecas y técnicas.',
    'Aprendizaje constante: Explorar nuevas bibliotecas, frameworks y tecnologías emergentes en Python, como TensorFlow para inteligencia artificial, Django o Flask para desarrollo web, y Pandas para análisis de datos.',
    'Contribución a proyectos de código abierto: Participar en proyectos de código abierto en plataformas como GitHub o GitLab, mejorando y aprendiendo de otros desarrolladores.',
    'Automatización de tareas: Crear scripts Python para automatizar tareas repetitivas en tu vida diaria, como organización de archivos, notificaciones personalizadas o monitoreo de sistemas.',
    'Análisis y visualización de datos: Utilizar bibliotecas como Pandas, NumPy y Matplotlib para analizar y visualizar datos de intereses personales, como estadísticas deportivas, clima o finanzas.'
]);

</script>

<template>
    <div class="intereses-contenedor">
        <FondoLava />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
</template>

<style scoped>

.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}

</style>