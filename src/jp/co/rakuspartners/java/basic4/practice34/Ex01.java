package jp.co.rakuspartners.java.basic4.practice34;

public class Ex01 {
    public static void main(String[] args) {
        
        ShoppingCart shoppingCart = new ShoppingCart();

        Book book1 =new Book();
        Book book2 =new Book();

        book1.setName("本1");
        book2.setName("本2");
        book1.setPrice(100);
        book2.setPrice(100);

        shoppingCart.addItem(book1);
        shoppingCart.addItem(book2);

        System.out.println(shoppingCart.getItemSize());
        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getAverage());




        
    }

}
