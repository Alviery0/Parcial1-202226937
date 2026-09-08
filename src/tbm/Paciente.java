package tbm;

public class Paciente {
	private String genero;
	private double peso;
	private double altura;
	private int edad;
	
	
	public Paciente(String genero, double peso, double altura, int edad) {
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;		
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	"""public String calcularTbm():"""

}
