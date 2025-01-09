@FeatureLogin
Feature:Ingreso a MBaaS

  Como usuario

  # ************************************** Pagina Principal *********************************************** #

  @Ingreso
   #ButtonForgotPasswordSteps
  Scenario: Ingreso a pagina Web
    Given Usuario tiene acceso a la URL

  @Internet
   #ButtonForgotPasswordSteps
  Scenario: Ingreso a pagina Web
    Given Usuario tiene acceso a la internet

  @Google
   #IngresoGoogleSteps
  Scenario: Ingreso a pagina Web
    Given Usuario accede a Google .com

  @Salida
    #ButtonForgotPasswordSteps
  Scenario: Salida de pagina Web
    Given Usuario sale de la URL

  @Amazon
   #IngresoGoogleSteps
  Scenario: Ingreso a pagina Web
    Given Usuario accede a Amazon .com

