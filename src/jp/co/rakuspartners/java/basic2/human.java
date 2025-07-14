package jp.co.rakuspartners.java.basic2;

public class human {
          String lastName;
          String firstName;
          int power;

          human(){}

          human(String lastName,String firstName, int power){
            this.lastName = lastName;
            this.firstName = firstName;
            this.power = power;
          } 
         public String toString(){
          return lastName + firstName + "さんのパワーは" + power + "です";
         }
 
          void sayMyName(){
            System.out.println("私の名前は"+lastName + firstName + "です。");
          }
          void eat(String food){
            if(food.equals("おにぎり")){
              power=power+10;
            } else if (food.equals("カレー")){
              power=power+20;
            } else{
              power=power+5;
            }System.out.println("パワーは" + power + "になりました。");
            
          }



}
