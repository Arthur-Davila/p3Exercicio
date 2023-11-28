package Banco;

public class ContaPoupanca extends Conta {
    
    private double taxaRendimento ;
    
    public ContaPoupanca(int agencia, int conta, Cliente cliente) {
        super(agencia, conta, cliente);
        this.taxaRendimento = 0.05;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    } 

    public double simularOperacao(int meses){
       //error message
        if(meses >= 0){
        for (int i = 0; i < meses; i++) {
            this.saldo += this.saldo+(this.taxaRendimento*this.saldo);
        }

        return this.saldo;
    }
    }else{
        System.out.println("Meses não positivos");
        return this.saldo;
    }
}
