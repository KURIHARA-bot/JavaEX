package jp.co.rakuspartners.java.basic3.practice.Ex03;

public class Character {

    private int hp;
    private String name;
    
    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showHp(){
        System.out.println("「"+name+"の現在のHP:"+hp +"]");
    }

    public void attack(Character ch){
        System.out.println("「"+this.name +"のこうげき！」");
        ch.downHp(5);
        ch.showHp();
    }

    public void downHp(int hp){
        

    }

    

}
