<script setup>
import NavBar from './components/icons/NavBar.vue';
import DatosPersonales from './components/icons/DatosPersonales.vue';
import EducacionComponente from './components/icons/EducacionComponente.vue';
import ExperienciaComponente from './components/icons/ExperienciaComponente.vue';
import ProyectoComponente from './components/icons/ProyectoComponente.vue';
</script>

<template>
  <header>
    <!-- Barra de navegacion -->
    <NavBar />
    <!-- Datos personales -->
    <DatosPersonales />
  </header>
  <main>
    <!-- El estilo css de section se encuentra en base.css -->
    <section id="educacion">
      <h2> Educacion - Cursos </h2>
      <EducacionComponente />
    </section>
    <section id="experiencia">
      <h2> Experiencia </h2>
      <ExperienciaComponente />
    </section>
    <section id="proyectos">
      <h2> Proyectos </h2>
      <ProyectoComponente />
    </section>
    <section id="habilidades">
      <h2> Habilidades </h2>
    </section>
    <section id="intereses">
      <h2> Intereses </h2>
    </section>
  </main>
</template>

<style scoped>
</style>
 
