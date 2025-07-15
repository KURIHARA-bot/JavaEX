package jp.co.rakuspartners.java.basic2;

public class Ex16Triathlete {
    String place;
    String tool;


        public Ex16Triathlete(String place, String tool) {
        this.place = place;
        this.tool = tool;
    }
        void move(String newPlace){
            if(place.equals(newPlace)){
                System.out.println("既に" + place + "にいます");
            }else{
            System.out.println( place + "から" + newPlace+ "へ移動しました");
            place = newPlace;
        }
    }
        void changeTool(String newTool){
            if(this.tool.equals(newTool)){
                System.out.println("既に" + tool + "を使っています");
            }else{
                System.out.println(tool + "から"+ newTool + "にツールを変更しました");
                tool = newTool;
            }
        }

        void training(){
            System.out.println(place + "で" + tool + "を使用します");
        if(place.equals("海") && tool.equals("水着")){
            System.out.println("泳ぎの練習をしました");
        }else if(place.equals("サイクリングロード")&& tool.equals("自転車")){
            System.out.println("自転車の練習をしました");
        }else if(place.equals("公園")&& tool.equals("シューズ")){
            System.out.println("走りの練習をしました");
        }else{System.out.println("練習できませんでした");}

        }
        }
