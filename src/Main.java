public class Main {
    public static void main(String[] args) {
        System.out.println("merhaba zalim dünya");
        String text = "Erciyes üniversitesinden selamlar ";
        int x = 10;
        double y = 11.1;
        char karakter = 'a';
        boolean dogruMu = false;
        System.out.println(text);
        System.out.println(text+x);
        System.out.println(text+x);
        System.out.println(text+x);
        System.out.println(text+x);
        System.out.println(text+x);
        if(dogruMu == true){
            System.out.println(karakter);
        } else if (x < y) {
            System.out.println("y büyük abi");
        } else{
            System.out.println("bir tuhaflık var");
        }
        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 18;

        int enBuyukSayi = sayi1;

        if(enBuyukSayi<sayi2){
            enBuyukSayi = sayi2;
        }
        if (enBuyukSayi<sayi3){
            enBuyukSayi = sayi3;
        }
        System.out.println("en büyük sayı: "+enBuyukSayi);


    }
}