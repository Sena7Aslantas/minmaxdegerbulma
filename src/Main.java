import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.print("Dizi elemanlarından bir tane eleman seciniz:");

        Scanner deger=new Scanner(System.in);
        int sayi=deger.nextInt();
        System.out.println("Girilen sayı:"+sayi);
        int index = Arrays.binarySearch(list,sayi);
        System.out.println("Girilen sayın indeksi :" + index);
        int listSize= list.length;

        if((index-1)!=-1) {
            int min = list[index - 1];
            System.out.println("Girilen sayıdan kucuk en yakın deger: " + min);
        }
        else{
            System.out.println("Girdiğiniz sayıdan kucuk eleman bulunmamaktadır.");
        }
        if((index+1)>=listSize){
            System.out.println("Girilen sayıdan buyuk eleman bulunamadı.");
        }else {
            int max = list[index + 1];
            System.out.println("Girilen sayıdan buyuk en yakın deger: " + max);
        }





    }
}