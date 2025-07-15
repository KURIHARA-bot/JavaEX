package jp.co.rakuspartners.java.basic3.practice;

public class Human extends Mammalian{

    public Human(String name){
      super(name);
      System.out.println("人が生まれました！");
    }


 @Override

 public void eat(){
    System.out.println("野菜を食べます");
 }
    



}
