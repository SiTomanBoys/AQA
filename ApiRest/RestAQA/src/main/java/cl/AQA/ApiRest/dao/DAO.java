package cl.AQA.ApiRest.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.AQA.ApiRest.dto.*;
@Repository
public class DAO {

	public List<Producto> Listar() {
		
		ArrayList<Producto> listaProductos = new ArrayList<Producto>(); 
		listaProductos.add(new Producto(Long.valueOf(1),"prueba",100));
		
		return listaProductos;
	}
}
