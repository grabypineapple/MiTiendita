package Entidades;

public class Existencias extends Producto {
	
	private double cantidadProdExistencia;
	private double precioProducto; 
	private boolean estadoProducto;
	private String descripcionExistencia;
	
	
	public Existencias() {
		super();
	}
	public Existencias(double cantidadProdExistencia, double precioProducto) {
		super();
		this.cantidadProdExistencia = cantidadProdExistencia;
		this.precioProducto = precioProducto;
	}
	public Existencias(double cantidadProdExistencia, double precioProducto, boolean estadoProducto) {
		super();
		this.cantidadProdExistencia = cantidadProdExistencia;
		this.precioProducto = precioProducto;
		this.estadoProducto = estadoProducto;
	}
	public Existencias(double cantidadProdExistencia, double precioProducto, boolean estadoProducto,
			String descripcionExistencia) {
		super();
		this.cantidadProdExistencia = cantidadProdExistencia;
		this.precioProducto = precioProducto;
		this.estadoProducto = estadoProducto;
		this.descripcionExistencia = descripcionExistencia;
	}
	
	
	public double getCantidadProducto() {
		return cantidadProdExistencia;
	}
	public void setCantidadProducto(double cantidadProdExistencia) {
		//Si la  cantidadProdExistencia Disparar un pedido 
		this.cantidadProdExistencia = cantidadProdExistencia;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public boolean isEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(boolean estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	
	
	
	@Override
	public String toString() {
		return "Existencias [cantidadProdExistencia=" + cantidadProdExistencia + ", precioProducto=" + precioProducto
				+ ", estadoProducto=" + estadoProducto + ", descripcionExistencia=" + descripcionExistencia + "]";
	}
	
	//Metodos
	/* metodo se que debe ejecuatar despues de realizar una venta 
	 * Esto permitira modificar
	 * cantidad de producto en existencia
	 * 
	 * */
		public boolean registroVenta() {
			boolean  registro=false;
			/*
			 * UPDATE tbl_existencia
		SET  =  numProductos = numproductos -1
		estatusProducto = "VENDIDO"
		WHERE Id_producto = Id_producto 
			 * */ 	
			
			return registro;
		}
		/*
		 * Metodo para registar nuevos productos 
		 * Evaluar si ya exite producto; incremenatar inventario
		 * Si no existe producto, evaluar ya que se deben modificar dos tablas existencia y producto
		 *  
		 * */
		public boolean altaProdctoExistencia(Producto producto) {
			boolean altaProducto=false;
			
			/*
			 * INSERT INTO tbl_existencia(cantidad , precio , estatusproducto,idExistencia,idProducto,fechaAlta)
			VALUES (cantidadprod , 100 , "AltaProducto", 123444,1,"10/10/21");
			
			*/
			return altaProducto;
		}
		/*Metodo para realizar baja de existencia pueder por 
		 * - venta
		 * - defecto
		 * - caducidad
		 * */
		public boolean bajaProductoexistencia() {
			boolean bajaProducto=false;
			
			 /* UPDATE tbl_existencia
				SET  =  numProductos = numproductos -1
				estatusProducto = "VENDIDO"
				WHERE Id_producto = Id_producto 
				*/
			return bajaProducto;
		}
		
		
}
