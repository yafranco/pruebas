#language: es
Característica: Registro de pagina y validacion de registro
  
  
  Escenario: Como usuario quiero entrar a la pagina de servicios y buscar prestamo de autos
    Dado Que el usuario ingrese a "https://www.banistmo.com/wps/portal/banistmo/personas/"
    Cuando Ingresa en la opcion "productos y servicios"
    Entonces validacion de descarga "DownDir"
    
   
   

