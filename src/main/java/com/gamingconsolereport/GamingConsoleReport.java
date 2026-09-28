package com.gamingconsolereport;

public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional array storing city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Single-dimensional array storing console types
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array storing sales data for each city and console
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town sales
                {2000, 3000, 4000}, // Port Elizabeth sales
                {1500, 1100, 1200}  // Pretoria sales
        };

        // Single-dimensional array to store total sales for each city
        int[] cityTotals = new int[cities.length];

        int highestSales = -1;
        String topCity = "";

        // Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {
            int currentCityTotal = 0;

            for (int j = 0; j < consoles.length; j++) {
                currentCityTotal += sales[i][j];
            }

            // Store the calculated total into the single-dimensional array
            cityTotals[i] = currentCityTotal;

            // Determine the city with the highest total sales
            if (currentCityTotal > highestSales) {
                highestSales = currentCityTotal;
                topCity = cities[i];
            }
        }

        String divider = "------------------------------------------------------------------";

        System.out.println(divider);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(divider);

        // Header columns (empty column for city names, followed by console names)
        System.out.printf("%-16s%-16s%-16s%-16s%n", "", consoles[0], consoles[1], consoles[2]);

        // Print each row (city name and console sales numbers)
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s%-16d%-16d%-16d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]
            );
        }

        // ---------------------------------------------------------------------
        // 4. PRINTING TOTALS AND TOP PERFORMING CITY (4 Marks)
        // ---------------------------------------------------------------------

        System.out.println(divider);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(divider);

        // Print totals for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s%d%n", cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println(divider);
    }
}