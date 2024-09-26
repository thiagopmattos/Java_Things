public class Conta {

    String Cpf;
    int  numBanco;
    double saldo;
    boolean clienteEspecial;

    public Conta(String cpf, int numBanco, double saldo,boolean clienteEspecial) {
        this.Cpf = cpf;
        this.numBanco = numBanco;
        this.clienteEspecial= clienteEspecial;
        this.saldo = saldo;
    }

    public double bonificacao(){
     if (this.clienteEspecial){
         return this.saldo*0.1;

     }else {
         return this.saldo*0.05;
     }
    }
    public void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Valor de saque" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }
        public void depositar (double valor){
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Deposito de " + valor);

            } else {
                System.out.println("Não foi possivel realizar deposito");
            }
        }
            public void mostrarAtributos(){
                System.out.println("CPF do titular" + this.Cpf);
                System.out.println("Numero do banco" + this.numBanco);
                System.out.println("Saldo atual:" + this.saldo);
                System.out.println("Bonificação:" + this.bonificacao());
            }
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta de CPF " + destino.Cpf);
        } else {
            System.out.println("Transferência não realizada: saldo insuficiente ou valor inválido.");
        }
    }

        }






