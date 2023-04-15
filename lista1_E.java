class lista1_E{
	public static void main(String[] args){
		float altChico = 0.8f;
		float crescChico = 0.06f;
		float altJuca = 0.6f;
		float crescJuca = 0.09f;
		int ano = 0;
		
		while (true){
			altChico = altChico + crescChico;
			altJuca = altJuca + crescJuca;
			ano++;
			
			if(altJuca > altChico){
				System.out.printf("Juca levou %d anos para ficar maior que Chico", ano);
				break;
			}
			
		}
	}
}
