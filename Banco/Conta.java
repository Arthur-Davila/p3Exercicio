package Banco;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;
    
    public Conta(int agencia, int conta, Cliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposito(double depositar) {
        
        depositar = depositar + this.saldo;
        setSaldo(depositar);
   
        
    }

    public double saque(double sacar) {
        if (sacar > this.saldo)  {
            return 0;// retornar erro
        }else{
            this.saldo = this.saldo-sacar;
            return sacar;
        }
    }

    public void transferencia(Conta destinatario, double valor) {
        if (valor <= 0) {
            System.out.println("O valor da transferência deve ser maior que zero.");
            return;
        }

        if (saldo >= valor) {
            this.saldo -= valor;
            destinatario.deposito(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso para a conta " + destinatario.getConta());
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo:"+ this.saldo);
    }

}
