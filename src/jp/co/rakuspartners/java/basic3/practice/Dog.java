package jp.co.rakuspartners.java.basic3.practice;

public class Dog extends Mammalian{

  public Dog(String name){
      super(name);
    System.out.println("犬が生まれました！");
  }

  @Override
  public void eat(){
    System.out.println("肉を食べます");
  }

}
