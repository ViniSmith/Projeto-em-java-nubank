import java.util.Scanner;

public class Principal
{
    static Scanner le = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        while(true) {
            int menu = menu();
            if(menu == 1) {
                
            }else if(menu == 2) {
                
            }else if(menu == 3) {
                
            }else if(menu == 4) {
                break;
            }
        }
    }
    
    public static int menu() {
        System.out.println("Bem vindo ao Nubank, escola uma opção : ");
        System.out.println("( 1 ) Cadastrar uma nova conta");
        System.out.println("( 2 ) Realizar um depósito");
        System.out.println("( 3 ) Realizar um saque");
        System.out.println("( 4 ) Sair");
        return le.nextInt();
    }
}
