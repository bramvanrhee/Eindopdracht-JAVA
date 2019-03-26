
public class JavaLevel1 {
	public static void main(String[] args) {
		
		int rowCount = Integer.parseInt(args[0]); //Hierdoor kun je invullen hoeveel rows er op je scherm verschijnen
		int columnCount = Integer.parseInt(args[1]); //Hierdoor kun je invullen hoeveel columns er op je scherm verschijnen
		int [][] getallen = new int[rowCount][columnCount];
		int[] gemiddelde = new int[rowCount]; 
		
		//Generen random getallen en rekent het gemiddelde uit
		for (int row = 0; row < rowCount; row++) {
			int som = 0;
			for (int col = 0; col < columnCount; col++) {
				getallen[row][col] = (int) Math.ceil(Math.random() * 100);
				som += getallen[row][col];
			}
			gemiddelde[row] = som/rowCount;
			
			
		}
	}

}
