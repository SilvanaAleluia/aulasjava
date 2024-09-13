import java.util.Random;
import java.util.Scanner;


public class aula2exj{
    public static void main(String[]args){;

    //Atribuindo os valores iniciais.            
    Random aleatorio = new Random();
    Scanner leitura = new Scanner(System.in);
    final int sorteio = aleatorio.nextInt(1,6);

    //Obtendo valores com o usuario.
    System.out.println("Digite um numero");
    int numero = leitura.nextInt(), pontuacao = 30;

    //Condição 1: Caso o numero alelatorio seja igual ao numero escolhido a mensagem sera"voce acertou"
    if (numero == sorteio){
        System.out.println("voce acertou");
        leitura.close();
        return;
    }

    //Condição 2: Caso o numero aleatorio seja (Diferente) ao numero esolhido será"Voçê perder 10 pontod esta com x ponto.
    else if {
         pontuacao = pontuacao - 10;
                           
            System.out.println("Voce perdeu " + 10  + " pontos e esta com " + pontuacao + "pontos!");
            leitura.close();


    }
            //Condição 3: Caso o numero aleatorio seja (diferente) ao numero escolhido a mensagem sera "Voce perder 10 pontos  e esta com x pontos.
            else if {
                pontuacao = pontuacao - 10;

                System.out.println("Voce perdeu " + 10 +" pontos e esta com "+ pontuacao + "pontos!");
                leitura.close();
            }  
        
    else {
        pontuacao = pontuacao - 10;

        System.out.println("Voce perdeu " + 10 +" pontos e esta com " + pontuacao + "pontos!");
        leia.close();
    
    }
 leitura. close()
    }
