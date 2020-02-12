public class Main {
    public static void main(String[] args) {
        Exemplo o = new Exemplo();
        System.out.println("Exemplo.contador = " + Exemplo.contador);
        o = new Exemplo();
        System.out.println("Exemplo.contador = " + Exemplo.contador);
    }
}
