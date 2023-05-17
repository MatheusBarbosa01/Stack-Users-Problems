
public class Main {
    public static void main(String[] args) {
        Users nome = new Users("Matheus");
        nome.addActions("A");
        nome.addActions("B");
        nome.addActions("C");
        nome.addActions("D");
        nome.addActions("E");
        nome.addActions("F");
        nome.addActions("G");
        nome.addActions("H");
        nome.addActions("I");
        nome.addActions("J");
        nome.addActions("K");
        nome.addActions("L");
        nome.addActions("M");
        nome.addActions("N");
        nome.addActions("O");
        nome.addActions("P");
        nome.addActions("Q");
        nome.DelActions(16);

        nome.showActions();
    }
}