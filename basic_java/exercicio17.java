public class fibo{
    public static void main(String[] args){
        long n1 = 0;
        long n2 = 1;
        
        System.out.println(n1);
        System.out.println(n2);


        for (int x = 0; x < 10; x++){
            long aux = n2;
            n2 = n1 + n2;
            n1 = aux;
            System.out.println(n2);
        }

    }
}
