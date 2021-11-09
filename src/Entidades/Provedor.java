package Entidades;

public class Provedor extends Producto {
	private double idProvedor;
	private String nombreProvedor;
	private String fechaAltaprovedor;
	private String fechaBajaProvedor;

	
	//Constructores
	public Provedor() {
		super();
	}
	public Provedor(double idProvedor, String nombreProvedor, String fechaAltaprovedor) {
		super();
		this.idProvedor = idProvedor;
		this.nombreProvedor = nombreProvedor;
		this.fechaAltaprovedor = fechaAltaprovedor;
	}

	
	public Provedor(double idProvedor, String nombreProvedor, String fechaAltaprovedor, String fechaBajaProvedor) {
		super();
		this.idProvedor = idProvedor;
		this.nombreProvedor = nombreProvedor;
		this.fechaAltaprovedor = fechaAltaprovedor;
		this.fechaBajaProvedor = fechaBajaProvedor;
	}
	
	//Setter & Getters 
	public double getIdProvedor() {
		return idProvedor;
	}
	public void setIdProvedor(double idProvedor) {
		this.idProvedor = idProvedor;
	}
	public String getNombreProvedor() {
		return nombreProvedor;
	}
	public void setNombreProvedor(String nombreProvedor) {
		this.nombreProvedor = nombreProvedor;
	}
	public String getFechaAltaprovedor() {
		return fechaAltaprovedor;
	}
	public void setFechaAltaprovedor(String fechaAltaprovedor) {
		this.fechaAltaprovedor = fechaAltaprovedor;
	}
	public String getFechaBajaProvedor() {
		return fechaBajaProvedor;
	}
	public void setFechaBajaProvedor(String fechaBajaProvedor) {
		this.fechaBajaProvedor = fechaBajaProvedor;
	}
	@Override
	public String toString() {
		return "Provedor [idProvedor=" + idProvedor + ", nombreProvedor=" + nombreProvedor + ", fechaAltaprovedor="
				+ fechaAltaprovedor + ", fechaBajaProvedor=" + fechaBajaProvedor + "]";
	}
	

	//Metodos
	/*Metodo Para Agregar prover
	 * Realizar si exite provedor antes de insertar
	 * Regresa true si la alta fue exitosa de lo contrario indicar error o ya existe provedor
	 * 
	 * */
	public boolean  altaProvedor() {
		boolean altaprovedor=false;
		/*
		INSERT INTO tbl_provvero(id_provedor,nombreProvedor ,fechaAlta )
		VALUES (1245 , "La pantera ABARROTES" , "10/12/21", 1234444445)
		*/
		
		return altaprovedor;
	}
	/*Metodo para dar de baja Provvedro 
	 * Se realiza un Update para actualizar el estado del proveedor
	 * En caso de provedor con mal calificaión pasar a lista negra
	 * Regresa true si la insercion fue correcta de lo contraio false y debe indicar error.
	 * */
	public boolean bajaProvedor() {
		boolean altaprovedor=false;
		/*
		 UPDATE tbl_carrito
			SET totalCompra = total, numProductos = numproductos, total
			estatusPedido = estadoPedido
			WHERE Id_cliente = Id_cliente
			*/ 
	return altaprovedor;	
	}
	
		
	}
