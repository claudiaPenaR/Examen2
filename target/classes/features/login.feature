Feature: Ingreso de usuario

  Scenario: Ingreso exitoso con datos correctos
    Given El usuario tiene un nombre de usuario almacenado en la base de datos
    When El usuario ingresa el nombre de usuario en el campo correspondiente
    Then El usuario debe ser redirigido al panel de inicio
