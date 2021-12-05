import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("1- plus  2 - minus");
        Scanner n = new Scanner(System.in);
        int g = n.nextInt();

        switch(g) {
            case 1:
                countp();
              break;
            case 2:
                countm();
              break;
            default:
                System.out.println("Non-existent operation (" + g +")");
          }


        
    }

    static void countp(){
        Scanner nr = new Scanner(System.in);
        Manager ok = new Manager();
        System.out.print(ok.db[0] + " = ");

        int a = nr.nextInt();
        System.out.print(ok.db[1] + " = ");

    
        int b = nr.nextInt();
        int x = (int)(a + b);
        System.out.print(ok.db[2] + " = ");
        System.out.print(x);
}


    static void countm(){
        Scanner nr = new Scanner(System.in);
        Manager ok = new Manager();
        System.out.print(ok.db[0] + " = ");

        int a = nr.nextInt();
        System.out.print(ok.db[1] + " = ");


        int b = nr.nextInt();
        int x = (int)(a - b);
        System.out.print(ok.db[2] + " = ");
        System.out.print(x);

}
    
    

  }