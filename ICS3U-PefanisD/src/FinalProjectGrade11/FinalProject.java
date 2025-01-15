package FinalProjectGrade11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import hsa_new.Console;


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

	//Images
	static Console c = new Console ();
	static BufferedImage wizard = null;
	static BufferedImage weathertypes = null;
	static BufferedImage clock = null;
	static BufferedImage window = null;
	static BufferedImage thermometer = null;
	static BufferedImage timeofday = null;
	static BufferedImage veryhot = null;
	static BufferedImage sunnycloud = null;
	static BufferedImage clouds = null;
	static BufferedImage rain = null;
	static BufferedImage snowman = null;
	static BufferedImage muddy = null;





	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Starting point of the program
		try {
			wizard = ImageIO.read(new File ("src/FinalProjectGrade11/wizard.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			weathertypes = ImageIO.read(new File ("src/FinalProjectGrade11/weather types.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clock = ImageIO.read(new File ("src/FinalProjectGrade11/clock.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			window = ImageIO.read(new File ("src/FinalProjectGrade11/window.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thermometer = ImageIO.read(new File ("src/FinalProjectGrade11/thermometer.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			timeofday = ImageIO.read(new File ("src/FinalProjectGrade11/timeofday.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			veryhot = ImageIO.read(new File ("src/FinalProjectGrade11/very hot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sunnycloud = ImageIO.read(new File ("src/FinalProjectGrade11/sunnycloud.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clouds = ImageIO.read(new File ("src/FinalProjectGrade11/clouds.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rain = ImageIO.read(new File ("src/FinalProjectGrade11/rain.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			snowman = ImageIO.read(new File ("src/FinalProjectGrade11/snowman.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			muddy = ImageIO.read(new File ("src/FinalProjectGrade11/muddy.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		displayMenu();



	}
	//Setting the variables
	private static void displayMenu() throws InterruptedException {
		// TODO Auto-generated method stub

		String weather = getUserInputWeather();
		int temperature = getUserInputTemperature();
		String timeOfDay = getUserInputTimeOfDay();

		String prediction = predictWeather(weather, temperature, timeOfDay);
		printPrediction(prediction);
	}

	public static String getUserInputWeather() throws InterruptedException {
		//Introduction of code
		c.println("Hey there!");
		Thread.sleep(2000);
		c.drawImage (wizard,  0, 0, 700, 500, null);
		c.println("I'm the Weather Wizard...");
		Thread.sleep(2000);
		c.println("You're favourite weather predictor!");
		Thread.sleep(2000);
		c.clear();
		c.drawImage (weathertypes,  0, 0, 700, 500, null);
		c.println("No matter the weather...");
		Thread.sleep(2000);
		c.clear();
		c.drawImage (clock,  0, 0, 700, 500, null);
		c.println("No matter the time...");
		Thread.sleep(2000);
		c.println("I've got your back!");
		Thread.sleep(2000);
		c.println("I do need your help though.");
		Thread.sleep(2000);
		c.println("Only a few questions, don't worry ;)");
		Thread.sleep(2000);
		c.println("Let's Start!");
		c.println(" ");
		Thread.sleep(2000);


		// Asks the user to input the current weather condition
		Scanner scanner = new Scanner(System.in);

		c.println("Question 1:");
		c.println("-----------");
		Thread.sleep(2000);
		c.clear();
		c.drawImage (window,  0, 0, 700, 500, null);
		c.println("Look Outside!");
		Thread.sleep(2000);
		c.println("What is your current weather condition? (sunny, cloudy, raining, snowing): ");
		String weather = c.readLine().toLowerCase();

		while (!weather.equals("sunny") && !weather.equals("cloudy") && !weather.equals("raining") && !weather.equals("snowing")) {
			c.clear();
			c.println("That wasnt an option :(");
			Thread.sleep(2000);
			c.println("Please enter one of the following: sunny, cloudy, raining, snowing.");
			weather = c.readLine().toLowerCase();
		}
		return weather;
	}

	private static void drawImage(BufferedImage wizard2, int i, int j, int k, int l, Object object) {
		// TODO Auto-generated method stub

	}

	private static void clear() {
		// TODO Auto-generated method stub

	}

	public static int getUserInputTemperature() throws InterruptedException {
		// Asks the user to input the current temperature in Celsius

		c.println("Noted!");
		c.println(" ");
		Thread.sleep(2000);
		c.clear();
		c.println("Question 2:");
		c.println("-----------");
		Thread.sleep(2000);
		c.println("Either check online..");
		Thread.sleep(2000);
		c.println("Or make an educated guess!");
		Thread.sleep(2000);
		c.clear();
		c.drawImage (thermometer,  0, 0, 700, 500, null);
		c.println("Enter the current temperature (in Celsius): ");
		int temperature = c.readInt();

		return temperature;
	}

	public static String getUserInputTimeOfDay() throws InterruptedException {
		// Asks the user to input the time of day (morning, afternoon, night)
		c.println("Got it!!");
		c.println(" ");
		Thread.sleep(2000);
		c.println("Question 3:");
		c.println("-----------");
		Thread.sleep(2000);
		c.clear();
		c.drawImage (timeofday,  0, 0, 700, 500, null);
		c.println("Please enter the time of day (morning, afternoon, night): ");
		String timeOfDay = c.readLine().toLowerCase();

		while (!timeOfDay.equals("morning") && !timeOfDay.equals("afternoon") && !timeOfDay.equals("night")) {
			c.println("That wasnt an option :(");
			Thread.sleep(2000);
			c.println("Please enter one of the following: morning, afternoon, night.");
			timeOfDay = c.readLine().toLowerCase();
		}
		return timeOfDay;
	}

	public static String predictWeather(String weather, int temperature, String timeOfDay) {
		// Predicts the weather based on the user's input
		String prediction = "Weather prediction for the next few hours: ";

		// Sunny conditions
		c.clear();
		c.drawImage (veryhot,  0, 0, 700, 500, null);
		if (weather.equals("sunny")) {
			if (temperature > 25) {
				prediction += "It will stay sunny and hot! Perfect for a beach day or a hot day outside!";
				c.clear();
				c.drawImage (veryhot,  0, 0, 700, 500, null);
			} else if (temperature >= 15) {
				c.clear();
				c.drawImage (sunnycloud,  0, 0, 700, 500, null);
				prediction += "It will stay sunny but a bit cooler. Enjoy the pleasant weather!";
			} else {
				c.clear();
				c.drawImage (sunnycloud,  0, 0, 700, 500, null);
				prediction += "It will still be sunny, but might want a light jacket.";
			}
		}
		// Cloudy conditions
		else if (weather.equals("cloudy")) {
			c.clear();
			c.drawImage (sunnycloud,  0, 0, 700, 500, null);
			if (temperature > 20) {
				prediction += "It will stay cloudy, but warm. It could be a nice day for a walk!";
			} else {
				c.clear();
				c.drawImage (clouds,  0, 0, 700, 500, null);
				prediction += "It will stay cloudy and chilly. A good day to stay inside!";
			}
		}
		// Raining conditions
		else if (weather.equals("raining")) {
			if (timeOfDay.equals("morning")) {
				c.clear();
				c.drawImage (rain,  0, 0, 700, 500, null);
				prediction += "The rain will likely continue through the morning. Don't forget your umbrella!";
			} else if (timeOfDay.equals("afternoon")) {
				c.clear();
				c.drawImage (rain,  0, 0, 700, 500, null);
				prediction += "The rain will ease off in the afternoon, but expect some showers later.";
			} else {
				c.clear();
				c.drawImage (rain,  0, 0, 700, 500, null);
				prediction += "The rain will continue through the night, so stay indoors if you can!";
			}
		}
		// Snowing conditions
		else if (weather.equals("snowing")) {
			if (temperature < 0) {
				c.clear();
				c.drawImage (snowman,  0, 0, 700, 500, null);
				prediction += "The snow will continue. It's a great time for snowball fights or building a snowman!";
			} else {
				c.clear();
				c.drawImage (muddy,  0, 0, 700, 500, null);
				prediction += "The snow will likely turn to slush. Be careful on the roads!";
			}
		}

		return prediction;
	}

	public static void printPrediction(String prediction) {
		// Prints the weather prediction to the user
		c.println(prediction);


	}

}
