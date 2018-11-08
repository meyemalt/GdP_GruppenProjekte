/**
 * @author meyemalt
**/
public class GGT {

/**
 * 1.  In der Klasse 'GGT' wird die Methode 'main()' erstellt.
 * 2.  'main()' bekommt als Parameter das Array 's' zugewiesen.
 * 3.  In 's' befinden sich Elemente, die auf Strings verweisen,
 *     sobald die Eingabe der Argumente in der Kommandozeile erfolgt ist.
**/
	public static void main(String s[]) {

/**
 * 4.  Zwei Variablen vom Datentyp Integer werden erstellt und bekommen die Namen 'm' und 'n' zugewiesen.
 * 5.1 Die Initialisierung von 'm' und 'n' erfolgt durch die Methode 'parseInt()'.
 * 5.2 Die Methode sucht fuer 'm' in dem angegebenen Element '0' nach einem Verweis auf einen String in 's'
 *     und convertiert den String in einen Interger.
 * 5.3 'm' wird mit diesem Integer-Wert initialisiert.
 * 6.. Wiederhole 5.1 bis 5.3 für 'n' im Element '1'.
**/
		int m=Integer.parseInt(s[0]);
		int n=Integer.parseInt(s[1]);
                
                /**
                 * 7. 'm' und 'n' werden auf ihre Positivität geprüft.
                **/
		if (m>0&&n>0) {

                /**
                 * 8. Eine weitere Variable 'r' vom Typ Integer wird erstellt und mit dem Wert '1' initialisiert.
                **/
			int r=1;

                /**
                 * 9. 'do-Anweisung' lässt den Schleifenkörper einmal durchlaufen, bevor die Schleife beginnt.
                 *        Warum? - Weil es sein kann, dass der GGT von Zwei Zahlen schon nach einem Durchgang ermittelt ist.
                **/
			do {

				if (m<n) {              //2.1 hier startet der Algorithmus mit dem Vergleich von 'm' und 'n'

					int t=m; m=n; n=t;  //2.2 durch 't' können die Werte von 'm' und 'n' getauscht werden, ohne Verlust
					r=m-n;              //3.  'r' wird mit dem Subtraktionsergebnis von (m-n) überschrieben
					m=n; n=r;           //4.  Wertetausch ohne t-Variable, da nurnoch 'n-Wert' und 'r-Wert' gebraucht 
				}
				else {                  // falls 2.1 nicht zutrifft

					r=m-n;              //3.  -||-
					m=n; n=r;           //4.  -||-
				}
			}
			while (r>0|r<0);            //5.  Eintritt in die Schleife, falls die Bedingung zutrifft

			System.out.println(m);      //6.  'm' wird als Ergebnis ausgegeben
		}
		
		/**
		 * Bezug auf die erste if-Anweisung.
		 * 3 Fälle werden geprüft und individuell ausgegeben mit Hinweis auf Korrektur der Eingabe 
		 **/
			else if (m<=0&&n<=0) {

				System.out.println("''"+m+"''"+" und "+"''"+n+"''"+" sind beides ungültige Werte!");
				System.out.println("Bitte achten Sie ausschließlich auf GANZZAHLIGE und POSITIVE Werte!");
				System.exit(-1);
			}
			else if (m<=0) {

				System.out.println("''"+m+"''"+" ist ein ungültiger Wert!");
				System.out.println("Bitte achten Sie ausschließlich auf GANZZAHLIGE und POSITIVE Werte!");
				System.exit(-1);
			}
			else if (n<=0) {
				System.out.println("''"+n+"''"+" ist ein ungültiger Wert!");
				System.out.println("Bitte achten Sie ausschließlich auf GANZZAHLIGE und POSITIVE Werte!");
				System.exit(-1);
			}
	}
}