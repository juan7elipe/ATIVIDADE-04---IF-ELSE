import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner (System.in);
    
    String nome = "";
    int idade = 0;
    
    System.out.println("Nome: ");
    nome = scanner.nextLine();
    
    System.out.println("Idade: ");
    idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println(nome+ " Voce e maior de idade, sua idade e " + idade+ " anos");
        }
            
            else{
                System.out.println(nome+ " Voce e menor de idade, sua idade e " + idade+ " anos");
            }
        
        scanner.close();
        
             
    }
}
