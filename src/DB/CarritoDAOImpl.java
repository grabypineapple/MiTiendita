package DB;

import java.util.List;

import Entidades.Cliente;
import Entidades.Pedidos;
import Entidades.Producto;

public class CarritoDAOImpl implements CarritoDAO{

	@Override
	public void registrarCompra(Producto producto, Cliente cliente) {
		System.out.println("Carrito registrarCompra");
		
	}

	@Override
	public String cancelarCompra(Producto producto, Cliente cliente) {
		
		System.out.println("Carrito cancelarCompra");
		return null;
	}

	@Override
	public String calcularTotal(Producto producto) {
		
		System.out.println("Carrito calcularTotal");
		return null;
	}

	@Override
	public String aplicarDescuento(Pedidos pedido) {
		
		System.out.println("Carrito aplicarDescuento");
		return null;
	}

	@Override
	public List<Pedidos> listarPedidos() {
		
		System.out.println("Carrito listarPedidos");
		return null;
	}

	@Override
	public void modificarCompra(Pedidos pedido) {
		
		System.out.println("Carrito modificarCompra");
		
	}

	

}
