package capitulo6;

import capitulo4.Data;

public class funcionario {
	private int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	/* forth question
	 * Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
	 * Pois ao criar um contrutor o construtor default padronizado por java deixa de ser chamado
	 */
	public funcionario(){
		this.identificador = this.identificador + 1;
	}
	public funcionario(String nome) {
		this.identificador = this.identificador + 1;
		this.nome = nome;
	}
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario * 12; 
	}
	
	public void mostra(){
		System.out.println("nome: " + this.nome +"\nDepartamento: "+ this.departamento +"\nSalario: "+ this.salario + this.dataEntrada.formatada() +"\nRG: "+ this.rg);  
	}
	
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public int getIdentificador(){
    	return identificador;
    }
    


}
