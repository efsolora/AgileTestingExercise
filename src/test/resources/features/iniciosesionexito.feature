#language:en
#encoding:UTF-8
#Author:

Feature: Inicio de sesion
  yo como usuario de la pagina del Exito
  quiero iniciar sesion
  para poder comprar productos

  Scenario: Inicio sesion exitoso
    Given que el usuario esta en la pagina
    When ingresa correo y contrasenna validas
    Then se ve un mensaje con el nombre del usuario