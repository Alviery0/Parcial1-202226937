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
	
	public void calcularTbm() {
	
		String generoMinusculas= genero.toLowerCase();
		
		switch (generoMinusculas){
				case "hombre":
					//verificar de las condiciones de peso, altura y edad
					boolean verificarPeso = false;
					boolean verificarAltura = false;
					boolean verificarEdad = false;
					
					//me faltó verificar que los atributos cumplieran con los requerimientos para calcular el TBM
					double tbm = null;
					
					if (verificarPeso == true) {
						if (verificarAltura== true) {
							if  (verificarEdad == true) {
								
								
							}
							
						}
						
					}
						
					
					System.out.println("La tasa metabolica basal (TMB) es: " + tbm);
				case "mujer":
					
					//verificar de las condiciones de peso, altura y edad
					boolean verificarPeso = false;
					boolean verificarAltura = false;
					boolean verificarEdad = false;
					
					//me faltó verificar que los atributos cumplieran con los requerimientos para calcular el TBM
					double tbm = null;
					
					if (verificarPeso == true) {
						if (verificarAltura== true) {
							if  (verificarEdad == true) {
								
								
							}
							
						}
						
					}
					System.out.println("La tasa metabolica basal (TMB) es: " + tbm);
					
					
				default:
					System.out.println("Los datos no incorrectos para calcular TBM");
				
		}
	}
	

}
