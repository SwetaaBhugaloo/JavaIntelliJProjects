public class ForLoop {
    public static void main(String[] args) {
        //whenever there is counter involved -> run for certain times -> for
//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//        }
//        //complex condition -> while, if you want to run your loop atleast 1 time -> do-while
//
//        int i =0;
//        while(i<5) {
//            System.out.println("hello");
//            i++;
//        }


//        for (int i=0;i<5;i++){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int rows=4;
//        for (int a=rows-1;a>=0;a--){
//            for (int b=0;b<=a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int s= 5;
        while(s<10){
            s++;
// continue stmt skips the stmt after it and runs to infinity.
            if (s==7){
                continue;
            }
            System.out.println(s);
        }



    }
}
