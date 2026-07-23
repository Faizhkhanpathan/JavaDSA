import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(str);
    }
}

---------------------------------------------------------------------------------------

import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:");
    int a=sc.nextInt();
    System.out.println("Enter b:");
    int b=sc.nextInt();
    System.out.println("Sum is:");
    int sum=a+b;
    System.out.println(sum);
    }
}
---------------------------------------------------------------------------------------

Type conversion:
Implicit conversion:

import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    float b=a;
    System.out.println(b);
    }
}



Explicit conversion:

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        int b=(int)a;
        System.out.println(b);
        
    }
}

----------------------------------------------------------------------------------------