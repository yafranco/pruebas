#language: es
Característica: Registro de pagina y validacion de registro
  
  
  Escenario: Como usuario quiero comprar cursos
    Dado Que el usuario ingrese a "http://practice.automationtesting.in/shop/"
    Cuando Ingresa en la opcion "los cursos a comprar"
    Entonces validacion del monto "validation"
    
   
   

