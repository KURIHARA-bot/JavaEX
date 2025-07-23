package jp.co.rakuspartners.java.basic3.practice.Ex02;

public class Zoo {
    public static void main(String[] args) {

        
        Animal[] animals ={new Sheep(),new Horse(),new Goat(),new Monkey(),new Bear()};

        for(Animal animal:animals){
            animal.cry();
        }
    }

}
