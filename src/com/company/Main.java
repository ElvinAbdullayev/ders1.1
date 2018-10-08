package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //tapsiriq1
      /*  int birincisayi, ikincisayi, cem, ferq, hasil,bolme;
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayini daxil edin");
        birincisayi = scanner.nextInt();
        System.out.println("ikinci sayini daxil edin");
        ikincisayi = scanner.nextInt();
        cem = birincisayi + ikincisayi;
        System.out.println("Saylarin toplami" + cem);
        ferq = birincisayi - ikincisayi;
        System.out.println("Saylarin ferqi" + ferq);
        hasil = birincisayi * ikincisayi;
        System.out.println("Saylarin hasili"+ hasil);
        bolme = birincisayi / ikincisayi;
        System.out.println("Saylarin bolumu"+ bolme);*/



         //tapsiriq2
      /*  int a,b;
              Scanner scanner = new Scanner(System.in);
              System.out.println("birinci sayini daxil edin");
              a = scanner.nextInt();
              System.out.println("ikinci sayini daxil edin");
              b = scanner.nextInt();
              if (a>b)
                  System.out.println(a);
              else if(b>a)
                  System.out.println(b);
              else
                  System.out.println("ededler beraberdir");*/


      //taosiriq3
        /*int a,b,perimetir,sahe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("duzbucaqlinin uzunluqunu daxil edin");
        a = scanner.nextInt();
        System.out.println("duzbucaqlinin enini daxil edin");
        b = scanner.nextInt();
        perimetir=2*(a+b);
        System.out.println("duzbucaqlinin perimetri=" + perimetir);
        sahe=a*b;
        System.out.println("duzbucaqlinin sahesi=" + sahe);*/


        //tapsiriq4
       /* int r,s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dairenin radiusunu daxil edin");
        r = scanner.nextInt();
        s=  ((int)Math.PI * (r * r));
        System.out.println("dairenin sahesi=" + s);*/


       //tapsiriq6
      /*  int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin");
        a = scanner.nextInt();
        if(a%2==0)
        System.out.println("daxil etdiyiniz eded cutdur");
       else if(a%2==1)
            System.out.println("daxil etdiyiniz eded tekdir");*/



      //tapsiriq7
       /* int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin");
        a = scanner.nextInt();
        if(a>0)
            System.out.println("daxil etdiyiniz eded musbetdir");
        else if(a<0)
            System.out.println("daxil etdiyiniz eded menfidir");
        else
            System.out.println("daxil etdiyiniz eded ne menfi ne musbetdir");*/



       //tapsiriq8
       /* int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        b = scanner.nextInt();
        System.out.println("ucuncu ededi daxil edin");
        c = scanner.nextInt();

        if(a>b&&a>c)
            System.out.println("ededlerin en boyuku"+a);
        else if(b>a&&b>c)
        System.out.println("ededlerin en boyuku"+b);
        else if(c>a&&c>b)
        System.out.println("ededlerin en boyuku"+c);


        if(a<b&& a<c)
            System.out.println("ededlerin en kiciyi"+a);
        else if(b<a&&b<c)
            System.out.println("ededlerin en kiciyi"+b);
        else if(c<a&&c<b)
            System.out.println("ededlerin en kiciyi"+c);*/



        //tapsiriq9
        /*int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("absisi daxil edin");
        x = scanner.nextInt();
        System.out.println("ordinanti daxil edin");
        y = scanner.nextInt();
        if(x>0&&y>0)
            System.out.println("kordinantlarin kesismesi birinci rubde yerlesir");
        if(x<0&&y>0)
            System.out.println("kordinantlarin kesismesi ikinci rubde yerlesir");
        if(x<0&&y<0)
            System.out.println("kordinantlarin kesismesi ucuncu rubde yerlesir");
        if(x>0&&y<0)
            System.out.println("kordinantlarin kesismesi ucuncu rubde yerlesir");*/




        //tapsiriq10
       /* System.out.println("Fizika");
        int x,y,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("duzgun cvblarin sayin daxil edin");
        x = scanner.nextInt();
        System.out.println("yanlis cvblarin sayin daxil edin");
        y = scanner.nextInt();
        c=8*x-2*y;
        System.out.println("fizikadan baliniz"+c);


        System.out.println("Riyyaziyyat");
        int a,b,d;
        System.out.println("duzgun cvblarin sayin daxil edin");
        a = scanner.nextInt();
        System.out.println("yanlis cvblarin sayin daxil edin");
        b = scanner.nextInt();
        d=8*a-2*b;
        System.out.println("Riyaziyyatdan baliniz"+d);


        System.out.println("Kimya");
        int q,w,e;
        System.out.println("duzgun cvblarin sayin daxil edin");
        q = scanner.nextInt();
        System.out.println("yanlis cvblarin sayin daxil edin");
        w = scanner.nextInt();
        e=4*q-w;
        System.out.println("Kimyadan baliniz"+e);



        System.out.println("Ana dili");
        int r,t,u;
        System.out.println("duzgun cvblarin sayin daxil edin");
        r = scanner.nextInt();
        System.out.println("yanlis cvblarin sayin daxil edin");
        t = scanner.nextInt();
        u=4*r-t;
        System.out.println("Ana dilinden baliniz"+u);



        System.out.println("Xarici dili");
        int v,n,m;
        System.out.println("duzgun cvblarin sayin daxil edin");
        v = scanner.nextInt();
        System.out.println("yanlis cvblarin sayin daxil edin");
        n = scanner.nextInt();
        m=4*v-n;
        System.out.println("Xarici dilinden baliniz"+m);

        int j;
        System.out.println("cem bal");
        j=c+d+e+u+m;
        System.out.println("TQDKdan cem baliniz="+j);*/


       //tapsiriq11
       /* int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("balinizi daxil edin");
        x = scanner.nextInt();
        if(x>0&&x<51)
            System.out.println("F");
        else if(x>=51&&x<61)
            System.out.println("E");
        else if(x>=61&&x<71)
            System.out.println("D");
        else if(x>=71&&x<81)
            System.out.println("C");
        else if(x>=81&&x<91)
            System.out.println("B");
        else if(x>=91&&x<=100)
            System.out.println("A");
        else
            System.out.println("Yanlis eded daxil etmisiniz");*/



//tapsiriq bonus
      /*  int x,y,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci terefi daxil edin");
        x = scanner.nextInt();
        System.out.println("ikinci terefi daxil edin");
        y = scanner.nextInt();
        System.out.println("ucuncu terefi daxil edin");
        c = scanner.nextInt();
        if(x+y>c&&x+c>y&&y+c>x)
            System.out.println("beli ola biler");
            else
            System.out.println("xeyir ola bilmez");*/
      //tapsiriq5
        /*System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");



        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");

        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");


        System.out.println("     *    ");
        System.out.println("    * *    ");
        System.out.println("   *   *    ");
        System.out.println("  *     *    ");
        System.out.println(" *       *    ");
        System.out.println("  *     *    ");
        System.out.println("   *   *    ");
        System.out.println("    * *    ");
        System.out.println("     *    ");*/




    }
}
