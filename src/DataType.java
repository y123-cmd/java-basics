public class DataType {
    public static void main(String[]args){
        //interger type
        byte mybyte = 127;
        int myint = 12;
        short myshort =12;
        long mylong = 12L;
        // floating point  type
        float myfloat =14.5f;
        double mydouble =17.8;
        //character type
        char mychar = 'A';
        char Char = 'B';
        //boolean type
        boolean myboolen = true;
      
    
    System.out.println(mybyte);
    System.out.println(myint);
    System.out.println(myshort);
    System.out.println(mylong);
    System.out.println(myfloat);
    System.out.println(mydouble);
    System.out.println(mychar);
    System.out.println(myboolen);
    //explicit casting
        //double to int
        int intfromdouble= (int) mydouble;
        System.out.println(mydouble);
        int asciiValue = (int) mychar;
        System.out.println(asciiValue);
        int asciiValue1 = (int)Char;
        System.out.println(asciiValue1);
   }
}

