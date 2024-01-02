public class Main {

    public static void main(String[] args) {
        float nota1 = 7;
        float  nota2 = 5;
        float  nota3 = 8;
        float  nota4 = 10;
        float  mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if(mediaFinal >= 7){
            System.out.println("Aprovado");
        } else if (mediaFinal >= 5) {
            System.out.println("Recuperação");
        } else System.out.println("Reprovado");
    }
}