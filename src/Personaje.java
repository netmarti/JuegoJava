
public class Personaje {
	
	private String nombre;
	private Boolean principal;
	private Boolean primera;
	
	
	public Personaje (){
		nombre = "Pablete";
		principal = false;
		primera = false;	
	}
	
	public void setPrincipal(){
		principal = true;
	}
	
	public void setPrimera(){
		primera = true;
	}
	
	
	public Boolean getOculta(){
		if(principal == true && primera == true){
			return true;
		}
		else{
			return false;
		}			
	}
			
	public void resetear(){
		principal = false;
		primera = false;
				
	}

}
