package jp.co.rakuspartners.java.basic2;

public class Ex13ElectricCar {
    int battery; // バッテリー残量
    boolean power; // 電源

    public void powerOn() {
        if(battery<=0){
            System.out.println("充電してください");}
            else{power = true;}
    }

    public void powerOff() { // 電源を切る
        power = false;
    }

    public void chargeToFull() { // 満充電する
        battery = 100;
    }

    public void move(String place) { // 指定場所へ移動する
        if (!power) { // power == falseと同じ意味
            System.out.println("電源を入れてください");
            return; // メソッドがここで終わり呼び出し元に処理が移る
        }

        System.out.println(place + "へ移動しました");
        battery = battery - 50;

        // バッテリー残量が0以下なら電源を切る
        if (battery <= 0) {
            battery = 0;
            power = false;
        }
    }
}
