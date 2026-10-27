class EvenOd {
    static void checkEvenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is even.");
        }else{
            System.out.println(num+" is odd.");
        }
    }
    public static void main(String[]args){
        checkEvenOdd(5);
        checkEvenOdd(10);
    }
}
