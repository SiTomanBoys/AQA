package cl.AQA.ApiRest.dto;

public abstract class Entidad 
{
	private Long idIncremental;
	
	public Entidad(Long idIncremental) 
	{
		this.idIncremental = idIncremental;
	}
	public Long getIdIncremental() 
	{
		return idIncremental;
	}
	
	public void setIdIncremental(Long idIncremental) 
	{
		this.idIncremental = idIncremental;
	}
	
}
