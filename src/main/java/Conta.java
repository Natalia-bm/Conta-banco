public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtContas = 0;
    private int juros;
    //Métodos Get e Set
    public Conta(String pTitular){
        this.titular = pTitular;
        qtContas++;
        this.numero = qtContas;
        this.saldo = 0;
    }
    public void DadosBancarios() {
        System.out.println("");
        System.out.println("-----Dados Bancarios-----");
        System.out.println("Número: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("");
    }
    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return this.saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void Saldo(double saldo) {
        this.saldo = saldo;
    }
    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("----- Realizando Deposito -----");
        System.out.println("Saldo anterior: " + this.saldo);
        this.saldo = this.saldo + pValor;
        System.out.println("Saldo posterior: " + this.saldo);
        System.out.println("");
    }
    public void Sacar(double pValor){
        System.out.println("");
        System.out.println("----- Realizando Saque -----");
        System.out.println("Saldo anterior: " + this.saldo);
        if(pValor <= this.saldo){
            this.saldo -= pValor;
            System.out.println("Saldo posterior: " + this.saldo);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("");
    }
    public int getJuros() {
        return juros;
    }
    public void setJuros(int juros) {
        this.juros = juros;
    }
}