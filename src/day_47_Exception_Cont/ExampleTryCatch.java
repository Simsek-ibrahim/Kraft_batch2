package day_47_Exception_Cont;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTryCatch {
    public static void main(String[] args) {

        //integer değişken kabul eden bir metot yazın
        //kullanıcıdan tek bir giriş sağlayın
        //kullanıcı integer dışında bir değer girerse  "Lütfen tekrar deneyiniz" hata mesajı verin
        //kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin
        /*boolean devam=true;
        while(devam){

            try {
                Scanner scan=new Scanner(System.in);
                System.out.print("Sayı: ");
                int x=scan.nextInt();
            }catch (Exception e){
                System.out.println("Lütfen tekrar deneyiniz");
                continue;
            }
            System.out.println("programdan çıkış yapılıyor");
            devam=false;


        }

        // 2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        //2 adet catch bloğu kullanın sonunda finally bloğunu kullanın



boolean devam=true;


        while (devam){

            Scanner scan=new Scanner(System.in);

            try {
                System.out.print("Sayi : "); int x=scan.nextInt();
                System.out.print("Bölüm : "); int y=scan.nextInt();
                System.out.println("sonuc"+(x/y));
            }catch (ArithmeticException a){
                System.out.println("aritmetik bir hata mevcut tekrar deneyiniz");
                continue;
            }catch (Exception e){
                System.out.println("Hata alındı, tekrar deneyiniz");
                continue;
            }finally {
                System.out.println("(finally block uyarıyor) Daha dikkatli olun ");
            }

            devam=false;

        }



        //personel islerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde
        //id gönderin (arr[]={}) bu idlerin içerisinde 0 var ise IllegalArgumentException hatası verin
        //bunu bir checkArrayId metodunun içerinde yapın true veya false retun edebilirsiniz
        // yada 0 veya 1 döndürebilirsiniz

        int arr[]={111,125,0,36};
        try {
            System.out.println(checkArrayId(arr));
        }catch (IllegalArgumentException e){
           e.printStackTrace();
            System.out.println("Uygun olmayan Personel Id tespit edildi");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Bilinmeyen bir hata tespit edildi");
        }
        System.out.println("programa devam ediliyor");
      */

        //array içerinde en büyük sayının index numarasını getiren metodu yazınız
        //eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.


    }
    //1,2 ,5,4,5   1,2,4,5,5
    /*public static int maxNumberIndex(int[] array) throws Exception {
        int arr[]=array;
        int indexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];
        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }

        for(int i=0; i<array.length; i++){
            if(array[i]==x){
                indexNumber=i;
            }

        }
        return indexNumber;
    }



    public static int maxNumber(int[] arr){

        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];




        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;



    }











    public static boolean checkArrayId(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                throw new IllegalArgumentException("Perdonel ID sıfır olamaz");
            }

        }
        return true;

    }
*/
}