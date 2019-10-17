#language: es
#Author: cajaram@bancolombia.com.co

Característica: Ingresar a la pagina deseada
  Yo como usuario quiero abrir el navegador para comprar un producto 

Antecedentes: Ingresar a la pagina del exito
  Dado que Carolina abre la pagina del exito
 
 	@CompraPortatil
  Escenario:
 		Cuando agrega un producto de tecnologia al carrito de compras
 		Entonces se verifica que el producto se annadio al carrito de compras