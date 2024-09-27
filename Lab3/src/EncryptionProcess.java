import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncryptionProcess {
    private EncryptionStrategy encryptionStrategy;

    public EncryptionProcess(EncryptionStrategy encryptionStrategy){
        this.encryptionStrategy = encryptionStrategy;
    }
    public void encryption(String inputFilePath,String outputFilePath){
       try {
           String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));
           String encrypted = encryptionStrategy.Encrypt(content);
           Files.write(Paths.get(outputFilePath), encrypted.getBytes());
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
    public void decryption(String inputFilePath){

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));
            String decrypted = encryptionStrategy.Decrypt(content);
            System.out.println(decrypted);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
