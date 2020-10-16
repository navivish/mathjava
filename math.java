//Author  : Vaishnavi Sheoran.
//Date      : 18/02/2020.
//Purpose: Applying functions of math class.


import java.io.*;
class math
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
System.out.println("Input two Numbers");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
System.out.println("\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\t\tOUTPUT:\t\t\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\n\n");
System.out.println("\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
System.out.println("Sine of I no.->\t\t\t\t"+Math.sin(a));
System.out.println("Cosine of I no.->\t\t\t"+Math.cos(a));
System.out.println("Tangent of I no.->\t\t\t"+Math.tan(a));
System.out.println("Angle whose sine is I no.->\t\t"+Math.asin(a));
System.out.println("Angle whose cosine is I no.->\t\t"+Math.acos(a));
System.out.println("Angle whose tangent is I no.->\t\t"+Math.atan(a));
System.out.println("Angle whose tangent is I no./II no.->\t"+Math.atan2(a,b));
System.out.println("\nI no. raised to II no.->\t\t"+Math.pow(a,b));
System.out.println("e raised to I no.->\t\t\t"+Math.exp(a));
System.out.println("Natural logarithm of I no.->\t\t"+Math.log(a));
System.out.println("Square root of I no.->\t\t\t"+Math.sqrt(a));
System.out.println("Rounded up of I no.->\t\t\t"+Math.ceil(a));
System.out.println("Rounded down of I no.->\t\t\t"+Math.floor(a));
System.out.println("Truncated value of I no.->\t\t"+Math.rint(a));
System.out.println("Absolute value of I no.->\t\t"+Math.abs(a));
System.out.println("\nSine of II no.->\t\t\t"+Math.sin(b));
System.out.println("Cosine of II no.->\t\t\t"+Math.cos(b));
System.out.println("Tangent of II no.->\t\t\t"+Math.tan(b));
System.out.println("Angle whose sine is II no.->\t\t"+Math.asin(b));
System.out.println("Angle whose cosine is II no.->\t\t"+Math.acos(b));
System.out.println("Angle whose tangent is II no.->\t\t"+Math.atan(b));
System.out.println("Angle whose tangent is II no./I no.->\t"+Math.atan2(b,a));
System.out.println("\nII no. raised to I no.->\t\t"+Math.pow(b,a));
System.out.println("e raised to II no.->\t\t\t"+Math.exp(b));
System.out.println("Natural logarithm of II no.->\t\t"+Math.log(b));
System.out.println("Square root of II no.->\t\t\t"+Math.sqrt(b));
System.out.println("Rounded up of II no.->\t\t\t"+Math.ceil(b));
System.out.println("Rounded down of II no.->\t\t"+Math.floor(b));
System.out.println("Truncated value of II no.->\t\t"+Math.rint(b));
System.out.println("Absolute value of II no.->\t\t"+Math.abs(b));
System.out.println("\nMaximum of both numbers->\t\t"+Math.max(a,b));
System.out.println("Minimum of both numbers->\t\t"+Math.min(a,b));
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
}
}