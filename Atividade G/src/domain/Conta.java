package domain;

/* Questao 1 - Repare que a nossa classe Conta � uma excelente candidata para uma classe abstrata. Por qu�? Que m�todos seriam interessantes candidatos a serem abstratos?
 * Pois assim garantimos que teremos apenas Contas com com as modalidades corrente e poupan�a 
 * sem instanciar uma conta arbitraria sem modalidade.
 * Apenas o m�todo atualiza. pois para cada conta apartir deste momento instanciavel tem uma forma diferente de atualizar e com a classe
 * sendo abstrata o m�todo teria uma implementa��o inutil.  
 * 
 * Quest�o 5 - Existe outra maneira de a classe ContaCorrente compilar se voc� n�o reescrever o m�todo abstrato?
 * N�o. Ao tornarmos um metodo abstrato na SuperClasse � obrigat�rio a reescrita nas classes filhas.
 * 
 * Quest�o 6 - Pra que ter o m�todo atualiza na classe Conta se ele n�o faz nada? O que acontece se simplesmente apagarmos esse m�todo da classe Conta e deixarmos o m�todo atualiza nas filhas?
 * Para que ao instaciarmos as contas como do tipo Conta, o programa reconhe�a o metodo implementado nas Classes filhas. 
 * O programa incide em erro.Teriamos de instanciar as Contas com base nos seus respectivos tipos, com o custo de reimplementar a Classe "Atualizador de Contas" tamb�m.
 *
 * Quest�o Desafio- N�o podemos dar new em Conta, mas por que, ent�o, podemos dar new em Conta[10], por exemplo?
 * Pois ser�o cridos espa�os de memoria para [10]Contas, ou seja um array de "contas" onde n�o h� instancia��o para uma Conta e sim cria��o de vagas para contas,
 * no caso, que poder�o ser Conta Corrente ou Poupan�a.
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
