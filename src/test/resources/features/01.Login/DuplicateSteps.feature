Feature: Validar el uso de pasos duplicados sin crear mas logica

  @FormLoginFlaticon
    #IconUserFormSteps FlaticonSteps reutilizado solo para el Given
  Scenario: Reutilizacion de pasos
    Given Usuario tiene acceso a flaticon
    When da clic en el icon user
    Then se visualiza el form de inicio de sesion
      | Inicia sesión        |
      | Continuar con Google |
      | Continúa con Apple   |
      | Continúa con email   |

  @FormEmail
    #SendDataFomrSteps
  Scenario: Ingresar datos de formulario
    Given Usuario tiene acceso a flaticon
    And Ingresa para iniciar sesion con email
    When Ingresamos datos en el formulario
    Then no se visualicen advertencias

