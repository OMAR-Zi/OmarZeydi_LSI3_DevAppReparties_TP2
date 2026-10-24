package clientPackage;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Scanner;

public class Client {
    static final String IP_SERVEUR = "192.168.0.86"; // adresse IP de la machine serveur
    static final int PORT = 1234;

    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);

        InetAddress adresseIp = InetAddress.getByName(IP_SERVEUR);
        InetSocketAddress adresseServeur = new InetSocketAddress(adresseIp, PORT);
        System.out.println("Je suis un client pas encore connecté…");
        Socket s = new Socket();
        s.connect(adresseServeur, 5000);
        System.out.println("je suis un client connecté à " + IP_SERVEUR + ":" + PORT);

        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream());
        String op;
        while (true) {
            do {
                System.out.print("Operator (+ - * /, E to exit): ");
                op = scanner.next();
            } while (!op.equals("E") && !List.of("+", "-", "*", "/").contains(op));

            out.writeUTF(op);
            if (op.equals("E")) break;

            System.out.print("First number: ");
            double first = scanner.nextDouble();

            double second;
            do {
                System.out.print("Second number: ");
                second = scanner.nextDouble();
                if (op.equals("/") && second == 0) {
                    System.out.println("Cannot divide by zero.");
                }
            } while (op.equals("/") && second == 0);

            out.writeDouble(first);
            out.writeDouble(second);
            System.out.println("Résultat : " + in.readDouble());
        }
        s.close();
        scanner.close();
    }
}
