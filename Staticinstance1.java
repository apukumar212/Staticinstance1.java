package com.task1;

public class Staticinstance1 
{
int c;
static int e;
Staticinstance1()
{
	System.out.println(++c);
	System.out.println(++e);
}
public static void main(String[] args) 
{
int a=34;
int b=21;
new Staticinstance1().c-=a++ + ++b;
int d=--a + --b + new Staticinstance1().c--;
e=a + +b+ + new Staticinstance1().c+d--;
int f=-a + b-- + -new Staticinstance1().c-d++;
int sum=a+b+new Staticinstance1().c+d+e+f;
System.out.println("sum="+sum);
}
}
