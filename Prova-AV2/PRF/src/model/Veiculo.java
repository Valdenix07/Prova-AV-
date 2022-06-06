package model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	
	private String Tipo;
	private List<Carro> carros = new ArrayList<>();
	private List<Carro> Sedans = new ArrayList<>();
	private List<Carro> SUVs = new ArrayList<>();
	private List<Moto> motos = new ArrayList<>();
	private List<Moto> scooters = new ArrayList<>();
	private List<Moto> esportivas = new ArrayList<>();
	
	
///////////////////////////////////////////////////////////Atributos\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
			
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String tipo) {
			Tipo = tipo;
		}
		
		public List<Carro> getCarros() {
			return carros;
		}
		public void setCarros(List<Carro> carros) {
			this.carros = carros;
		}
		
		public List<Moto> getMotos() {
			return motos;
		}
		public void setMotos(List<Moto> motos) {
			this.motos = motos;
		}
		
/////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		//Listas Dos Carros
		
		
		public void ListarCarros() {
			
			for (Carro carro : this.carros) {
				System.out.printf("Placa:%s \n", carro.getPlaca());
				System.out.printf("Modelo:%s \n", carro.getModelo());
				System.out.format("\n");
		

			}
		}
			public void ListarSedans() {
				
				for (Carro sedan : this.Sedans) {
					System.out.printf("Placa:%s \n", sedan.getPlaca());
					System.out.printf("Modelo:%s \n", sedan.getModelo());
					System.out.format("\n");
				}
		}
			
		public void ListarSUVs() {
				
				for (Carro suvs : this.SUVs) {
					System.out.printf("Placa:%s \n", suvs.getPlaca());
					System.out.printf("Modelo:%s \n", suvs.getModelo());
					System.out.format("\n");
				}
		}	
		
		public List<Carro> getSedans() {
			return Sedans;
		}
		public void setSedans(List<Carro> sedans) {
			Sedans = sedans;
		}
		public List<Carro> getSUVs() {
			return SUVs;
		}
		public void setSUVs(List<Carro> sUVs) {
			SUVs = sUVs;
		}
		
//////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		// Listas Dos Carros
		
		public void ListarMotos() {
			
			for (Moto moto : this.motos) {
				System.out.printf("Placa:%s \n", moto.getPlaca());
				System.out.printf("Tipo:%s \n", moto.getTipo());
				System.out.printf("Modelo:%s \n", moto.getModelo());
				System.out.printf("Ano:%d \n", moto.getAno());
				System.out.format("\n");
				}
		}
		public List<Moto> getScooters() {
			return scooters;
		}
		public void setScooters(List<Moto> scooters) {
			this.scooters = scooters;
		}
		public List<Moto> getEsportivas() {
			return esportivas;
		}
		public void setEsportivas(List<Moto> esportivas) {
			this.esportivas = esportivas;
		}
		
		public void ListarScooters() {
			
			for (Moto scooters : this.scooters) {
				System.out.printf("Placa:%s \n", scooters.getPlaca());
				System.out.printf("Modelo:%s \n", scooters.getModelo());
				System.out.format("\n");
			}
	}
		
		public void ListarEsportivas() {
			
			for (Moto esportivas : this.esportivas) {
				System.out.printf("Placa:%s \n", esportivas.getPlaca());
				System.out.printf("Modelo:%s \n", esportivas.getModelo());
				System.out.format("\n");
			}
	}
		
}
