package DB;

import Entidades.Producto;

public interface ProductoDAO {
	void agregaProducto(Producto producto);
	boolean modificaproducto(Producto producto);
	void consultaProducto(Producto producto);
	boolean eliminaProducto(Producto producto);

}
