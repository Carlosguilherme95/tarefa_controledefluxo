public class Carro {

    private int valor;
    private String nome;
    private String modelo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void cadastrarValor(int valor){
        setValor(valor);
    }
    public void cadastrarNome(String nome){
        setNome(nome);
    }
    public void cadastrarModelo(String modelo){
        setModelo(modelo);
    }
    public void mostrarValorCarro(){
        System.out.println("O Valor do carro é " + this.valor);
    }
    public void mostrarNomeCarro(){
        System.out.println("O Nome do carro é " + this.nome);
    }
    public void mostrarModeloCarro(){
        System.out.println("O Modelo do carro é " + this.modelo);
    }
}


