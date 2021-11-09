package DB;
import Entidades.Cliente;

public interface ClienteDAO {
	void  modificaCliente(Integer id);
	boolean bajaCliente(Integer id);
	String ListarCliente(Cliente cliente);
	String consultarCliente(Cliente cliente);
	boolean loginCliente(Cliente cliente);
	void altaCliente(Cliente cliente);
}
