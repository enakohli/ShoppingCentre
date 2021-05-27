/* 
 * Name: Ena Kohli
 * Program Name: Shop
 * Date: May 23rd 2018
 */
import java.util.*;
import java.util.concurrent.TimeUnit;
public class FoodTickets {

	public static void main(String[] args) throws InterruptedException{
		foodShop();	
}
	public static void foodShop () throws InterruptedException
	{
		while(true)
		{
			//Declare variables		
			String shopOption = "";
			int foodPlace = 0;
				
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
				
				while (true) {
				//if the user selects food, then they are taken to the food shop
				if (shopOption.equals("1") || shopOption.equalsIgnoreCase("food"))
				{
					//output the different places to eat
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Welcome to the Food SHOP!");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("1. Papa's Poutine");
					System.out.println("2. Pizza Palace");
					System.out.println("3. Ice Cream King");
					System.out.println("4. Candy Wonderland");
					System.out.println ("5. Quit");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Where would you like to eat (Select a number)? ");
					foodPlace = input.nextInt();
				
					//check which option the user selects and go to that method
					if (foodPlace == 1)
					{
						poutine();	
					}
					else if (foodPlace == 2)
					{
						pizza();	
					}
					else if (foodPlace == 3)
					{
						iceCream();
					}
					else if (foodPlace == 4)
					{
						candy();
					}
					else if (foodPlace == 5)
					{
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
		//a method is created for the poutine place
		public static void poutine() throws InterruptedException
		{
			//initiate scanner
			Scanner input = new Scanner (System.in);
			//declare variables
			int poutine = 0, toppingsAmount1 = 0, toppingsAmount2 = 0, toppingsAmount3 = 0, toppingsAmount4 = 0, counter = 0;
			double total = 0, money = 1000000;
			final double classic = 4.25, bbq = 5.00, vegetable = 4.00, meat = 5.25, toppingsCost = 0.25;
			String quit1 = "", quit2 = "",toppingsAnswer1 = "", toppingsAnswer2 = "", toppingsAnswer3 = "", toppingsAnswer4 = "";
			
			do
			{
				//output options for the user to select from
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Welcome to Papa's Poutine! You can try all types of poutine!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("1. The Classic - $ 4.25");
				System.out.println("2. BBQ Chicken Poutine - $5.00");
				System.out.println("3. Vegetable Garden Poutine - $4.00");
				System.out.println("4. Meat Supreme Poutine - $ 5.25");
				TimeUnit.SECONDS.sleep(1);
				//ask the user to select an option
				System.out.println("Which poutine would you like to try?");
				poutine = input.nextInt();
				
				//if the user selects option 1, display a message and output a new type of badge
				if (poutine == 1)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen The Classic Poutine.\nThis poutine consists of fries, gravy and cheese curds! YUMMY!");
					total += classic;
					//output list of toppings and as the user if they would like any
					TimeUnit.SECONDS.sleep(1);
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Guacamole\n2. Ketchup\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Mayonnaise\n8. Beans");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer1 = input.next();
					
					//if the user says they do want toppings ask them to enter the number of toppings they would like and ask them to enter them
					if (toppingsAnswer1.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount1 = input.nextInt();
						String toppings[] = new String[toppingsAmount1];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("\nToppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								System.out.println(toppings[i]);
							}													
						}
					}
					//if the user does not want toppings, display an appropriate message
					else if (toppingsAnswer1.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if they enter anything else they are asked to enter again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount1 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount1];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount1;
										
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" *****");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println("*     *");
					System.out.println(" *****");
					
				}
				//if the user selects option 2, display an appropriate message and output a new badge
				else if (poutine == 2)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the BBQ Chicken Poutine.\nThis poutine consists of fries, gravy, chicken, barbeque sauce and cheese curds! YUMMY!");
					total += bbq;
					TimeUnit.SECONDS.sleep(1);
					//output list of toppings and ask user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Guacamole\n2. Ketchup\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Mayonnaise\n8. Beans");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer2 = input.next();
					
					//if the user wants toppings ask how many and ask them to enter the names
					if (toppingsAnswer2.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount2 = input.nextInt();
						String toppings[] = new String[toppingsAmount2];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, display an appropriate message 
					else if (toppingsAnswer2.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects anything else, it is an invalid input and they are asked again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount2 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount2];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")||toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount2;
					TimeUnit.SECONDS.sleep(1);					
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" |*****|");
					System.out.println("*   *   *");
					System.out.println("*   *   *");
					System.out.println("*   *   *");
					System.out.println("*   *   *");
					System.out.println("*   *   *");
					System.out.println(" |*****|");
				}
				//if the user selects option 3, display an appropriate message and output a new badge
				else if (poutine == 3)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the Vegetable Garden Poutine.\nThis poutine consists of fries, gravy, cheese curds, tomatoes, green onions, mushrooms, jalapenos and bell pepppers! YUMMY!");
					total += vegetable;
					TimeUnit.SECONDS.sleep(1);
					//output list of toppings and ask the user if they would like any toppings
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Guacamole\n2. Ketchup\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Mayonnaise\n8. Beans");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer3 = input.next();
					
					//if the user wants toppings, ask them how many and ask them to enter the names
					if (toppingsAnswer3.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount3 = input.nextInt();
						String toppings[] = new String[toppingsAmount1];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer3.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input they are asked the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount3 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount3];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount3;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" <<>>");
					System.out.println("*    *");
					System.out.println("*    *");
					System.out.println("<    >");
					System.out.println("*    *");
					System.out.println("*    *");
					System.out.println(" <<>>");
				}
				//if the user selects option 4 display an appropriate message and output a new badge
				else if (poutine == 4)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the Meat Supreme Poutine.\nThis poutine consists of fries, gravy, cheese curds, bacon, chicken, and beef! YUMMY!");
					total += meat;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Guacamole\n2. Ketchup\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Mayonnaise\n8. Beans");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer4 = input.next();
					
					//if the user wants toppings, then they are asked to enter the amount and asked to enter the names of them
					if (toppingsAnswer4.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount4 = input.nextInt();
						String toppings[] = new String[toppingsAmount4];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer4.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user enters an invalid input they are asked again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount4 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount4];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("guacamole") ||toppings[i].equalsIgnoreCase("ketchup")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("mayonnaise") ||toppings[i].equalsIgnoreCase("beans"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount4;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" **~**");
					System.out.println("~     ~");
					System.out.println("~     ~");
					System.out.println("~     ~");
					System.out.println("~     ~");
					System.out.println("~     ~");
					System.out.println(" **~**");
				}
				//if the user selects an invalid option, a message is displayed
				else 
				{
					System.out.println("That's not a correct option!");
					total = 0;
				}
				//output total cost
				TimeUnit.SECONDS.sleep(1);
				System.out.println("The total cost is $" + total);
				//output money left
				money = money - total;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Money Left = $" + money);
				//ask the user if they would like to buy anything else
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Would you like to buy again (Y or N)?");
				quit1 = input.next();
			//loop continues until they do not wish to buy from the shop any longer
			}while(quit1.equalsIgnoreCase("Y"));
			
		}
		//a method is created for the pizza place
		public static void pizza() throws InterruptedException
		{
			//initiate scanner 
			Scanner input = new Scanner (System.in);
			//declare variables
			int pizza = 0, toppingsAmount1 = 0, toppingsAmount2 = 0, toppingsAmount3 = 0, toppingsAmount4 = 0, counter = 0;
			double total = 0, money = 1000000;
			final double cheese = 3.25, pepperoni = 4.00, vegetable = 4.50, meat = 5.00, toppingsCost = 0.25;
			String quit1 = "", quit2 = "",toppingsAnswer1 = "", toppingsAnswer2 = "", toppingsAnswer3 = "", toppingsAnswer4 = "";
			do
			{
				//output menu options for the user to choose from 
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Welcome to Pizza Palace! You can try all types of pizza!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("1. Cheese - $ 3.25");
				System.out.println("2. Pepperoni - $4.00");
				System.out.println("3. Vegetarian - $4.50");
				System.out.println("4. Meat - $ 5.00");
				TimeUnit.SECONDS.sleep(1);
				//ask the user to select an option
				System.out.println("Which type of pizza would you like to try?");
				pizza= input.nextInt();
				
				//if the user selects option 1, display an appropriate message and output a new badge
				if (pizza == 1)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the infamous cheese pizza!\nThis pizza consists of a crispy base, a delicate tomato paste and 5 different types of cheese! Delicious!");
					total += cheese;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Tomatoes\n2. Pineapple\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Feta\n8. Pickles");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer1 = input.next();
					
					//if the user enters y, they are asked how many toppings they would like and the names for the toppings
					if (toppingsAnswer1.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount1 = input.nextInt();
						String toppings[] = new String[toppingsAmount1];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								System.out.println(toppings[i]);
							}												
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer1.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects anything else they are asked to enter information again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount1 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount1];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount1;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("  **T** ");
					System.out.println("*   X   *");
					System.out.println("*   X   *");;
					System.out.println("  **T** ");
					
				}
				//if the user selects option 2, display an appropriate message and output a new badge
				else if (pizza == 2)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the amazing pepperoni pizza.\nThis pizza consists of a crispy base, a delicate tomato paste, 5 different types of cheese, and a lot of pepperoni! Delicious!");
					total += pepperoni;
					TimeUnit.SECONDS.sleep(1);
					//output toppings options and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Tomatoes\n2. Pineapple\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Feta\n8. Pickles");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer2 = input.next();
					
					//if the user enters y, ask them how many toppings to enter and the names of the toppings
					if (toppingsAnswer2.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount2 = input.nextInt();
						String toppings[] = new String[toppingsAmount2];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer2.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input they are asked again if they would like any toppings
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount2 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount2];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount2;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" |**#**|");
					System.out.println("*   #   *");
					System.out.println("*   #   *");
					System.out.println(" |**#**|");
				}
				//if the user selects option 3, display an appropriate message and output a new badge
				else if (pizza == 3)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the healthy vegetarian pizza.\nThis pizza consists of a crispy base, a delicate tomato paste, 5 different types of cheese, onions, tomatoes, peppers, mushrooms, and pineapple! Delicious!");
					total += vegetable;
					TimeUnit.SECONDS.sleep(1);
					//output toppings options and ask the user if they would like any extra toppings
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Tomatoes\n2. Pineapple\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Feta\n8. Pickles");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer3 = input.next();
					
					//if the user wants extra toppings, ask them how many and ask them to enter the names
					if (toppingsAnswer3.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount3 = input.nextInt();
						String toppings[] = new String[toppingsAmount3];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, then an appropriate message is displayed
					else if (toppingsAnswer3.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid option, they are asked all the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount3 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount3];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount3;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" !!!!");
					System.out.println("*    *");
					System.out.println("*    *");
					System.out.println(" !!!!");
				}
				//if the user selects option 4, display an appropriate message and output a new badge
				else if (pizza == 4)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the delicious meat pizza.\nThis pizza consists of a crispy base, a delicate tomato paste, 5 different types of cheese, pepperoni, chipotle chicken, and beef! Delicious!");
					total += meat;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Tomatoes\n2. Pineapple\n3. Cheese\n4. Peppers\n5. Onions\n6. Jalapenos\n7. Feta\n8. Pickles");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer4 = input.next();
					
					//if the user selects y, they are asked for the number of options and the names of the options
					if (toppingsAnswer4.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount4 = input.nextInt();
						String toppings[] = new String[toppingsAmount4];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects n, an appropriate message is displayed
					else if (toppingsAnswer4.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input, they are asked the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount4 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount4];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();		
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("tomatoes") ||toppings[i].equalsIgnoreCase("pineapple")|| toppings[i].equalsIgnoreCase("cheese") || toppings[i].equalsIgnoreCase("peppers") ||toppings[i].equalsIgnoreCase("onions") ||toppings[i].equalsIgnoreCase("jalapenos") ||toppings[i].equalsIgnoreCase("feta") ||toppings[i].equalsIgnoreCase("pickles"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount4;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("  **!**");
					System.out.println("~   *   ~");
					System.out.println("~   *   ~");
					System.out.println("  **!**");
				}
				//if the user selects an invalid number, an appropriate message is displayed
				else 
				{
					System.out.println("That's not a correct option!");
					total = 0;
				}				
				//output the total cost
				TimeUnit.SECONDS.sleep(1);
				System.out.println("The total cost is $" + total);
				//output money left
				money = money - total;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Money Left = $" + money);
				//ask the user if they would like to play again
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Would you like to buy again (Y or N)?");
				quit1 = input.next();	
			//do this while they want to keep buying
			}while(quit1.equalsIgnoreCase("Y"));
		}
		//another method is created for ice cream
		public static void iceCream() throws InterruptedException
		{
			//initiate scanner
			Scanner input = new Scanner (System.in);
			//declare variables
			int iceCream = 0, toppingsAmount1 = 0, toppingsAmount2 = 0, toppingsAmount3 = 0, toppingsAmount4 = 0, counter = 0;
			double total = 0, money = 1000000;
			final double vanilla = 4.00, chocolate = 4.00, strawberry = 4.00, cookie = 5.00, toppingsCost = 0.25;
			String quit1 = "", quit2 = "",toppingsAnswer1 = "", toppingsAnswer2 = "", toppingsAnswer3 = "", toppingsAnswer4 = "";
			do
			{
				//output a menu of options
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Welcome to Ice Cream King! You can try all types of delicious ice cream!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("1. Vanilla - $ 4.00");
				System.out.println("2. Chocolate - $4.00");
				System.out.println("3. Strawberry - $4.00");
				System.out.println("4. Chocolate Chip Cookie Dough - $ 5.00");
				TimeUnit.SECONDS.sleep(1);
				//ask the user to select an option
				System.out.println("Which type of ice cream would you like to try?");
				iceCream= input.nextInt();
				
				//if the user selects option 1, display an appropriate message and output a new badge
				if (iceCream == 1)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the infamous vanilla ice cream!\nThis ice cream is creamy and delightful! Yum!");
					total += vanilla;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any 
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Gummies\n2. Chocolate\n3. Sprinkles\n4. Caramel\n5. Strawberries\n6. Oreos\n7. Brownies\n8. Peanuts");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer1 = input.next();
					
					//if the user wants toppings, ask them for the amount and ask them to enter the names of them
					if (toppingsAnswer1.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount1 = input.nextInt();
						String toppings[] = new String[toppingsAmount1];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")||toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer1.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input, they are asked the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount1 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount1];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")||toppings[i].equalsIgnoreCase("sprinkles") ||toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount1;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("  !!!!! ");
					System.out.println("*   *   *");
					System.out.println("*   *   *");;
					System.out.println("  !!!!! ");					
				}
				//if the user selects option 2, display an appropriate message and output a new badge
				else if (iceCream == 2)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the amazing chocoalte ice cream.\nThis ice cream has a creamy chocolate taste! Delicious!");
					total += chocolate;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Gummies\n2. Chocolate\n3. Sprinkles\n4. Caramel\n5. Strawberries\n6. Oreos\n7. Brownies\n8. Peanuts");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer2 = input.next();
					
					//if the user selects y, then they are asked how many toppings they would like and the names of the toppings
					if (toppingsAnswer2.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount2 = input.nextInt();
						String toppings[] = new String[toppingsAmount2];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, then an appropriate message is displayed
					else if (toppingsAnswer2.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input, then they are asked all the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount2 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount2];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount2;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" |**#**|");
					System.out.println("*   !   *");
					System.out.println("*   !   *");
					System.out.println("*   !   *");
					System.out.println("*   !   *");
					System.out.println(" |**#**|");
				}
				//if the user selects option 3, display an appropriate message and output a new badge
				else if (iceCream == 3)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the yummy strawberry ice cream.\nThis ice cream has a creamy strawberry taste! Delicious!");
					total += strawberry;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Gummies\n2. Chocolate\n3. Sprinkles\n4. Caramel\n5. Strawberries\n6. Oreos\n7. Brownies\n8. Peanuts");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer3 = input.next();
					
					//if the user selects y, they are asked for the number of toppings and the names of the toppings
					if (toppingsAnswer3.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount3 = input.nextInt();
						String toppings[] = new String[toppingsAmount3];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, then an appropriate message is displayed 
					else if (toppingsAnswer3.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input, they are asked the questions again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount3 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount3];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")||toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount3;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" &&&");
					System.out.println("*    *");
					System.out.println("*    *");
					System.out.println(" $$$");
				}
				//if the user selects option 4, display an appropriate message and output a new badge
				else if (iceCream == 4)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the delicious chocolate chip cookie dough!\nThis ice cream is creamy and consists of chocolate chips and cookie dough! Yum!");
					total += cookie;
					TimeUnit.SECONDS.sleep(1);
					//output toppings and ask the user if they would like any extra toppings
					System.out.println("\nHere are a few extra toppings to choose from!\n1. Gummies\n2. Chocolate\n3. Sprinkles\n4. Caramel\n5. Strawberries\n6. Oreos\n7. Brownies\n8. Peanuts");
					System.out.println("\nWould you like any extra toppings (Y or N)?");
					toppingsAnswer4 = input.next();
					
					//if the user selects y, they are asked how many toppings they would like and are asked for the names
					if (toppingsAnswer4.equalsIgnoreCase ("Y"))
					{
						System.out.println("How many toppings would you like (Enter a number)?");
						toppingsAmount4 = input.nextInt();
						String toppings[] = new String[toppingsAmount4];
						
						for (int i = 0;i<toppings.length;i++)
						{
							System.out.println("Enter the toppings you would like:");
							toppings[i] = input.next();	
							
							//if the user does not enter an option, a message is displayed
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") || toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								continue;
							}
							else
							{
								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
							}
						}
						System.out.println("Toppings: ");
						
						for (int i = 0;i<toppings.length;i++)
						{
							//only options available will be output to the user
							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") ||toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
							{
								System.out.println(toppings[i]);
							}						
						}
					}
					//if the user selects no, an appropriate message is displayed
					else if (toppingsAnswer4.equalsIgnoreCase("N"))
					{
						System.out.println("Okay, we will complete your request");
					}
					//if the user selects an invalid input, then they are asked again
					else 
					{
						counter = counter + 1;
	                    while(counter == 1)
	                    {
	                    	System.out.println("Invalid Input");
	                    	System.out.println("\nWould you like any extra toppings (Enter Y or N)?");
	                    	quit2 = input.next();
	                        quit2 = quit2.toUpperCase();
	                         
	                        if (quit2.equals("Y"))
	                        { 
	                        	counter = counter - 1;
	                        	System.out.println("How many toppings would you like (Enter a number)?");
	     						toppingsAmount4 = input.nextInt();
	     						String toppings[] = new String[toppingsAmount4];
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							System.out.println("Enter the toppings you would like:");
	     							toppings[i] = input.next();	
	     							
	     							//if the user does not enter an option, a message is displayed
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")||toppings[i].equalsIgnoreCase("sprinkles") ||toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	     							{
	    								continue;
	    							}
	    							else
	    							{
	    								System.out.println("That's not an option! If you take your request to customer service, we can try adding it to our menu!");
	    							}
	     						}
	     						System.out.println("Toppings: ");
	     						
	     						for (int i = 0;i<toppings.length;i++)
	     						{
	     							//only options available will be output to the user
	     							if (toppings[i].equalsIgnoreCase("gummies") ||toppings[i].equalsIgnoreCase("chocolate")|| toppings[i].equalsIgnoreCase("sprinkles") ||toppings[i].equalsIgnoreCase("caramel") ||toppings[i].equalsIgnoreCase("strawberries") ||toppings[i].equalsIgnoreCase("oreos") ||toppings[i].equalsIgnoreCase("brownies") ||toppings[i].equalsIgnoreCase("peanuts"))
	    							{
	    								System.out.println(toppings[i]);
	    							}						
	     						}
	                         }
	                         else if (quit2.equals("N"))
	                         {
	                        	counter = counter - 1;
	                            break;
	                         }
	                     }
					}
					total += toppingsCost * toppingsAmount4;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("  ++!++");
					System.out.println("=   *   =");
					System.out.println("=   *   =");
					System.out.println("  ++!++");					
				}
				//if the user puts in an invalid option, a message is displayed
				else 
				{
					System.out.println("That's not a correct option!");
					total = 0;
				}
				//output total cost
				TimeUnit.SECONDS.sleep(1);
				System.out.println("The total cost is $" + total);
				//output money left
				money = money - total;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Money Left = $" + money);
				//ask the user if they would like to buy again
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Would you like to buy again (Y or N)?");
				quit1 = input.next();	
			//loop continues until the user does not want to buy anymore
			}while(quit1.equalsIgnoreCase("Y"));		

}
		//another method is created for the candy store
		public static void candy() throws InterruptedException
		{
			//initiate scanner
			Scanner input = new Scanner (System.in);
			//declare variables
			int candy = 0;
			double total = 0, money = 1000000;
			final double cotton = 3.25, gum = 4.00, starbursts = 4.50, skittles = 5.00;
			String quit1 = "";
			do
			{
				//output a menu for the user to choose an option from
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Welcome to Candy Wonderland! You can try all types of candy!");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("1. Cotton Candy - $ 3.25");
				System.out.println("2. Chewing Gum - $4.00");
				System.out.println("3. Starbursts - $4.50");
				System.out.println("4. Skittles - $ 5.00");
				TimeUnit.SECONDS.sleep(1);
				//ask the user to select an item
				System.out.println("Which type of candy would you like to try?");
				candy= input.nextInt();
					
				//if the user selects option 1, display an appropriate message and output a new badge
				if (candy == 1)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the delicious cotton candy!\nThis candy is soft, fluffy and melts in your mouth! Delicious!");
					total += cotton;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("@@@@@@@@@@");
					System.out.println("*   X   *");
					System.out.println("*   X   *");;
					System.out.println("@@@@@@@@@@");					
				}
				//if the user selects option 2, display an appropriate message and output a new badge
				else if (candy == 2)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen the chewing gum.\nThis is very sticky and comes in all types of flavour like mint and berry! Delicious!");
					total += gum;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" |**#**|");
					System.out.println("*********");
					System.out.println("*********");
					System.out.println(" |**#**|");
				}
				//if the user selects option 3, display an appropriate message and output a new badge
				else if (candy == 3)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen starbursts.\nThis candy is very flavourful! Delicious!");
					total += starbursts;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println(" !!!!");
					System.out.println("******");
					System.out.println("******");
					System.out.println("******");
					System.out.println(" !!!!");
				}
				//if the user selects option 4, display an appropriate message and output a new badge
				else if (candy == 4)
				{
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have chosen skittles.\nThis candy is chewy and full of flavour! Delicious!");
					total += skittles;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Congratulations! You get a new badge!");
					System.out.println("***!***");
					System.out.println("*******");
					System.out.println("*******");
					System.out.println("*******");
					System.out.println("***!***");
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
				//output money left
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

