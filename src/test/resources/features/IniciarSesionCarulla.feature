Feature: Iniciar sesion en la pagina web de Carulla
  Yo como usuario de la pagina web de carulla
  quiero iniciar sesion con mi correo y contrasenna validos
  para poder verificar el funcionamiento del login de la pagina web

  Scenario: Inicio de sesion exitoso
    Given que el usuario esta en la pagina de inicio de carulla
    When inicia sesion en la pagina web de carulla con su email y contrasenna validos
    Then al dar click en el boton cuenta deberia aparecer el nombre de mi usuario