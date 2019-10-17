#language: es
#Author: christian@choucairtesting.com

@Tags
Característica: Ingresar a la pagina deseada
  Yo como usuario quiero abrir el navegador para comprar un producto

  Antecedentes: Ingresar a la página del exito
    Dado que Carolina abre la pagina del exito

  @CarritoElectrodomestico
  Escenario: Agregar un electrodomestico al carrito de compras
    Cuando agrega un electrodomestico al carrito de compras
      | producto          | tipoDeElectrodomestico | marcas | nombreProducto                 |
      | Electrodomésticos | Cocción eléctrica      | HACEB  | Cocineta arrezo a gas 2 puesto |
    Entonces verifica que el electrodomestico se encuentre en el carrito de compras
      | verificarCarrito               |
      | Cocineta arrezo a gas 2 puesto |

  @CompraElectrodomestico
  Escenario: Comprar un electrodomestico
    Cuando compra un electrodomestico
      | producto          | tipoDeElectrodomestico | marcas | nombreProducto                 |
      | Electrodomésticos | Cocción eléctrica      | HACEB  | Cocineta arrezo a gas 2 puesto |
    Entonces verifica mensaje de compra exitosa

  
  
