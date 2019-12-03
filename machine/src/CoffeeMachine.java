package machine;

import java.util.Scanner; // importing scanner from the standard library

public class CoffeeMachine {
    public static void main(String[] args) {

        int water=400;
        int milk=540;
        int beans=120;
        int cups=9;
        int money=550;

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        Scanner scanner = new Scanner(System.in);
        String action=scanner.nextLine();

        while (action.equals("exit")!=true)
        {

            if (action.equals("buy")) {

                System.out.println("");
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
                String coffeeSelect = scanner.nextLine();

                if (coffeeSelect.equals("back") != true) {
                    if (coffeeSelect.equals("3")) {
                        water = water - 200;
                        milk = milk - 100;
                        beans = beans - 12;
                        cups = cups - 1;
                        money = money + 6;
                        if (water >= 0 && milk >= 0 && beans >= 0 && cups >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            water = water + 200;
                            milk = milk + 100;
                            beans = beans + 12;
                            cups = cups + 1;
                            money = money - 6;
                            System.out.println("Sorry, not enough water!");

                        }
                    }

                    if (coffeeSelect.equals("1")) {
                        water = water - 250;
                        //milk=milk-100;
                        beans = beans - 16;
                        cups = cups - 1;
                        money = money + 4;
                        if (water >= 0 && milk >= 0 && beans >= 0 && cups >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            water = water + 250;
                            milk = milk;
                            beans = beans + 16;
                            cups = cups + 1;
                            money = money - 4;
                            System.out.println("Sorry, not enough water!");
                        }
                    }
                    if (coffeeSelect.equals("2")) {
                        water = water - 350;
                        milk = milk - 75;
                        beans = beans - 20;
                        cups = cups - 1;
                        money = money + 7;
                        if (water >= 0 && milk >= 0 && beans >= 0 && cups >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            water = water + 350;
                            milk = milk + 75;
                            beans = beans + 20;
                            cups = cups + 1;
                            money = money - 7;
                            System.out.println("Sorry, not enough water!");
                        }
                    }


                }
            }

            if (action.equals("fill"))
            {
                System.out.println("Write how many ml of water do you want to add:");
                int waterAdd=scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milkAdd=scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int beansAdd=scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int cupsAdd=scanner.nextInt();

                water=water+waterAdd;
                milk=milk+milkAdd;
                beans=beans+beansAdd;
                cups=cups+cupsAdd;
            }

            if (action.equals("take"))
            {
                System.out.println("I gave you $"+money);
                money=0;
            }
            if (action.equals("remaining"))
            {
                System.out.println("The coffee machine has:");
                System.out.println(water+" of water");
                System.out.println(milk+" of milk");
                System.out.println(beans+" of coffee beans");
                System.out.println(cups+" of disposable cups");
                System.out.println(money+" of money");
            }

            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action=scanner.nextLine();
        }

    }
}
