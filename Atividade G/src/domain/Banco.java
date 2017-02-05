package domain;

public class Banco {
    private static Banco instance;
    private Conta[] contas;

    private Banco(){
        this.contas = new Conta[100];
    }

    public static Banco getInstance(){
        if(Banco.instance == null)
            Banco.instance = new Banco();
        return Banco.instance;
    }

    public void adiciona(Conta c) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = c;
                return;
            }
        }
        System.out.println("Banco lotado!");
    }

    public Conta pegaConta(int indice) {
        return this.contas[indice];
    }

    public int pegaTotalDeContas(){
        for(int i = 0;i < contas.length;i++)
            if(contas[i]== null)
                return i-1;
        return -1;
    }
    }
