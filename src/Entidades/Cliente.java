package Entidades;


public class Cliente extends Producto {
	private double idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String direccionCliente;
	private String ciudadCliente;
	private String cpCliente;
	private String telefonoCliente;
	private String fechaAltaCliente;
	private String emailCliente;
	private int edadCliente;
	private String edoCliente;
	
	public Cliente() {
		super();
	}

	
	public Cliente(double idCliente, String direccionCliente, String ciudadCliente, String cpCliente,
			String fechaAltaCliente) {
		super();
		this.idCliente = idCliente;
		this.direccionCliente = direccionCliente;
		this.ciudadCliente = ciudadCliente;
		this.cpCliente = cpCliente;
		this.fechaAltaCliente = fechaAltaCliente;
	}
	public Cliente(double idCliente, String nombreCliente, String apellidoCliente, String direccionCliente,
			String ciudadCliente, String cpCliente, String telefonoCliente, String fechaAltaCliente,
			String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccionCliente = direccionCliente;
		this.ciudadCliente = ciudadCliente;
		this.cpCliente = cpCliente;
		this.telefonoCliente = telefonoCliente;
		this.fechaAltaCliente = fechaAltaCliente;
		this.emailCliente = emailCliente;
	}

	
	
	public double getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(double idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getCiudadCliente() {
		return ciudadCliente;
	}
	public void setCiudadCliente(String ciudadCliente) {
		this.ciudadCliente = ciudadCliente;
	}
	public String getCpCliente() {
		return cpCliente;
	}
	public void setCpCliente(String cpCliente) {
		this.cpCliente = cpCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
		
			 if(telefonoCliente.length()>0 && telefonoCliente.length()<=10) {
				 this.telefonoCliente = telefonoCliente;			 			 
			 }else{
				 this.edoCliente = "Telefono fuera de rango";
			 }
	}
	public String getFechaAltaCliente() {
		return fechaAltaCliente;
	}
	public void setFechaAltaCliente(String fechaAltaCliente) {
		this.fechaAltaCliente = fechaAltaCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public int getEdadCliente() {
		return edadCliente;
	}


	public void setEdadCliente(int edadCliente) {
			if (edadCliente <12 && edadCliente >120){
				this.edadCliente =edadCliente;
			}else 
				this.edoCliente = "Edad fuera de rango permitido";
	}
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", direccionCliente=" + direccionCliente + ", ciudadCliente=" + ciudadCliente
				+ ", cpCliente=" + cpCliente + ", telefonoCliente=" + telefonoCliente + ", fechaAltaCliente="
				+ fechaAltaCliente + ", emailCliente=" + emailCliente + "]";
	}



	//Metodos
	
	/* Solo puede existir un cliente con un mismos telfono y correo electronico*/
	public boolean validaCliente(String email, String telefono) {
	boolean  existeCliente = false;

	/* Consulta cliente por telefono y correo
	SELECT idCliente FROM 
	WHERE TELEFONO_bd=TELFONO AND
	EMAIL_db = EMAIL;
	*/
	/*if( idCliente)
		existeCliente = true;
	 */

	return existeCliente ;
	}
	
	public boolean altaCliente(Cliente cliente) {
		boolean altaCliente=false;
		
		 if(  validaCliente(cliente.emailCliente, cliente.telefonoCliente) == false){
			 /*
			INSERT INTO tbl_cliente(nombres , apellido ,edad ,email,direcion,telefono,password)
			VALUES ("Juan" , "Hernandez" , 28, "juanhern@gmail.com",1234444445,"*************");
			  
			 if (INSERT  == OK)
				 altaCliente = true; // insercion correcta 
			 else
				 altaCliente = false; // insercion incorrecta*/ 

		}else 		 // Ya existe cliente
 
		altaCliente = false; 
		
		return altaCliente;
		}
	
	
	/* Se modifican datos del cliente 
	Solo puede modificarse
	direccion ,o password 
	//correo y telefono no se pueden modificar
	*/
	 public boolean  modificaCliente() {
	boolean modificacion=false;
		 /*
		 UPDATE tbl_cliente
	SET direccion = direccion, password = pasword
	WHERE Id_cliente = Id_cliente
	if(UPDATE)
	 modificacion=true;


*/
	return modificacion;
	}
	 
	//Eliminar Cliente, Realizar la baja de cliente
	public boolean bajaCliente(int idCliente ) {
	boolean eliminaCliente=false;
	/*
	DELETE FROM TBL_CLIENTE
	WHERE idCliente= idCliente ;
	
	if(DELETE == OK)
	eliminaCliente= true;*/

	return eliminaCliente;
	}
	
	//Consulta a Bd los datos del cliente 
	//Regresa datos del cliente
	public Cliente consultarCliente(int idCliente) {
	 Cliente cliente  = new Cliente();

	//select * from tblcliente  where idCliente;
	return cliente;
	}
	
	//REALIZAR EL LOGIN DEL USUARIO
	//PERMITIR 3 INTENTOS
	// Se manejara un tipo de hash para el password
	 public boolean loginCliente(String usuario, String password) {
	 boolean acceso =false;
	 
	/*SELECT USUARIO, PASSWORD FROM TBLCLIENTE
	  if (usuario.equal(USUARIO && password.equals(PASSWORD))
		acceso =true;*/


	return acceso;
	}
	
	 //
	 public boolean validapassword(String password, String passBD){
		 boolean autentica=false;
	  //generar Hash para encript y decrip de pass  
	 //autentica =validaHash(password,passBD);

	 return autentica;
	 }
	 
	//public void listarCliente() {}	
	//public void visualizarCliente() {}


	
}
