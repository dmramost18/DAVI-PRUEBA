@FeatureLogin
Feature:Ingreso a MBaaS

  Como usuario

  # ************************************** Pagina Principal *********************************************** #

  @Ingreso
   #ButtonForgotPasswordSteps
  Scenario: Ingreso a pagina Web
    Given Usuario tiene acceso a la URL

  @Salida
    #ButtonForgotPasswordSteps
  Scenario: Salida de pagina Web
    Given Usuario sale de la URL