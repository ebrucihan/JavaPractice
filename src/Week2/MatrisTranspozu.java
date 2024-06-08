package Week2;

public class MatrisTranspozu {
    public static void main(String[] args) {
        // Örnek bir 2x3 matris oluşturma
        int [][] matris = new int[2][3];
        int number = 1;
        // Matrise sıralı olarak değerler atama
        for (int i = 0; i< matris.length; i++) {
            for (int j = 0; j< matris[i].length; j++) {
                matris[i][j]= number++;
            }
        }

        System.out.println("Matris: ");

        for (int i= 0; i<matris.length; i++) {
            for (int j =0; j< matris[i].length; j++) {
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();

        }
        // Matrisin transpozu hesaplama
        int[][] transpozMatris = transpoze(matris);

        // Transpoz matrisi ekrana yazdırma
        System.out.println("Transpoze: ");
        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[i].length; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Verilen matrisin transpozunu hesaplama
    public static int[][] transpoze(int[][] matris) {
        int row = matris.length;
        int col = matris[0].length;
        int[][] transpozMatris = new int[col][row];


        // Matrisin her bir elemanını transpoz matrisine atama
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        return transpozMatris;
    }
}