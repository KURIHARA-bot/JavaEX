package jp.co.rakuspartners.java.basic3.practice.Ex01;

public class Mammalian {
    private String name;

    
    public void showType(){
        System.out.println("哺乳類です");
    }

    public void showName(){
        System.out.println("私の名前は"+name+"です");

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("生き物を食べます");
    }

    

}
