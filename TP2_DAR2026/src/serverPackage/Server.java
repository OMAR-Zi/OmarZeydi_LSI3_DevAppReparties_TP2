package serverPackage;
import java.io.*;
import java.net.*;
public class Server {
    static final String IP_SERVEUR = "192.168.0.86"; // adresse IP de la machine serveur
    static final int PORT = 1234;
    public static void main(String[] args) throws IOException {
        InetAddress adresseIp = InetAddress.getByName(IP_SERVEUR);
        InetSocketAddress adresseServeur = new InetSocketAddress(adresseIp, PORT);
        ServerSocket sk = new ServerSocket();
        sk.bind(adresseServeur);
        System.out.println("Je suis un serveur en attente la connexion d'un client ");
        Socket s = sk.accept();
        System.out.println("un client est connecté" + s.getInetAddress());
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        while(true) {
            String op = in.readUTF();
            if (op.equals("E")){
                System.out.println("Closing connection...");
                break;
            }
            double first = in.readDouble();
            double second = in.readDouble();
            double resultat;

            switch (op) {
                case "+":
                    resultat = first + second;
                    break;
                case "-":
                    resultat = first - second;
                    break;
                case "*":
                    resultat = first * second;
                    break;
                case "/":
                    resultat = first / second;
                    break;
                default:
                    resultat = 0;
            }
            out.writeDouble(resultat);
        }

        s.close();
        sk.close();
    }
}
