package com.ga.superhero;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		List<String[]> superheros = new ArrayList<String[]>();

		String line;


		String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));




		try {
			File inputFile = new File("input.txt");
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();

			while ((line = bufferedReader.readLine()) != null) {
				list.add(line);
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("You are going to play the superheros trivia game!!!!");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter your name!!!!");
		String userName = myObj.nextLine();
		int rightsCount = 0;
		int wrongsCount = 0;
		for (String element : list) {
			superheros.add(element.split(","));
		}
		for (int i = 0; i < superheros.size(); i++) {
			String newArr[] = superheros.get(i);
			System.out.println("What do you know about " + newArr[0] + "?");
			System.out.println("Do you know " + newArr[0] + "'s secret identity? Enter it");
			String hero_id = myObj.nextLine();

			if (hero_id.toLowerCase().equals(newArr[1].toLowerCase())) {
				System.out.println("That is right!!!");
				rightsCount++;
			} else
			{wrongsCount++;
				System.out.println("Sorry !!! Your answer was " + hero_id + ", it should have been " + newArr[1]);
			}
			System.out.println("Do you know where " + newArr[0] + " comes from? Enter it");
			String hero_home = myObj.nextLine();
			if (hero_home.toLowerCase().equals(newArr[2].toLowerCase())) {
				System.out.println("That is right!!!");
				rightsCount++;
			} else { wrongsCount ++;
				System.out.println("Sorry!!! Your answer was " + hero_home + ", it should have been " + newArr[2]);};
		}

		if (rightsCount > wrongsCount) {
			System.out.println(userName +", You win!!!. You had " + rightsCount + " right!!!");
			writer.write(userName +", You win!!!. You had " + rightsCount + " right!!!");
			writer.close();
		} else System.out.println("You lose. You had " + rightsCount + " right!!! and " + wrongsCount + " wrong!!");

	}
}