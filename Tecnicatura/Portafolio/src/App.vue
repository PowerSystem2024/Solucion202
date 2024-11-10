<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import EducacionComponente from './components/EducacionComponente.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
import ProyectoComponente from './components/ProyectoComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
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
      <!-- Componente Educacion -->
      <EducacionComponente />
    </section>
    <section id="experiencia">
      <h2> Experiencia </h2>
      <!-- Componente Experiencia -->
      <ExperienciaComponente />
    </section>
    <section id="proyectos">
      <h2> Proyectos </h2>
      <!-- Componente Proyectos -->
      <ProyectoComponente />
    </section>
    <section id="habilidades">
      <h2> Habilidades </h2>
      <HabilidadesComponente />
    </section>
    <section id="intereses">
      <h2> Intereses </h2>
      <InteresesComponente />
    </section>
  </main>
  <footer>
    <a href="#top">Inicio</a>
    <p>@ 2024 Solucion 202 - Portafolio Web</p>
  </footer>
</template>

<style scoped>

footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  font-size: 1.3rem;
}

</style>
 
