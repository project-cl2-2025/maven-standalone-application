package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to Bright Mind Tech Training Institution" + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "BMT";
		return new Date();

	}

}
