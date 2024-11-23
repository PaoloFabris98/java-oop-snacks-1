import org.classes.*;

public class Main {
    public static void main(String[] args) {
        // Test della classe Studente
        System.out.println("### Test della classe Studente ###");
        Studente studente1 = new Studente("Mario", "Rossi", 25);

        System.out.println("Nome studente1: " + studente1.nameReturning());
        System.out.println("Cognome studente1: " + studente1.surnameReturning());
        System.out.println("Età studente1: " + studente1.ageReturning());
        System.out.println();

        Studente studente2 = new Studente("", "Verdi", -10);

        System.out.println("### Test della classe bankAccount ###");
        bankAccount account1 = new bankAccount();
        account1.setBalance(1000.00);
        System.out.println("Saldo account1 dopo deposito: " + account1.returnBalance());
        account1.setBalance(-500.00);
        System.out.println("Saldo account1 dopo prelievo: " + account1.returnBalance());
        account1.setBalance(-1000.00);
        System.out.println("Saldo account1 dopo prelievo non consentito: " + account1.returnBalance());
        System.out.println("Numero account1: " + account1.returnAccountNumber());
        System.out.println();

        System.out.println("### Test della classe StudentRegister ###");
        StudentRegister registro = new StudentRegister();
        registro.addStudent(studente1);
        registro.addStudent(new Studente("Luigi", "Bianchi", 22));
        registro.addStudent(new Studente("Anna", "Neri", 30));

        System.out.println("Elenco degli studenti nel registro:");
        for (Studente s : registro.getStudents()) {
            System.out.println(
                    "Nome: " + s.nameReturning() + ", Cognome: " + s.surnameReturning() + ", Età: " + s.ageReturning());
        }
    }
}
