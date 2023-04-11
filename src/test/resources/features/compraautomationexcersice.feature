
Feature: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página

  Scenario: Compra de productos
    Given que el usuario esta en la pagina de inicio
    When inicia sesion y completa los campos necesarios para realizar la compra
    Then el usuario debe ver un mensaje de confirmacion de la compra

