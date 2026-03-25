class Animal{
 
}
class Tiger{
    
}
public class InstanceofOperator {
    public static void main(String[] arg){
        Animal an = new Animal();
        Animal as = new Animal();
        Tiger tg =new Tiger();
        System.out.println(an instanceof Animal);
        System.out.println(as instanceof Animal);
        System.out.println(tg instanceof Tiger);



    }
}