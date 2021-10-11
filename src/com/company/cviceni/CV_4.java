package com.company.cviceni;
import java.util.Scanner;
public class CV_4 {
    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);
        /*
        boolean flag = true;
        int pocet = 1;
        int nahodneCislo = (int) ((Math.random() * 100) + 1);
        System.out.println(nahodneCislo);
        System.out.println("Hádej číslo 1-100: ");
        System.out.println("Mate pouze 5 pokusu");
        int hadaneCislo = vstup.nextInt();

        while ((hadaneCislo != nahodneCislo)) {
            if(pocet>5)
            {
                flag= false;
                break;
            }
            System.out.println(pocet + ". pokus");
            if (hadaneCislo < nahodneCislo) {
                System.out.print("Zkus větší číslo: ");
            } else if(hadaneCislo > nahodneCislo) {
                System.out.print("Zkus menší číslo: ");
            }

            hadaneCislo = vstup.nextInt();
            pocet++;
        }
        if(flag) {
            System.out.print("Uhodl jste číslo");
        }else{
            System.out.print("Neuhodl jste číslo");
        }
        */
        int pokus = 0;
         final int pocet = 6;
         String enter = "";
        boolean hrajePocitac = true;
        int poziceKulkyVBubinku = (int) (Math.random() * pocet); // pozice kulky v šestiranném bubínku revolveru
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * pocet); // říká, který z otvorů bubínku je vybrán ke střelbě

        System.out.println("Hraje PC");
        System.out.println("Zmacknete enter, aby vystrelit");

        while (poziceKulkyVBubinku != poziceBubinku) {
            if(vstup.nextLine() == enter)
            {
                pokus++;
                System.out.println(pokus + ". pokus");
                System.out.println("Nic!");
                if(pokus > 2) {
                    poziceBubinku = (int) (Math.random() * pocet);
                }else{
                    if(poziceBubinku>pocet)
                    {
                        poziceBubinku = 0;
                    }
                    poziceBubinku++;
                }

                hrajePocitac = !hrajePocitac;
                if (hrajePocitac) {
                    System.out.println("Hraje PC");
                } else {
                    System.out.println("Hraješ ty");
                }
            }
            System.out.println("Zmacknete enter, aby vystrelit");

        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi! :)");
        } else {
            System.out.println("Prohrál jsi :(");
        }

        // -- dodatečné úkoly --
        // přidat čekání na akci (zmáčknutí spouště) uživatele
        // předělat magickou konstantu 6 na pojmenovanou konstantu a zkoušet hru s různými počty otvorů v revolveru
        // předělat hru na extrémnější variantu, kde se od druhého pokusu už netočí a jde se dál,
        // - tady potřeba napojit konec bubínku na začátek bubínku, aby se pořád otáčel dokola (int proměnná, co se bude zvyšovat a pak modulo % nebo nulování za koncem)
    }
}
