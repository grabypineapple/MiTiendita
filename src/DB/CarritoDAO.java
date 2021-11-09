package DB;

import Entidades.Producto;

import java.util.List;

import Entidades.Cliente;
import Entidades.Pedidos;

public interface CarritoDAO {
	void registrarCompra(Producto producto,Cliente cliente);
	String cancelarCompra(Producto producto,Cliente cliente);
	String calcularTotal(Producto producto);
	String aplicarDescuento(Pedidos pedido);
	List<Pedidos> listarPedidos();
	void modificarCompra(Pedidos pedido );	

}
