public class Automovel {
    int ano;
    String tipo;
    int qtdRodas;
    int velocidadeMax;
    boolean estaLigado = false;

    public void ligar(){
        estaLigado = true;
        System.out.println("vruuuum");
    }

    public void desligar(){
        estaLigado = false;
    }
}
