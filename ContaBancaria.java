public class ContaBancaria {
    private String titular;
    private double saldo;

public ContaBancaria(String titular, double saldo){
    this.titular = titular;
    this.saldo = saldo;
}

public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Alex Silva", 500.00);
        
        conta.depositar(200.00); 
        conta.sacar(150.00);    
        conta.sacar(1000.00);   
        
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}


