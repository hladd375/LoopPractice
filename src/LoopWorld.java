public class LoopWorld {


    public static void main(String[] args) {
      LoopWorld loops = new LoopWorld();
    }
    public LoopWorld (){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
        pattern13();

    }

    public void pattern1(){
        System.out.println("*** Pattern 1 ***");
        for(int x = 0; x <26; x = x+5){
            System.out.println(x);
        }

    }
    public void pattern2(){
        System.out.println("*** Pattern 2 ***");
        for(int x = 2; x <= 27; x = x+5){
            System.out.println(x);
        }

    }
    public void pattern3(){
        System.out.println("*** Pattern 3 ***");
        for(int x = 21; x >= 1; x = x-4){
            System.out.print(x + "  ");
        }
        System.out.println();

    }
    public void pattern4(){
        System.out.println("*** Pattern 4 ***");
        for(int x = 1; x <=6; x++){
            System.out.print(x*x + "  ");
        }
        System.out.println();

    }

    public void pattern5(){
        System.out.println("*** Pattern 5 ***");
        for(int i = 0; i <4; i++){
            for(int x = 1; x <=4; x++) {
                System.out.print(x + "  ");
            }
            System.out.println();


        }
        System.out.println();
    }

    public void pattern6(){
        System.out.println("*** Pattern 6 ***");
        for(int x = 1; x <= 5; x++){
            for(int i = 0; i <x-1; i++){
                System.out.print(" ");

            }
            System.out.println(x);
        }



    }
    public void pattern7(){
        System.out.println("*** Pattern 7 ***");
        for(int x = 1; x <= 5; x++){
            for(int i = 0; i <= 5-x; i++){
                System.out.print(x + " ");

            }
            System.out.println();

        }

    }
    public void pattern8(){
        System.out.println("*** Pattern 8 ***");
        for(int x = 1; x <= 5; x++){
            for(int i = 0; i <x-1; i++){
                System.out.print(" ");

            }
            for(int i = 0; i < 6-x; i++){
                System.out.print("*");

            }
            System.out.println();

        }



    }
    public void pattern9(){
        System.out.println("*** Pattern 9 ***");
        for(int h = 1; h <= 6; h++){
            for(int l = 1; l < h; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public void pattern10(){
        System.out.println("*** Pattern 10 ***");
        for(int h = 0; h <= 5; h++){
            for(int l =0; l < h; l++){
                System.out.print(h);
            }
            System.out.println();
        }

    }
    public void pattern11(){
        System.out.println("*** Pattern 11 ***");
        for(int h = 1; h <= 5; h++){
            for(int l = 1; l <= h; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int h = 1; h < 5; h++){
            for(int l =1; l < 6-h; l++){
                System.out.print(l);
            }
            System.out.println();
        }


    }
    public void pattern12(){
        System.out.println("*** Pattern 12 ***");
        for(int h = 0; h < 5; h++){
            for(int l =1; l < 6-h; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int h = 2; h <= 5; h++){
            for(int l = 1; l <= h; l++){
                System.out.print(l);
            }
            System.out.println();
        }

    }

    public void pattern13(){
        System.out.println("*** Pattern 13 ***");
        for(int h = 0; h < 5; h ++){
            for(int l = 5 -h ; l > 0; l = l -1){
                System.out.print(l);
            }
            System.out.println();
        }
//        for(int h = 5; h < 0; h = h -1){
//            for(int l = 5 -h ; l > 0; l = l-1){
//                System.out.print(l);
//            }
//            System.out.println();
//        }
        for(int h = 2; h <= 5; h++){
            for(int l = 1 - h; l < 5; l++){
                System.out.print(l);
            }
            System.out.println();
        }

    }


}
