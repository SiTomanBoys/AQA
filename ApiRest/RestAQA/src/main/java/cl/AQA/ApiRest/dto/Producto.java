package cl.AQA.ApiRest.dto;

public class Producto extends Entidad {

	public Producto(Long idIncremental) {
		super(idIncremental);
		// TODO Auto-generated constructor stub
	}
	
	private String nombre;
	private Integer precio;
	
	public Producto(Long idIncremental, String nombre, Integer precio){
		super(idIncremental);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}
