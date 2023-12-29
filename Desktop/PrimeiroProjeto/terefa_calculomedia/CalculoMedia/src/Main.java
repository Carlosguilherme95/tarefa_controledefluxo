public class Main {

    Float nota1 = 7f;
    Float nota2 = 8.5f;
    Float nota3 = 7.7f;
    Float nota4 = 5.5f;
    Float media = (nota1 + nota2 + nota3 + nota4) / 4;

    public static void main(String args[]){
        Main instance = new Main();
       instance.printMedia();
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(Float nota4) {
        this.nota4 = nota4;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public void printMedia(){
        System.out.println("**********************");
        System.out.println("Nota 1: "+nota1 );
        System.out.println("Nota 2: "+nota2 );
        System.out.println("Nota 3: "+nota3 );
        System.out.println("Nota 4: "+nota4 );
        System.out.println("Média final: " +media);
        System.out.println("**********************");
    }
}




