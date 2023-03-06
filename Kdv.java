import java.util.Scanner;
public class Kdv {
   public static void main(String[] args) {
    Scanner ham = new Scanner(System.in);

    System.out.println("lütfen ürünü okutunuz");
    double hamUcret = ham.nextDouble();
    double kdvİlkMiktarı = hamUcret*18/100;
    double kdvİkinciMiktarı = hamUcret*8/100;
    double kdvliİlkUcret= hamUcret*118/100;
    double kdvliBuyukUcret= hamUcret*108/100;
    
    double kdv = hamUcret>1000?kdvİkinciMiktarı:kdvİlkMiktarı;
    double kdvliUcret =hamUcret>1000?kdvliBuyukUcret:kdvliİlkUcret;

    System.out.println("kdv miktarınız  :"+ kdv );
    System.out.println("kdvli toplam bcretiniz  :"+kdvliUcret);
    System.out.println("kdv siz ücretiniz "+ hamUcret );

   }
    
   }

