import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        System.out.println("Digite o primeiro numero: ");
           num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
           num2 = scan.nextDouble();
        System.out.println("Digite o operador:(+, -, /, *) ");
           operador = scan.next().charAt(0);
           
           switch (operador) {
            case '+':
            resultado = num1 + num2;

            System.out.println("resultado: " + resultado);

            break;
           
            case '-':
            resultado = num1 - num2;

            System.out.println("resultado: " + resultado);
                break;
            
            case '*':
                    resultado = num1 * num2;
        
                    System.out.println("resultado: " + resultado);
                        break;
           
           case '/':
            if (num2 != 0 ) {
            resultado = num1 / num2;
    
                System.out.println("resultado: " + resultado);
            }
            else{
                System.out.println("Erro: divisão por zero não é permitida.");
            }
            break;
            default:
            System.out.println("Operador invalido.");
            
            break;
            }
            
            scan.close();
    }

}
