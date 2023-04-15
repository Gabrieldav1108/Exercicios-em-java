import java.util.Scanner;
class lista1_B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: \n");
		float peso = sc.nextFloat();
		
		System.out.print("Digite o seu altura: \n");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc < 18.5){
			System.out.printf("Classificação: Magreza\n");
			System.out.printf("Obesidade(grau): 0\n");
			System.out.printf("Seu imc: %.2f", imc);
		}if (imc >= 18.5 && imc <= 24.9){
			System.out.printf("Classificação: Normal\n");
			System.out.printf("Obesidade(grau): 0	\n");
			System.out.printf("Seu imc: %.2f", imc);
		}if (imc >= 25 && imc <= 29.9){
			System.out.printf("Classificação: Sobrepeso\n");
			System.out.printf("Obesidade(grau): I\n");
			System.out.printf("Seu imc: %.2f", imc);
		}if (imc >= 30 && imc <= 39.9){
			System.out.printf("Classificação: Obesidade\n");
			System.out.printf("Obesidade(grau): II\n");
			System.out.printf("Seu imc: %.2f", imc);
		}if (imc >= 40){
			System.out.printf("Classificação: Obesidade grave\n");
			System.out.printf("Obesidade(grau): III\n");
			System.out.printf("Seu imc: %.2f", imc);
		}
	}
}
