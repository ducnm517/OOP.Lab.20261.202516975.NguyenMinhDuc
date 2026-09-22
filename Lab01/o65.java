package Lab01;

public class o65 {
    public static void main(String[] args) {
        float[] ss = {7, 6, 4,5,3,1};

        for (int i = 0; i < ss.length; i++) {
            for (int j = i+1; j < ss.length; j++) {
                if (ss[i]>ss[j]) {
                    float q = ss[i];
                    ss[i] = ss[j];
                    ss[j] = q;
                }
            }
        }
        float rt = 0;
        for (int i = 0; i < ss.length; i++) rt+=ss[i];

        System.out.println("Sum : " + rt + ", Average : "+(rt/ss.length));
    }
}
