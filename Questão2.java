import java.util.Scanner;
public class Questão2{
    public static void main(String[] args) {
        
        int [] posicoes;
        posicoes = new int[5];


        Scanner sc=new Scanner(System.in);
        for (int cont = 0; cont < posicoes.length;cont ++){
            System.out.println("digite a posição "+ (cont + 1));  
            posicoes[cont]=sc.nextInt();
            for (int posi = 0; posi < posicoes.length;posi ++){

                System.out.println("A posição "+(posi+1)+" é de: " +posicoes[posi]);
            }
            }
    }
}