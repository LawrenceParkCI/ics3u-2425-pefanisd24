package FinalProjectGrade11;

import java.awt.Color;
import java.util.Scanner;

/**
 * Description: This program predicts weather based on information the user inputs.
 * Date: January 8, 2025
 * Author: Daniella Pefanis
 */

public class FinalProject {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 * @throws InterruptedException 
	 */


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Starting point of the program
		displayMenu();



	}

	private static void displayMenu() throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String weather = getUserInputWeather();
		int temperature = getUserInputTemperature();
		String timeOfDay = getUserInputTimeOfDay();

		String prediction = predictWeather(weather, temperature, timeOfDay);
		printPrediction(prediction);
	}

	public static String getUserInputWeather() throws InterruptedException {

		System.out.println("Hey there!");
		Thread.sleep(2000);
		System.out.println("I'm the Weather Wizard...");
		Thread.sleep(2000);
		System.out.println("You're favourite weather predictor!");
		Thread.sleep(2000);
		System.out.println("No matter the weather...");
		Thread.sleep(2000);
		System.out.println("No matter the time...");
		Thread.sleep(2000);
		System.out.println("I've got your back!");
		Thread.sleep(2000);
		System.out.println("I do need your help though.");
		Thread.sleep(2000);
		System.out.println("Only a few questions, don't worry ;)");
		Thread.sleep(2000);
		System.out.println("Let's Start!");
		System.out.println(" ");
		Thread.sleep(2000);






		// Asks the user to input the current weather condition
		Scanner scanner = new Scanner(System.in);

		System.out.println("Question 1:");
		System.out.println("-----------");
		Thread.sleep(2000);
		System.out.println("Look Outside!");
		Thread.sleep(2000);
		System.out.println("What is your current weather condition? (sunny, cloudy, raining, snowing): ");
		String weather = scanner.nextLine().toLowerCase();

		while (!weather.equals("sunny") && !weather.equals("cloudy") && !weather.equals("raining") && !weather.equals("snowing")) {
			System.out.println("That wasnt an option :(");
			Thread.sleep(2000);
			System.out.println("Please enter one of the following: sunny, cloudy, raining, snowing.");
			weather = scanner.nextLine().toLowerCase();
		}
		return weather;
	}

	public static int getUserInputTemperature() throws InterruptedException {
		// Asks the user to input the current temperature in Celsius
		Scanner scanner = new Scanner(System.in);

		System.out.println("Noted!");
		Thread.sleep(2000);
		System.out.println("Question 2:");
		Thread.sleep(2000);
		System.out.println("Please enter the current temperature (in Celsius): ");
		int temperature = scanner.nextInt();

		return temperature;
	}

	public static String getUserInputTimeOfDay() {
		// Asks the user to input the time of day (morning, afternoon, night)
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the time of day (morning, afternoon, night): ");
		String timeOfDay = scanner.nextLine().toLowerCase();

		while (!timeOfDay.equals("morning") && !timeOfDay.equals("afternoon") && !timeOfDay.equals("night")) {
			System.out.println("Invalid input! Please enter one of the following: morning, afternoon, night.");
			timeOfDay = scanner.nextLine().toLowerCase();
		}
		return timeOfDay;
	}

	public static String predictWeather(String weather, int temperature, String timeOfDay) {
		// Predicts the weather based on the user's input
		String prediction = "Weather prediction for the next few hours: ";

		// Sunny conditions
		if (weather.equals("sunny")) {
			if (temperature > 25) {
				prediction += "It will remain sunny and hot! Perfect for a beach day!";
			} else if (temperature >= 15) {
				prediction += "It will stay sunny but a bit cooler. Enjoy the pleasant weather!";
			} else {
				prediction += "It will still be sunny, but you'll want a light jacket.";
			}
		}
		// Cloudy conditions
		else if (weather.equals("cloudy")) {
			if (temperature > 20) {
				prediction += "It will stay cloudy, but warm. It could be a nice day for a walk.";
			} else {
				prediction += "It will stay cloudy and chilly. A good day to stay inside!";
			}
		}
		// Raining conditions
		else if (weather.equals("raining")) {
			if (timeOfDay.equals("morning")) {
				prediction += "The rain will likely continue through the morning. Don't forget your umbrella!";
			} else if (timeOfDay.equals("afternoon")) {
				prediction += "The rain will ease off in the afternoon, but expect some showers later.";
			} else {
				prediction += "The rain will continue through the night, so stay indoors if you can!";
			}
		}
		// Snowing conditions
		else if (weather.equals("snowing")) {
			if (temperature < 0) {
				prediction += "The snow will continue. It's a great time for snowball fights or building a snowman!";
			} else {
				prediction += "The snow will likely turn to slush. Be careful on the roads!";
			}
		}

		return prediction;
	}

	public static void printPrediction(String prediction) {
		// Prints the weather prediction to the user
		System.out.println(prediction);


	}

}
