package questoesEstagio;

public class questao3 {
	 

	  public static void main(String[] args) {
	        System.out.println("Letra A: " + letraA());
	        System.out.println("Letra B: " + letraB());
	        System.out.println("Letra C: " + letraC());
	        System.out.println("Letra D: " + letraD());
	        System.out.println("Letra E: " + letraE());
	        System.out.println("Letra F: " + letraF());
	    }

	    public static int letraA() {
	        int[] sequencia = {1, 3, 5, 7};
	        return sequencia[sequencia.length - 1] + 2; // 9
	    }

	    public static int letraB() {
	        int[] sequencia = {2, 4, 8, 16, 32, 64};
	        return sequencia[sequencia.length - 1] * 2; // 128
	    }

	    public static int letraC() {
	        int[] sequencia = {0, 1, 4, 9, 16, 25, 36};
	        return (int) Math.pow(sequencia.length, 2); // 49
	    }

	    public static int letraD() {
	        int[] sequencia = {4, 16, 36, 64};
	        int dobro = sequencia.length * 2;
	        return (int) Math.pow(dobro + 2, 2); // 100
	    }

	    public static int letraE() {
	        int[] sequencia = {1, 1, 2, 3, 5, 8};
	        return sequencia[sequencia.length - 1] + sequencia[sequencia.length - 2]; // 13
	    }

	    public static int letraF() {
	        int[] sequencia = {2, 10, 12, 16, 17, 18, 19};
	        return 200; // 200
	    }
}
