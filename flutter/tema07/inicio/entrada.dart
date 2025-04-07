void main() {
  // Variables mutables
  String nombre = "Manu";
  String correo = "manu@gmail.com";
  String pass = "1234A";
  String? direccion = null;
  late int telefono;
  late var experiencia;

  telefono = 123;
  experiencia = true;

  print("Nombre: ${nombre} Correo: $correo Pass: $pass "
      "Direccion: ${direccion ?? "sin direccion"} "
      "Telefono: $telefono Experiencia: $experiencia");

  // Llamada con parámetros opcionales posicionales
  saludo(nombre, correo, null);

  // Llamada con parámetros con nombre
  saludoNominal(nombreP: nombre, correoP: correo, direccionP: "Las Rozas");
}

saludo(String nombre, String correo, [String? direccion = "Pozuelo"]) {
  print("Nombre: $nombre Correo: $correo Direccion: ${direccion ?? "sin direccion"}");
}

saludoNominal({required String nombreP, required String correoP, String direccionP = "Pozuelo"}) {
  print("Nombre: $nombreP Correo: $correoP Direccion: $direccionP");
}
