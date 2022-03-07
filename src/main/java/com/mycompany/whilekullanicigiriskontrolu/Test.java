package com.mycompany.whilekullanicigiriskontrolu;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Furkan";
        String sys_parola = "12345";

        System.out.println("*********************************");
        System.out.println("Kullanici girisine hosgeldiniz...");
        System.out.println("*********************************");

        while (true) {
            System.out.println("Kullanici Adi : ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola : ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldiniz, " + kullanici);
                break;
            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                giris_hakki--;
                System.out.println("Parola Yanlıs... " + giris_hakki + " Giris Hakkiniz Kaldi.");
            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                giris_hakki--;
                System.out.println("Kullanici Adiniz Yanlıs... " + giris_hakki + " Giris Hakkiniz Kaldi.");
            } else {
                giris_hakki--;
                System.out.println("Kullanici Adiniz ve Parola Yanlıs... " + giris_hakki + " Giris Hakkiniz Kaldi.");
            }
            if (giris_hakki == 0) {
                System.out.println("Giris Hakkiniz Bitti.Tekrar Bekleriz..");
                break;
            }
        }
    }

}
