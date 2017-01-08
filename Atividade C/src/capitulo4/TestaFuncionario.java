package capitulo4;

public class TestaFuncionario {
	
	public static void main(String[] args){
		funcionario f1 = new funcionario();
		Data data = new Data();
		f1.nome = "Hugo";
		f1.departamento = "TI";
		f1.salario = 1000;
		f1.dataEntrada = data;
		f1.rg = "129.121.222-45";
		//// Fourth question
		funcionario f2 = new funcionario();
		
		f2.nome = "Danilo";
		f2.departamento = "TI";
		f2.salario = 100;
		f2.dataEntrada = data;
		f2.rg = "123.555.888-99";
		
		funcionario f3 = new funcionario();
		
		f2.nome = "Danilo";
		f2.departamento = "TI";
		f2.salario = 100;
		f2.dataEntrada = data;
		f2.rg = "123.555.888-99";
		
		if (f2 == f3){
			
			System.out.println("iguais\n");
		} else {
			
			System.out.println("diferentes\n");
		}
		//######################################
		
		//Fifth question
		funcionario f4 = new funcionario();
		
		f2.nome = "Hugo";
		f2.departamento = "TI";
		f2.salario = 700;
		f2.dataEntrada = data;
		f2.rg = "345.950.123.12";
		
		funcionario f5 = f4;
		
		if (f4 == f5){
			
			System.out.println("iguais\n");
		} else {
			
			System.out.println("diferentes\n");
		}
		//######################################
		
		
		f1.recebeAumento(500);
		f1.mostra();
		System.out.println("Ganho anual:" + f1.calculaGanhoAnual());
		
		
	}
}
