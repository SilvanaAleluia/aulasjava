import java.util.Scanner;
public class aula3 {

    public static void main(String[] args) {
       Scanner leitorTxt = new Scanner(System.in);        
       System.out.println("Digite o nome completo do 1° funcionario:\n");
        String nome1 = leitorTxt.nextLine();

        System.out.println("Digite o nome completo do 2° funcionario:\n");
        String nome2 = leitorTxt.nextLine();

        System.out.println("Digite o nome completo do 3° funcionario:\n");
        String nome3 = leitorTxt.nextLine();   

        System.out.println("Digite o nome completo do 4° funcionario:\n");
        String nome4 = leitorTxt.nextLine();

        System.out.println("Digite o nome completo do 5° funcionario:\n");
        String nome5 = leitorTxt.nextLine();
        
        System.out.println("Os nomes respectvamente sao: " + nome1 + "" +
        nome2 +
        nome3 +
        nome4 + 
        nome5);

        
    }
    
}
