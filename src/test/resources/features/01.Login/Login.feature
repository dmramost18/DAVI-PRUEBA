@FeatureLogin
Feature: Ingreso a Web

  # ************************************** Pagina Principal *********************************************** #

  @FormLogin
   #FlaticonSteps
  Scenario: Ingreso a pagina Web Flaticon
    #Task
    Given Usuario tiene acceso a flaticon
    #Task
    When Realizo una busqueda
    #Questions
    Then se visualiza el resultado de la busqueda

  @Youtube
   #YoutubeSteps
  Scenario: Ingreso a youtube
    Given Usuario tiene acceso a la internet

  @Google
   #
  Scenario: Ingreso a Google
    Given Usuario accede a Google .c



