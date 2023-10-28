public class Main {
    public static void main(String[] args) {
        Wizard wiz = new Wizard();
        Knight kng = new Knight();

        System.out.println(wiz);
        System.out.println(kng);
        wiz.attack(kng);
        System.out.println(wiz);
        System.out.println(kng);
    }
}