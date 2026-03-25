public class TypeCastingOperator {
    public static void main(String[] args) {
        //Explicit
        double d = 9.78;
        int num = (int) d;
        System.out.println("Before conversion: " + d);
        System.out.println("After CONVERSION:" + num);

        //implicit
        int i = 10;
        double p = i;
        System.out.println("Before conversion : " + i);
        System.out.println("After CONVERSION:" + p);

    }

}
