class Conta {
    private Pessoa cliente;
    private String nConta;
    private int agencia;
    private double saldo;

    public Conta(Pessoa cliente) {
        this.cliente = cliente;
        
        setAgencia(1);
        setSaldo(0);

        int nConta = (int) (Math.random() * 1000000000);
        String nContaFormatada = String.format("%09d", nConta);
        setNumConta(nContaFormatada);
    }

    // metodo sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o saque.");
        }
    }

    // metodo depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor inserido com sucesso!");
        } else {
            System.out.println("Não foi possivel fazer um deposito na conta.");
        }
    }

    // metodo mostrarInformacoes
    public void mostrarExtrato() {
        System.out.printf("Número da conta: %s\n", nConta);
        System.out.printf("Agencia: %s\n", agencia);
        System.out.printf("Saldo disponível: %s\n", saldo);
    }
    
    public void mostrarDados(){
		System.out.printf("Nome: %s \n", cliente.nome);
		System.out.printf("Nascimento %s \n", cliente.nascimento);
		System.out.printf("Fone: %s \n", cliente.fone);
		System.out.printf("CPF: %s \n", cliente.cpf);
		System.out.printf("Endereço: %s \n", cliente.endereco);
	}

    // getter e seters
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Valor inválido\n");
        }
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumConta(String nConta) {
        if (nConta.length() == 9) {
            this.nConta = nConta;
        } else {
            System.out.println("Número de conta inválido\n");
        }
    }

    public String getNumConta() {
        return this.nConta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double setSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta(new Pessoa("Julio", "06/07/2006", "518459415", "048.171.660-29", "rua do sem criatividade") );

        conta1.depositar(800);
        conta1.sacar(400);
        conta1.mostrarDados();
        conta1.mostrarExtrato();


    }
}
