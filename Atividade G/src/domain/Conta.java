package domain;

/* Questao 1 - Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que métodos seriam interessantes candidatos a serem abstratos?
 * Pois assim garantimos que teremos apenas Contas com com as modalidades corrente e poupança 
 * sem instanciar uma conta arbitraria sem modalidade.
 * Apenas o método atualiza. pois para cada conta apartir deste momento instanciavel tem uma forma diferente de atualizar e com a classe
 * sendo abstrata o método teria uma implementação inutil.  
 * 
 * Questão 5 - Existe outra maneira de a classe ContaCorrente compilar se você não reescrever o método abstrato?
 * Não. Ao tornarmos um metodo abstrato na SuperClasse é obrigatório a reescrita nas classes filhas.
 * 
 * Questão 6 - Pra que ter o método atualiza na classe Conta se ele não faz nada? O que acontece se simplesmente apagarmos esse método da classe Conta e deixarmos o método atualiza nas filhas?
 * Para que ao instaciarmos as contas como do tipo Conta, o programa reconheça o metodo implementado nas Classes filhas. 
 * O programa incide em erro.Teriamos de instanciar as Contas com base nos seus respectivos tipos, com o custo de reimplementar a Classe "Atualizador de Contas" também.
 *
 * Questão Desafio- Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo?
 * Pois serão cridos espaços de memoria para [10]Contas, ou seja um array de "contas" onde não há instanciação para uma Conta e sim criação de vagas para contas,
 * no caso, que poderão ser Conta Corrente ou Poupança.
 * */

public abstract class Conta {
    protected double saldo;

    public abstract void atualiza(double taxa);


    public void deposita(double valor) {

        this.saldo += valor;
    }

    public void saca(double valor) {

        this.saldo -= valor;
    }

    public double getSaldo() {

        return this.saldo;
    }
}
