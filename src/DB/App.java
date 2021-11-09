package DB;

import Entidades.Cliente;
import Entidades.Producto;

public class App {
	
	public static void main(String[] args) {
		System.out.println(" Patrones de diseño ");
		
		Cliente cliente = new Cliente(1,"manzano 56","Cd de mexico","10999","23/11/21");
		
		ClienteDAO clienteDAO = new  ClienteDAOImpl();		
		clienteDAO.altaCliente(cliente);
		
		Producto  producto  = new  Producto(1,"Aceite Kartamus", 2800, 1,2,1, "23/11/21");
		
		ProductoDAO productoDAO =  new ProductoDAOImpl();
		productoDAO.agregaProducto(producto);
		 
		
		
		CarritoDAO carrito =  new CarritoDAOImpl(); 
		carrito.registrarCompra(producto, cliente);
				

	}


}
