package capitulo6;

import capitulo4.Data;

/* first question
Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe Funcionario. Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O que acontece?
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field funcionario.nome is not visible
	...
*/
public class principal {
	
	public static void main(String[] args){
		funcionario f1 = new funcionario();
		Data data = new Data();
		f1.getIdentificador();
		f1.setNome("Hugo");
		f1.setDepartamento("TI");
		f1.setSalario(1000);
		f1.setDataEntrada(data);
		f1.setRg("129.121.222-45");
		
		
		f1.recebeAumento(500);
		f1.mostra();
		System.out.println("Ganho anual:" + f1.calculaGanhoAnual());
	}
	
}
