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
        System.out.println("              ");
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: "+ mesaj.length());
        System.out.println("5.eleman: "+ mesaj.charAt(4));
        System.out.println(mesaj.concat(" yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime: mesaj.split("-")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

        int number = 25;
        int remainder = number % 2 ;
        System.out.println(remainder);
        for(int as=1;as<=25;as++){
            remainder = number % as;
            if(remainder==0){
                if ((as!=25) && (as!=1)){
                    System.out.println("asal böleni: "+ as);
                }
            }
        }

        char harf = 'I';

        switch (harf){
            case'A':
            case'I':
            case'O':
            case'U':
                System.out.println("Kalın sesli harf.");
                break;
            default:
                System.out.println("İnce sesli harf.");
        }
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        int namber = 28;
        int total1 = 0;

        for (int ii=1; ii<namber;ii++){
            if(namber % ii ==0){
                total1 = total1 + ii;
            }
        }
        if(total1 == namber){
            System.out.println("Mükemmel sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }
        //220-284

        int sayia1 = 220;
        int sayia2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int iii=1;iii<sayia1;iii++){
            if(sayia1 % iii ==0){
                toplam1 = toplam1 +iii;
            }
        }

        for (int iii=1;iii<sayia2;iii++){
            if(sayia2 % iii ==0){
                toplam2 = toplam2 +iii;
            }
        }

        if (sayia1==toplam2 && sayia2==toplam1){
            System.out.println("Bu iki sayi arkadaştır");
        }
        else{
            System.out.println("Bu iki sayi arkadaş değildir");
        }

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;

        for (int sayi: sayilar){
            if(sayi==aranacak){
                System.out.println("Sayi mevcuttur.");
            }
        }




    }
}