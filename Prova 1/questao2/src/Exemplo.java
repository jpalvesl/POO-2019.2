public class Exemplo {
    public static int contador = 0;
    private int num_conta;

    // como exemplo uma conta de banco que se auto incremento evitando numeros repetidos
    public Exemplo() {
        this.num_conta = ++contador;
    }
}
