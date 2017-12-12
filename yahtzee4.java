import javax.swing.JOptionPane;
import java.util.Arrays;

public class yahtzee4 {

	public static void main(String[] args) {
		// YAHTZEE
		JOptionPane.showMessageDialog(null, "Please Put the Console 1/8 of your Monitors\'s length and all of your Monitor's Width.");
		JOptionPane.showConfirmDialog(null, "Did you do it?");
		String name1= JOptionPane.showInputDialog( "Enter your name, Player 1!");
		String name2= JOptionPane.showInputDialog( "Enter your name, Player 2!");
		//Create Score Sheet
		
		int used19= 0 ,used29= 0, used39= 0, used49= 0, used59= 0, used69= 0,used79= 0,used89= 0,used99= 0,used109= 0,used119= 0,used139= 0;
		int used18= 0 ,used28= 0, used38= 0, used48= 0, used58= 0, used68= 0,used78= 0,used88= 0,used98= 0,used108= 0,used118= 0,used138= 0;
		
		int [][] scoreSheetADD = new int[6][2];

		
		for(int i = 0; i<scoreSheetADD.length; i++)
		{
		    for(int  j = 0; j<scoreSheetADD[0].length /*find length of one row of the array */; j++)
		    {
		    	scoreSheetADD[i][j]=0;		 	       		        		      		       
		    }		   
		}		
		//---------------------------TOTAL  sums --------63--------
		int [][] scoreSheetSUMS = new int[1][2];
		
		scoreSheetSUMS[0][0] = 0; scoreSheetSUMS[0][1] = 0;
		//------------------------------------------------
		
		int [][] scoreSheet63= new int[1][2];
		
		scoreSheet63[0][0] = 0; scoreSheet63[0][1] = 0;
		
		//--------------OTHER-------------------------
		int [][] scoreSheetOTHERS= new int[7][2];
	
		
		for(int i = 0; i<scoreSheetOTHERS.length; i++)
		{
		    for(int  j = 0; j<scoreSheetOTHERS[0].length /*find length of one row of the array */; j++)
		    {
		    	scoreSheetOTHERS[i][j]=0;		       		        		      		       
		    }
	
		}
		
		//=================================TOTALTOTALTOTALTOTAL=============
		
	int [][] scoreSheetTOTALTOTAL = new int[1][2];
		
		scoreSheetTOTALTOTAL[0][0] = 0;	scoreSheetTOTALTOTAL[0][1] = 0;
		

		 
		//create a dice 
		 		/**---------------------------FORLOOP----------------- */
		Die die1;	
		die1 = new Die();
			
		//roll the dice 5 times
		/**--^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^----- */
		
		//Rerolls the dice
		int a, c = 0;
		String rerolls = "";
		
		//Reroll for the first time
		//Player's turns
		
		
//------------------------------------------------------------------------------
		int game = 0;System.out.println("The current points are: ");
		System.out.println("   "+name1+  "              "  + name2);		
//--------------TEST----------
		for (int r = 0; r < scoreSheetADD.length; r++)
		{
			for (int q = 0; q < scoreSheetADD[r].length; q++)
			{
				System.out.print("   ");
				System.out.print(scoreSheetADD[r][q] + "            ");
			}
			
			System.out.println(" ");
		}		
		System.out.println(" ");		
//-----------------------TOTAL----------------------
		System.out.println(name1+  "'s Sums     "  + name2+"'s Sums");
		for (int r = 0; r < scoreSheetSUMS.length; r++)
		{
			for (int q = 0; q < scoreSheetSUMS[r].length; q++)
			{
				System.out.print("   ");			
				System.out.print(scoreSheetSUMS[r][q] + "             ");
			}		
			System.out.println(" ");
		}
			
//----------------------------------BONUS--------------------	
		System.out.println(name1+  "'s Bonus    "  + name2+"'s Bonus");
		for (int r = 0; r < scoreSheet63.length; r++)
		{
			for (int q = 0; q < scoreSheet63[r].length; q++)
			{
				System.out.print("   ");
				System.out.print(scoreSheet63[r][q] + "             ");
			}
			
			System.out.println(" ");
		}
				
//-----------------------OTHERS WEIRD PAIRS--------------------------------------------------		
		System.out.println(name1+  "'s Others    "  + name2+"'s Others");
		for (int r = 0; r < scoreSheetOTHERS.length; r++)
		{
			for (int q = 0; q < scoreSheetOTHERS[r].length; q++)
			{
				System.out.print("   ");
				System.out.print(scoreSheetOTHERS[r][q] + "             ");
			}
			
			System.out.println(" ");
		}		
//=================================TOTALTOTALTOTALTOTAL=============
	
		System.out.println();
		System.out.println();
		System.out.println(name1+  "'s  Total     "  + name2+"'s Total ");
		for (int r = 0; r < scoreSheetTOTALTOTAL.length; r++)
		{
			for (int q = 0; q < scoreSheetTOTALTOTAL[r].length; q++)
			{
				System.out.print("   ");
				System.out.print(scoreSheetTOTALTOTAL[r][q] + "              ");
			}			
			System.out.println("             ");
		}	
		//=========================================================
			while (game <= 12)
			{
				int rolls = 0;
				while (rolls == 0)
					{
					//Roll the dice
					int[] values= new int[5];
				
					
					for(int x=0;x<5;x++)
						{
						values [x]=die1.roll();
						}
					System.out.println("           ");
					System.out.print("           ");
					System.out.print(Arrays.toString(values));
					System.out.println("           ");
					
					
						rerolls = JOptionPane.showInputDialog(name1+", Which dice would you like to reroll?");
						int x = Integer.parseInt(rerolls);
						if (x == 0)
							{
								rolls++;
							}
						else
							{
							for (int b = 0; b < rerolls.length(); b++ )
								{
									a = rerolls.charAt(b);
									c = a;
									c = c - '0';
									values[c-1] = die1.roll();
								}
							
//Print the first reroll
					System.out.print("You rerolled these dice: ");
							for (int i = 0; i<values.length; i++)
								{
									System.out.print(values[i] + " ");
								}
		
//Reroll for the second time
							rerolls = JOptionPane.showInputDialog(name1+", Which dice would you like to reroll a second time?");
							int countingString = Integer.parseInt(rerolls);
						if (countingString !=0)
							{
								for (int b = 0; b < rerolls.length(); b++ )
								{
									a = rerolls.charAt(b);
									c = a;
									c = c - '0';
									values[c-1] = die1.roll();
								}
		
							rolls++;
								}
							}
						
		
//Print the second reroll
				System.out.println(" ");
				System.out.print(name1+", Here are your final dice: ");
				for (int i = 0; i<values.length; i++)
					{
						System.out.print(values[i] + " ");
					}
				System.out.println(" ");
	
//=================INPUT POINTS================
		
				String store = "";
				store = JOptionPane.showInputDialog("v v v v v v If ----1= USED,  If ----0= NOT USED v v v v v v v v  \n >1. Ones -------------------" +used19 +"\n > (Add all the ones together)\n >2. Twos -------------------" +used29 +"\n > (Add all the twos together)\n >3. Threes ------------------" +used39 +"\n > (Add all the threes together) \n >4. Fours -------------------" +used49 +"\n > (Add all the fours together)\n >5. Fives -------------------" +used59 +"\n > (Add all the fives together) \n >6. Sixes -------------------" +used69 +"\n > (Add all the sixes together) \n >7. Three of a Kind ------------" +used79 +"\n > (3 die of the same value) \n >8. Four of a Kind -------------" +used89 +"\n > (4 die of the same value)\n >9. Full House ----------------" +used99 +"\n > (3 die of the same value, and 2 different die of the same value)\n >10. Small Straight ------------" +used109 +"\n > (4 die that are in ascending order together) \n >11. Large Straight ------------" +used119 +"\n > (All die are in ascending order together) \n >12. Yahtzee ------------------~~"  +"\n > (All 5 die of the same Value) \n >13. Chance -----------------" +used139 +"\n > (Add all die together) \n ^ ^ ^ ^"+name1+", Select a choice above to put your points ^ ^ ^ ^ ^ ^ ");
				int k = Integer.parseInt(store);
				int j=0;
				if (k == 1)
					{
					j = ones(values);
					System.out.println(j);
					scoreSheetADD [0][0] = j;
					used19++;
					}
				if (k == 2)
				{	
					j = twos(values);
					System.out.println(j);
					scoreSheetADD [1][0] = j;
					used29++;
				}
				if (k == 3)
				{
					j = threes(values);
					System.out.println(j);
					scoreSheetADD [2][0] = j;
					used39++;
				}
				if (k == 4)
				{
					j = fours(values);
					System.out.println(j);
					scoreSheetADD [3][0] = j;
					used49++;
				}
				if (k == 5)
				{
					j = fives(values);
					System.out.println(j);
					scoreSheetADD [4][0] = j;
					used59++;
				}
				if (k == 6)
				{
					j = sixes(values);
					System.out.println(j);
					scoreSheetADD [5][0] = j;
					used69++;
				}
				
//==========================================OTHERS===================
				if (k == 7)
				{
					int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++; 
							 }
						}
					}
				  
					if( kindcount >=3 )
					{
					j = threeKind(values);
					System.out.println(j);
					scoreSheetOTHERS [0][0] = j;
					}
					else
					{
						scoreSheetOTHERS [0][0] = 0;	
					}
					used79++;
				}
//-------------------------------------fourkind
				if (k == 8)
				{
	int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++; 
							 }
						}
					}
			if (kindcount >=4)
			{
					j = fourKind(values);
					System.out.println(j);
					scoreSheetOTHERS  [1][0] = j;
				
			}
			else
			{
				scoreSheetOTHERS  [1][0] = 0;
			}
			used89++;
			
//vvvvvvvvvvvvFULL HOUUSVVVVVVVVVVVVVVVV
				}
				if (k == 9)
				{
					
int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++;  
								
							 }
						}
					}
				
					if (kindcount>=3)
						
				
					{
					j = fullHouse(values);
					System.out.println(j);
					scoreSheetOTHERS [2][0] = j;
					}
					else
					{
						scoreSheetOTHERS [2][0] = 0;
					}
					used99++;		
				}
//VVVVVVVVVVVVV small str8===================
				if (k == 10)
				{
					j = smallStraight(values);
					System.out.println(j);
					scoreSheetOTHERS [3][0] = j;
					used109++;
				}
//VVVVVVVVVVVVV large str8===================
				if (k == 11)
				{
					j = largeStraight(values);
					System.out.println(j);
					scoreSheetOTHERS[4][0] = j;
					used119++;
				}
//VVVVVVVVVVVVV sYAHTZEE ===================
				if (k == 12)
				{
					j = Yahtzee(values);
					System.out.println(j);
					scoreSheetOTHERS [5][0] = j;
				
				}
//==============chance=============== 
				if (k == 13)
				{
					j = chance(values);
					System.out.println(j);
					scoreSheetOTHERS [6][0] = j;
					used139++;
				}
				
				
				

				System.out.println("P1      P2 ");
				
				System.out.println("   "+name1+  "              "  + name2);		
				//--------------TEST----------
						for (int r = 0; r < scoreSheetADD.length; r++)
						{
							for (int q = 0; q < scoreSheetADD[r].length; q++)
							{
								System.out.print("   ");
								System.out.print(scoreSheetADD[r][q] + "            ");
							}
							
							System.out.println(" ");
						}		
						System.out.println(" ");		
				//-----------------------TOTAL----------------------
						System.out.println(name1+  "'s Sums     "  + name2+"'s Sums");
						for (int r = 0; r < scoreSheetSUMS.length; r++)
						{
							for (int q = 0; q < scoreSheetSUMS[r].length; q++)
							{
								System.out.print("   ");			
								System.out.print(scoreSheetSUMS[r][q] + "             ");
							}		
							System.out.println(" ");
						}
							
				//----------------------------------BONUS--------------------	
						System.out.println(name1+  "'s Bonus    "  + name2+"'s Bonus");
						for (int r = 0; r < scoreSheet63.length; r++)
						{
							for (int q = 0; q < scoreSheet63[r].length; q++)
							{
								System.out.print("   ");
								System.out.print(scoreSheet63[r][q] + "             ");
							}
							
							System.out.println(" ");
						}
								
				//-----------------------OTHERS WEIRD PAIRS--------------------------------------------------		
						System.out.println(name1+  "'s Others    "  + name2+"'s Others");
						for (int r = 0; r < scoreSheetOTHERS.length; r++)
						{
							for (int q = 0; q < scoreSheetOTHERS[r].length; q++)
							{
								System.out.print("   ");
								System.out.print(scoreSheetOTHERS[r][q] + "             ");
							}
							
							System.out.println(" ");
						}		
				//=================================TOTALTOTALTOTALTOTAL=============
					
						System.out.println();
						System.out.println();
						System.out.println(name1+  "'s  Total     "  + name2+"'s Total ");
						for (int r = 0; r < scoreSheetTOTALTOTAL.length; r++)
						{
							for (int q = 0; q < scoreSheetTOTALTOTAL[r].length; q++)
							{
								System.out.print("   ");
								System.out.print(scoreSheetTOTALTOTAL[r][q] + "              ");
							}			
							System.out.println("             ");	
				
					}
//=================Player 2 code=================
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^-===============================================================================================================================//^^^^^^^^^^^^^^^^^^^^^^^^^^^^-===============================================================================================================================				
				
				 rolls = 0;
				while (rolls == 0)
					{
					//Roll the dice
					 values=  new int[5];
					for( x=0;x<5;x++)
					{
					values [x]=die1.roll();
					}
					System.out.println("           ");
					System.out.print("           ");
					System.out.print(Arrays.toString(values));
					System.out.println("           ");
					
					
						rerolls = JOptionPane.showInputDialog(name2+", Which dice would you like to reroll?");
					 x = Integer.parseInt(rerolls);
						if (x == 0)
							{
								rolls++;
							}
						else
							{
							for (int b = 0; b < rerolls.length(); b++ )
								{
									a = rerolls.charAt(b);
									c = a;
									c = c - '0';
									values[c-1] = die1.roll();
								}
							
//Print the first reroll
							System.out.print(name2+", You rerolled these dice: ");
							for (int i = 0; i<values.length; i++)
								{
									System.out.print(values[i] + " ");
								}
		
//Reroll for the second time
							rerolls = JOptionPane.showInputDialog(name2+", Which dice would you like to reroll a second time?");
							int countingString = Integer.parseInt(rerolls);
						if (countingString !=0)
							{
								for (int b = 0; b < rerolls.length(); b++ )
								{
									a = rerolls.charAt(b);
									c = a;
									c = c - '0';
									values[c-1] = die1.roll();
								}
		
							rolls++;
								}
							}
		
//Print the second reroll
				System.out.println(" ");
				System.out.print(name2+", Here are your final dice: ");
				for (int i = 0; i<values.length; i++)
					{
						System.out.print(values[i] + " ");
					}
				System.out.println(" ");
	
//=================INPUT POINTS================	
				 store = "";
				store = JOptionPane.showInputDialog("v v v v v v If ----1= USED,  If ----0= NOT USED v v v v v v v v  \n >1. Ones -------------------" +used18 +"\n > (Add all the ones together)\n >2. Twos -------------------" +used28 +"\n > (Add all the twos together)\n >3. Threes ------------------" +used38 +"\n > (Add all the threes together) \n >4. Fours -------------------" +used48 +"\n > (Add all the fours together)\n >5. Fives -------------------" +used58 +"\n > (Add all the fives together) \n >6. Sixes -------------------" +used68 +"\n > (Add all the sixes together) \n >7. Three of a Kind ------------" +used78 +"\n > (3 die of the same value) \n >8. Four of a Kind -------------" +used88 +"\n > (4 die of the same value)\n >9. Full House ----------------" +used98 +"\n > (3 die of the same value, and 2 different die of the same value)\n >10. Small Straight ------------" +used108 +"\n > (4 die that are in ascending order together) \n >11. Large Straight ------------" +used118 +"\n > (All die are in ascending order together) \n >12. Yahtzee ------------------~~"  +"\n > (All 5 die of the same Value) \n >13. Chance -----------------" +used138 +"\n > (Add all die together) \n ^ ^ ^ ^Select a choice above to put your points ^ ^ ^ ^ ^ ^ ");
				 k = Integer.parseInt(store);
				 j=0;
				if (k == 1)
					{
					j = ones(values);
					System.out.println(j);
					scoreSheetADD [0][1] = j;
					used18++;
					}
				if (k == 2)
				{	
					j = twos(values);
					System.out.println(j);
					scoreSheetADD [1][1] = j;
					used28++;
				}
				if (k == 3)
				{
					j = threes(values);
					System.out.println(j);
					scoreSheetADD [2][1] = j;
					used38++;
				}
				if (k == 4)
				{
					j = fours(values);
					System.out.println(j);
					scoreSheetADD [3][1] = j;
					used48++;
				}
				if (k == 5)
				{
					j = fives(values);
					System.out.println(j);
					scoreSheetADD [4][1] = j;
					used58++;
				}
				if (k == 6)
				{
					j = sixes(values);
					System.out.println(j);
					scoreSheetADD [5][1] = j;
					used68++;
				}			
//==========================================OTHERS================================================
				if (k == 7)
				{
					int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++; 
							 }
						}
					}
				  
					if( kindcount >=3 )
					{
					j = threeKind(values);
					System.out.println(j);
					scoreSheetOTHERS [0][1] = j;
					}
					else
					{
						scoreSheetOTHERS [0][1] = 0;	
					}
					used78++;
				}
//-------------------------------------fourkind=========================================================
				if (k == 8)
				{
	int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++; 
							 }
						}
					}
			if (kindcount >=4)
			{
					j = fourKind(values);
					System.out.println(j);
					scoreSheetOTHERS  [1][1] = j;
				
			}
			else
			{
				scoreSheetOTHERS  [1][1] = 0;
			}
			used88++;
			
//vvvvvvvvvvvvFULL HOUUSVVVVVVVVVVVVVVVV
				}
				if (k == 9)
				{
					
int kindcount=0;
					
					for (int i = 0; i<values.length; i++)
					{
						for( j = 0; j<values.length; j++)
						{
							 if (values[i]== (values[j]))
							 {							 
								kindcount++;  
								
							 }
						}
					}				
					if (kindcount>=3)
						
				
					{
					j = fullHouse(values);
					System.out.println(j);
					scoreSheetOTHERS [2][1] = j;
					}
					else
					{
						scoreSheetOTHERS [2][1] = 0;
					}
					used98++;		
				}
//VVVVVVVVVVVVV small str8===================
				if (k == 10)
				{
					j = smallStraight(values);
					System.out.println(j);
					scoreSheetOTHERS [3][1] = j;
					used108++;
				}
//VVVVVVVVVVVVV large str8===================
				if (k == 11)
				{
					j = largeStraight(values);
					System.out.println(j);
					scoreSheetOTHERS[4][1] = j;
					used118++;
				}
//VVVVVVVVVVVVV sYAHTZEE ===================
				if (k == 12)
				{
					j = Yahtzee(values);
					System.out.println(j);
					scoreSheetOTHERS [5][1] = j;
				
				}
//==============chance=============== 
				if (k == 13)
				{
					j = chance(values);
					System.out.println(j);
					scoreSheetOTHERS [6][1] = j;
					used138++;
				}
				
				
				
				//--------------TEST----------
				System.out.println("The current points are: ");
				System.out.println("   "+name1+  "              "  + name2);	
				for (int r = 0; r < scoreSheetADD.length; r++)
				{
					for (int q = 0; q < scoreSheetADD[r].length; q++)
					{
						System.out.print("   ");
						System.out.print(scoreSheetADD[r][q] + "            ");
					}
					
					System.out.println(" ");
				}		
				System.out.println(" ");		
		//-----------------------TOTAL----------------------
				System.out.println(name1+  "'s Sums     "  + name2+"'s Sums");
				for (int r = 0; r < scoreSheetSUMS.length; r++)
				{
					for (int q = 0; q < scoreSheetSUMS[r].length; q++)
					{
						System.out.print("   ");			
						System.out.print(scoreSheetSUMS[r][q] + "             ");
					}		
					System.out.println(" ");
				}
					
		//----------------------------------BONUS--------------------	
				System.out.println(name1+  "'s Bonus    "  + name2+"'s Bonus");
				for (int r = 0; r < scoreSheet63.length; r++)
				{
					for (int q = 0; q < scoreSheet63[r].length; q++)
					{
						System.out.print("   ");
						System.out.print(scoreSheet63[r][q] + "             ");
					}
					
					System.out.println(" ");
				}
						
		//-----------------------OTHERS WEIRD PAIRS--------------------------------------------------		
				System.out.println(name1+  "'s Others    "  + name2+"'s Others");
				for (int r = 0; r < scoreSheetOTHERS.length; r++)
				{
					for (int q = 0; q < scoreSheetOTHERS[r].length; q++)
					{
						System.out.print("   ");
						System.out.print(scoreSheetOTHERS[r][q] + "             ");
					}
					
					System.out.println(" ");
				}		
		//=================================TOTALTOTALTOTALTOTAL=============
			
				System.out.println();
				System.out.println();
				System.out.println(name1+  "'s  Total     "  + name2+"'s Total ");
				for (int r = 0; r < scoreSheetTOTALTOTAL.length; r++)
				{
					for (int q = 0; q < scoreSheetTOTALTOTAL[r].length; q++)
					{
						System.out.print("   ");
						System.out.print(scoreSheetTOTALTOTAL[r][q] + "              ");
					}			
					System.out.println("             ");
				}	
					}//end roll player 2
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^-===============================================================================================================================				
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^-===============================================================================================================================	
game++;
					}
			
			}			
if (game>=12)// ============FIND WINNER==================
	{
	
	/** ADD THEM ALL UP FOR NOW **/
	
// add player one
	int p1=0;
int sumADD=0, sumOTHERS=0;	
for ( a = 0;a < scoreSheetADD.length; a++)
	{ 	
		sumADD = sumADD + scoreSheetADD[p1][0];
		p1++;
	}

if(sumADD >63)
	{
	scoreSheet63[0][0]=25;
		}

p1=0;
	for ( a = 0;a < scoreSheetOTHERS.length; a++)
		{ 
			sumOTHERS = sumOTHERS + scoreSheetOTHERS[p1][0];
			p1++;
		}
	
//add player too
	
p1=0;
int sumADD2=0, sumOTHERS2=0;	
for ( a = 0;a < scoreSheetADD.length; a++)
	{ 
		sumADD2 = sumADD2 + scoreSheetADD[p1][1];
		p1++;
	}

if(sumADD >63)
	{
		scoreSheet63[0][1]=25;
	}

p1=0;
for ( a = 0;a < scoreSheetOTHERS.length; a++)
	{ 
		sumOTHERS = sumOTHERS + scoreSheetOTHERS[p1][1];
		p1++;
	}
scoreSheetSUMS[0][0]= sumADD;
scoreSheetSUMS[0][1]= sumADD2;	

	/**^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */
	// ====================================END GAME================
	
		//player one
	scoreSheetTOTALTOTAL[0][0]= 	scoreSheetSUMS[0][0] +  scoreSheet63[0][1]  + sumOTHERS;
	

	
	//playertwo
	
	scoreSheetTOTALTOTAL[0][1]= 	scoreSheetSUMS[0][1] +  scoreSheet63[0][1] + sumOTHERS2 ;
	
	
	
	//--------------TEST----------
	System.out.println("The current points are: ");
	System.out.println("   "+name1+  "              "  + name2);	
	
	for (int r = 0; r < scoreSheetADD.length; r++)
	{
		for (int q = 0; q < scoreSheetADD[r].length; q++)
		{
		
			System.out.print(scoreSheetADD[r][q] + "       ");
		}
		
		System.out.println(" ");
	}
	
	System.out.println(" ");
	
//-----------------------TOTAL----------------------
	System.out.println("P1sums  P2sums ");
	for (int r = 0; r < scoreSheetSUMS.length; r++)
	{
		for (int q = 0; q < scoreSheetSUMS[r].length; q++)
		{
		
			System.out.print(scoreSheetSUMS[r][q] + "       ");
		}					
		System.out.println(" ");
	}			
//----------------------------------BONUS--------------------	
	System.out.println("P1bonus               P2bonus ");
	for (int r = 0; r < scoreSheet63.length; r++)
	{
		for (int q = 0; q < scoreSheet63[r].length; q++)
		{
			System.out.print("   ");
			System.out.print(scoreSheet63[r][q] + "                   ");
		}					
		System.out.println(" ");
	}
	
	
	
//-----------------------OTHERS WEIRD PAIRS--------------------------------------------------					
	System.out.println("P1OTHERS        P2OTHERS ");
	for (int r = 0; r < scoreSheetOTHERS.length; r++)
	{
		for (int q = 0; q < scoreSheetOTHERS[r].length; q++)
		{
			System.out.print("   ");
			System.out.print(scoreSheetOTHERS[r][q] + "             ");
		}			
		System.out.println(" ");
	}		
//=================================TOTALTOTALTOTALTOTAL=============			
	System.out.println();
	System.out.println();
	System.out.println("P1TOTALSCORE                P2TOTALSCORE ");
	for (int r = 0; r < scoreSheetTOTALTOTAL.length; r++)
	{
		for (int q = 0; q < scoreSheetTOTALTOTAL[r].length; q++)
			{
				System.out.print("     ");
				System.out.print(scoreSheetTOTALTOTAL[r][q] + "                      ");
			}
		
		System.out.println("             ");
	}					
		}//end roll player 2

	/**===================================== find winner       =========== */
	
		if( scoreSheetTOTALTOTAL[0][0]> scoreSheetTOTALTOTAL[0][1] )
			{
					JOptionPane.showMessageDialog(null, "PLAYER ONE WINS!!!!!");	
			}
		else if (scoreSheetTOTALTOTAL[0][0]< scoreSheetTOTALTOTAL[0][1])
			{	
					JOptionPane.showMessageDialog(null, "PLAYER TWO WINS!!!!!");
			}
		else if (scoreSheetTOTALTOTAL[0][0]== scoreSheetTOTALTOTAL[0][1])
			{
					JOptionPane.showMessageDialog(null, "how the hell did you guys tie");
			}
			
		
			}	
	
	public static int ones (int[] array)
	   {
		  int ones = 0;
	   	  for (int x = 0; x < array.length; x++)
	   	  {
	   		  if (1 == array[x])
	   		  {
	   			  ones++;
	   		  }
	   	  }
	      return(ones);             
	    }
	  
	  //twos
	  public static int twos (int[] array)
	   {
		  int twos = 0;
	   	  for (int x = 0; x < array.length; x++)
	   	  {
	   		  if (2 == array[x])
	   		  {
	   			  twos++;
	   		  }
	   	  }
	      twos = twos*2;
	      return(twos);             
	    }
	  
	  //threes
	  public static int threes (int[] array)
	   {
		  int threes = 0;
	   	  for (int x = 0; x < array.length; x++)
	   	  {
	   		  if (3 == array[x])
	   		  {
	   			  threes++;
	   		  }
	   	  }
	      threes = threes*3;
	      return(threes);             
	    }
	  
	  //fours
	  public static int fours (int[] array)
	   {
		  int fours = 0;
	   	  for (int x = 0; x < array.length; x++)
	   	  {
	   		  if (4 == array[x])
	   		  {
	   			  fours++;
	   		  }
	   	  }
	      fours = fours*4;
	      return(fours);             
	    }
	  
	  //fives
	  public static int fives (int[] values)
	   {
		  int fives = 0;
	   	  for (int x = 0; x < values.length; x++)
	   	  {
	   		  if (5 == values[x])
	   		  {
	   			  fives++;
	   		  }
	   	  }
	      fives = fives*5;
	      return(fives);             
	    }
	  
	  //sixes
	  public static int sixes (int[] values)
	   {
		  int sixes = 0;
	   	  for (int x = 0; x < values.length; x++)
	   	  {
	   		  if (6 == values[x])
	   		  {
	   			  sixes++;
	   		  }
	   	  }
	      sixes = sixes*6;
	      return(sixes);             
	    }
	  
	  //three of a kind
	  public static int threeKind (int[] values)
	   {
		  
		  int sum = 0;
	   	  for (int i = 0; i < values.length; i++)
	   	  {
	   		 sum = sum + values[i];
	   	  }
	      
	      return(sum);             
	    }
	  //four of a kind
	  public static int fourKind (int[] values)
	  {
		
		  int sum = 0;
		  for (int i = 0; i < values.length; i++)
		  {
			  sum = sum + values[i];
		  }
		  return(sum);
	  }	  	  	  
	  //full house
	  public static int fullHouse (int[] values)
	  {
		  int fullHouse = 25;
		  return fullHouse;
	  }
	  
	  //small straight
	  public static int smallStraight (int[] values)
	  {
		  int smallStraight = 30;
		  return smallStraight;
	  }	  
	  
	  
	  //large straight
	  public static int largeStraight (int[] values)
	  {
		  int largeStraight = 40;
		  return largeStraight;
	  }
	  //YAHTZEE
	  public static int Yahtzee (int[] values)
	  {
		  int Yahtzee = 50;
		  return Yahtzee;
	  }
	  
	  //chance
	  public static int chance (int [] values)
	  {		 
		  int sum = 0;
		  for (int i = 0; i < values.length; i++)
		  {
			  sum = sum + values[i];
		  }
		  return(sum);
	  }	  
}//END main IF THIS CHANGES SOMETHINGS WRONG
