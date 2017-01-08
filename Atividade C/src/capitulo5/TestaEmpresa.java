package capitulo5;

public class TestaEmpresa {
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		empresa.empregados = new funcionario[10];
		int pos = 0;
		
		funcionario f1 = new funcionario();
		f1.nome = "Hugo";
		f1.departamento = "TI";
		f1.salario = 1000;
		f1.rg = "129.121.222-45";
		
		funcionario f2 = new funcionario();
		
		f2.nome = "Danilo";
		f2.departamento = "TI";
		f2.salario = 100;
		f2.rg = "123.555.888-99";
		
		empresa.adiciona(f1, pos);
		pos++;
		empresa.adiciona(f2, pos);
		pos++;
		
		empresa.mostraEmpregados();
		if(empresa.contem(f1, pos)==true)
			System.out.println("Funcionario alocado");
		else
			System.out.println("Funcionario nao alocado");
		
	}

}
