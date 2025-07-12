package jp.co.rakuspartners.java.basic2;

public class human {
          String lastName;
          String firstName;
          int power;

          void sayMyName(){
            System.out.println(lastName + firstName);
          }
          void eat(String food){
            if(food.equals("おにぎり")){
              power=power+10;
            } else if (food.equals("カレー")){
              power=power+20;
            } else{
              power=power+5;
            }
            
          }



}
