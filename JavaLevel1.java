
public class JavaLevel1 {
	public static void main(String[] args) {
		
		int rowCount = Integer.parseInt(args[0]); //Hierdoor kun je invullen hoeveel rows er op je scherm verschijnen
		int columnCount = Integer.parseInt(args[1]); //Hierdoor kun je invullen hoeveel columns er op je scherm verschijnen
		int [][] getallen = new int[rowCount][columnCount];
		int[] gemiddelde = new int[rowCount]; 
		int gemiddeldeG = 0;
		double stDeviatie;
		
		//Generen random getallen en rekent het gemiddelde uit
		for (int row = 0; row < rowCount; row++) {
			int som = 0;
			for (int col = 0; col < columnCount; col++) {
				getallen[row][col] = (int) Math.ceil(Math.random() * 100);
				som += getallen[row][col];
			}
			gemiddelde[row] = som/rowCount;
			
		}
		//Berekenen Minimum en Maximum
		int [] minimum = new int[columnCount];
		for (int col = 0; col < columnCount; col++) {
			minimum[col] = 100;
		}
		
		int [] maximum = new int[columnCount];
		for (int col= 0; col < columnCount; col++) {
			maximum[col] = 0; 
		}
		
		for (int col = 0; col < columnCount; col++) {
			for (int row = 0; row < rowCount; row++) {
				minimum[col] = Math.min(getallen[row][col], minimum[col]);
				maximum[col] = Math.max(getallen[row][col], maximum[col]);
			}
		}
		
		//Berekent Gemiddelde van het Gemiddelde
		int sum = 0;
		for (int row = 0; row < rowCount; row++) {
			sum = sum + gemiddelde[row];
			gemiddeldeG = sum/rowCount;
		}
		
		double sum2 = 0.0, standaardDeviatie = 0.0;
		int length = gemiddelde.length;
		
		for (double num : gemiddelde) {
			sum2 += num;
		}
		
		double avg = sum2/length;
		
		for (double num : gemiddelde) {
			standaardDeviatie += Math.pow(num - avg, 2);
		}
		
		stDeviatie = Math.sqrt(standaardDeviatie/length);
		
		//afdrukken
		System.out.println();
		for (int row = 0; row < rowCount; row++) {
			for(int col = 0; col < columnCount; col++) {
				System.out.print("\t"+getallen[row][col]); //Print de random getalen
			}
			System.out.println("\t"+gemiddelde[row]); //Print het gemiddelde
		}
		
		System.out.println();
		for (int row = 0; row < rowCount; row++) {
			System.out.print("\t"+minimum[row]); //Print het minimum
		}
		
		System.out.print("\t"+gemiddeldeG); //Print het gemiddelde van het gemiddelde
		
		System.out.println();
		for (int row = 0; row < rowCount; row++) {
			System.out.print("\t"+maximum[row]); //Print het maximum
		}
	}

}
