package jp.co.rakuspartners.java.basic4.practice34;

public class Ex05 {
/**
 * 1年の月を表すEnum
 */
public enum Month{
    JANUARY(1,"1月","最初の月です","お正月"),
    FEBRUARY(2, "2月", "2番目の月です。", "バレンタインデー"),
	MARCH(3, "3月", "3番目の月です。", "卒業式"), 
	APRIL(4, "4月", "4番目の月です。", "入学式"), 
	MAY(5, "5月", "5番目の月です。", "ゴールデンウィーク"),
	JUNE(6, "6月", "6番目の月です。", "梅雨入り"), 
	JULY(7, "7月", "7番目の月です。", "夏休み開始"), 
	AUGUST(8, "8月", "8番目の月です。", "お盆、夏休み"),
	SEPTEMBER(9, "9月", "9番目の月です。", "敬老の日"), 
	OCTOBER(10, "10月", "10番目の月です。", "ハロウィン"),
	NOVEMBER(11, "11月", "11番目の月です。", "七五三"), 
	DECEMBER(12, "12月", "最後の月です。", "クリスマス"),
	;
 /**
  * 月の数字
  */
  private final int monthNumber;
  /** 月の数字(日本語) */
	private final String japanese;
	/** 月の説明 */
	private final String description;
	/** イベント */
	private final String event;
    /*
     * コンストラクタ
     * @param monthNumber 月の数字
     * @param Japanese    月の数字(日本語)
	 * @param description 月の説明
	 * @param event       イベント

     */
    private Month(int monthNumber, String japanese, String description, String event) {
        this.monthNumber = monthNumber;
        this.japanese = japanese;
        this.description = description;
        this.event = event;
    }

    /**
     * 
     * 月の数字から1年の月を表す
     * @param monthNumber　月の数字
     * @return　月を表すEnum
     */

     public static Month of(int monthNumber){
        for(Month month:Month.values()){
            if(month.monthNumber==monthNumber){
                return month;
            }
        }throw new IndexOutOfBoundsException("The value of number of month doesn't exist.");
	}

     public int getMonthNumber() {
        return monthNumber;
    }

     public String getJapanese() {
        return japanese;
    }

     public String getDescription() {
        return description;
    }

     public String getEvent() {
        return event;
    }

    

     }

    


}
