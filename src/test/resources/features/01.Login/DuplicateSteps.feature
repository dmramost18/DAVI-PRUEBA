Feature: Validar el uso de pasos duplicados sin crear mas logica

  @FormLogin
    #IconUserFormSteps FlaticonSteps reutilizado solo para el Given
    Scenario: Reutilizacion de pasos
      Given Usuario tiene acceso a flaticon
      When da clic en el icon user
      Then se visualiza el form de inicio de sesion