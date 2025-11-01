public class ByteArrayExample {
    public static void main(String[] args) {
        byte[] nameBytes = {83, 104, 111, 117, 114, 121, 97, 32, 83, 105, 110, 103, 104};
        byte[] emailBytes = {115, 104, 111, 117, 114, 121, 97, 64, 103, 109, 97, 105, 108, 46, 99, 111, 109};

        String name = new String(nameBytes);
        String email = new String(emailBytes);

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
