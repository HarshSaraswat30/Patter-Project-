import java.util.Scanner;

class pattern
{
    Scanner x = new Scanner(System.in);
    int i,j,n;
    void choose()
    {
        System.out.print("\n\t Entera Size of  --  ");
        n=x.nextInt();
        select();
    }
    void select()
   {
       System.out.println("Choose a Pattern You want : ");
       System.out.println("\n\t\t\t\t\t1.Square Hollow Pattern ");
       System.out.println("\t\t\t\t\t2.Number Triangular");
       System.out.println("\t\t\t\t\t3.Zero-One Triangle");
       System.out.println("\t\t\t\t\t4.Hollow Triangle Pattern ");
       System.out.println("\t\t\t\t\t5.Triangle Star Pattern");
       System.out.println("\t\t\t\t\t6.Square Fill Pattern");
       System.out.println("\t\t\t\t\t7.Rhombus Pattern");
       System.out.println("\t\t\t\t\t8.Diamond Pattern");
       System.out.println("\t\t\t\t\t9.Number Increasing Pattern");
       char m;
        m = x.next().charAt(0);
        if(m == '1')
        sqrehlw();
        else if(m == '2')
        nmber();
        else if(m == '3')
        zrone();
        else if(m == '4')
        hlwtr();
        else if(m == '5')
        trstr();
        else if(m == '6')
        sqfi();
         else if(m == '7')
        rom();
         else if(m == '8')
        dim();
         else if(m == '9')
        nmin();
        else
        {
          System.out.println(" Choose your correct option :\n");
          select();
        }
        System.out.printf("\n\t\t-> Want To Continue This Program? [Press 'y'] ");
        System.out.printf("\n\t\t-> Want to Continue From Starting with a new size? [Press 'n'] ");
        System.out.printf("\n\t\t-> for Exit the Program Press Any key ");
                char d;
                d = x.next().charAt(0);
                if(d=='y'||d=='Y'){
                   select();
                }
                else if(d=='n'||d=='N')
                {
                  choose();
                }
                else{
                        System.out.printf("\n\n\n\t\t\t\t\tThankyouuu For Your Precious Time !!\n\n");
        }
    }
    void sqrehlw()
   {
        System.out.println("\n\t\t<----Square Hollow Pattern---->\n\n");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i == 1|| j == 1 || i == n || j == n?"*":" ") ;
            }
            System.out.println();
        }
    }
    void nmber()
    {
        int t=0;
        System.out.print("\n\t\t<----Number Triangular pattern---->\n\n");
        for(i=1;i<=n;i++)
        {
            System.out.println(t=(t*10+i));
        }
    }
    void zrone()
    {
        System.out.println("\n\t\t<----Zero-One Triangle---->\n\n");
        int x =1;
        for(i=1;i<=n;i++)
        { 
            x=(i%2==0)?0:1;
            for(j=1;j<=i;j++)
            {
                System.out.print(x=(x==1)?0:1);
            }
            System.out.println();
        }
    }
   void hlwtr()
    {
        System.out.println("\n\t\t\t\t\t<----Hollow Triangle Pattern---->\n\n");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j==1||j==i||i==n?"*":" ");
            }
            System.out.println();
        }

    }
    void trstr()
    {
        int x=0;
        System.out.println("\n\t\t\t\t\t<----Triangle Star Pattern---->\n\n");
        for(i=1;i<=n;i++,x++)
        {
            System.out.print(" ".repeat(n-i));
            for(j=1;j<=i+x;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }

    }
   void sqfi()
    {
        System.out.println("\n\t\t\t\t\t<----Square Fill Pattern---->\n\n");
        for(i=1;i<=n;i++)
        {
    
            for(j=1;j<=n;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
   void rom()
    {
        System.out.println("\n\t\t\t\t\t<----Rhombus Pattern---->\n\n");
        for(i=1;i<=n;i++)
        {
            System.out.print(" ".repeat(i-1));
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void dim()
    {
        System.out.println("\n\t\t\t\t\t<----Diamond Pattern---->\n\n");
        for(i=1;i<=(n+n-1);i++)
        {
            if(i<=n)
            {
                System.out.print(" ".repeat(n-i));
                for(j=1;j<=i;j++)
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ".repeat(i-n));
                for(j=1;j<=(n+n-i);j++)
                System.out.print("* ");
            }
             System.out.println();
        }
    }
    void nmin()
    {
        System.out.println("\n\t\t\t\t\t<----Number Increasing Pyramid---->\n\n");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class project1 {

    public static void main(String[] args) {
        pattern n=new pattern();
        System.out.print("\n\t\t Choose a choice:--");
        System.out.print("\n\t\t 1.Patterns:");
        Scanner x=new Scanner(System.in);
        char ch;
        ch=x.nextLine().charAt(0);
        if(ch=='1')
        {
            System.out.print("\n\t you have choose a pattern");
            n.choose();
        }
    }
}