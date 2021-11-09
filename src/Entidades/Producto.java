package Entidades;
enum TipoProducto{NOEXISTE,AGOTADO,DESCONTINUADO,EXISTE};

public class Producto {
	private double idProducto; 
	private String nombreProducto;
	private double precioProducto; 
	private int idProveedor; 
	private int idDepartamento;
	private String fechaAltaproducto;
	private String fechaBajaProducto;
	private boolean estadoProducto; 
	private TipoProducto tipoProducto;
	private String descProducto;
	
	
	//Constructores
	public Producto() {
		super();
		
	}


	public Producto(double idProducto, String nombreProducto) {
		super();
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		
		
	}

	
	public Producto(double idProducto, String nombreProducto, double precioProducto, int idProveedor,
			double cantidadProducto, int idDepartamento, String fechaAltaproducto) {
		//Se realizara Acceso a la BD para obtenr los datos del productos por medio del idproducto seleccionado por el usuario 
		 
		// Select precioProducto,nombreProducto from tbl_producto where idProdcuto; 
		super(); 
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.idProveedor = idProveedor;		
		this.idDepartamento = idDepartamento;
		this.fechaAltaproducto = fechaAltaproducto;
	}
	
	

	
	//Setter & Getters
	public double getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(double idProducto) {
		
		if (idProducto == 0) {
			this.idProducto = idProducto;	
			this.tipoProducto = TipoProducto.NOEXISTE;
		} else if(consultaProducto(idProducto)) { // Se consulta existencia de producto en BD 
			this.idProducto = idProducto;
			this.tipoProducto = TipoProducto.EXISTE;
			
		}else {
			this.idProducto = idProducto;
			this.tipoProducto = TipoProducto.AGOTADO;
		}
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		 
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		if(precioProducto==0)
		{  this.descProducto ="Error en producto ";
			this.precioProducto = precioProducto;
		}
		else {
			this.precioProducto = precioProducto;
		}
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getFechaAltaproducto() {
		return fechaAltaproducto;
	}
	public void setFechaAltaproducto(String fechaAltaproducto) {
		this.fechaAltaproducto = fechaAltaproducto;
	}
	public String getFechaBajaProducto() {
		return fechaBajaProducto;
	}
	public void setFechaBajaProducto(String fechaBajaProducto) {
		this.fechaBajaProducto = fechaBajaProducto;
	}
	public boolean isEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(boolean estadoProducto) {
		this.estadoProducto = estadoProducto;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", idProveedor=" + idProveedor 
				+ ", idDepartamento=" + idDepartamento + ", fechaAltaproducto=" + fechaAltaproducto
				+ ", fechaBajaProducto=" + fechaBajaProducto + ", estadoProducto=" + estadoProducto + "]";
	}
	
	
	//metodos
	
	/*
	Metodo  para agregar un nuevo producto
	 * se recibira de un formulario las caracteriticas del producto
	 * Se debe evaluar que el procto NO existe. y existe debe pertenecer a un provvedor diferente
	 * Regresara true si la insercion se realizo correctamante
	 * */
	public boolean agregaProducto(Producto producto) {
		boolean altaProducto=false;
		/* Inserta producto en la tablas de producto y exitencia
		INSERT INTO tbl_productp(nombreProducto, numProductos , fechaAlta,idDepartamento)
		VALUES ("aceite" , 500 , "AltaProducto", "07/10/2021",1);
		
		*/
		return altaProducto;
	}
	
	//Metodo para eliminar producto
	public boolean eliminaProducto(int idProducto ){
		boolean elimiaProducto=false;
				/*Para elimiar producto se deben tomar en cuenta motivo
				- por venta
				- por defecto
				- por renovacion
				- etc
				Evaluar las tablas de donde se realizara el borrado
				 DELETE FROM TBL_producto, TBLexistencia
				WHERE idCliente= idProducto  ;
				*/
				
	return 	elimiaProducto;		
	}

	//Metodo para consultad de producto
	public boolean   consultaProducto(double idproducto){
		boolean existeProducto=false;
		//SELECT * FROM TBL:PRODUCTO WHERE ID_PRODUCTO // se realiza la consulta a BD del producto seleccio9nado 
		//La consulta  debera realizar con la tablas de TBL_exitencias para regresar el estado del producto
		
		return existeProducto;		
	}

	//Metodo para modificar producto
	public boolean  modificaproducto(Producto producto){
		boolean modificaProducto=false;
		/* Las codiciones para modificar producto pueden ser
		 * venta producto
		 * agregar producto al inventario
		 * devolucion
		 * defecto del producto
		 * Evaluar modificar un solo producto o productos en volumen 
		 UPDATE tbl_producto, tblExistencia 
		SET nombreProducto = 50, numProductos = numproductos, total
		estatusProducto = estadoProducto
		WHERE Id_Producto = Id_producto
		 * 
		 * */
		return modificaProducto;
	}
	
}
