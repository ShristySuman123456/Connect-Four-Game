package com.shristy.javaFxConnectGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class warmUp {
	public static void main(String[] args){
		//wap to create an array for range of value from 0,1,2,3....100
		int[] numArray= new int[101];

		for(int i=0;i<=100;i++){
			numArray[i]=i;

			//USING JAVA8 Feature IntStream
			int[] numberArray=IntStream.rangeClosed(0,100).toArray();

			//wap to create a ArrayList<Integer> that contains 0,1,2,3......100 integer number
			List<Integer> numberList= new ArrayList();

			for(int j=0;j<=100;j++){
				numberList.add(new Integer(j));
				List<Integer> numbersList =IntStream.rangeClosed(0,100). //0,1,2,3.....100
						                   mapToObj(k -> new Integer(k)). //Integer object: 0,1,2,3....100
						                   collect(Collectors.toList()); //add all Integer object to ArrayList<Integer>

			}
		}
	}
}
