package com;

import com.service.UserService;
import com.service.JourneyService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Centralized constant for the logo file path
    private static final String LOGO_PATH = "C:\\spring components\\Git\\TravelLogo.txt";

    private static final JourneyService journeyService = new JourneyService();
    private static final UserService userService = new UserService();

    public static void main(String[] args) {
        if (displayCompanyLogo()) {
            showMenuOptions();
        } else {
            System.out.println("Failed to load company logo. Exiting...");
        }
    }

    /**
     * Displays the company logo from the specified file.
     * If the file is not found or cannot be read, it shows fallback text.
     *
     * @return true if logo or fallback text was displayed successfully
     */
    private static boolean displayCompanyLogo() {
        System.out.println("Attempting to read logo from: " + LOGO_PATH);

        File logoFile = new File(LOGO_PATH);
        if (!logoFile.exists()) {
            System.out.println("Logo file not found. Showing fallback text.");
            System.out.println("Welcome to abc travels");
            return true;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(logoFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error reading company logo file: " + e.getMessage());
            System.out.println("Welcome to abc travels");
            return true;
        } finally {
            // Close reader if it was opened
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // Log and ignore
                    System.err.println("Error closing logo file reader: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Shows menu options and processes user choices.
     */
    private static void showMenuOptions() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu Options:");
            System.out.println("1. New Admin User Registration");
            System.out.println("2. Login");
            System.out.println("3. Plan journey");
            System.out.println("4. Reschedule booking date");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    userService.registerNewAdmin();
                    break;
                case 2:
                    userService.login();
                    break;
                case 3:
                    journeyService.planJourney();
                    break;
                case 4:
                    journeyService.reScheduleJourney();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a correct option.");
                    break;
            }
        }

        // Close scanner before exiting
        scanner.close();
    }
}
