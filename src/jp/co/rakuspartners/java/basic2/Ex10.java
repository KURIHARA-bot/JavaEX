package jp.co.rakuspartners.java.basic2;

public class Ex10 {
    public static void main(String[] args) {

    String[] friends = {"一郎", "次郎", "三郎", "四郎", "五郎", "六郎", "七郎"};

    for(int i =0;i<friends.length;i++){
        System.out.println(friends[i]+"さん");
    }
    for(String friend:friends){
        System.out.println(friend+ "さん");
    }
}
}
