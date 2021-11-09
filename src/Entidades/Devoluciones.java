package Entidades;
import java.util.*;
public class Devoluciones extends Producto {
	private double  idProducto; 
	private String fechaDovolucion;
	private double valorUnidad;
	private String motivoDevolucion;
	private boolean edoDevolución;
	
	//Constructores
	public Devoluciones() {
		super();
	}
	public Devoluciones(double idProducto, String fechaDovolucion, double valorUnidad, String motivoDevolucion,
			boolean edoDevolución) {
		super();
		this.idProducto = idProducto;
		this.fechaDovolucion = fechaDovolucion;
		this.valorUnidad = valorUnidad;
		this.motivoDevolucion = motivoDevolucion;
		this.edoDevolución = edoDevolución;
	}
	public Devoluciones(double idProducto, double valorUnidad, boolean edoDevolución) {
		super();
		this.idProducto = idProducto;
		this.valorUnidad = valorUnidad;
		this.edoDevolución = edoDevolución;
	}


	
	//setter & Getters 
	
		public double getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(double idProducto) {
		this.idProducto = idProducto;
	}
	public String getFechaDovolucion() {
		return fechaDovolucion;
	}
	public void setFechaDovolucion(String fechaDovolucion) {
		this.fechaDovolucion = fechaDovolucion;
	}
	public double getValorUnidad() {
		return valorUnidad;
	}
	public void setValorUnidad(double valorUnidad) {
		this.valorUnidad = valorUnidad;
	}
	public String getMotivoDevolucion() {
		return motivoDevolucion;
	}
	public void setMotivoDevolucion(String motivoDevolucion) {
		this.motivoDevolucion = motivoDevolucion;
	}
	public boolean isEdoDevolución() {
		return edoDevolución;
	}
	public void setEdoDevolución(boolean edoDevolución) {
		this.edoDevolución = edoDevolución;
	}
	@Override
	public String toString() {
		return "Devoluciones [idProducto=" + idProducto + ", fechaDovolucion=" + fechaDovolucion + ", valorUnidad="
				+ valorUnidad + ", motivoDevolucion=" + motivoDevolucion + ", edoDevolución=" + edoDevolución + "]";
	}
	

	//Metodos 
	/*Metodo  para devolver producto
	 * Algunos de los motivos puden ser
	 * defecto, No Pago, 	 
	 * Si se plica correcta la devolución se regresara un true
	 * Si el producto es defecto debera agregarso con un estatus de defecto 
	 * 
	 */
	public boolean ingresaProductoDevolucion() {
		boolean devolucion=false;  
		/* Inserta en la TBL_EXISTENCIA
		INSERT INTO TBL_EXISTENCIA(idProducto, numProducto , fechaDevolucion,estatusProducto)
		VALUES (1 , 500 ,  "07/10/2021",1, "defecto");
		
		*/
		return devolucion;
	}
	public void modificaProdcutoDevoucion() {}
	
	/*Metodo para inventario de la Tienda 
	 * Consulta los productos devulto y las caracteristicas de los mismos 
	 * */
	public ArrayList <Producto>  consultaproductoDevolucion() {
		ArrayList <Producto> arrayProductos= new  ArrayList <Producto>();
		/*
		 * Select TBL_producto where estado producto = "devoluion";
		 * 
		 * */
	return 	arrayProductos;
	}
	
	

}
