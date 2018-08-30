import java.util.Scanner;

public class Main {
	
	public static void main (String [] args){
		boolean Finished = false;
		Botsautos botsautos = new Botsautos();
		Hawaii hawaii = new Hawaii();
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		Spin spin = new Spin();
		Spookhuis spookhuis = new Spookhuis();
		
		
	while (!Finished){
	     int atracktienummer;
	     Scanner atrackieNummerScanner = new Scanner(System.in);
	     System.out.println("Druk op 1 voor de Botsauto's, 2 voor de Hawaii, 3 voor het Ladderklimmen, 4 voor het Spiegelpaleis, 5 voor de Spin, 6 voor het Spookhuis");
	     atracktienummer = atrackieNummerScanner.nextInt();
	     
	     if (atracktienummer == 1) botsautos.draaien();
	     if (atracktienummer == 2) hawaii.draaien();
	     if (atracktienummer == 3) ladderklimmen.draaien();
	     if (atracktienummer == 4) spiegelpaleis.draaien();
	     if (atracktienummer == 5) spin.draaien();
	     if (atracktienummer == 6) spookhuis.draaien();
	     else System.out.println("invalid input");
	    	 
	     
	}
	     
	     
	     /*switch (atracktienummer) {
	         case 1:
	             System.out.println();
	             break;
	         case 2:
	             System.out.println();
	             break;
	         case 3:
	             System.out.println();
	             break;
	         default:
	             System.out.println();
	             break;
	     }*/
	 }
		
		/*Attractie attractie [] = new Attractie[5];
		attractie [0] = botsautos;
		attractie [1] = hawaii;
		attractie [2] = ladderklimmen;
		attractie [3] = spiegelpaleis;
		attractie [4] = spin;
		attractie [5] = spookhuis;*/
		
		
		
		
		
		
	}


