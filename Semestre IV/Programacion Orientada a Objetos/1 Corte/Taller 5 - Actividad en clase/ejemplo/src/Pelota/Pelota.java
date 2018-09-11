package Pelota;

public class Pelota {
	
	
	//Atributos
	
	float radio;
	float peso;
	String color;
	
	public Pelota() {
		 
		radio = 100;
		peso = 250;
		color = "verde clarito"; 
		
	}
	
	
	public Pelota(float radio, float peso,String color) {
		this.radio = radio;
		this.peso = peso;
		this.color = color;
	}
	//Metodo
	public float ObtenerRadio() {
		return radio;
	}
	public float ObtenerPeso() {
		return peso;
	}
	public String ObtenerColor() {
		return color;
	}
	public void PatearPelota() {
		System.out.println("Haz pateado la pelota");
	}
	
	public void AtraparPelota() {
		System.out.println("Se ha pateado la pelota");
	}
	
}