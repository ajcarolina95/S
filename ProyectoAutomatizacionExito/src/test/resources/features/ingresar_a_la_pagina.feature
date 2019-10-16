#language: es
#Author: cajaram@bancolombia.com.co


@tag
Característica: Ingresar a la pagina deseada
  Yo como usuario quiero abrir el navegador para comprar un producto 

Antecedentes: Ingresar a la página del exito
  Dado que Carolina abre la pagina del exito

Escenario:
  Cuando busca la nevera que desea
  Y la agrega al carrito de compras
  Entonces verifica que se haya agregado correctamente
