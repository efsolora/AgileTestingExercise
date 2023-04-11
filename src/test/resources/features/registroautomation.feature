Feature: Registro automation exercise
  yo como usuario de la pagina automation exercise
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página

  @RegistroAutomation
  Scenario: Registro exitoso
    Given que el usuario esta en la pagina de inicioo
    When navega hasta la el formulario de registro
    And Llena todos los campos
    Then El usuario vera un mensaje de creacion exitosa