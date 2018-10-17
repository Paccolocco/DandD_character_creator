package sorting;


public class InsertionSort {
	public static int[] insertionSort(int[] eingabe) {
		int laenge = eingabe.length;
		int[] ausgabe = new int[laenge];

		for(int j=2;j<ausgabe.length;j++)do{
		    int x = ausgabe[j];
		    int i = j-1;
		    while((i>0)&&(ausgabe[i]>x))do{
		        ausgabe[i+1]=ausgabe[i];
		        i=i-1;
            }
            ausgabe[i+1]=x;
        }
		/*
		 * an dieser stelle muessen sie die elemente des arrays 'eingabe' in der korrekten reihenfolge
		 * in das array 'ausgabe' schreiben. verwenden sie dazu den in der vorlesung kennengelernten 
		 * algorithmus 'InsertionSort'. java-eigene sortiermethoden sind nicht erlaubt.
		 */
		
		return ausgabe;
	}
	
	/*
	 * DIESE METHODE SOLLTEN SIE NICHT AENDERN!
	 * sie erzeugt arrays verschiedener laenge aus zufallszahlen, sortiert diese mit ihrer sortiermethode 
	 * und misst die dafuer benoetigte zeit.  
	 */
	public static void main(String[] args) {
		for (int eingabeLaenge = 10 ; eingabeLaenge < 1000001 ; eingabeLaenge *= 10) { // laenge der eingabe zwischen 10^1 und 10^6
			System.out.print("Sortiere " + eingabeLaenge + " Elemente in ");
			// erzeuge ein array mit zufallszahlen
			int[] eingabe  = new int[eingabeLaenge];
			for (int i = 0 ; i < eingabeLaenge ; ++i) {
				int zufallszahl = (int) (Math.random()*eingabeLaenge); // erzeugt eine Zufallszahl im Intervall [0,eingabeLaenge)
				eingabe[i] = zufallszahl;
			}
			long start = System.nanoTime(); // beginn der zeitmessung
			int[] sortiert = insertionSort(eingabe); // aufruf der eigenen sortiermethode, kann einige zeit dauern
			long end = System.nanoTime(); // ende der zeitmessung
			System.out.println("" + (end-start) + " nanosekunden");
		}
	}
	
}
