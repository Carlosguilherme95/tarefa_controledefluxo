public class Main {
    int primitivo = 10;
    Integer wrapper = Integer.valueOf(primitivo);
    public static void main(String[] args) {
        Main primitivo = new Main();
        Main wrapper = new Main();
        System.out.println("numero primitivo: " + primitivo.primitivo);
        System.out.println("Convertido em wrapper: " + wrapper.wrapper);

    }
}