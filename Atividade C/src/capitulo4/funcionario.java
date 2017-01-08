package capitulo4;
public class funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public Data dataEntrada;
	public String rg;
	
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12; 
	}
	
	public void mostra(){
		System.out.println("nome: " + this.nome +"\nDepartamento: "+ this.departamento +"\nSalario: "+ this.salario + this.dataEntrada.formatada() +"\nRG: "+ this.rg);
		//Seventh question
		System.out.println("Dia: " + this.dataEntrada.dia);
	    System.out.println("Mês: " + this.dataEntrada.mes);
	    System.out.println("Ano: " + this.dataEntrada.ano);
	    /*O que acontece se chamarmos o método mostra antes de atribuirmos uma data para este Funcionario?
	    OS valores apresentados são 0 para dia mes e ano.*/
	    //Eighth question
	    /*O que acontece se você tentar acessar um atributo diretamente na classe?
	    	Faz sentido perguntar para o esquema do Funcionario seu valor anual?
	    O codigo se torna inutil pois nao faz sentido chamar a propria classe e atributos sem criar um objeto antes.*/  
	}

}
