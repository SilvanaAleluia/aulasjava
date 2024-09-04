import java.util.Scanner;
public class aula2{    
    public static void main(String[]arg){
        Scanner leitorTxt = new Scanner(System.in);
         
        System.out.println ("Meu texto");
        System.out.println ("Meu texto");
        String nome = leitorTxt.nextLine();    
        System.out.println (nome);
        leitorTxt.close();   

}

}