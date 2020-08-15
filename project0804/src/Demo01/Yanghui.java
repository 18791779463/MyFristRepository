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

    public void print() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
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
            for (int j = 0; j < a[1].length; j++) {
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
