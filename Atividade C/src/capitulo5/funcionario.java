package capitulo5;

import capitulo4.Data;

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
	}

}

class Empresa{
	public String nome;
	public String cnpj;
	public funcionario[]  empregados;
	
	public void adiciona(funcionario f,int pos){
		
		if(this.empregados[pos] == null){
			this.empregados[pos] = f;
			}
		else
			System.out.println("ERRO! Vaga ja preenchida\n");
	
	}
	
	public void mostraEmpregados(){
		for(int i = 0; i < this.empregados.length;i++){
			if(this.empregados[i]!=null)
				System.out.println("Funcionario na posicao: " +i + " Nome: " + this.empregados[i].nome + " Salario: " + this.empregados[i].salario);
		}
	}
	
	public boolean contem(funcionario f,int pos){
		
		for(int i = 0; i <= pos ;i++)
			if(this.empregados[i].rg == f.rg)
				return true;
		
			return false;
	}
	
	
}