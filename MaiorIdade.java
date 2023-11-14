import java.util.Scanner;

class MaiorIdade {
		public static void main(String[] args){
			
			int maiorIdade = 0;
			
			for (int i=0; i<5; i++){
				System.out.println("Qual a idade?");
				
				//lendo a idade e armazenando na variavel
				// fazendo a leitura
				Scanner sc = new Scanner(System.in);
				int idade = sc.nextInt();
				
				if(i == 0){
					maiorIdade = idade;
				}else{
					maiorIdade = Math.max(maiorIdade, idade);
				}
			}
			
			System.out.printf("A maior idade lida foi %d anos", maiorIdade);
		}
	}
