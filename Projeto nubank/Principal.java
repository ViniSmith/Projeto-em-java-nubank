import java.util.Scanner;

public class Principal
{
    static Scanner le = new Scanner(System.in);
    Conta conta = new Conta();
    Banco banco = new Banco();
    
    public static void main(String[] args) {
        while(true) {
            int menu = menu();
            if(menu == 1) {
                cadastrarCliente();
            }else if(menu == 2) {
                cadastrarConta();
            }else if(menu == 3) {
                realizarDeposito();
            }else if(menu == 4) {
                realizarSaque();
            }else if(menu == 5) {
                break;
            }
        }
    }
    
    
    public static void realizarDeposito() {
        System.out.println("Digite o valor que deseja depositar : ");
        
    }
    
    public static void realizarSaque() {
        System.out.println("Digite o valor que deseja sacar");
        
    }
    
    public static Cliente cadastrarCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Digite o seu nome : ");
        cliente.setNome(le.next());
        System.out.println("Digite o seu sobrenome : ");
        cliente.setSobrenome(le.next());
        System.out.println("Digite o seu CPF : ");
        cliente.setCpf(le.nextInt());
        System.out.println("Digite a sua data de nascimento : ");
        cliente.setDataNascimento(le.nextInt());
        
        return cliente;
    }
    
    public static Conta cadastrarConta() {
        Conta conta = new Conta();
        System.out.println("Digite o número da conta : ");
        conta.setNumeroConta(le.nextInt());
        System.out.println("Digite o limite total do seu crédito especial : ");
        conta.setCreditoEspecial(le.nextDouble());
        conta.setSaldoCreditoEspecial(le.nextDouble());
        
        return conta;
    }
    
    public static int menu() {
        System.out.println("Bem vindo ao Nubank, escola uma opção : ");
        System.out.println("( 1 ) Cadastrar novo cliente");
        System.out.println("( 2 ) Cadastrar uma nova conta");
        System.out.println("( 3 ) Realizar um depósito");
        System.out.println("( 4 ) Realizar um saque");
        System.out.println("( 5 ) Sair");
        return le.nextInt();
    }
}
