public class Moto extends Automovel{
    public Moto(){
        tipo = "Moto";
        qtdRodas = 2;
    }

    public void ligar(){
        estaLigado = true;
        System.out.println("randandam!");
    }
}

