package jp.co.rakuspartners.java.basic3.practice;

public class Cat extends Mammalian{

    public Cat(String name){
      super(name);
        System.out.println("猫が生まれました！");
    }

    @Override

    public void eat(){
        System.out.println("魚を食べます");
    }

}
