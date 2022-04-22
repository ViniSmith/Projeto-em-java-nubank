import java.util.ArrayList;

public class Banco
{
    ArrayList <Conta> contas;
    
    public void addConta(Conta conta) {
        contas.add(conta);
    }
    
    public int procurarConta(int numeroConta) {
        int armazenaNumeroConta = 0;
        for(Conta conta : contas) {
            if(numeroConta == conta.getNumeroConta()) {
                armazenaNumeroConta = numeroConta;
            }else {
                System.out.println("Conta não encontrada");
            }
        }
        return armazenaNumeroConta;
    }
}
