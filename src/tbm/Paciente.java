package tbm;

public class Paciente {
	private String genero;
	private double peso; //en kilogramos
	private double altura; //en centimetros
	private int edad; //en anios
	
	
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
					double tbm = 0.0;
					
					if (60 <= peso && peso <=110) {
						verificarPeso= true;
					}
					if (160 <= altura && altura <=195) {
						verificarAltura= true;
					}
					
						
					if  (edad > 15) {
						verificarEdad= true;
					}
					
					if (verificarEdad && verificarAltura && verificarPeso) {
						tbm = 88.362 + (13.397 * peso ) + (4.799 * altura) - (5.677 *edad);
					}
					
					System.out.println("La tasa metabolica basal (TMB) es: " + tbm);
				case "mujer":
					
					//verificar de las condiciones de peso, altura y edad
					boolean verificarPeso1 = false;
					boolean verificarAltura1 = false;
					boolean verificarEdad1 = false;
					
					//me faltó verificar que los atributos cumplieran con los requerimientos para calcular el TBM
					double tbm1 = 0.0;
					
					if (40 <= peso && peso <=80) {
						verificarPeso1= true;
					}
					if (140 <= altura && altura <=180) {
						verificarAltura1= true;
					}
					
						
					if  (edad > 15) {
						verificarEdad1= true;
					}
					
					if (verificarEdad1 && verificarAltura1 && verificarPeso1) {
						tbm = 447.593 + (9.247 * peso ) + (3.098 * altura) - (4.33 *edad);
					}
					System.out.println("La tasa metabolica basal (TMB) es: " + tbm1);
					
					
				default:
					System.out.println("Los datos no incorrectos para calcular TBM");
				
		}
	}
	

}
