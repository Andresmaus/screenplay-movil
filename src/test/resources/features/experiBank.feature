@Regresion
Feature: abrir erikbank y conocer el saldo a favor
  Yo como usuario quiero ingresar a erikbanck para validar el funcionamiento de app
  @Login
  Scenario Outline: login
    Given Andres ingresa a la apk erikbank
    When Digita las credenciales de acceso
      | usuario   | clave   |
      | <usuario> | <clave> |
    Then verifica que ingreso correctamente

    Examples:
      | usuario | clave   |
      | company | company |
