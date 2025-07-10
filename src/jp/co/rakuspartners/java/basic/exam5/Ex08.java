package jp.co.rakuspartners.java.basic.exam5;

public class Ex08 {
    public static void main(String[] args) {
        int tmp = 38;
        int cold = 37;
        int abnormal = 42;
        if (tmp <= cold){System.out.println("正常");}
        else if (tmp > cold && tmp <= abnormal){System.out.println("風邪");}
        else {System.out.println("異常");}

    }

}
