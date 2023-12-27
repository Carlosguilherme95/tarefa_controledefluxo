public class LendoOCarro {
    public static void main (String args[]){
        Carro valor = new Carro();
        valor.cadastrarValor(75000);


        Carro nome = new Carro();
        nome.cadastrarNome("Fiat Cronos");

        Carro modelo = new Carro();
        modelo.cadastrarModelo("Sedan");

        valor.mostrarValorCarro();
        nome.mostrarNomeCarro();
        modelo.mostrarModeloCarro();

    }
}
