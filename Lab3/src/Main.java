import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose encryption method:");
        System.out.println("1. AES");
        System.out.println("2. DES");
        System.out.println("3. Caesar Cipher");

        int choice = scanner.nextInt();
        scanner.nextLine();
        EncryptionStrategy strategy;

        switch (choice) {
            case 1:
                strategy = new AesEncryption();
                break;
            case 2:
                strategy = new DesEncryption();
                break;
            case 3:
                System.out.println("Enter shift value for Caesar Cipher:");
                strategy = new CaesarCipher();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        EncryptionProcess service = new EncryptionProcess(strategy);

        System.out.println("Enter File Path:");
        String inputFIlePath = scanner.nextLine();

        System.out.println("Enter Encrypted File Path:");
        String EncryptedFIlePath = scanner.nextLine();

        service.encryption(inputFIlePath,EncryptedFIlePath);
        service.decryption(EncryptedFIlePath);
    }
}