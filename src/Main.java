import org.classes.*;

public class Main {
    public static void main(String[] args) {
        Studente p = new Studente("ciao", "cazzone", 101);
        System.out.println(p.nameReturning());

        bankAccount a = new bankAccount();
        a.setBalance(500.00);
        System.out.println(a.returnBalance());
        a.setBalance(-1500.00);
        System.out.println(a.returnBalance());

    }
}
