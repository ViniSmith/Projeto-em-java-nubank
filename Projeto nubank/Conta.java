
public class Conta
{
   private double saldo, creditoEspecial, saldoCreditoEspecial;
   private int numeroConta;
   
   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }
   public double getSaldo() {
       return this.saldo;
   }
   
   public void setCreditoEspecial(double creditoEspecial) {
       this.creditoEspecial = creditoEspecial;
   }
   public double getCreditoEspecial() {
       return this.creditoEspecial;
   }
   
   public void setSaldoCreditoEspecial(double saldoCreditoEspecial) {
       this.saldoCreditoEspecial = saldoCreditoEspecial;
   }
   public double getSaldoCreditoEspecial() {
       return this.saldoCreditoEspecial;
   }
   
   public void setNumeroConta(int numeroConta) {
       this.numeroConta = numeroConta;
   }
   public int getNumeroConta() {
       return this.numeroConta;
   }
   
   public Conta() {
       saldo = creditoEspecial = saldoCreditoEspecial = 0;
       numeroConta = 0;
   }
   public Conta(double saldo, double creditoEspecial, double saldoCreditoEspecial, int numeroConta) {
       this.saldo = saldo;
       this.creditoEspecial = creditoEspecial;
       this.saldoCreditoEspecial = saldoCreditoEspecial;
       this.numeroConta = numeroConta;
   }
   
   public void deposito(double valor) {
        double armazenaValor = 0;
        if(valor > 0) {
            saldo = valor;
            System.out.println("Efetuando depósito de : R$" + valor);
            if(saldoCreditoEspecial < creditoEspecial) {
                saldoCreditoEspecial = valor;
                if(saldoCreditoEspecial > creditoEspecial) {
                    armazenaValor = saldoCreditoEspecial - creditoEspecial;
                    saldoCreditoEspecial -= armazenaValor;
                    saldo = armazenaValor;
                }
            }
        }
    }
    
    public void saque(double valor) {
        double armazenaTotalSaldo = saldo + saldoCreditoEspecial;
        saldo -= valor;
        if(saldo < valor) {
            saldoCreditoEspecial -= valor;
            if(saldoCreditoEspecial < valor) {
                System.out.println("Valor insuficiente para sacar!");
            }
        }
    }
}
