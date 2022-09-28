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


        char grade ='A';

        switch (grade){
            case 'A':
                System.out.println("mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("çok güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("maalesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }
        System.out.println("-------------------------------------------------------");
        for (int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");

        //while
        int i =1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");





    }
}