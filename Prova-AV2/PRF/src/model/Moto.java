package model;


public class Moto extends Veiculo implements Documentação{
	
	private String Placa;
	private String Modelo;
	private String Cor;
	private Long Ano;
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public Long getAno() {
		return Ano;
	}
	public void setAno(Long ano) {
		Ano = ano;
	}
		
	
	@Override
	public void Documentacao(){
		
		System.out.printf("Placa:%s \n", this.getPlaca());
		System.out.printf("Tipo:%s \n", this.getTipo());
		System.out.printf("Modelo:%s \n",this.getModelo());
		System.out.printf("Cor:%s \n", this.getCor());
		System.out.printf("Ano:%d \n", this.getAno());
	
	
	}
	
	
	
}

