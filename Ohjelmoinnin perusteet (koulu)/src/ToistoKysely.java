import java.util.Scanner;
 
public class ToistoKysely {
           public static void main(String[] args) {
                      
                      Scanner sc = new Scanner(System.in);
                      
                      String user;
                      String pw;
                      String userConf;
                      String pwConf;
                      
                      System.out.print("Anna käyttäjänimi: ");
                      user = sc.next();
                      System.out.print("Anna salasana: ");
                      pw = sc.next();
                      
                      do {
                                 System.out.println("\n\nAnna käyttäjänimi ja salasana uudelleen\n\n");
                                 System.out.print("Käyttäjä: ");
                                 userConf = sc.next();
                                 System.out.print("Salasana: ");
                                 pwConf = sc.next();
                                 
                                 System.out.println();
                                 
                      } while (!user.equals(userConf) || !pw.equals(pwConf));
                      
                      if (user.equals(userConf) && pw.equals(pwConf)) {
                                 System.out.println("Oikein meni!");
                      }
            }
}