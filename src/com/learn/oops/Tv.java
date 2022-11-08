package com.learn.oops;


public class Tv {
    String brand;
    String modelName;
    Integer screenSize;
    Integer price;
    String color;
    String displayType;
    
    void insertData(String b,String mm,Integer ss,Integer p,String c,String dt)
    {
    	brand=b;
    	modelName=mm;
    	screenSize=ss;
    	price=p;
    	color=c;
    	displayType=dt;
    }
void display()
{
	System.out.println("Display function : " + brand + " " + modelName);
}
    public static void main(String args[])
    {
        Tv lgOled= new Tv();
        Tv samsungFrame= new Tv();

        lgOled.brand="LG";
        lgOled.modelName="4K oled 75' tv";
        lgOled.screenSize=75;
        lgOled.price=100000;
        lgOled.color="black";
        lgOled.displayType="OLED";
System.out.println(lgOled.brand + " " + lgOled.modelName);

samsungFrame.insertData("Samsung", "65' Frame TV", 65, 100000,"Beige","LED");

System.out.println(samsungFrame.brand + " " + samsungFrame.modelName);

//calling display function

lgOled.display();
samsungFrame.display();
    }
}

