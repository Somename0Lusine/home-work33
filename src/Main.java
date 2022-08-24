
public class Main {

public static void main ( String [] args) throws Exception {

    BonusServisMilles service = new BonusServisMilles();
          int price = 20_000;
          int miles =  service.calculate(price);

    System.out.println("бонусные милли:"+ miles);

}




}
