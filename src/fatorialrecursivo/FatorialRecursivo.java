package fatorialrecursivo;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class FatorialRecursivo {
   
    
public static int calculaFatorial(int num){
        
        if (num <= 1){
            
            return 1;

        }else{
            return calculaFatorial (num-1)*num;
        }
    }
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcular o fatorial: "));
        System.out.println("O fatorial é: " + calculaFatorial(numero));
    }   
}


/*
public class FatorialRecursivo {
    
    public static int fatorial(int num) {

        if (num <= 1) {
            return 1;
        } else {
            return fatorial(num - 1) * num;
        }
    }
    
    public static void main(String[] args) {
        
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número que você pretende obter o fatorial.");
        numero = entrada.nextInt();
        System.out.println("O fatorial de " + numero + " é " + fatorial(numero) + ".");
    }
}
*/