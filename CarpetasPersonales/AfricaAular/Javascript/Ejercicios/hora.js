let hora = 18;
let mensaje;

if (hora >= 6 && hora <= 11) {
  mensaje = "Good moorning";
} else if (hora >= 12 && hora <= 16) {
  mensaje = "Good afternoon";
} else if (hora >= 17 && hora <= 19) {
  mensaje = "Good evening";
} else if (hora >= 20 && hora <= 23) {
  mensaje = "Good night";
} else {
  mensaje = "Valor incorrecto";
}

console.log(mensaje);