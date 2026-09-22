package Lab01;

public class o66 {
    public static void main(String[] args) {
        
        float[][] matA = {{1,2,3},{5,6,7},{4,8,9}};
        float[][] matB = {{1,2,3},{5,6,7},{4,8,9}};

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                System.out.print((matA[i][j]+matB[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
}

