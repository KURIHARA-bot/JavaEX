package jp.co.rakuspartners.java.basic3.practice.Ex01;

public class StartApp {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.setName("ポチ");
        dog.showType();
        dog.showName();
        dog.eat();

        Cat cat = new Cat();

        cat.showType();
        cat.setName("タマ");
        cat.showName();
        cat.eat();

        Human human = new Human();
        
        human.setName("山田");
        human.showType();
        human.showName();
        human.eat();

        Mouse mouse = new Mouse();

        mouse.showType();
        mouse.setName("チュー");
        mouse.showName();
        mouse.eat();

    }

}
