Feature: Comprar en la tienda Jumbo
  Como: Potencial comprador de chorizo
  Quiero: Comprar el chorizo mas barato
  De manera que

  @UnChorizo
  Scenario: Un chorizo
    Given Accedi a la pagina inicial de Jumbo
    And Inicie sesion
    And Seleccione mi direccion
    When Busco por Chorizo
    And Selecciono el Chorizo mas barato
    Then Sere redireccionado a la pagina de pago