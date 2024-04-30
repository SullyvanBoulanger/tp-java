package fr.algorithmie;

public class FabriquerMur {
	
	private static boolean makeWall(int nbSmall, int nbBig, int wallLength) {		
		int bigNeeded = Math.round(wallLength/5);
		
		if(nbBig<bigNeeded) {
			return nbBig*5 + nbSmall >= wallLength;
		}
		int smallNeeded = wallLength%5;
		
		return nbBig >= bigNeeded && nbSmall >= smallNeeded;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b){
		if (!makeWall(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

}
