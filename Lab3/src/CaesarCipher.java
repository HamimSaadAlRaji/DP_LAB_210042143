public class CaesarCipher implements EncryptionStrategy {

    private int shift;

    public CaesarCipher() {
        this.shift = 3;  // Default shift value
    }

    @Override
    public String Encrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isUpperCase(character)) {
                char shifted = (char) ((character + shift - 'A') % 26 + 'A');
                result.append(shifted);
            } else if (Character.isLowerCase(character)) {
                char shifted = (char) ((character + shift - 'a') % 26 + 'a');
                result.append(shifted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    @Override
    public String Decrypt(String data) {
        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (Character.isUpperCase(character)) {
                char shifted = (char) ((character - shift - 'A' + 26) % 26 + 'A');
                result.append(shifted);
            } else if (Character.isLowerCase(character)) {
                char shifted = (char) ((character - shift - 'a' + 26) % 26 + 'a');
                result.append(shifted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
