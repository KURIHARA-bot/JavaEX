package jp.co.rakuspartners.java.basic2;

public class Ex16 {
    public static void main(String[] args) {
        
        Ex16Triathlete run = new Ex16Triathlete();

        run.move("サイクリングロード");
        run.changeTool("自転車");
        run.training();
        run.move("海");
        run.changeTool("シューズ");
        run.training();
        run.move("公園");
        run.changeTool("シューズ");
        run.training();
    }

}
