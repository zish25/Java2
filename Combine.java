import java.util.Scanner;
public class Combine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select one:");
        System.out.println("1:To print Welcome to Java Programming");
        System.out.println("2:Add Two Numbers Entered by the User");
        System.out.println("3:Calculate Difference, Product, and Division of Two Numbers");
        System.out.println("4:Find the Square of a Number");
        System.out.println("5:Check if a Number is Even or Odd");
        System.out.println("6:Check if a Number is Positive, Negative, or Zero");
        System.out.println("7:Find the Largest of Three Numbers");
        System.out.println("8:Print the Multiplication Table of a Given Number");
        System.out.println("9:Calculate the Factorial of a Number");
        System.out.println("10:Print All Even Numbers from 1 to 100");
        System.out.println("11:Check if a Given String is a Palindrome");
        System.out.println("12:Count the Number of Vowels in a Given String");
        System.out.println("13:Reverse the Digits of a Number");
        System.out.println("14:Check if a Given Number is a Palindrome");
        System.out.println("15:Find the Sum of Digits of a Number");
        System.out.println("16:Print the Fibonacci Series up to n Terms");
        System.out.println("17:Calculate the Sum of the First n Natural Numbers");
        System.out.println("18:Check if a Given Number is Prime");
        System.out.println("19:To Display student's details and grade");
        System.out.println("20:To check bank account simulation");
        System.out.println("21:Default Constructor");
        System.out.println("22:Parameterized constructor");
        System.out.println("23:Constructor overloading");
        System.out.println("24:Product counter");
        System.out.println("25:Temperature converter");
        System.out.println("26:To show Car Details");
        System.out.println("27:To show fibonacci series at a location");
        System.out.println("28:Calculate Sum of Digits of a Number");
        System.out.println("29:Text Analysis (Word Count, Find & Replace, etc.)");
        System.out.println("30:Check if a string is a palindrome");
        System.out.println("31:To demonstrate Garbage collection");
        System.out.println("32:Vehicle inheritance and demonstrate runtime polymorphism");
        System.out.println("Enter choice:-");
        int choice=sc.nextInt();
        int a=0;
        String str;
        switch(choice)
        {
            case 1:
                System.out.println("Welcome to Java Programming");
                break;

            case 2:
                System.out.print("Enter first number: ");
                int d=sc.nextInt();
                System.out.print("Enter second number: ");
                int b=sc.nextInt();
                int c=a+b;
                System.out.println("The sum is: " +c);
                break;

            case 3:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                c=a-b;
                d=a*b;
                float e=(float) a/b;
                System.out.println("Difference: " +c);
                System.out.println("Product: " +d);
                System.out.println("Division: " +e);
                break;

            case 4:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                b=a*a;
                System.out.println("The square of the number is: "+b);
                break;
                
            case 5:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                if (a%2==0) {
                    System.out.println("The number is even.");
                }
                else
                {
                    System.out.println("The number is odd.");
                }
                break;
                
            case 6:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                if (a>0) {
                    System.out.println("The number is positive.");
                }
                else if (a<0) {
                    System.out.println("The number is negative.");
                }
                else {
                    System.out.println("The number is zero.");
                }
                break;

            case 7:
                System.out.print("Enter first number: ");
                a=sc.nextInt();
                System.out.print("Enter second number: ");
                b=sc.nextInt();
                System.out.print("Enter third number: ");
                c=sc.nextInt();
                if(a>b && a>c)
                {
                    System.out.println("The largest number is: " +a);
                }
                else if(b>a && b>c)
                {
                    System.out.println("The largest number is: " +b);
                }
                else if(c>a && c>b)
                {
                    System.out.println("The largest number is: " +c);
                }
                else
                {
                    System.out.println("All are equal");
                }
                break;

            case 8:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                System.out.println("Table for" +a+ ":");
                for (int i=1;i<=10;i++)
                {
                    System.out.println(a+" x "+i+"="+(a* i));
                }
                break;

            case 9:
                b=1;
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                for (int i=1;i<=a;i++)
                {
                    b=b*i;
                }
                System.out.println("The factorial is: "+b);
                break;

            case 10:
                System.out.println("Even numbers from 1 to 100:");
                for (int i=1;i<=100;i++)
                {
                    if (i%2==0) {
                        System.out.println(i);
                    }
                }
                break;

            case 11:
                String s,r="";
                System.out.println("Enter a string: ");
                s=sc.nextLine();
                for (int i=s.length()-1;i>=0;i--) {
                    r=r+s.charAt(i);
                }
                if (s.equals(r)) {
                    System.out.println("It is a palindrome.");
                }
                else
                {
                    System.out.println("It is not a palindrome.");
                }
                break;

            case 12:
                c=0;
                System.out.print("Enter a string: ");
                str=sc.next().toLowerCase();
                for (char ch:str.toCharArray()) {
                    if ("aeiou".indexOf(ch)!=-1) {
                        c++;
                    }
                }
                System.out.println("Vowels: " +c);
                break;

            case 13:
                b=0;
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                while (a!= 0) {
                    b=b*10+a%10;
                    a/=10;
                }
                System.out.println("Reversed number: " +b);
                break;

            case 14:
                c=0;
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                b=a;
                while(a!= 0)
                {
                    c=c*10+a%10;
                    a/=10;
                }
                if (b==c) {
                    System.out.println("It is a palindrome.");
                }
                else
                {
                    System.out.println("It is not a palindrome.");
                }
                break;

            case 15:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                b=0;
                while(a!=0)
                {
                    b=b+(a%10);
                    a/=10;
                }
                System.out.println("Sum of digits: " +b);
                break;

            case 16:
                a=0;
                b=1;
                System.out.print("Enter the number:");
                c=sc.nextInt();
                System.out.println("Fibonacci series: ");
                System.out.println(a);
                System.out.println(b);
                for (int i=2;i<c;i++) {
                    d=a+b;
                    System.out.println(d);
                    a=b;
                    b=d;
                }
                break;

            case 17:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                if (a<1) {
                    System.out.println("Please enter a positive integer.");
                }
                else
                {
                    b=0;
                    for (int i = 1; i <=a; i++)
                    {
                        b=b+i;
                    }
                    System.out.println("The sum of natural numbers are: " +b);
                }
                break;

            case 18:
                System.out.print("Enter a number: ");
                a=sc.nextInt();
                if(a<=1)
                {
                    System.out.println("It is not a prime number.");
                }
                else
                {
                    for (int i=2;i<a;i++)
                    {
                        if (a%i==0)
                        {
                            System.out.println("It is not a prime number.");
                            return ;
                        }
                    }
                    System.out.println("It is a prime number.");
                }
                break;

            case 19:
                System.out.println("Displaying predefined student details:\n");
                C19 c191=new C19(1, "Shreyas", 85.5);
                C19 c192=new C19(2, "Vallabh", 92.0);
                C19 c193=new C19(3, "Zinath", 78.5);
                C19 c194=new C19(4, "Prachi", 95.0);
                C19 c195=new C19(5, "Atharva", 88.0);
                c191.displayDetails();
                c192.displayDetails();
                c193.displayDetails();
                c194.displayDetails();
                c195.displayDetails();
                break;

            case 20:
                System.out.println("Bank Account Operations:");
                C20 c201=new C20("SBI001", "Shreyas", 5000);
                C20 c202=new C20("SBI002", "Vallabh", 7000);
                c201.displayAccountDetails();
                c201.deposit(2000);
                c201.withdraw(3000);
                c201.withdraw(5000);
                c202.displayAccountDetails();
                c202.deposit(3000);
                c202.withdraw(1000);
                c202.withdraw(-500);
                break;

            case 21:
                System.out.println("Displaying predefined book details:\n");
                C21 c211=new C21();
                C21 c212=new C21();
                C21 c213=new C21();
                C21 c214=new C21();
                C21 c215=new C21();
                c211.title="Java Programming";
                c211.author="Shreyas";
                c211.price=599.99;
                c212.title="Python Basics";
                c212.author="Vallabh";
                c212.price=499.99;
                c213.title="Web Development";
                c213.author="Zinath";
                c213.price=699.99;
                c214.title="Data Science";
                c214.author="Prachi";
                c214.price=799.99;
                c215.title="AI Fundamentals";
                c215.author="Atharva";
                c215.price=899.99;
                c211.displayDetails();
                c212.displayDetails();
                c213.displayDetails();
                c214.displayDetails();
                c215.displayDetails();
                break;

            case 22:
                System.out.println("Displaying predefined employee details:\n");
                C22 c221=new C22(101, "Shreyas", 45000);
                C22 c222=new C22(102, "Vallabh", 50000);
                C22 c223=new C22(103, "Zeinth", 48000);
                C22 c224=new C22(104, "Prachi", 52000);
                C22 c225=new C22(105, "Atharva", 47000);
                c221.displayDetails();
                c222.displayDetails();
                c223.displayDetails();
                c224.displayDetails();
                c225.displayDetails();
                break;

            case 23:
                System.out.println("Displaying predefined shape details:\n");
                C23 c231=new C23();
                C23 c232=new C23(4.0, 5.0);
                C23 c233=new C23(6.5, 3.2);
                C23 c234=new C23();
                C23 c235=new C23(7.0, 8.5);
                c231.displayDetails("Shreyas");
                c232.displayDetails("Vallabh");
                c233.displayDetails("Zinath");
                c234.displayDetails("Prachi");
                c235.displayDetails("Atharva");
                break;

            case 24:
                System.out.println("Displaying Product Details and Total Product Count:");
                C24 c241=new C24("Shreyas Laptop", 75000);
                C24 c242=new C24("Vallabh Tablet", 35000);
                C24 c243=new C24("Zeinth Phone", 50000);
                C24 c244=new C24("Prachi Monitor", 20000);
                C24 c245=new C24("Atharva Keyboard", 5000);
                c241.displayDetails();
                c242.displayDetails();
                c243.displayDetails();
                c244.displayDetails();
                c245.displayDetails();
                C24.displayProductCount();
                break;

            case 25:
                System.out.println("Temperature Conversion:");
                System.out.println("Enter temperature in Celsius: ");
                double celsius=sc.nextDouble();
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit=sc.nextDouble();
                double f=ctf(celsius);
                double cl=ftc(fahrenheit);
                System.out.println(celsius + " C=" + f + " F");
                System.out.println(fahrenheit + " F=" + cl + " C");
                break;

            case 26:
                C26 c1=new C26("Toyota", "Camry", 30000.00);
                C26 c2=new C26("Honda", "Civic", 25000.00);
                System.out.println("Car 1 details:");
                c1.displayDetails();
                System.out.println("Car 2 details:");
                c2.displayDetails();
                break;

            case 27:
                System.out.println("Enter the position of the Fibonacci number you want: ");
                int n=sc.nextInt();
                int re=fibonacci(n);
                System.out.println("The "+n+"th Fibonacci number is: "+re);
                break;

            case 28:
                C28 C28=new C28();
                System.out.print("Enter a number: ");
                n=sc.nextInt();
                int result=C28.calculateSum(n);
                System.out.println("The sum of digits is: "+result);
                break;

            case 29:
                C29 c29=new C29();
                System.out.println("Enter a paragraph of text:");
                String text=sc.nextLine();
                text=sc.nextLine();
                System.out.println("1.Count the number of words: " +c29.count(text));
                System.out.print("2.Enter the word to find: ");
                String toFind=sc.nextLine();
                System.out.print("Enter the word to replace it with: ");
                String toReplace=sc.nextLine();
                System.out.println("Text after replacement: " +c29.Replace(text, toFind, toReplace));
                System.out.println("3.First sentence: " +c29.First(text));
                System.out.println("4.Text in uppercase: " +c29.Upper(text));
                System.out.println("Text in lowercase: " +c29.Lower(text));
                break;

            case 30:
                C30 c30=new C30();
                System.out.print("Enter a string: ");
                String input=sc.next();
                boolean p=c30.p(input);
                if (p) {
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("It is not a palindrome.");
                }
                break;

            case 31:
                System.out.println("Demonstrating Garbage Collection...");
                Resource r1=new Resource();
                Resource r2=new Resource();
                r1=null;
                r2=null;
                System.out.println("Requesting garbage collection...");
                System.gc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Program execution continues...");
                break;

            case 32:
                Car4 c4=new Car4();
                c4.move();
                Bike4 bike=new Bike4();
                bike.move();
                break;

            default:
                System.out.println("Invaild");
                break;
        }
    }

    //Case 25
    public static double ctf(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double ftc(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    //Case 27
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Cae 31
    static class Resource {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Resource object is being garbage collected.");
        }
    }
}

//CAase 19
class C19 {
    int id;
    String name;
    double marks;
    C19(int studentId, String studentName, double studentMarks) {
        id = studentId;
        name = studentName;
        marks = studentMarks;
    }
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}

//Case 20
class C20 {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    C20(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n₹" + amount + " deposited successfully");
            displayBalance();
        } else {
            System.out.println("\nInvalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n₹" + amount + " withdrawn successfully");
            displayBalance();
        } else if (amount > balance) {
            System.out.println("\nInsufficient balance! Current balance: ₹" + balance);
        } else {
            System.out.println("\nInvalid withdrawal amount");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        displayBalance();
    }
}

//Case 21
class C21 {
    String title;
    String author;
    double price;
    C21() {
        title = "Unknown";
        author = "Anonymous";
        price = 0.0;
    }
    void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

//Case 22
class C22 {
    int id;
    String name;
    double salary;
    C22(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

//Case 23
class C23 {
    private String shapeType;
    private double radius;
    private double length;
    private double breadth;
    public C23() {
        this.shapeType = "Circle";
        this.radius = 1.0;
    }
    public C23(double length, double breadth) {
        this.shapeType = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {
        if (shapeType.equals("Circle")) {
            return Math.PI * radius * radius;
        } else if (shapeType.equals("Rectangle")) {
            return length * breadth;
        } else {
            return 0;
        }
    }
    public void displayDetails(String name) {
        System.out.println("Name: " + name);
        System.out.println("Shape Type: " + shapeType);
        if (shapeType.equals("Circle")) {
            System.out.println("Radius: " + radius);
        } else if (shapeType.equals("Rectangle")) {
            System.out.println("Length: " + length);
            System.out.println("Breadth: " + breadth);
        }
        System.out.println("Area: " + calculateArea());
        System.out.println("--------------------------");
    }
}

//Case 24
class C24 {
    private static int productCount = 0;
    private String name;
    private double price;
    public C24(String name, double price) {
        this.name = name;
        this.price = price;
        productCount++;
    }
    public static void displayProductCount() {
        System.out.println("Total Products Created: " + productCount);
    }
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

//Case 26
class C26 {
    private String brand;
    private String model;
    private double price;

    public C26(String brand, String model, double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public void displayDetails() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: $"+price);
    }
}

//Case 28
class C28{
    public int calculateSum(int n){
        if (n==0) {
            return 0;
        }
        return n%10+calculateSum(n/10);
    }
}

//Case 29
class C29 {
    public int count(String text) {
        String[] w=text.split("\\s+");
        return w.length;
    }
    public String Replace(String text, String toFind, String toReplace) {
        return text.replace(toFind, toReplace);
    }

    public String First(String text) {
        int endIndex=text.indexOf('.');
        if (endIndex!=-1) {
            return text.substring(0, endIndex+1).trim();
        }
        return text;
    }
    public String Upper(String text) {
        return text.toUpperCase();
    }
    public String Lower(String text) {
        return text.toLowerCase();
    }
}

//Case 30
class C30 {
    public boolean p(String text) {
        text=text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right=text.length() - 1;
        while (left<right) {
            if(text.charAt(left)!=text.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

//case 32
class Vehicle4 {
    public void move() {
        System.out.println("Its Vehicle");
    }
}
class Car4 extends Vehicle3 {
    @Override
    public void move() {
        System.out.println("Its Car.");
    }
}
class Bike4 extends Vehicle3 {
    @Override
    public void move() {
        System.out.println("Its Bike.");
    }
}
