package Demo01;

public class Demo01 {
    public static void main(String[] args) {
        char[][] a = new char[5][];
        for(int i = 0;i<a.length;i++){
            a[i] = new char[i+1];
            for (int j = 0;j<a[i].length;j++)
                a[i][j] = '*' ;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
