class Pessoa{
	String nome;
	String nascimento;
	String fone;
	String cpf;
	String endereco;
	
	public Pessoa(String nome, String nascimento, String fone, String cpf, String endereco){
	
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			System.out.printf("Preencha corretamente o nome do paciente");
			this.nome = "";
		}
		
		this.nascimento = nascimento;
		
		if (fone.length() == 8 || (fone.length() >= 9 && fone.length() <= 14) ) {
			this.fone = fone;
		} else { 
			System.out.printf("Número inválido\n");
		}
		
		if (cpf.length() == 14) {
			this.cpf = cpf;
		} else {
			System.out.printf("Insira o CPF no formato xxx.yyy.zzz-dd \n");
			this.cpf = "";
		}
		
		if(endereco.length() <= 50){
			this.endereco = endereco;
		}else{
			System.out.printf("Insira um endereço válido. \n");
		}
	}
	
	public void mostrarPessoa(){
		System.out.printf("Nome: %s", nome);
		System.out.printf("Nascimento: %s", nascimento);
		System.out.printf("Fone: %s", fone);
		System.out.printf("CPF: %s", cpf);
	}
	
	public static void main(String[] args){
		Pessoa cliente = new Pessoa("Julio", "06/07/2006", "518459415", "78945612323", "rua do sem criatividade");
        cliente.mostrarPessoa();
	}
}
