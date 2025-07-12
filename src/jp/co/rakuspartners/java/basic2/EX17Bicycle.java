package jp.co.rakuspartners.java.basic2;

public class EX17Bicycle {
    String bearing;
    
    void setBearing(String bearing){
        this.bearing = bearing;

    }

    void turnLeft(){
        if(bearing.equals("北")){
            bearing ="西";
        }else if(bearing.equals("西")){
            bearing="南";
        }else if(bearing.equals("南")){
            bearing="東";
        }else{bearing="北"; 
    }   System.out.println("左へ曲がったので"+ bearing+"を向きました。");
}

    void turnRight(){
        if(bearing.equals("北")){
            bearing="東";
        }else if(bearing.equals("西")){
            bearing="北";
        }else if(bearing.equals("南")){
            bearing="西";
        }else{bearing="南"; 
    } System.out.println("右へ曲がったので" + bearing + "を向きました。");
}


    void display(){
        System.out.println(bearing);
    }

}
