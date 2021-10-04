public class Principal {
    public static void main(String [] args){
        System.out.println("1- Orientação de Objetos!");

        Carro carro = new Carro();
        carro.cor = "Preto";
        carro.marca = "Fiat";
        carro.modelo = "Uno 2013";
        carro.ano = 2013;
        carro.velocidadeMax = 180;
        carro.qtdRodas = 4;
        System.out.println(carro.tipo+" é um "+carro.marca+" "+carro.modelo+" "+carro.cor+" "
                +carro.ano+" "+carro.tipo+" "+carro.velocidadeMax);

        Carro carro2 = new Carro();
        carro2.cor = "Branco";
        carro2.marca = "Ford";
        carro2.modelo = "Ka 2012";
        carro.ano = 2013;
        carro.velocidadeMax = 180;
        carro.qtdRodas = 4;

        System.out.println(carro2.tipo+" é um "+carro2.marca+" "+carro2.modelo+" "+carro2.cor+" "
                +carro2.ano+" "+carro2.tipo+" "+carro2.velocidadeMax);

        carro2.ligar();
        carro2.desligar();

        System.out.println(carro2.estaLigado);

        Moto moto1 = new Moto();
        moto1.velocidadeMax = 200;
        moto1.ano = 2019;
        System.out.println(moto1.qtdRodas);
        System.out.println(moto1.tipo);
        System.out.println(moto1.velocidadeMax);
        System.out.println(moto1.ano);

        moto1.ligar();
        moto1.desligar();

    }
}
