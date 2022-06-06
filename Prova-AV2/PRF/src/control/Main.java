package control;

import java.util.Scanner;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {
	
	public static void main(String[] args) {
		
		Veiculo carros = new Veiculo();
		Veiculo motos = new Veiculo();
		
///////////////////////////////////////////////////////////CARROS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\		
		
		Carro carro1 = new Carro();
		carro1.setPlaca("AYU6460");
		carro1.setTipo("Sedan");
		carro1.setModelo("Renalt-Logan");
		carro1.setCor("Marrom");
		carro1.setAno((long) 2015);
		carros.getCarros().add(carro1);
		carros.getSedans().add(carro1);
		
		Carro carro2 = new Carro();
		carro2.setPlaca("KGB3269");
		carro2.setTipo("Sedan");
		carro2.setModelo("Chevrolet-Onix");
		carro2.setCor("Vermelho");
		carro2.setAno((long) 2018);
		carros.getCarros().add(carro2);
		carros.getSedans().add(carro2);
		
		Carro carro3 = new Carro();
		carro3.setPlaca("RJJ5548");
		carro3.setTipo("Sedan");
		carro3.setModelo("Fiat-Grand Siena");
		carro3.setCor("Prata");
		carro3.setAno((long) 2020);
		carros.getCarros().add(carro3);
		carros.getSedans().add(carro3);
		
		Carro carro4 = new Carro();
		carro4.setPlaca("ZPA3245");
		carro4.setTipo("SUV");
		carro4.setModelo("Jeep-Compass");
		carro4.setCor("Azul");
		carro4.setAno((long) 2021);
		carros.getCarros().add(carro4);
		carros.getSUVs().add(carro4);
		
		Carro carro5 = new Carro();
		carro5.setPlaca("YJG9985");
		carro5.setTipo("SUV");
		carro5.setModelo("Fiat-Pulse");
		carro5.setCor("Amarelo");
		carro5.setAno((long) 2021);
		carros.getCarros().add(carro5);
		carros.getSUVs().add(carro5);
	
///////////////////////////////////////////////////////////MOTOS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		Moto moto1 = new Moto();
		moto1.setPlaca("PDJ0402");
		moto1.setTipo("Scooter");
		moto1.setModelo("Honda-Biz");
		moto1.setCor("Vermelho");
		moto1.setAno((long) 2017);
		motos.getMotos().add(moto1);
		motos.getScooters().add(moto1);
		
		Moto moto2 = new Moto();
		moto2.setPlaca("KYQ4087");
		moto2.setTipo("Esportiva");
		moto2.setModelo("BMW-S 1000 RR");
		moto2.setCor("Preto");
		moto2.setAno((long) 2020);
		motos.getMotos().add(moto2);
		motos.getEsportivas().add(moto2);
		
		Moto moto3 = new Moto();
		moto3.setPlaca("PMB2109");
		moto3.setTipo("Scooter");
		moto3.setModelo("Honda-Shineray");
		moto3.setCor("Azul");
		moto3.setAno((long) 2012);
		motos.getMotos().add(moto3);
		motos.getScooters().add(moto3);
		
///////////////////////////////////////////////IMPRESSÃO NA TELA\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
		
		Scanner scan = new Scanner(System.in);{
			int escolha_VeiculoEspecie = 0 ;
			int escolha_VeiculoTipo = 0 ;
			String escolha_VeiculoPlaca ;
		
		System.out.print("POLÍCIA RODÓVIARIA FEDERAL \n");
		System.out.print("Registro Digital de Veículos \n");
		System.out.print("Pátio de Garanhuns \n");
		System.out.format("\n");
		System.out.printf("Escolha a espécie de veiculo que deseja verificar: \n");
		System.out.printf("1- Carros  \n");
		System.out.printf("2- Motos  \n");
		escolha_VeiculoEspecie = scan.nextInt();

		switch (escolha_VeiculoEspecie) {
		
					case 1: 
						
						System.out.printf("Escolha o tipo de veiculo que deseja verificar: \n");
						System.out.printf("1- Sedan  \n");
						System.out.printf("2- SUV  \n");
						System.out.printf("0- Exibir todos os Veiculos  \n");
						escolha_VeiculoTipo = scan.nextInt();
						
						switch (escolha_VeiculoTipo) {
						
						case 1:
							carros.ListarSedans(); //Lista de todos os sedans
							
							System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
							escolha_VeiculoPlaca = scan.nextLine();
							escolha_VeiculoPlaca = scan.nextLine();
							
									switch (escolha_VeiculoPlaca) {
											
											case "AYU6460":
												carro1.Documentacao();
												break;
												
											case "KGB3269":
												carro2.Documentacao();
												break;
												
											case "RJJ5548":
												carro3.Documentacao();
												break;
												
											default: 
												System.out.print("Veiculo/placa inexistênte");			
									}
											break;
							
						case 2:
							carros.ListarSUVs(); //Lista de todos os SUV´S
							
							System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
							escolha_VeiculoPlaca = scan.nextLine();
							escolha_VeiculoPlaca = scan.nextLine();
							
									switch (escolha_VeiculoPlaca) {
											
											case "ZPA3245":
												carro4.Documentacao();
												break;
											case "YJG9985":
												carro5.Documentacao();
												break;
												
											default: 
												System.out.print("Veiculo/placa inexistênte");	
												break;
							}
							break;
							
						case 0:
							carros.ListarCarros(); //Lista de todos os carros no sistema
							
							System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
							escolha_VeiculoPlaca = scan.nextLine();
							escolha_VeiculoPlaca = scan.nextLine();
							
									switch (escolha_VeiculoPlaca) {
											
											case "AYU6460":
												carro1.Documentacao();
												break;
												
											case "KGB3269":
												carro2.Documentacao();
												break;
												
											case "RJJ5548":
												carro3.Documentacao();
												break;
												
											case "ZPA3245":
												carro4.Documentacao();
												break;
											case "YJG9985":
												carro5.Documentacao();
												break;
												
											default: 
												System.out.print("Veiculo/placa inexistênte");
												break;	
									}
					}
					break;
			
				case 2:
						
					System.out.printf("Escolha o tipo de veiculo que deseja verificar: \n");
					System.out.printf("1- Scooter  \n");
					System.out.printf("2- Esportiva  \n");
					System.out.printf("0- Exibir todos os Veiculos  \n");
					escolha_VeiculoTipo = scan.nextInt();
					
					switch (escolha_VeiculoTipo) {
					
					case 1:
						
						motos.ListarScooters();
						
						System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
						escolha_VeiculoPlaca = scan.nextLine();
						escolha_VeiculoPlaca = scan.nextLine();
						
								switch (escolha_VeiculoPlaca) {
										
										case "PDJ0402":
											moto1.Documentacao();
											break;
											
										case "PMB2109":
											moto3.Documentacao();
											break;
											
										default: 
											System.out.print("Veiculo/placa inexistênte");			
								}
								break;
					
					case 2:
						
						motos.ListarEsportivas();
						
						System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
						escolha_VeiculoPlaca = scan.nextLine();
						escolha_VeiculoPlaca = scan.nextLine();
								
								switch (escolha_VeiculoPlaca) {
								
										case "KYQ4087":
											moto2.Documentacao();
											break;
											
										default: 
											System.out.print("Veiculo/placa inexistênte");			

										}
					case 0:
						motos.ListarMotos();
						
						System.out.printf("Para ver a documentação do veiculo digite a placa referentea ele: \n");
						escolha_VeiculoPlaca = scan.nextLine();
						escolha_VeiculoPlaca = scan.nextLine();
								
						switch (escolha_VeiculoPlaca) {
						
								case "PDJ0402":
									moto1.Documentacao();
									break;
									
								case "PMB2109":
									moto3.Documentacao();
									break;
									
								case "KYQ4087":
									moto2.Documentacao();
									break;
									
								default: 
									System.out.print("Veiculo/placa inexistênte");
									break;	
						}
						
					default: 
						System.out.print("Opção inexistênte");	
						break;
								}
								break;
					
				default: 
					System.out.print("Opção inexistênte");	
					break;
				} 
		
		
		
		
		scan.close();}
		
		
	}

}
