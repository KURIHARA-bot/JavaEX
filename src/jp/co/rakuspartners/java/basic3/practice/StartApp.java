package jp.co.rakuspartners.java.basic3.practice;

public class StartApp {
    public static void main(String[] args) {
        
        Dog dog = new Dog("ポチ");
        dog.getName();
        dog.showType();
        dog.showName();
        dog.eat();

        Cat cat = new Cat("タマ");

        cat.showType();
        cat.showName();
        cat.getName();
        cat.eat();

        Human human = new Human("山田");
        
        human.getName();
        human.showType();
        human.showName();
        human.eat();

    }

}
