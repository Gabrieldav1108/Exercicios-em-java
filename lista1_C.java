class lista1_C{
	public static void main(String[] args){
		for(int i=1;i<=500;i++){
			
			if((i % 3) == 0){
				System.out.printf("Fizz: %d\n", i);
			}if ((i % 5) == 0)
				System.out.printf("Buzz: %d\n", i);
			 if ((i % 3 == 0) && (i % 5 == 0))
				System.out.printf("FizzBuzz: %d\n", i);
		}
	}
}
