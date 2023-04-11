Feature: Inicio de sesion
  yo como usuario de falabella
  quiero dirigirme a la pagina principal
  para poder ver los productos

  Scenario: Inicio de sesion
    Given el usuario esta en la pagina principal falabella
    When navega hasta el incio de sesion
    Then debe observar un mensaje de registro exitoso