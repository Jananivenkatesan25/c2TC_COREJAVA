package com.tns.ifet.day1;

public class PrimitiveDataTypeDemo {

	public static void main(String[] args) {
	byte byteMax=127;
	byte byteMin=-128;
	System.out.println("min range of byte is:"+byteMin);
	System.out.println("max range of byte is:"+byteMax);
	short shortMax=32767;
	short shortMin=-32768;
	System.out.println("minshort range of byte is:"+shortMin);
	System.out.println("maxshort range of byte is:"+shortMax);
	int maxInt=2147483647;
	int minInt=-2147483648;
	System.out.println("minint range of byte is:"+minInt);
	System.out.println("maxint range of byte is:"+maxInt);
    long maxLong=9223372036854775807L;
    long minLong=-922337203685477808L;
    System.out.println("minlong range of byte is:"+minLong);
	System.out.println("maxlong range of byte is:"+maxLong);
	float f=3234.141243278345f;
	double d=3456.14124512345678902345678914f;
	System.out.println("float value is:"+f);
	System.out.println("double value is:"+d);
	boolean flag=false;
	System.out.println("boolean value is:"+flag);
}
}
