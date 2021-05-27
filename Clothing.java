import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Clothing {

	public static void main(String[] args) throws InterruptedException{
		clothingShop();

	}
	public static void clothingShop() throws InterruptedException 
	{
		while(true)
		{
		//Declare variables		
		String shopOption = "";
		int clothingPiece = 0;
		
			
		//Initiate Scanner
		Scanner input = new Scanner (System.in);
			
		//Output the menu
		System.out.println("Welcome to the SHOP!");
		System.out.println("1. Food");
		System.out.println("2. Clothing");
		System.out.println("3. Tickets");
		System.out.println("4. Quit");
		
		//ask the user to select an option
		System.out.println("What would you like to do?");
		shopOption = input.next();
		
		while(true)
		{
		//check if the user selects option 2, then take them to the clothing main menu
		if (shopOption.equals("2") || shopOption.equalsIgnoreCase("clothing"))
		{
			//output clothing store main menu
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Welcome to the Clothing SHOP!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1. Sweater Manor");
			System.out.println("2. T-Shirt House");
			System.out.println("3. Accessory Palace");
			System.out.println("4. Quit");
			TimeUnit.SECONDS.sleep(1);
			//ask the user to select a place where they would like to shop
			System.out.println("Where would you like to shop (Select a number)? ");
			clothingPiece = input.nextInt();
			//check which option the user selects and go to the method created
			if (clothingPiece == 1)
			{
				sweaters();	
			}
			else if (clothingPiece == 2)
			{
				shirts();	
			}
			else if (clothingPiece == 3)
			{
				accessories();
			}
			else if (clothingPiece == 4)
			{
				//if the user wants to quit, the loop breaks and the user is taken to the shop main menu
				break;
			}
			else
			{
				//if the user selects an invalid option, they are asked the question again
				System.out.println("Invalid Input");
			}
		}
		}
		}
	}
	//this method is created if the user selects option 1
	public static void sweaters () throws InterruptedException
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		int sweaters = 0, counter = 0;
		double total = 0, money = 1000000;
		final double woolen = 10.00, sweatShirt = 15.00, crewneck = 12.00;
		String quit1 = "", size1 = "", size2 = "", size3 = "", colour1 = "", colour2 = "", colour3 = "";
		do
		{
			//output a menu for the user to choose an option from
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Welcome to Sweater Manor! Here are the types of sweaters you can purchase!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1. Woolen Sweater - $10.00");
			System.out.println("2. Sweatshirt - $15.00");
			System.out.println("3. Crewneck - $12.00");
			TimeUnit.SECONDS.sleep(1);
			//ask the user to select an item
			System.out.println("Which type of sweater would you like to buy?");
			sweaters= input.nextInt();
				
			//if the user selects option 1, display an appropriate message and output a new badge
			if (sweaters == 1)
			{
				//output description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen the amazing woolen sweater! This sweater is soft, and perfect for cold winter days, while also being fashionable! ");
				
				do
				{
				//ask the user for their size
				TimeUnit.SECONDS.sleep(1);
				System.out.println("What is your size (S, M, L)?");
				TimeUnit.SECONDS.sleep(1);
				size1 = input.next();
				//check the size and output an appropriate message
				
					if (size1.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size1.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size1.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
						
					}
				}while(!size1.equalsIgnoreCase("s") || !size1.equalsIgnoreCase("m") || !size1.equalsIgnoreCase("l"));
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour1 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour1.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink sweater. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green sweater. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour1.equalsIgnoreCase("purple") || !colour1.equalsIgnoreCase("yellow") ||!colour1.equalsIgnoreCase("blue") ||!colour1.equalsIgnoreCase("orange") ||!colour1.equalsIgnoreCase("red") ||!colour1.equalsIgnoreCase("pink") ||!colour1.equalsIgnoreCase("green"));
				
				//add to total
				total += woolen;
				//print badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("<<<<<<<<<");
				System.out.println("*   <>   *");
				System.out.println("*   <>   *");;
				System.out.println("<<<<<<<<<");					
			}
			//if the user selects option 2, display an appropriate message and output a new badge
			else if (sweaters == 2)
			{
				//output description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have picked a sweatshirt! This sweater is comfortable and soft and perfect to sleep in!");
				do
				{
					//ask the user to select a size
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What is your size (S, M, L)?");
					TimeUnit.SECONDS.sleep(1);
					size2 = input.next();
					//check the size and output a message
					if (size2.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size2.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size2.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!size2.equalsIgnoreCase("s") || !size2.equalsIgnoreCase("m") || !size2.equalsIgnoreCase("l"));
				
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour2 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour2.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink sweater. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green sweater. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour2.equalsIgnoreCase("purple") || !colour2.equalsIgnoreCase("yellow") ||!colour2.equalsIgnoreCase("blue") ||!colour2.equalsIgnoreCase("orange") ||!colour2.equalsIgnoreCase("red") ||!colour2.equalsIgnoreCase("pink") ||!colour2.equalsIgnoreCase("green"));
				
				//add to total
				total += sweatShirt;
				
				//output badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("+++++++++");
				System.out.println("*********");
				System.out.println("*********");
				System.out.println("+++++++++");
			}
			//if the user selects option 3, display an appropriate message and output a new badge
			else if (sweaters == 3)
			{
				//output description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen a crewneck sweater! This sweater is both comfortable and stylish.");
				do
				{
					//ask the user to select a size
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What is your size (S, M, L)?");
					size3 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the size of the user and display an appropriate message
					if (size3.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size3.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size3.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!size3.equalsIgnoreCase("s") || !size3.equalsIgnoreCase("m") || !size3.equalsIgnoreCase("l"));
				
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour3 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour3.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink sweater. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green sweater. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour3.equalsIgnoreCase("purple") || !colour3.equalsIgnoreCase("yellow") ||!colour3.equalsIgnoreCase("blue") ||!colour3.equalsIgnoreCase("orange") ||!colour3.equalsIgnoreCase("red") ||!colour3.equalsIgnoreCase("pink") ||!colour3.equalsIgnoreCase("green"));
				
				//add to total
				total += crewneck;
				//print badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("######");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("######");
			}
			//if the user inputs an invalid number, an appropriate message is displayed
			else 
			{
				System.out.println("That's not a correct option!");
				total = 0;
			}
			//output the total cost
			TimeUnit.SECONDS.sleep(1);
			System.out.println("The total cost is $" + total);
			money = money - total;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Money Left = $" + money);
			//ask the user if they would like to play again
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to buy again (Y or N)?");
			quit1 = input.next();	
		//loop continues until the user does not want to buy again
		}while(quit1.equalsIgnoreCase("Y"));
	
	}
	//if the user selects option 2, they are taken to this method
	public static void shirts() throws InterruptedException
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		int shirts = 0;
		double total = 0, money = 1000000;
		final double superhero = 7.00, crop = 15.00, vNeck = 18.00;
		String quit1 = "", size1 = "", size2 = "", size3 = "", colour1 = "", colour2 = "", colour3 = "";
		do
		{
			//output a menu for the user to choose an option from
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Welcome to T-Shirt House! Here are the types of t-shirts you can purchase!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1. Superhero T-Shirt - $7.00");
			System.out.println("2. Crop Top - $15.00");
			System.out.println("3. V Neck T-Shirt - $18.00");
			TimeUnit.SECONDS.sleep(1);
			//ask the user to select an item
			System.out.println("Which type of t-shirt would you like to buy?");
			shirts= input.nextInt();
				
			//if the user selects option 1, display an appropriate message and output a new badge
			if (shirts == 1)
			{
				//output a description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen the fun superhero t-shirt! This t-shirt has a superhero logo on it and is fun to wear. ");
				do
				{
					//ask the user to select a size
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What is your size (S, M, L)?");
					size1 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the size and display an appropriate message
					if (size1.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size1.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size1.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!size1.equalsIgnoreCase("s") || !size1.equalsIgnoreCase("m") || !size1.equalsIgnoreCase("l"));
				
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour1 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour1.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink superhero shirt. It has been added to your cart");
						break;
					}
					else if (colour1.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green superhero shirt. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour1.equalsIgnoreCase("purple") || !colour1.equalsIgnoreCase("yellow") ||!colour1.equalsIgnoreCase("blue") ||!colour1.equalsIgnoreCase("orange") ||!colour1.equalsIgnoreCase("red") ||!colour1.equalsIgnoreCase("pink") ||!colour1.equalsIgnoreCase("green"));
				
				//add to total
				total += superhero;
				//print badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("??????????");
				System.out.println("*   <>   *");
				System.out.println("*   <>   *");
				System.out.println("*   <>   *");
				System.out.println("*   <>   *");
				System.out.println("??????????");					
			}
			//if the user selects option 2, display an appropriate message and output a new badge
			else if (shirts == 2)
			{
				//output description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have picked a crop top! This top is very stylish and comfortable to wear!");
				do
				{
					//ask the user to select a size
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What is your size (S, M, L)?");
					size2 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the size input by the user and output an appropriate message
					if (size2.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size2.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size2.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!size2.equalsIgnoreCase("s") || !size2.equalsIgnoreCase("m") || !size2.equalsIgnoreCase("l"));
				
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour2 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour2.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink crop top. It has been added to your cart");
						break;
					}
					else if (colour2.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green crop top. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour2.equalsIgnoreCase("purple") || !colour2.equalsIgnoreCase("yellow") ||!colour2.equalsIgnoreCase("blue") ||!colour2.equalsIgnoreCase("orange") ||!colour2.equalsIgnoreCase("red") ||!colour2.equalsIgnoreCase("pink") ||!colour2.equalsIgnoreCase("green"));
				
				//add to total
				total += crop;
				//print badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("TTTTTTTTTT");
				System.out.println("*   <>   *");
				System.out.println("*********");
				System.out.println("*   <>   *");
				System.out.println("*********");
				System.out.println("*   <>   *");
				System.out.println("TTTTTTTTTT");
			}
			//if the user selects option 3, display an appropriate message and output a new badge
			else if (shirts == 3)
			{
				//output description
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen a V Neck t-shirt! This t-shirt looks great while also being comfortable.");
				do
				{
					//ask the user to select a size and output an appropriate message
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What is your size (S, M, L)?");
					size3 = input.next();
					TimeUnit.SECONDS.sleep(1);
					if (size3.equalsIgnoreCase("s"))
					{
						System.out.println("You have a chosen a small size. It has been added to your cart");
						break;
					}
					else if (size3.equalsIgnoreCase("m"))
					{
						System.out.println("You have a chosen a medium size. It has been added to your cart");
						break;
					}
					else if (size3.equalsIgnoreCase("l"))
					{
						System.out.println("You have a chosen a large size. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!size3.equalsIgnoreCase("s") || !size3.equalsIgnoreCase("m") || !size3.equalsIgnoreCase("l"));
				
				do
				{
					//ask the user for the colour they want
					TimeUnit.SECONDS.sleep(1);
					System.out.println("What colour would you like (purple, yellow, blue, orange, red, pink, green)?");
					colour3 = input.next();
					TimeUnit.SECONDS.sleep(1);
					//check the colour and output an appropriate message
					if (colour3.equalsIgnoreCase("purple"))
					{
						System.out.println("You have a chosen a a purple t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("yellow"))
					{
						System.out.println("You have a chosen a yellow t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("blue"))
					{
						System.out.println("You have a chosen a blue t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("orange"))
					{
						System.out.println("You have a chosen a orange t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("red"))
					{
						System.out.println("You have a chosen a red t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("pink"))
					{
						System.out.println("You have a chosen a pink t-shirt. It has been added to your cart");
						break;
					}
					else if (colour3.equalsIgnoreCase("green"))
					{
						System.out.println("You have a chosen a green t-shirt. It has been added to your cart");
						break;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}while(!colour3.equalsIgnoreCase("purple") || !colour3.equalsIgnoreCase("yellow") ||!colour3.equalsIgnoreCase("blue") ||!colour3.equalsIgnoreCase("orange") ||!colour3.equalsIgnoreCase("red") ||!colour3.equalsIgnoreCase("pink") ||!colour3.equalsIgnoreCase("green"));
				
				//add to total
				total += vNeck;
				//print badge
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("%%%%%%");
				System.out.println("******");
				System.out.println("******");
				System.out.println("%%%%%%");
				System.out.println("******");
				System.out.println("******");
				System.out.println("%%%%%%");
			}
			//if the user inputs an invalid number, an appropriate message is displayed
			else 
			{
				System.out.println("That's not a correct option!");
				total = 0;
			}
			//output the total cost
			TimeUnit.SECONDS.sleep(1);
			System.out.println("The total cost is $" + total);
			money = money - total;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Money Left = $" + money);
			//ask the user if they would like to play again
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to buy again (Y or N)?");
			quit1 = input.next();	
		//loop continues until the user does not want to buy again
		}while(quit1.equalsIgnoreCase("Y"));
	
	}
	//if the user selects option 3, they are taken to this menu
	public static void accessories() throws InterruptedException
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		int accessories = 0;
		double total = 0, money = 1000000;
		final double earrings = 4.00, necklace = 8.00, headband = 3.00;
		String quit1 = "";
		do
		{
			//output a menu for the user to choose an option from
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Welcome to Accessory Palace! Here are the types of accessories you can purchase!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1. Earrings - $4.00");
			System.out.println("2. Necklace - $8.00");
			System.out.println("3. Headband - $3.00");
			TimeUnit.SECONDS.sleep(1);
			//ask the user to select an item
			System.out.println("Which type of accessory would you like to buy?");
			accessories= input.nextInt();
				
			//if the user selects option 1, display an appropriate message and output a new badge
			if (accessories == 1)
			{
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen earrings! These earrings are very beautiful and fashionable.");
				total += earrings;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("//////////");
				System.out.println("*        *");
				System.out.println("*        *");
				System.out.println("//////////");					
			}
			//if the user selects option 2, display an appropriate message and output a new badge
			else if (accessories == 2)
			{
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen a necklace! This necklace is classy and elegant.");
				total += necklace;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("TTTTTTTTTT");
				System.out.println("*        *");
				System.out.println("TTTTTTTTTT");
			}
			//if the user selects option 3, display an appropriate message and output a new badge
			else if (accessories == 3)
			{
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You have chosen a headband! This headband is perfect for holding your hair up, while also looking nice!");
				total += headband;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Congratulations! You get a new badge!");
				System.out.println("======");
				System.out.println("**  **");
				System.out.println("**  **");
				System.out.println("======");
			}
			//if the user inputs an invalid number, an appropriate message is displayed
			else 
			{
				System.out.println("That's not a correct option!");
				total = 0;
			}
			//output the total cost
			TimeUnit.SECONDS.sleep(1);
			System.out.println("The total cost is $" + total);
			money = money - total;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Money Left = $" + money);
			//ask the user if they would like to play again
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to buy again (Y or N)?");
			quit1 = input.next();	
		//loop continues until the user does not want to buy again
		}while(quit1.equalsIgnoreCase("Y"));
	

}
}

