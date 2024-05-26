package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	//Classe principa main
	public static void main(String[] args) {

	analisar(1600.0);
	analisar(2000.0);
	analisar(2500.0);
	selecaoCandidatos();
	imprimir();
}//fechamento do main
	
	
	public static void imprimir() {
		 String[] canditados = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio", "Gustavo","Thaila"};
for(int indice=0;indice<canditados.length;indice++) {
	System.out.println("O indice é "+indice+" nome do candidato "+canditados[indice]);
}
for(String candidato:canditados) {
	System.out.println("Forma Abreviada "+ candidato);
}
	}
	
	
	
	//inicio do metodo de seleção de candidatos
 static void selecaoCandidatos() {
	 String[] canditados = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio", "Gustavo","Thaila"};
			 int candidatoSelecionados = 0;
			 int candidatoAtual=0;
			 double salarioBase = 2000.0;
	 	while(candidatoSelecionados<5 && candidatoAtual< canditados.length ) {
	 		String candidato = canditados[candidatoAtual];
	 				double salarioAtual=valorPretendido();
	 				System.out.println("nome "+candidato+" valor"+salarioAtual);
	 				
	 				//inicio if
	 				if(salarioBase>salarioAtual) {
	 					System.out.println("voce foi selecionado !!!!!!!"+candidato);
	 		candidatoSelecionados++;
	 		}//fechamento do if
	 				candidatoAtual++;
	 	} //fechamento do While
 }	//fechamento do metodo seleção
	 		
	 			
	 	public static double valorPretendido(){
	 return ThreadLocalRandom.current().nextDouble(1000,2500);
 }
	 	
 
 public static void analisar(double salarioPretendido){
	 double salarioBase = 2000;
	 if(salarioBase>salarioPretendido) {
	 System.out.println("LIGAR PARA O CANDIDATO");
	 
	 }else if(salarioBase==salarioPretendido) {
		 System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
	 }else {
		 System.out.println("AGUARDANDO RESULTADO PARA DEMAIS CANDIDATOS");
	 }
 }
}
