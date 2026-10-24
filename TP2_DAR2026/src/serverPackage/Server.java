package serverPackage;
import java.io.*;
import java.net.*;
import common.Calcul;

public class Server {
    static final String IP_SERVEUR = "192.168.0.86"; // adresse IP de la machine serveur
    static final int PORT = 1234;
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        InetAddress adresseIp = InetAddress.getByName(IP_SERVEUR);
        InetSocketAddress adresseServeur = new InetSocketAddress(adresseIp, PORT);
        ServerSocket sk = new ServerSocket();
        sk.bind(adresseServeur);
        System.out.println("Je suis un serveur en attente la connexion d'un client ");
        Socket s = sk.accept();
        System.out.println("un client est connecté" + s.getInetAddress());

        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());

        while(true) {
            Calcul c=(Calcul)in.readObject();
            if (c.getOp().equals("E")){
                System.out.println("Closing connection...");
                break;
            }
            double first = c.getX();
            double second = c.getY();
            double resultat;

            switch (c.getOp()) {
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
            out.flush();
        }
        in.close();
        out.close();
        s.close();
        sk.close();
    }
}
