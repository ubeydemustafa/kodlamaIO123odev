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

        int j = 100;

        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("do-while döngüsü bitti");


        String ogrenci1 = "engin";
        String ogrenci2 = "derin";
        String ogrenci3 = "salih";
        String ogrenci4 = "ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "engin";
        ogrenciler[1] = "derin";
        ogrenciler[2] = "salih";
        ogrenciler[3] = "ahmet";

        for (int k=0;k<ogrenciler.length;k++){
            System.out.println(ogrenciler[k]);
        }
        System.out.println(" ");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

        double[] mylist = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = mylist[0];

        for (double number:mylist) {
            if (max<number){
                max=number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam " + total);
        System.out.println("en büyük " + max);

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int g=0;g<=2;g++){
            for (int r=0;r<=2;r++){
                System.out.print(sehirler[g][r] + " ");
            }
            System.out.println("");
        }





    }
}