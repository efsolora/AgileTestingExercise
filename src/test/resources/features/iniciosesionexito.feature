#language:es
#encoding:UTF-8
#Author:

Característica: Inicio de sesion
  yo como usuario de la pagina del Exito
  quiero iniciar sesion
  para poder comprar productos

  Escenario: Inicio sesion exitoso
    Dado que el usuario esta en la pagina
    Cuando ingresa correo y contrasenna validas
    Entonces se ve un mensaje con el nombre del usuario