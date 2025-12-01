public  class Main {
    static void myMethod() {
        int sum = 0;
        for (int i = 0; i <= 100; ++i) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
        }
    public static void main(String[]args){
        myMethod();
    }

}




