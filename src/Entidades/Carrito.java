package Entidades;
import java.util.*;

public class Carrito extends Producto {
	private String estatusPedido;
	private double totalCompra;
	private int numeroArticulos;
	
	public Carrito(double totalCompra, int numeroArticulos) {
		super();
		this.totalCompra = totalCompra;
		this.numeroArticulos = numeroArticulos;
	}
	public Carrito() {
		super();
	}
	public Carrito(String estatusPedido, double totalCompra, int numeroArticulos) {
		super();
		this.estatusPedido = estatusPedido;
		this.totalCompra = totalCompra;
		this.numeroArticulos = numeroArticulos;
	}
	public String getEstatusPedido() {
		return estatusPedido;
	}
	public void setEstatusPedido(String estatusPedido) {
		this.estatusPedido = estatusPedido;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public int getNumeroArticulos() {
		return numeroArticulos;
	}
	public void setNumeroArticulos(int numeroArticulos) {
		this.numeroArticulos = numeroArticulos;
	}
	@Override
	public String toString() {
		return "Carrito [estatusPedido=" + estatusPedido + ", totalCompra=" + totalCompra + ", numeroArticulos="
				+ numeroArticulos + "]";
	}
	
	//Metodos
	

	public boolean registrarCompra(int Id_cliente , String estatusPedido){
		boolean registrado = false;

		//Inserta en BD la compra como estado Solicicitado 

		/*
		INSERT INTO tbl_carrito(totalCompra , numProductos , estatusPedido,idCliente)
		VALUES (totalCompra , numProductos , "Solicitado", 1234444445)
		*/

		// if(INSERT OK) 
		registrado  = true ;

		return registrado;
		}
	
	
	
	public boolean  modificarCompra (int idCliente,String estadoPedido){
		boolean modificaPedido=false;
		 // Se consulta a BD el depido este debe estar en estado de Solicictado 
		 /* 
		 UPDATE tbl_carrito
		SET totalCompra = total, numProductos = numproductos, total
		estatusPedido = estadoPedido
		WHERE Id_cliente = Id_cliente 

		*/
		/*
		 if (UPDATE == OK )
		 modificaPedido = true;

		*/
		return modificaPedido;
		}
	
	public double calcularTotal (double  precioProducto, int cantidadProducto){
		double total =0;
		total += precioProducto * cantidadProducto;

		return total;
		}
	public double aplicarDescuento (double importe, double porcentaje){
		double descuento;
		try{
			descuento = (porcentaje * importe)/100;
		}catch(Exception e){
			System.out.println("Error al calcular el porcentaje valide datos de entrada "+e.getMessage());
			descuento =0;
		}
		return descuento;
		}
	
	/*
	listarPedidos    te dovolvera los pedido realizados
	// Validar puede ser por: rango de fecha, cliente,estatusPedido
	// 
	*/
	public ArrayList <Cliente> listarPedidos(String fechaInicial, String fechaFinal, String idestatuspeidio){
		ArrayList <Cliente> ArrayCliente = new  ArrayList <Cliente>();
	/*
	SELECT * FROM TBLCARRITO
	where fechaInicial = fechaInical  and fechaFinal = fechaFinal	
	where idestatuspeidio = "SOLICITADO", "CALCELADO" , "PENDIENTE"
	*/
		return ArrayCliente;
	}
	
	//Cambiar de Estatus el Pedido 
	//Disparar la Devolucion
	public void cancelarCompra(int idCliente ) {
		//Buscar en DB la compra por IdCliente
		/*
		SELECT compra FROM TBLcarrito
		where 	idCliente= idCliente;		
		*/
		// DisparaRDevolucion 
		
	}			
	

	
}
