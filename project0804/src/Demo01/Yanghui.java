package Demo01;

public class Yanghui {
    int[][] a;

    public Yanghui(int ceng) {
        a = new int[ceng][ceng * 2+1];
        a[0][a.length] = 1;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[1].length-1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j + 1];
            }
        }
    }
    
    public Yanghui(int ceng, int f){
        a = new int[ceng][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            a[i][0] = 1;
            a[i][a[1].length-1] = 1;
        }
         for (int i = 2; i < a.length; i++) {
            for (int j = 1; j < a[i].length-1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
    }

     public void print(int f) {
        for (int i = 0; i < a.length; i++) {
            for(int k = 0;k < a.length - i ; k ++)
                System.put.print(" \t");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public void print() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] != 0)
                    System.out.print(a[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void printz(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] != 0)
                    System.out.print(a[i][j]+"\t");
//                else
//                    System.out.print("\t");
            }
            System.out.println();
        }
    }
//}

    public static void main(String[] args) {

        Yanghui yanghui = new Yanghui(9);
        yanghui.print();
        System.out.println("-----------------------------------------------");
        yanghui.printz();
    }
}
