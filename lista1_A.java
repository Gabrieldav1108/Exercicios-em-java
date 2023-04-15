import java.util.Scanner;
class lista1_A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua altura: \n");
		float h = sc.nextFloat();
		System.out.print("Digite seu sexo(Homem ou Mulher): \n");
		String sexo = sc.next();
		
		if(sexo.equalsIgnoreCase("Homem")){
			float resHomem = (72.7f * h) - 58;
			System.out.printf("Seu peso ideal é: %.2f", resHomem);
		}if (sexo.equalsIgnoreCase("Mulher")){
			float resMulher = (62.1f * h) - 44.7f;
			System.out.printf("Seu peso ideal é: %.2f", resMulher);
		}
		
	}
}

//equalsIgnoreCase() -> maneira correta de testar strings
