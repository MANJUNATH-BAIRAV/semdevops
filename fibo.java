class fibo
{
    public static void main(String args[])
    {
        int limit = 4;
        int i = 0;
        int j = 1;
        int z = i + j;

        
        while( z < limit)
        {
            
            System.out.print(z +" ");
            i = j;
            j = z;
        }
    }
}