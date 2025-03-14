class Fibo {
    public static void main(String args[]) {
        int n = 5;  
        int i = 0, j = 1, z;

        System.out.print(i + " " + j + " ");  

        for (int count = 2; count < n; count++) {  
            z = i + j;
            System.out.print(z + " ");
            i = j;
            j = z;
        }
    }
}
