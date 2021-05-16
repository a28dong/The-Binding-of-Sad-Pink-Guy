// The "EdwardWayneAndrewGame" class.
// Edward, Andrew, and Wayne  24/10/2017
// Mr.Kordbacheh  ICS3U  L'Amoreaux C.I.

/* This is a game assignment, we named the game "The Binding of Sad Pink Guy".
In this game, the player's(or user's) objective is to escape this maze-oriented map.
There are many puzzles and other "mini-games" that seperates this game from other maze-like games.
The player must combine both strategy and logic to overcome these puzzles so that they may advance,
but player must also be wary of tricks and traps that would hinder their progress.
*/
import java.awt.*;
import hsa.Console;

public class EdwardWayneAndrewGame
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	//Used to increase the run screen size for the output of the game.
	c = new Console (30, 125); //Sets the Dimensions to 1000x600

	//Creates new fonts for the drawString method.
	//The parameters require a font, the style(bold,italics,plain) and a size.
	Font normalMis = new Font ("Mistral", Font.PLAIN, 50); //
	//Title Screen, Legend & End Game(Completion) Screen Fonts
	Font smaMis = new Font ("Mistral", Font.ITALIC, 35);
	Font bigMis = new Font ("Mistral", Font.BOLD, 80);
	//Game-Over Screen(Death) Fonts
	Font endB = new Font ("Mistral", Font.BOLD, 120);
	Font endI = new Font ("Mistral", Font.ITALIC, 60);

	//Color variables using RGB for graphics and text
	Color pinkGuy = new Color (204, 153, 152);
	Color ground = new Color (185, 122, 87);
	Color wall = new Color (110, 66, 55);
	Color door = new Color (68, 40, 36);
	Color switcher = new Color (232, 123, 0);
	Color text = new Color (43, 29, 14);
	Color tears = new Color (144, 203, 206);
	Color key = new Color (238, 180, 34);
	Color portal = new Color (148, 0, 211);
	Color leverRed = new Color (216, 31, 42);
	Color leverGreen = new Color (0, 176, 24);
	Color leverBody = new Color (52, 204, 255);
	Color leverRod = new Color (192, 192, 192);
	Color red = new Color (255, 0, 0);
	Color orange = new Color (255, 127, 0);
	Color yellow = new Color (255, 255, 0);
	Color green = new Color (0, 255, 0);
	Color blue = new Color (0, 0, 255);
	Color indigo = new Color (111, 0, 255);
	Color violet = new Color (75, 0, 130);
	Color brown = new Color (82, 54, 27);
	Color turtle = new Color (0, 100, 0);
	Color shell = new Color (173, 129, 80);
	Color shellLines = new Color (102, 51, 0);
	Color mapsBack = new Color (129, 108, 91);
	Color mapsRoom = new Color (222, 188, 153);
	Color endScreen1 = new Color (244, 59, 17);
	Color background = new Color (122, 121, 119);
	Color title = new Color (160, 167, 185);
	Color title2 = new Color (26, 42, 78);

	//Death counter variable
	int deathTotal = 0;

	//Title Screen Background using a rectangle that covers the run screen.
	c.setColor (background); //Sets colour of the background
	c.fillRect (10, 0, 1000, 1000);

	//Draws the title of the game after setting Fonts and Colour
	c.setFont (smaMis);
	c.setColor (title2);
	c.drawString ("THE BINDING OF", 291, 53); //Used as a shadow for aesthetics
	c.setColor (title);
	c.drawString ("THE BINDING OF", 288, 50);
	c.setFont (bigMis);
	c.setColor (title2);
	c.drawString ("SAD PINK GUY", 290, 120); //Used as a shadow for aesthetics
	c.drawString ("PRESS ANY KEY...", 260, 555); //Used as a shadow for aesthetics
	c.setColor (title);
	c.drawString ("SAD PINK GUY", 285, 115);
	c.drawString ("PRESS ANY KEY...", 255, 550);

	//Disclaimer for the user providing regulation.
	c.setFont (smaMis);
	c.setColor (title2);
	c.drawString ("DO NOT USE CAPS LOCK OR THE SHIFT KEY WHEN PLAYING THIS GAME", 84, 592); //Used as a shadow for aesthetics
	c.setColor (title);
	c.drawString ("DO NOT USE CAPS LOCK OR THE SHIFT KEY WHEN PLAYING THIS GAME", 82, 590);

	//Draws the shadow of the main character.
	c.setColor (brown);
	c.fillOval (346, 395, 300, 90);

	//Draws Pink Guy(the main character)
	c.setColor (pinkGuy);
	c.fillOval (396, 155, 200, 200); //Head
	c.fillRect (445, 335, 100, 80); //Body
	c.fillRoundRect (416, 343, 30, 50, 5, 10); //Left hand
	c.fillRoundRect (544, 343, 30, 50, 5, 10); //Right Hand
	c.fillRoundRect (446, 400, 40, 50, 5, 10); //Left Leg
	c.fillRoundRect (504, 400, 40, 50, 5, 10); //Right Leg
	c.setColor (tears);
	c.fillRect (420, 254, 40, 62);  //Tears
	c.fillRect (534, 254, 40, 62);
	c.setColor (Color.black);
	c.drawArc (481, 271, 30, 30, 10, 160); //Mouth
	c.fillOval (410, 225, 60, 60); //Eyes
	c.fillOval (523, 225, 60, 60);
	c.setColor (Color.white);
	c.fillOval (414, 234, 30, 30); //Big White Left
	c.fillOval (528, 234, 30, 30); //Big White Right
	c.fillOval (452, 267, 10, 10); //Small White Left
	c.fillOval (565, 267, 10, 10); //Small White Right

	//Creates a delay for player to see the title screen
	for (int i = 0 ; i > 1200000000 ; i++)
	{
	}
	//Pauses the program until the player presses a key before the game proceeds.
	c.getChar ();

	//The code of the game.
	while (0 == 0) //Infinite loop that will always be true
	{
	    //Game Variables
	    int x = 470, y = 244, room = 1, movement = 0, life = 1, keyTotal = 0, keySpecial = 0;
	    double xreal = 68.0, yreal = 68.0;

	    //Room varibales: start with r, the room number, then a name for the variable
	    int r0X1 = 0, r0X2 = 0, r0X3 = 0, r0X4 = 0, r0PX = 487, r0PY = 328, r0xCount = 0, r0yCount = 0, r0PosAlt = 1, r0Delay = 0;
	    int r1Switch = 10, r2Light1 = 0, r2Light2 = 0, r2Light3 = 0, r2Light4 = 0, r2Barrier = 1, r2Activate = 0;
	    int r3x = 470, r3y = 420, r3Clear = 0, r3Mirror = 0, r4Key = 1, r5Key = 1, r5lever = 1;
	    int r6re = 0, r6or = 0, r6ye = 0, r6gr = 0, r6bl = 0, r6in = 0, r6vi = 0, r6Rainbow = 0;
	    int r7Star1 = 0, r7Star2 = 0, r7Star3 = 0, r7Star4 = 0, r7Star5 = 0, r7StarActivate = 0;
	    int r8Statue1 = 0, r8Statue2 = 0, r8Statue3 = 0, r8Statue4 = 0, r8Statue5 = 0, r8Statue6 = 0;
	    int r8Start = 0, r8x = 0, r8y = 0, r11Key = 1, r12Flip = 1, r12xCount, r12yCount, r14Patience = 0, r14Lock = 1;
	    int r15Hay1 = 0, r15Hay2 = 0, r15Hay3 = 0, r15Hay4 = 0, r15Switch = 0, r16Num1 = (int) (Math.random () * 10);
	    int r16Num2 = (int) (Math.random () * 10), r16Num3 = (int) (Math.random () * 10);
	    int r16Num4 = (int) (Math.random () * 10), r16Num5 = (int) (Math.random () * 10);
	    int r16Memory = 0, r16N1 = 0, r16N2 = 0, r16N3 = 0, r16N4 = 0, r16N5 = 0, r16Entry = 0;
	    int r17Circle1 = 0, r17Circle2 = 0, r17Line1x = 365, r17Line1y = 500, r17Line2x = 750, r17Line2y = 500;
	    int r17Line3x = 680, r17Line3y = 390, r17Line4x = 225, r17Line4y = 520, r17Line5x = 470, r17Line5y = 285;
	    int r18Hole = 1, r1925Portalmaker, r1925Ani = 0, r1925PFail = 1, r19From = 0, r25From = 0, r20Crusherx = 100;
	    int r20Lock = 1, r21Lock = 1, r24Charge1 = 0, r24Charge2 = 0, r24Charge3 = 0, r24Charge4 = 0, r24Battery = 0;
	    int r27AniX = 0, r27AniY = 0, r27AniD = 1, r27AniC = 0;

	    //Actual game
	    //Checks if the player is still alive.
	    while (life == 1)
	    {
		//The basis for most rooms and gives consistency of the graphics.
		if (room != 27 && room != 20 && room != 0)
		{
		    c.setFont (normalMis);
		    //The background of the game(base of the maze screen)
		    c.setColor (Color.white);
		    c.fillRect (0, 0, 1000, 10);
		    c.fillRect (0, 0, 10, 1000);
		    c.setColor (wall);
		    c.fillRect (10, 10, 990, 590);
		    c.setColor (ground);
		    c.fillRect (60, 60, 890, 490);

		    //Status bar for key count and respawns that provides the
		    //player information
		    c.drawString ("KEYS: ", 140, 53);
		    c.drawString ("DEATHS: " + deathTotal, 700, 53);

		    //Draws the number of keys accordingly.
		    c.setColor (key);
		    if (keyTotal >= 1)
			c.fillRect (230, 15, 10, 40);
		    if (keyTotal >= 2)
			c.fillRect (250, 15, 10, 40);
		    if (keyTotal == 3)
			c.fillRect (270, 15, 10, 40);
		    c.setColor (tears);
		    if (keySpecial == 1)
			c.fillRect (120, 15, 10, 40);
		}

		//Checks the room number and has different graphics, text and tasks accordingly.
		c.setColor (door);
		if (room == 0)
		{
		    c.setFont (bigMis);
		    //Draws the background of the room
		    c.setColor (wall);
		    c.fillRect (0, 0, 1000, 1000);
		    c.setColor (portal);
		    c.fillRect (60, 60, 890, 490);

		    //Draws the X's
		    c.setColor (Color.LIGHT_GRAY);
		    if (r0X1 == 1)
			c.setColor (indigo);
		    c.drawString ("X", 152, 240);
		    c.setColor (Color.LIGHT_GRAY);
		    if (r0X2 == 1)
			c.setColor (indigo);
		    c.drawString ("X", 822, 240);
		    c.setColor (Color.LIGHT_GRAY);
		    if (r0X3 == 1)
			c.setColor (indigo);
		    c.drawString ("X", 152, 416);
		    c.setColor (Color.LIGHT_GRAY);
		    if (r0X4 == 1)
			c.setColor (indigo);
		    c.drawString ("X", 822, 416);
		    c.setColor (Color.LIGHT_GRAY);
		    if (r0X1 == 1 && r0X2 == 1 && r0X3 == 1 && r0X4 == 1)
			c.drawString ("X", 487, 328);

		    //Draws the chasing X
		    c.setColor (indigo);
		    c.drawString ("X", r0PX, r0PY);
		}

		if (room == 1)
		{
		    //Draws the doors
		    c.fillRect (10, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Sets the tutorial text font
		    c.setColor (text);
		    //Provides information regarding the controls and instructions of the game.
		    c.drawString ("MOVE", 209, 250);
		    c.drawString ("DOOR", 563, 440);
		    c.drawString ("INTERACT", 635, 125);

		    //Keyboard Buttons
		    c.fillRect (123, 280, 55, 55);
		    c.fillRect (197, 280, 55, 55);
		    c.fillRect (270, 280, 55, 55);
		    c.fillRect (341, 280, 55, 55);

		    //Arrow pointing to door
		    c.drawArc (480, 370, 130, 150, -10, -62);
		    c.drawLine (565, 515, 580, 495);
		    c.drawLine (565, 516, 585, 521);

		    //Interact button
		    c.setColor (switcher);
		    c.fillRect (678, 155, 55, 55);

		    //Text on keyboard buttons that show the controls.
		    c.setColor (Color.white);
		    c.drawString (" W    A    S    D", 122, 324);
		    c.drawString ("E", 693, 199);

		    //Room 1 switch
		    c.setColor (Color.black);
		    //Changes the colour of the switch after a certain size is reached.
		    if (r1Switch == 150)
			c.setColor (Color.red);
		    c.fillOval (802 - r1Switch / 4, 223, r1Switch, r1Switch);
		    //Checks if the player enters the fully sized switch and kills the player.
		    if (x == 805 && y == 244 && r1Switch == 150)
			life = 0;
		}

		if (room == 2)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (10, 244, 50, 120);

		    //Closes down the barrier
		    if (r2Activate == 1)
		    {
			for (int i = 0 ; i <= 490 ; i++)
			{
			    //Draws the walls and barrier
			    c.setColor (brown);
			    c.fillRect (60, 60, 140, i);
			    c.fillRect (810, 60, 140, i);

			    //Draws pink guy
			    //The basic and main body of the character
			    c.setColor (pinkGuy);
			    c.fillRoundRect (x, y, 70, 70, 25, 25);
			    c.fillRect (x + 15, y + 70, 40, 30);
			    c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			    c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			    //Draws the tears.
			    c.setColor (tears);
			    c.fillRect (x + 10, y + 40, 15, 27);
			    c.fillRect (x + 45, y + 40, 15, 27);

			    //Draws the eyes
			    c.setColor (Color.black);
			    c.fillOval (x + 5, y + 25, 25, 25);
			    c.fillOval (x + 40, y + 25, 25, 25);
			    c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			    c.setColor (Color.white);
			    c.fillOval (x + 12, y + 30, 8, 8);
			    c.fillOval (x + 47, y + 30, 8, 8);

			    //Delay
			    for (int j = 0 ; j < 3000000 ; j++)
			    {
			    }
			}
			//Activates the barrier
			r2Activate = 2;
		    }
		    //Checks if the barrier is activated
		    if (r2Activate == 2 && r2Barrier == 1)
		    {
			//Draws the Switches
			c.setColor (switcher);
			c.fillRoundRect (604, 156, 70, 70, 25, 25);
			c.fillRoundRect (336, 156, 70, 70, 25, 25);
			c.fillRoundRect (604, 420, 70, 70, 25, 25);
			c.fillRoundRect (336, 420, 70, 70, 25, 25);

			//Draws the barrier
			c.setColor (brown);
			c.fillRect (60, 60, 140, 490);
			c.fillRect (810, 60, 140, 490);

			//Lights for the barrier depending on if the value is even or odd.
			c.setColor (Color.red);
			if (r2Light1 % 2 == 1)
			    c.setColor (Color.green);
			c.fillOval (85, 86, 90, 90);
			c.fillOval (835, 86, 90, 90);

			c.setColor (Color.red);
			if (r2Light2 % 2 == 1)
			    c.setColor (Color.green);
			c.fillOval (85, 202, 90, 90);
			c.fillOval (835, 202, 90, 90);

			c.setColor (Color.red);
			if (r2Light3 % 2 == 1)
			    c.setColor (Color.green);
			c.fillOval (85, 318, 90, 90);
			c.fillOval (835, 318, 90, 90);

			c.setColor (Color.red);
			if (r2Light4 % 2 == 1)
			    c.setColor (Color.green);
			c.fillOval (85, 434, 90, 90);
			c.fillOval (835, 434, 90, 90);

			//Animation of the barrier deactivating after checking if all lights are green(values are odd)
			if (r2Light1 % 2 == 1 && r2Light2 % 2 == 1 && r2Light3 % 2 == 1 && r2Light4 % 2 == 1)
			{
			    //Draws pink guy
			    //The basic and main body of the character
			    c.setColor (pinkGuy);
			    c.fillRoundRect (x, y, 70, 70, 25, 25);
			    c.fillRect (x + 15, y + 70, 40, 30);
			    c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			    c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			    //Draws the tears
			    c.setColor (tears);
			    c.fillRect (x + 10, y + 40, 15, 27);
			    c.fillRect (x + 45, y + 40, 15, 27);

			    //Draws the eyes
			    c.setColor (Color.black);
			    c.fillOval (x + 5, y + 25, 25, 25);
			    c.fillOval (x + 40, y + 25, 25, 25);
			    c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			    c.setColor (Color.white);
			    c.fillOval (x + 12, y + 30, 8, 8);
			    c.fillOval (x + 47, y + 30, 8, 8);

			    //Barrier slowly retracting animation
			    r2Barrier = 0;
			    c.setColor (ground);
			    for (int i = 0 ; i <= 490 ; i++)
			    {
				c.fillRect (60, 550 - i, 140, i);
				c.fillRect (810, 550 - i, 140, i);
				for (int j = 0 ; j < 3000000 ; j++)
				{
				}
			    }
			}
		    }
		}

		if (room == 3)
		{
		    //Draws the doors
		    if (r3Clear == 1)
		    {
			c.fillRect (470, 10, 70, 50);
			c.fillRect (470, 550, 70, 50);
		    }

		    //HINT
		    c.drawString ("IT ALSO WANTS TO PROCEED TO THE NEXT ROOM...", 90, 300);

		    //Checks if the room is not cleared.
		    if (r3Clear == 0)
		    {
			//Checks if the mirror doesn't have a position
			if (r3Mirror == 0)
			{
			    //Determines position of mirror depending on what the door the room is entered.
			    if (y == 420)
			    {
				r3y = 68;
				r3Mirror = 1;
			    }

			    if (y == 68)
			    {
				r3y = 420;
				r3Mirror = 2;
			    }
			}

			//Draws mirror image of the character's basic body but in black.
			c.setColor (Color.black);
			c.fillRoundRect (r3x, r3y, 70, 70, 25, 25);
			c.fillRect (r3x + 15, r3y + 70, 40, 30);
			c.fillRoundRect (r3x + 15, r3y + 80, 15, 40, 5, 10);
			c.fillRoundRect (r3x + 40, r3y + 80, 15, 40, 5, 10);
			c.fillRoundRect (r3x, r3y + 75, 15, 20, 5, 10);
			c.fillRoundRect (r3x + 55, r3y + 75, 15, 20, 5, 10);
		    }
		}
		if (room == 4)
		{
		    //Draws the doors
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (950, 244, 50, 120);

		    //Draws the key, if not taken
		    if (r4Key == 1)
		    {
			c.setColor (key);
			c.fillOval (490, 249, 35, 35);
			c.fillRect (502, 264, 10, 50);
			c.fillRect (495, 289, 10, 10);
			c.fillRect (490, 304, 15, 10);
			c.setColor (ground);
			c.fillOval (499, 258, 18, 18);
		    }
		}
		if (room == 5)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the key, if not taken
		    if (r5Key == 1)
		    {
			c.setColor (key);
			c.fillOval (150, 170, 35, 35);
			c.fillRect (162, 190, 10, 50);
			c.fillRect (155, 215, 10, 10);
			c.fillRect (150, 230, 15, 10);
			c.setColor (ground);
			c.fillOval (159, 179, 18, 18);
		    }

		    //Effects of Lever. Checks if the value is even or odd and changes colour and direction accordingly.
		    if (r5lever % 2 == 1)
		    {
			c.setColor (leverRed);
			c.fillOval (490, 20, 30, 30);
			c.setColor (leverBody);
			c.fillRect (365, 350, 30, 20);
			c.setColor (leverRod);
			c.fillRect (355, 357, 25, 8);
			c.setColor (leverGreen);
			c.fillOval (340, 350, 20, 20);
		    }

		    if (r5lever % 2 == 0)
		    {
			c.setColor (leverGreen);
			c.fillOval (490, 560, 30, 30);
			c.setColor (leverBody);
			c.fillRect (365, 350, 30, 20);
			c.setColor (leverRod);
			c.fillRect (380, 357, 25, 8);
			c.setColor (leverRed);
			c.fillOval (400, 350, 20, 20);
		    }
		}

		if (room == 6)
		{
		    //Draws the doors if the rainbow is completed
		    if (r6Rainbow == 1)
		    {
			c.fillRect (470, 10, 70, 50);
			c.fillRect (470, 550, 70, 50);
			c.fillRect (10, 244, 50, 120);
		    }

		    //Task for the player to complete
		    c.setColor (text);
		    c.drawString ("COLOURS OF THE RAINBOW", 280, 100);
		    c.drawString ("HINT:FIRST LETTER", 350, 160);

		    //Draws each section of the rainbow depending on whether the player has pressed the correct keys.
		    if (r6re == 1)
		    {
			c.setColor (red);
			c.fillRect (300, 240, 400, 20);
		    }
		    if (r6or == 1)
		    {
			c.setColor (orange);
			c.fillRect (300, 260, 400, 20);
		    }
		    if (r6ye == 1)
		    {
			c.setColor (yellow);
			c.fillRect (300, 280, 400, 20);
		    }
		    if (r6gr == 1)
		    {
			c.setColor (green);
			c.fillRect (300, 300, 400, 20);
		    }
		    if (r6bl == 1)
		    {
			c.setColor (blue);
			c.fillRect (300, 320, 400, 20);
		    }
		    if (r6in == 1)
		    {
			c.setColor (indigo);
			c.fillRect (300, 340, 400, 20);
		    }
		    if (r6vi == 1)
		    {
			c.setColor (violet);
			c.fillRect (300, 360, 400, 20);
		    }
		}

		if (room == 7)
		{
		    //Draws the doors
		    c.fillRect (10, 244, 50, 120);

		    //Checks whether the death star is activated or not and draws graphics accordingly
		    if (r7StarActivate == 1)
		    {
			//Draws the other door.
			c.fillRect (950, 244, 50, 120);
			//Draws lines and text for the death star
			c.setColor (Color.red);
			c.drawString ("DEATH STAR", 580, 298);
			c.drawString ("ACTIVATED", 592, 358);
			c.drawLine (170, 226, 438, 226);
			c.drawLine (438, 226, 237, 402);
			c.drawLine (237, 402, 304, 138);
			c.drawLine (304, 138, 371, 402);
			c.drawLine (371, 402, 170, 226);
			//Draws the death switch
			c.setColor (switcher);
			c.fillOval (284, 274, 40, 40);
		    }

		    //Draws each individual circle of the death star
		    //Checks on whether they have been activated, if activated changes colour.
		    if (r7StarActivate == 0 || r7StarActivate == 1)
		    {
			c.setColor (switcher);
			if (r7Star1 == 1)
			    c.setColor (Color.red);
			c.fillOval (264, 98, 80, 80);

			c.setColor (switcher);
			if (r7Star2 == 1)
			    c.setColor (Color.red);
			c.fillOval (130, 186, 80, 80);

			c.setColor (switcher);
			if (r7Star3 == 1)
			    c.setColor (Color.red);
			c.fillOval (398, 186, 80, 80);

			c.setColor (switcher);
			if (r7Star4 == 1)
			    c.setColor (Color.red);
			c.fillOval (197, 362, 80, 80);

			c.setColor (switcher);
			if (r7Star5 == 1)
			    c.setColor (Color.red);
			c.fillOval (331, 362, 80, 80);
		    }
		}

		if (room == 8)
		{
		    //Draws the doors if all statues have been destroyed.
		    if (r8Statue1 == 1 && r8Statue2 == 1 && r8Statue3 == 1 && r8Statue4 == 1 && r8Statue5 == 1 && r8Statue6 == 1)
		    {
			c.fillRect (470, 10, 70, 50);
			c.fillRect (470, 550, 70, 50);
		    }

		    //Message/Task for the player to complete after providing information.
		    c.setColor (Color.black);
		    c.drawString ("HMM..IT APPEARS YOU CAN SHOOT IN THIS ROOM.", 85, 250);
		    c.drawString ("BREAK ALL", 415, 330);
		    c.drawString ("STATUES.", 430, 390);

		    //Checks if any of the statues are still intact.
		    if (r8Statue1 == 0 || r8Statue2 == 0 || r8Statue3 == 0 || r8Statue4 == 0 || r8Statue5 == 0 || r8Statue6 == 0)
		    {
			//Draws the boundary according to the room they entered with.
			if (r8Start == 1)
			{
			    c.setColor (wall);
			    c.fillRect (10, 187, 1000, 20);
			}

			if (r8Start == 2)
			{
			    c.setColor (wall);
			    c.fillRect (10, 400, 1000, 20);
			}
		    }

		    //Draws each statue depending on whether they are still intact.
		    if (r8Statue1 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (93, 280, 20, 20);
			c.fillRect (88, 300, 30, 60);
		    }
		    if (r8Statue2 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (227, 280, 20, 20);
			c.fillRect (222, 300, 30, 60);
		    }
		    if (r8Statue3 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (361, 280, 20, 20);
			c.fillRect (356, 300, 30, 60);
		    }
		    if (r8Statue4 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (629, 280, 20, 20);
			c.fillRect (624, 300, 30, 60);
		    }
		    if (r8Statue5 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (763, 280, 20, 20);
			c.fillRect (758, 300, 30, 60);
		    }
		    if (r8Statue6 == 0)
		    {
			c.setColor (Color.gray);
			c.fillOval (897, 280, 20, 20);
			c.fillRect (892, 300, 30, 60);
		    }
		}

		if (room == 9)
		{
		    //Draws the doors
		    c.fillRect (10, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Checks if the room is locked then draws the lock on the door
		    if (r14Lock == 1)
		    {
			c.setColor (key);
			c.fillOval (23, 286, 24, 24);
			c.fillRect (30, 298, 12, 24);
		    }
		}

		if (room == 10)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (10, 244, 50, 120);
		}

		if (room == 11)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the pipe
		    c.setColor (Color.green);
		    c.fillRect (470, 10, 70, 50);
		    c.setColor (leverGreen);
		    c.fillRect (440, 60, 130, 30);

		    //Draws the key, if not taken
		    if (r11Key == 1)
		    {
			c.setColor (key);
			c.fillOval (150, 170, 35, 35);
			c.fillRect (162, 190, 10, 50);
			c.fillRect (155, 215, 10, 10);
			c.fillRect (150, 230, 15, 10);
			c.setColor (ground);
			c.fillOval (159, 179, 18, 18);
		    }
		}

		if (room == 12)
		{
		    //Draws the doors
		    c.fillRect (10, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the special key Lock
		    c.setColor (tears);
		    c.fillOval (493, 556, 24, 24);
		    c.fillRect (499, 568, 12, 24);
		    c.drawLine (475, 554, 488, 560);
		    c.drawLine (535, 554, 522, 560);
		    c.drawLine (475, 568, 490, 573);
		    c.drawLine (535, 568, 520, 573);
		    c.drawLine (475, 582, 493, 586);
		    c.drawLine (535, 582, 517, 586);

		    //Warns player of the flipping
		    c.setColor (Color.red);
		    c.drawString ("F L I P", 600, 130);
		}

		//Room 13 Does not have anything to draw

		if (room == 14)
		{
		    //Door
		    c.fillRect (950, 244, 50, 120);

		    //Draws the turtle monster
		    //Draws the flesh of the turtle.
		    c.setColor (turtle);
		    c.fillRect (150, 70, 200, 100); //Head
		    c.fillRect (350, 95, 45, 75); //Head
		    c.fillRect (190, 170, 70, 40); //Neck
		    c.fillRect (100, 240, 50, 130); //Arm
		    c.fillRect (300, 240, 130, 50); //Arm
		    c.fillRect (170, 410, 50, 80); //Leg
		    c.fillRect (230, 410, 50, 80); //Leg

		    //Draws the shell of the turtle with its lines
		    c.setColor (shell);
		    c.fillRect (150, 210, 150, 200); //The basic shell
		    c.setColor (shellLines);
		    c.drawRect (150, 210, 150, 200); //The outline of the shell
		    //Horizontal Lines
		    c.fillRect (180, 210, 30, 200);
		    c.fillRect (240, 210, 30, 200);
		    //Verticle Lines
		    c.fillRect (150, 240, 150, 20);
		    c.fillRect (150, 300, 150, 20);
		    c.fillRect (150, 360, 150, 20);

		    //Draws the eye
		    c.setColor (red);
		    c.fillRect (280, 100, 50, 30);
		    c.setColor (Color.white);
		    c.fillRect (308, 110, 20, 10);

		    //Warning for the user to leave the room.
		    c.setColor (red);
		    c.drawString ("BEGONE MORTAL", 450, 150);


		    //Kills the player after 2 warnings.
		    if (r14Patience == 3)
		    {
			//Draws character in red similar to being bathed in blood)
			//Draws only the basic shape of the character.
			c.setColor (red);
			c.fillRoundRect (x, y, 70, 70, 25, 25);
			c.fillRect (x + 15, y + 70, 40, 30);
			c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			//Creates a delay for the player's death
			for (int i = 0 ; i < 20000 ; i++)
			{
			    //Tells the player of the death.
			    c.setColor (red);
			    c.drawString ("DIE NOW", 450, 200);

			}
			//Kills the player.
			life = 0;
		    }
		}

		if (room == 15)
		{
		    //Checks if the switched is turned on.
		    if (r15Switch == 1)
		    {
			//Draws the doors
			c.fillRect (10, 244, 50, 120);
			c.fillRect (470, 10, 70, 50);
			c.fillRect (470, 550, 70, 50);
			c.fillRect (950, 244, 50, 120);

			//Checks if the room is locked then draws the lock on the door
			if (r20Lock == 1)
			{
			    c.setColor (key);
			    c.fillOval (493, 16, 24, 24);
			    c.fillRect (499, 28, 12, 24);
			}
		    }

		    //Hint for the player for what he or she should do.
		    c.setColor (Color.black);
		    c.drawString ("OOPS, WE FORGOT TO TURN ON THE DOORS!", 130, 230);
		    c.drawString ("MAYBE CHECK THE HAY BALES...", 240, 280);

		    //Draws the switch and changes colour depending on whether it is activated or not.
		    if (r15Switch == 0)
		    {
			c.setColor (Color.red);
			c.fillOval (73, 73, 20, 20);
		    }
		    if (r15Switch == 1)
		    {
			c.setColor (Color.green);
			c.fillOval (73, 73, 20, 20);
		    }

		    //Draws the hay bales if they are not destroyed.
		    if (r15Hay1 == 0)
		    {
			c.setColor (Color.yellow);
			c.fillRect (68, 68, 100, 100);
		    }
		    if (r15Hay2 == 0)
		    {
			c.setColor (Color.yellow);
			c.fillRect (842, 68, 100, 100);
		    }
		    if (r15Hay3 == 0)
		    {
			c.setColor (Color.yellow);
			c.fillRect (68, 440, 100, 100);
		    }
		    if (r15Hay4 == 0)
		    {
			c.setColor (Color.yellow);
			c.fillRect (842, 440, 100, 100);
		    }
		}

		if (room == 16)
		{
		    //Draws the door that the user has entered through.
		    if (r16Entry == 1)
			c.fillRect (10, 244, 50, 120);
		    if (r16Entry == 2)
			c.fillRect (950, 244, 50, 120);

		    //Checks if all values are correct and then draws the doors.
		    if (r16Num1 == r16N1 && r16Num2 == r16N2 && r16Num3 == r16N3 && r16Num4 == r16N4 && r16Num5 == r16N5)
		    {
			c.fillRect (950, 244, 50, 120);
			c.fillRect (10, 244, 50, 120);
			c.fillRect (470, 10, 70, 50);
		    }

		    //Checks if the user has not moved and outputs values.
		    if (r16Memory == 1)
		    {
			//Numbers to memorize
			c.setColor (Color.black);
			c.drawString ("MEMORIZE", 410, 250);
			c.drawString ("" + r16Num1, 356, 312);
			c.drawString ("" + r16Num2, 423, 312);
			c.drawString ("" + r16Num3, 490, 312);
			c.drawString ("" + r16Num4, 557, 312);
			c.drawString ("" + r16Num5, 624, 312);
		    }

		    //Checks if the user has moved and outputs the interaction values.
		    if (r16Memory > 1)
		    {
			//Draws the block of where the values will be outputted.
			c.setColor (Color.white);
			c.fillRect (340, 262, 60, 60);
			c.fillRect (407, 262, 60, 60);
			c.fillRect (474, 262, 60, 60);
			c.fillRect (541, 262, 60, 60);
			c.fillRect (608, 262, 60, 60);

			//Draws the task for the player as well as the interaction values that they would try to match.
			c.setColor (Color.black);
			c.drawString ("MATCH", 450, 250);
			c.drawString ("" + r16N1, 356, 312);
			c.drawString ("" + r16N2, 423, 312);
			c.drawString ("" + r16N3, 490, 312);
			c.drawString ("" + r16N4, 557, 312);
			c.drawString ("" + r16N5, 624, 312);

			//Draws the button for interaction to increase the values.
			c.setColor (Color.yellow);
			c.fillOval (350, 340, 40, 40);
			c.fillOval (417, 340, 40, 40);
			c.fillOval (484, 340, 40, 40);
			c.fillOval (551, 340, 40, 40);
			c.fillOval (618, 340, 40, 40);
		    }
		}

		if (room == 17)
		{
		    //The animation for the portal
		    for (int i = 0 ; i < 240000000 ; i++)
		    {
			//Borders patching
			c.setColor (door);
			c.fillRect (470, 10, 70, 50);
			c.setColor (wall);
			c.fillRect (420, 10, 50, 50);
			c.fillRect (10, 400, 50, 100);
			c.fillRect (950, 370, 50, 100);

			//Narrows the path
			c.setColor (ground);
			c.fillRect (400, 60, 210, 540);
			c.setColor (Color.black);
			c.fillRect (60, 60, 340, 540);
			c.fillRect (610, 60, 340, 540);

			//Draws the portal
			c.setColor (portal);
			c.fillOval (400 - r17Circle1, 530 - r17Circle1, 210 + r17Circle1 * 2, 140 + r17Circle1 * 2);

			//Draws the lines being drawn in
			c.drawLine (r17Line1x, r17Line1y, r17Line1x - 210, r17Line1y - 150);
			c.drawLine (r17Line2x, r17Line2y, r17Line2x + 250, r17Line2y - 100);
			c.drawLine (r17Line3x, r17Line3y, r17Line3x + 200, r17Line3y - 240);
			c.drawLine (r17Line4x, r17Line4y, r17Line4x - 215, r17Line4y - 61);
			c.drawLine (r17Line5x, r17Line5y, r17Line5x - 35, r17Line5y - 275);
			c.drawOval (300 + r17Circle2, 430 + r17Circle2, 410 - r17Circle2 * 2, 240 - r17Circle2);

			//Moves the lines
			r17Line1x += 7;
			r17Line1y += 5;
			r17Line2x -= 5;
			r17Line2y += 2;
			r17Line3x -= 5;
			r17Line3y += 6;
			r17Line4x += 7;
			r17Line4y += 2;
			r17Line5x += 1;
			r17Line5y += 9;
			r17Circle2 += 2;

			//Resets the lines
			if (r17Line1y > 730)
			{
			    r17Line1x = 365;
			    r17Line1y = 500;
			}
			if (r17Line2y > 680)
			{
			    r17Line2x = 750;
			    r17Line2y = 500;
			}
			if (r17Line3y > 800)
			{
			    r17Line3x = 680;
			    r17Line3y = 390;
			}
			if (r17Line4y > 661)
			{
			    r17Line4x = 225;
			    r17Line4y = 520;
			}
			if (r17Line5y > 850)
			{
			    r17Line5x = 470;
			    r17Line5y = 285;
			}
			if (r17Circle2 > 120)
			    r17Circle2 = 0;

			//Draws pink guy
			//Draws the main or basic body of the character
			c.setColor (pinkGuy);
			c.fillRoundRect (x, y, 70, 70, 25, 25);
			c.fillRect (x + 15, y + 70, 40, 30);
			c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			//Draws the tears
			c.setColor (tears);
			c.fillRect (x + 10, y + 40, 15, 27);
			c.fillRect (x + 45, y + 40, 15, 27);

			//Draws the eyes
			c.setColor (Color.black);
			c.fillOval (x + 5, y + 25, 25, 25);
			c.fillOval (x + 40, y + 25, 25, 25);
			c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			c.setColor (Color.white);
			c.fillOval (x + 12, y + 30, 8, 8);
			c.fillOval (x + 47, y + 30, 8, 8);

			//Moves the pink guy
			yreal += y * 0.005;
			y = (int) yreal;

			//Blows up the portal
			if (y > 570)
			    r17Circle1 += 0.002 * y;

			//Provides the player instruction
			if (r17Circle1 > 750)
			{
			    room = 27;
			    i = 250000001;
			    c.drawString ("PRESS ANY KEY TO CONTINUE", 260, 350);
			    //Pauses the program until a key is entered.
			    c.getChar ();
			}

			//Creates a delay
			for (int j = 0 ; j < 8000000 ; j++)
			{
			}
		    }
		}
		if (room == 18)
		{
		    //Draws the doors
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the fake doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (10, 244, 50, 120);
		}

		if (room == 19)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);

		    //Narrows the path
		    c.setColor (Color.black);
		    c.fillRect (60, 60, 890, 140);
		    c.fillRect (60, 410, 890, 140);

		    //Text regarding portal and instructions
		    c.setColor (portal);
		    c.drawString ("PORTAL  ACA19-25", 340, 130);
		    c.drawString ("PRESS E TO USE", 340, 510);

		    //Draws the portal
		    for (int i = 200 ; i < 411 ; i++)
		    {
			r1925Portalmaker = (int) (Math.sin (i) * 60);
			c.drawLine (184 + r1925Portalmaker, i, 154 + r1925Portalmaker, i);
			r1925Portalmaker = (int) (Math.cos (i) * 60);
			c.drawLine (184 + r1925Portalmaker, i, 154 + r1925Portalmaker, i);
		    }
		}

		if (room == 20)
		{
		    //Draws the door and walls
		    c.setColor (wall);
		    c.fillRect (10, 550, 990, 50);
		    c.setColor (door);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the special background
		    for (int i = 0 ; i < 549 ; i += 2)
		    {
			c.setColor (new Color (20 - i / 55, 225 - i / 3, 255 - i / 3));
			c.fillRect (10, i, 990, 2);
		    }

		    //Draws the floor
		    c.setColor (ground);
		    c.fillRect (450, 68, 110, 482);

		    //Draws the key, if not taken
		    if (keySpecial == 0)
		    {
			c.setColor (tears);
			c.fillOval (490, 79, 35, 35);
			c.fillRect (502, 94, 10, 50);
			c.fillRect (495, 119, 10, 10);
			c.fillRect (490, 134, 15, 10);
			c.drawOval (465, 73, 80, 80);
			c.setColor (ground);
			c.fillOval (499, 88, 18, 18);
		    }

		    //Destroys the room if the key is taken
		    if (keySpecial == 1)
		    {
			//Warning for the player
			c.setColor (Color.red);
			c.drawString ("R U N", 458, 60);
			c.fillRect (10, 0, r20Crusherx, 550);
			c.fillRect (1000 - r20Crusherx, 0, r20Crusherx, 550);
			r20Crusherx += 50;
		    }
		}

		//Room 21 does not have anything to draw

		if (room == 22)
		{
		    //Draws the doors
		    c.fillRect (470, 550, 70, 50);
		    c.fillRect (10, 244, 50, 120);
		}

		if (room == 23)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Draws the pitfall
		    c.setColor (Color.red);
		    c.fillRect (60, 60, 410, 184);
		    c.fillRect (470, 188, 402, 56);
		    c.fillRect (540, 364, 410, 186);
		    c.fillRect (138, 364, 402, 56);
		}

		if (room == 24)
		{
		    //Draws the doors
		    c.fillRect (10, 244, 50, 120);
		    c.fillRect (950, 244, 50, 120);
		    c.fillRect (470, 10, 70, 50);
		    c.fillRect (470, 550, 70, 50);

		    //Connects the battery to the doors
		    c.setColor (Color.LIGHT_GRAY);
		    if (r24Battery == 1)
			c.setColor (key);
		    c.fillRect (60, 289, 150, 30);
		    c.fillRect (490, 60, 30, 144);
		    c.fillRect (490, 404, 30, 146);

		    //Draws 'x's on the doors and the hint text
		    if (r24Battery == 0)
		    {
			c.setColor (Color.red);
			c.drawLine (10, 244, 60, 364);
			c.drawLine (60, 244, 10, 364);
			c.drawLine (470, 10, 540, 60);
			c.drawLine (540, 10, 470, 60);
			c.drawLine (470, 550, 540, 600);
			c.drawLine (540, 550, 470, 600);
			c.setColor (text);
			c.drawString ("LOOKS LIKE ONLY THE RIGHT DOOR WORKS....", 110, 125);
			c.drawString ("GUESS YOU'LL HAVE TO FIX THE BATTERY....", 125, 175);
		    }

		    //Draws the battery
		    c.setColor (key);
		    c.fillRect (210, 264, 30, 80);
		    c.fillRect (240, 204, 700, 200);
		    c.fillRect (289, 404, 30, 16);
		    c.fillRect (423, 404, 30, 16);
		    c.fillRect (691, 404, 30, 16);
		    c.fillRect (825, 404, 30, 16);
		    c.fillRect (557, 404, 30, 16);

		    //Draws the switches
		    c.setColor (switcher);
		    c.fillRoundRect (269, 420, 70, 70, 25, 25);
		    c.fillRoundRect (403, 420, 70, 70, 25, 25);
		    c.fillRoundRect (537, 420, 70, 70, 25, 25);
		    c.fillRoundRect (671, 420, 70, 70, 25, 25);
		    c.fillRoundRect (805, 420, 70, 70, 25, 25);
		    c.fillRect (265, 229, 645, 150);

		    c.setColor (Color.white);
		    c.drawString ("1", 294, 468);
		    c.drawString ("2", 428, 468);
		    c.drawString ("3", 694, 468);
		    c.drawString ("4", 830, 468);
		    c.drawString ("R", 562, 468);

		    //Draws the charges of the each section
		    c.setColor (key);
		    c.drawRect (290, 249, 590, 110);
		    c.drawRect (390, 249, 390, 110);
		    c.setColor (Color.white);
		    c.drawString ("" + r24Charge1, 330, 325);
		    c.drawString ("" + r24Charge2, 430, 325);
		    c.drawString ("" + r24Charge3, 720, 325);
		    c.drawString ("" + r24Charge4, 820, 325);
		}

		if (room == 25)
		{
		    //Draws the doors
		    c.fillRect (950, 244, 50, 120);

		    //Narrows the path
		    c.setColor (Color.black);
		    c.fillRect (60, 60, 890, 140);
		    c.fillRect (60, 410, 890, 140);

		    //Text regarding portal and instructions
		    c.setColor (portal);
		    c.drawString ("PORTAL  DFG25-19", 340, 130);
		    c.drawString ("PRESS E TO USE", 340, 510);

		    //Draws the portal
		    for (int i = 200 ; i < 411 ; i++)
		    {
			r1925Portalmaker = (int) (Math.sin (i) * 60);
			c.drawLine (184 + r1925Portalmaker, i, 154 + r1925Portalmaker, i);
			r1925Portalmaker = (int) (Math.cos (i) * 60);
			c.drawLine (184 + r1925Portalmaker, i, 154 + r1925Portalmaker, i);
		    }
		}

		if (room == 26)
		{
		    //Draws the door
		    c.fillRect (10, 244, 50, 120);

		    //Draws the background of the map
		    c.setColor (mapsBack);
		    c.fillRect (285, 85, 445, 445);

		    //Draws the rooms by coloumn
		    c.setColor (mapsRoom);
		    c.fillRect (295, 217, 60, 60);
		    c.fillRect (295, 400, 60, 60);

		    c.fillRect (356, 156, 60, 60);
		    c.fillRect (356, 217, 60, 60);
		    c.fillRect (356, 278, 60, 60);
		    c.fillRect (356, 339, 60, 60);
		    c.fillRect (356, 400, 60, 60);
		    c.fillRect (356, 461, 60, 60);

		    c.fillRect (417, 217, 60, 60);
		    c.fillRect (417, 339, 60, 60);

		    c.fillRect (478, 156, 60, 60);
		    c.fillRect (478, 217, 60, 60);
		    c.fillRect (478, 278, 60, 60);
		    c.fillRect (478, 339, 60, 60);
		    c.fillRect (478, 400, 60, 60);

		    c.fillRect (539, 95, 60, 60);
		    c.fillRect (539, 156, 60, 60);
		    c.fillRect (539, 217, 60, 60);
		    c.fillRect (539, 400, 60, 60);

		    c.fillRect (600, 156, 60, 60);
		    c.fillRect (600, 217, 60, 60);
		    c.fillRect (600, 278, 60, 60);
		    c.fillRect (600, 339, 60, 60);
		    c.fillRect (600, 400, 60, 60);
		    c.fillRect (600, 461, 60, 60);

		    c.fillRect (661, 217, 60, 60);
		    c.fillRect (661, 278, 60, 60);

		    //Draws the doors
		    c.setColor (door);
		    //Draws the vertical doors by coloumn
		    c.fillRect (350, 237, 10, 20);
		    c.fillRect (350, 420, 10, 20);

		    c.fillRect (411, 237, 10, 20);
		    c.fillRect (411, 359, 10, 20);

		    c.fillRect (472, 237, 10, 20);
		    c.fillRect (472, 359, 10, 20);

		    c.fillRect (533, 176, 10, 20);
		    c.fillRect (533, 420, 10, 20);

		    c.fillRect (594, 176, 10, 20);
		    c.fillRect (594, 237, 10, 20);
		    c.fillRect (594, 420, 10, 20);

		    c.fillRect (655, 237, 10, 20);
		    c.fillRect (655, 298, 10, 20);

		    //Draws horizontal doors by coloumn
		    c.fillRect (376, 211, 20, 10);
		    c.fillRect (376, 272, 20, 10);
		    c.fillRect (376, 333, 20, 10);
		    c.fillRect (376, 394, 20, 10);
		    c.fillRect (376, 455, 20, 10);

		    c.fillRect (498, 211, 20, 10);
		    c.fillRect (498, 272, 20, 10);
		    c.fillRect (498, 333, 20, 10);
		    c.fillRect (498, 394, 20, 10);

		    c.fillRect (559, 150, 20, 10);

		    c.fillRect (620, 211, 20, 10);
		    c.fillRect (620, 272, 20, 10);
		    c.fillRect (620, 333, 20, 10);
		    c.fillRect (620, 394, 20, 10);
		    c.fillRect (620, 455, 20, 10);

		    //Legend of map that provides the user information
		    c.setFont (smaMis);
		    c.setColor (tears);
		    c.fillOval (676, 293, 30, 30);
		    c.drawString ("YOU ARE HERE", 740, 120);
		    c.setColor (Color.green);
		    c.fillOval (493, 354, 30, 30);
		    c.drawString ("START", 740, 220);
		    c.setColor (Color.black);
		    c.fillOval (615, 476, 30, 30);
		    c.drawString ("END", 740, 320);
		    c.setColor (portal);
		    c.fillOval (310, 232, 30, 30);
		    c.fillOval (554, 232, 30, 30);
		    c.drawString ("PORTALS", 740, 420);
		    c.setColor (key);
		    c.fillOval (371, 171, 30, 30);
		    c.fillOval (493, 414, 30, 30);
		    c.fillOval (371, 354, 30, 30);
		    c.fillOval (493, 171, 30, 30);
		    c.drawString ("KEYS", 740, 520);
		}

		if (room == 27)
		{
		    //Pink guy stays stationary
		    x = 465;
		    y = 255;
		    c.setColor (background);
		    //Starts the animation with the blocks closing in
		    for (int i = 0 ; i < 241 ; i++)
		    {
			c.fillRect (r27AniX, r27AniY, 75, 75);
			//Moves the block
			if (r27AniD == 1)
			    r27AniX += 50;
			if (r27AniD == 2)
			    r27AniY += 50;
			if (r27AniD == 3)
			    r27AniX -= 50;
			if (r27AniD == 4)
			    r27AniY -= 50;
			//Changes the direction of the block
			if (r27AniX == (950 - r27AniC * 50) && r27AniD == 1)
			    r27AniD = 2;
			if (r27AniY == (550 - r27AniC * 50) && r27AniD == 2)
			    r27AniD = 3;
			if (r27AniX == (0 + r27AniC * 50) && r27AniD == 3)
			{
			    r27AniD = 4;
			    r27AniC += 1;
			}
			if (r27AniY == (0 + r27AniC * 50) && r27AniD == 4)
			    r27AniD = 1;

			//Creates a delay
			for (int j = 0 ; j < 20000000 ; j++)
			{
			}
		    }
		    c.setColor (Color.white);
		    c.fillRect (0, 0, 10, 600);

		    //Draws the Oval in the middle and reveals the title
		    for (int i = 0 ; i < 160 ; i++)
		    {
			//Drawas the background
			c.setColor (background);
			c.fillRect (10, 0, 990, 600);

			//Oval
			c.setColor (Color.white);
			c.fillOval (x + 35 - i, y + 60 - i, i * 2, i * 2);

			//Draws pink guy inside oval
			//Draws the main or basic body
			c.setColor (pinkGuy);
			c.fillRoundRect (x, y, 70, 70, 25, 25);
			c.fillRect (x + 15, y + 70, 40, 30);
			c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			//Draws the tears
			c.setColor (tears);
			c.fillRect (x + 10, y + 40, 15, 27);
			c.fillRect (x + 45, y + 40, 15, 27);

			//Draws the eyes
			c.setColor (Color.black);
			c.fillOval (x + 5, y + 25, 25, 25);
			c.fillOval (x + 40, y + 25, 25, 25);
			c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			c.setColor (Color.white);
			c.fillOval (x + 12, y + 30, 8, 8);
			c.fillOval (x + 47, y + 30, 8, 8);

			//Cover/surprise
			c.setColor (background);
			c.fillRect (260 + i * 3, 10, 480 - i * 3, 130);
			c.fillRect (115 + i * 5, 495, 800 - i * 5, 85);

			//Title and thank you
			c.setFont (smaMis);
			c.setColor (title2);
			c.drawString ("THE BINDING OF", 291, 53);
			c.setColor (title);
			c.drawString ("THE BINDING OF", 288, 50);
			c.setFont (bigMis);
			c.setColor (title2);
			c.drawString ("SAD PINK GUY", 290, 120);
			c.drawString ("THANKS FOR PLAYING", 185, 568);
			c.setColor (title);
			c.drawString ("SAD PINK GUY", 285, 115);
			c.drawString ("THANKS FOR PLAYING", 180, 563);

			//Cover/suprise
			c.setColor (background);
			c.fillRect (260 + i * 3, 10, 480 - i * 3, 130);
			c.fillRect (115 + i * 5, 495, 800 - i * 5, 85);

			//Creates a delay
			for (int j = 0 ; j < 20000000 ; j++)
			{
			}
		    }
		    c.setColor (background);
		    c.fillRect (725, 0, 60, 140);
		    c.fillRect (875, 470, 60, 120);

		    //Draws Satanic Star Left
		    c.setColor (endScreen1);
		    c.drawLine (60, 350, 100, 230); //Line 1
		    c.drawLine (100, 230, 150, 350); //Line 2
		    c.drawLine (150, 350, 40, 280); //Line 3
		    c.drawLine (40, 280, 165, 280); //Line 4
		    c.drawLine (165, 280, 60, 350); //Line 5
		    c.drawOval (35, 231, 135, 137); //Circle

		    //Draws Satanic Star Right
		    c.drawLine (860, 350, 900, 230); //Line 1
		    c.drawLine (900, 230, 950, 350); //Line 2
		    c.drawLine (950, 350, 840, 280); //Line 3
		    c.drawLine (840, 280, 965, 280); //Line 4
		    c.drawLine (965, 280, 860, 350); //Line 5
		    c.drawOval (835, 231, 135, 137); //Circle

		    //Draws moving lines around the circle
		    for (int i = 0 ; i < 2100000000 ; i++)
		    {
			//Covers lines
			c.setColor (background);
			//Outer
			c.drawOval (319, 134, 362, 362);
			c.drawOval (320, 135, 360, 360);
			c.drawOval (321, 136, 358, 358);
			//Inner
			c.drawOval (329, 144, 342, 342);
			c.drawOval (330, 145, 340, 340);
			c.drawOval (331, 146, 338, 338);
			//Redraws lines
			c.setColor (Color.red);
			//Outer
			c.drawArc (319, 134, 362, 362, i, 40);
			c.drawArc (319, 134, 362, 362, i - 120, 40);
			c.drawArc (319, 134, 362, 362, i - 240, 40);
			c.drawArc (320, 135, 360, 360, i, 40);
			c.drawArc (320, 135, 360, 360, i - 120, 40);
			c.drawArc (320, 135, 360, 360, i - 240, 40);
			c.drawArc (321, 136, 358, 358, i, 40);
			c.drawArc (321, 136, 358, 358, i - 120, 40);
			c.drawArc (321, 136, 358, 358, i - 240, 40);
			//Inner
			c.drawArc (329, 144, 342, 342, -i, 40);
			c.drawArc (329, 144, 342, 342, -i + 120, 40);
			c.drawArc (329, 144, 342, 342, -i + 240, 40);
			c.drawArc (330, 145, 340, 340, -i, 40);
			c.drawArc (330, 145, 340, 340, -i + 120, 40);
			c.drawArc (330, 145, 340, 340, -i + 240, 40);
			c.drawArc (331, 146, 338, 338, -i, 40);
			c.drawArc (331, 146, 338, 338, -i + 120, 40);
			c.drawArc (331, 146, 338, 338, -i + 240, 40);

			//Delay
			for (int j = 0 ; j < 17000000 ; j++)
			{
			}
		    }
		}

		if (room == 28)
		{
		    //Draws the door
		    c.fillRect (10, 244, 50, 120);

		    //Prints out the hints to solve the battery
		    c.drawString ("HOW TO FIX THE BATTERY 101:", 80, 110);
		    c.drawString ("CHARGE 4 HAS A CHARGE OF 2", 80, 180);
		    c.drawString ("CHARGE 1 HAS 4X THE CHARGES OF CHARGE 4", 80, 250);
		    c.drawString ("CHARGE 3 HAS 3 MORE CHARGES THAN CHARGE 2", 80, 320);
		    c.drawString ("THE SUM OF THE CHARGES IS 21", 80, 390);
		    c.drawString ("HIT THE 'R' WHEN YOU'RE DONE TO PROCEED", 80, 460);
		    c.drawString ("IF THE CHARGES ARE INCORRECT, THEY RESET", 80, 530);

		    //Draws the Battery Visual
		    c.setColor (key);
		    c.fillRect (690, 115, 20, 40);
		    c.fillRect (710, 85, 220, 100);
		}

		//Draws pink guy
		//Draws the main or basic body
		c.setColor (pinkGuy);
		c.fillRoundRect (x, y, 70, 70, 25, 25);
		c.fillRect (x + 15, y + 70, 40, 30);
		c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
		c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
		c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
		c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

		//Draws the tears
		c.setColor (tears);
		c.fillRect (x + 10, y + 40, 15, 27);
		c.fillRect (x + 45, y + 40, 15, 27);

		//Draws the eyes
		c.setColor (Color.black);
		c.fillOval (x + 5, y + 25, 25, 25);
		c.fillOval (x + 40, y + 25, 25, 25);
		c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
		c.setColor (Color.white);
		c.fillOval (x + 12, y + 30, 8, 8);
		c.fillOval (x + 47, y + 30, 8, 8);

		//Movement of character
		if (life == 1)
		    //Pauses the program until the player inputs a movement key
		    movement = c.getChar ();

		//Changes the x or y position according to which key was pressed.
		if (movement == 'a')
		    x = x - 67;
		if (movement == 'd')
		    x = x + 67;
		if (movement == 'w')
		    y = y - 88;
		if (movement == 's')
		    y = y + 88;

		//Movement of Mirror (room 3)
		if (room == 3)
		{
		    if (movement == 'a')
			r3x = r3x + 67;
		    if (movement == 'd')
			r3x = r3x - 67;
		    if (movement == 'w')
			r3y = r3y + 88;
		    if (movement == 's')
			r3y = r3y - 88;
		    //Boundaries of the mirror
		    if (r3x < 68)
			r3x = 68;
		    if (r3x > 872)
			r3x = 872;
		    if (r3y < 68)
			r3y = 68;
		    if (r3y > 420)
			r3y = 420;
		}

		//Allows player to go through doors and interact with stuff accordingly to the room
		if (room == 0)
		{
		    //In-room borders
		    if (x == 1)
			x = 68;
		    if (x == 939)
			x = 872;
		    if (y == -20)
			y = 68;
		    if (y == 508)
			y = 420;

		    //Sets values for the counting
		    if (x <= r0PX)
			r0xCount = (x - r0PX - 17) / 67;
		    if (x > r0PX)
			r0xCount = 1 + (x - r0PX - 50) / 67;
		    if (y <= r0PY)
			r0yCount = (y - r0PY + 84) / 88;
		    if (y > r0PY)
			r0yCount = 1 + (y - r0PY - 4) / 88;

		    //Chasing interactions
		    //Moves the X accordingly, with different distances
		    if (r0Delay % 2 == 0)
		    {
			if (Math.abs (r0xCount) > Math.abs (r0yCount))
			{
			    if (r0PX > x)
				r0PX -= 67;
			    if (r0PX < x)
				r0PX += 67;
			}
			else if (Math.abs (r0yCount) > Math.abs (r0xCount))
			{
			    if (r0PY > y)
				r0PY -= 88;
			    if (r0PY < y)
				r0PY += 88;
			}
			//If the x and y distance are the same, the movement is randomized
			else
			{
			    r0PosAlt = (int) Math.random () * 2;
			    if (r0PosAlt == 0)
			    {
				if (r0PX > x)
				    r0PX -= 67;
				if (r0PX < x)
				    r0PX += 67;
			    }
			    else if (r0PosAlt == 1)
			    {
				if (r0PY > y)
				    r0PY -= 88;
				if (r0PY < y)
				    r0PY += 88;
			    }
			}
		    }
		    r0Delay += 1;

		    //Makes the X's lit
		    if (r0PX == 152 && r0PY == 240)
			r0X1 = 1;
		    if (r0PX == 152 && r0PY == 416)
			r0X3 = 1;
		    if (r0PX == 822 && r0PY == 240)
			r0X2 = 1;
		    if (r0PX == 822 && r0PY == 416)
			r0X4 = 1;

		    //If all the X's are lit, continue with the portal
		    if (r0PX == 487 && r0PY == 328 && r0X1 == 1 && r0X2 == 1 && r0X3 == 1 && r0X4 == 1)
		    {
			if (r19From == 1)
			    room = 25;
			if (r25From == 1)
			    room = 19;
			r25From = 0;
			r19From = 0;
			r1925PFail = 0;

			//Closes out the room
			for (int i = 0 ; i <= 800 ; i++)
			{
			    c.drawLine (600 - i, 0, 400 - i, 600);
			    c.drawLine (600 + i, 0, 400 + i, 600);
			    c.drawLine (400 - i, 0, 600 + i, 600);
			    c.drawLine (400 + i, 0, 600 - i, 600);
			    for (int j = 0 ; j < 5000000 ; j++)
			    {
			    }
			}
		    }

		    //Sends player back to portal
		    if ((x == 135 && y == 156 && r0X1 == 1) || (x == 135 && y == 332 && r0X3 == 1) || (x == 805 && y == 156 && r0X2 == 1) || (x == 805 && y == 332 && r0X4 == 1) || (x == r0PX - 17 && y == r0PY - 84))
		    {
			c.setColor (portal);
			c.fillRect (0, 0, 1000, 600);

			//Draws pink guy
			//Draws the main or basic body
			c.setColor (pinkGuy);
			c.fillRoundRect (x, y, 70, 70, 25, 25);
			c.fillRect (x + 15, y + 70, 40, 30);
			c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			//Draws the tears
			c.setColor (tears);
			c.fillRect (x + 10, y + 40, 15, 27);
			c.fillRect (x + 45, y + 40, 15, 27);

			//Draws the eyes
			c.setColor (Color.black);
			c.fillOval (x + 5, y + 25, 25, 25);
			c.fillOval (x + 40, y + 25, 25, 25);
			c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			c.setColor (Color.white);
			c.fillOval (x + 12, y + 30, 8, 8);
			c.fillOval (x + 47, y + 30, 8, 8);
			c.setColor (Color.black);

			//Animation to go back to the room
			if (r19From == 1)
			{
			    room = 19;
			    r19From = 0;
			}
			if (r25From == 1)
			{
			    room = 25;
			    r25From = 0;
			}

			for (int i = 300 ; i >= 0 ; i--)
			{
			    c.drawOval (x + 35 - i, y + 60 - i, i * 2, i * 2);
			    for (int j = 0 ; j <= 5000000 ; j++)
			    {
			    }
			}

			//Resets all X's
			x = 470;
			r0X1 = 0;
			r0X2 = 0;
			r0X3 = 0;
			r0X4 = 0;
			r0PX = 487;
			r0PY = 328;
		    }
		}

		if (room == 1)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244)
		    {
			room = 2;
			x = 872;
		    }
		    if (y == -20 && x == 470)
		    {
			room = 3;
			y = 420;
		    }
		    if (y == 508 && x == 470)
		    {
			room = 4;
			y = 68;
		    }

		    //Interacts with tutorial switch
		    if (movement == 'e' && x == 671 && y == 156 && r1Switch < 150)
			r1Switch += 10;
		}

		if (room == 2)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 1;
			x = 68;
		    }
		    if (x == 1 && y == 244)
		    {
			room = 5;
			x = 872;
		    }

		    //Barrier interactions
		    if (x == 470 && r2Activate == 0)
			r2Activate = 1;
		    if (r2Activate == 2)
		    {
			//Prevents player from walking through barrier
			if (r2Barrier == 1 && x == 135)
			    x = 202;
			if (r2Barrier == 1 && x == 805)
			    x = 738;

			//Barrier deactivator interactions
			if (x == 336 && y == 156 && movement == 'e')
			{
			    r2Light2 += 1;
			    r2Light3 += 1;
			}
			if (x == 604 && y == 156 && movement == 'e')
			{
			    r2Light1 += 1;
			    r2Light2 += 1;
			    r2Light4 += 1;
			}
			if (x == 336 && y == 420 && movement == 'e')
			{
			    r2Light3 += 1;
			    r2Light4 += 1;
			}
			if (x == 604 && y == 420 && movement == 'e')
			{
			    r2Light1 += 1;
			    r2Light3 += 1;
			}
		    }
		}

		if (room == 3)
		{
		    //Checks for collision and causes death.
		    if (r3Clear == 0)
		    {
			if (y == r3y && x == 470 && r3Mirror > 0)
			{
			    //Kills the player
			    life = 0;
			}
		    }

		    //Checks if the room is cleared based off the mirror's positioning.
		    if (r3Mirror == 1)
		    {
			if (r3y == 420 && r3x == 470)
			    r3Clear = 1;
		    }
		    if (r3Mirror == 2)
		    {
			if (r3y == 68 && r3x == 470)
			    r3Clear = 1;
		    }

		    //Door interactions, checks positioning then assigns room and new position
		    if (r3Clear == 1)
		    {
			if (y == -20 && x == 470)
			{
			    room = 6;
			    y = 420;
			}

			if (y == 508 && x == 470)
			{
			    room = 1;
			    y = 68;
			}
		    }
		}

		if (room == 4)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 470 && y == -20)
		    {
			room = 1;
			y = 420;
		    }
		    if (x == 939 && y == 244)
		    {
			room = 7;
			x = 68;
		    }

		    //Key interactions
		    if (x == 470 && y == 244 && movement == 'e' && r4Key == 1)
		    {
			r4Key = 0;
			keyTotal += 1;
		    }
		}

		if (room == 5)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 2;
			x = 68;
		    }

		    //Key interactions
		    if (movement == 'e' && x == 135 && y == 156 && r5Key == 1)
		    {
			r5Key = 0;
			keyTotal += 1;
		    }

		    //Restrains movement if door isn't unlocked
		    if (r5lever % 2 == 0)
		    {
			if (y == -20 && x == 470)
			{
			    room = 8;
			    y = 420;
			    r8Start = 2;
			}
		    }
		    if (r5lever % 2 == 1)
		    {
			if (y == 508 && x == 470)
			{
			    room = 9;
			    y = 68;
			}
		    }

		    //Lever interactions that would turn it on or off
		    if (movement == 'e' && x == 336 && y == 332)
		    {
			r5lever += 1;
		    }
		}

		if (room == 6)
		{
		    //Checks if the rainbow is completed
		    //Door interactions, checks positioning then assigns room and new position
		    if (r6Rainbow == 1)
		    {
			if (y == -20 && x == 470)
			{
			    room = 11;
			    y = 420;
			}

			if (y == 508 && x == 470)
			{
			    room = 3;
			    y = 68;
			}

			if (x == 1 && y == 244)
			{
			    room = 10;
			    x = 872;
			}
		    }

		    //Checks if the correct keys are pressed then turns on each part of the rainbow
		    if (movement == 'r')
			r6re = 1;
		    if (movement == 'o')
			r6or = 1;
		    if (movement == 'y')
			r6ye = 1;
		    if (movement == 'g')
			r6gr = 1;
		    if (movement == 'b')
			r6bl = 1;
		    if (movement == 'i')
			r6in = 1;
		    if (movement == 'v')
			r6vi = 1;

		    //If all parts are turned on, the rainbow is completed.
		    if (r6re == 1 && r6or == 1 && r6ye == 1 && r6gr == 1 && r6bl == 1 && r6in == 1 && r6vi == 1)
			r6Rainbow = 1;
		}

		if (room == 7)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244)
		    {
			room = 4;
			x = 872;
		    }
		    if (x == 939 && y == 244 && r7StarActivate == 1)
		    {
			room = 12;
			x = 68;
		    }

		    //Sets ovals to be red when interacted with
		    if (x == 269 && y == 68 && movement == 'e')
			r7Star1 = 1;
		    if (x == 135 && y == 156 && movement == 'e')
			r7Star2 = 1;
		    if (x == 403 && y == 156 && movement == 'e')
			r7Star3 = 1;
		    if (x == 202 && y == 332 && movement == 'e')
			r7Star4 = 1;
		    if (x == 336 && y == 332 && movement == 'e')
			r7Star5 = 1;

		    //If all circles are red, star activates
		    if (r7Star1 == 1 && r7Star2 == 1 && r7Star3 == 1 && r7Star4 == 1 && r7Star5 == 1 && r7StarActivate != 2)
			r7StarActivate = 1;
		    //Trap: if player interacts with middle, he/she dies
		    if (r7StarActivate == 1 && x == 269 && y == 244 && movement == 'e')
		    {
			r7StarActivate = 2;
			for (int i = 0 ; i < 500 ; i++)
			{
			    //Destroys star
			    c.setColor (Color.red);
			    c.fillOval (310 - i / 2, 305 - i / 2, i, i);
			    //Draws pink guy
			    //Draws the main or basic body
			    c.setColor (pinkGuy);
			    c.fillRoundRect (x, y, 70, 70, 25, 25);
			    c.fillRect (x + 15, y + 70, 40, 30);
			    c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			    c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			    c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			    //Draws the tears
			    c.setColor (tears);
			    c.fillRect (x + 10, y + 40, 15, 27);
			    c.fillRect (x + 45, y + 40, 15, 27);

			    //Draws the eyes
			    c.setColor (Color.black);
			    c.fillOval (x + 5, y + 25, 25, 25);
			    c.fillOval (x + 40, y + 25, 25, 25);
			    c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			    c.setColor (Color.white);
			    c.fillOval (x + 12, y + 30, 8, 8);
			    c.fillOval (x + 47, y + 30, 8, 8);

			    //Creates a delay for the animation
			    for (int j = 0 ; j < 3000000 ; j++)
			    {
			    }
			}
			//Decreasing hole
			for (int i = 200 ; i > 0 ; i--)
			{
			    //Black hole
			    c.setColor (Color.red);
			    c.drawOval (305 - i / 2, 305 - i / 2, i, i);
			    //Creates a delay for the animation
			    for (int j = 0 ; j < 10000000 ; j++)
			    {
			    }
			}
			//Kills the player
			life = 0;
		    }
		}
		if (room == 8)
		{
		    //Checks if all statues are destroyed
		    //Door interactions, checks positioning then assigns room and new position
		    if (r8Statue1 == 1 && r8Statue2 == 1 && r8Statue3 == 1 && r8Statue4 == 1 && r8Statue5 == 1 && r8Statue6 == 1)
		    {
			if (y == -20 && x == 470)
			{
			    room = 15;
			    y = 420;
			}
			if (y == 508 && x == 470)
			{
			    room = 5;
			    y = 68;
			}
		    }

		    //Checks if any statues are intact and then has boundaries to restrict movements
		    if (r8Statue1 == 0 || r8Statue2 == 0 || r8Statue3 == 0 || r8Statue4 == 0 || r8Statue5 == 0 || r8Statue6 == 0)
		    {
			if (r8Start == 1 && y > 155)
			    y = 68;
			if (r8Start == 2 && y < 400)
			    y = 420;
		    }

		    //Checks if the player is shooting and if the statues are still intact
		    if (movement == 'e' && (r8Statue1 == 0 || r8Statue2 == 0 || r8Statue3 == 0 || r8Statue4 == 0 || r8Statue5 == 0 || r8Statue6 == 0))
		    {
			//Assigns a value to the bullet positioning
			r8x = x + 25;

			//Shooting animation
			if (r8Start == 2)
			{
			    r8y = 400;

			    for (int i = 0 ; i <= 60 ; i++)
			    {
				//The background
				c.setColor (ground);
				c.fillRect (60, 60, 890, 490);
				c.setColor (wall);
				c.fillRect (10, 400, 1000, 20);

				//Draws pink guy
				//Draws the main or basic body
				c.setColor (pinkGuy);
				c.fillRoundRect (x, y, 70, 70, 25, 25);
				c.fillRect (x + 15, y + 70, 40, 30);
				c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
				c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
				c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
				c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

				//Draws the tears
				c.setColor (tears);
				c.fillRect (x + 10, y + 40, 15, 27);
				c.fillRect (x + 45, y + 40, 15, 27);

				//Draws the eyes
				c.setColor (Color.black);
				c.fillOval (x + 5, y + 25, 25, 25);
				c.fillOval (x + 40, y + 25, 25, 25);
				c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
				c.setColor (Color.white);
				c.fillOval (x + 12, y + 30, 8, 8);
				c.fillOval (x + 47, y + 30, 8, 8);

				//Draws the statues if they are still intact
				if (r8Statue1 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (93, 280, 20, 20);
				    c.fillRect (88, 300, 30, 60);
				}
				if (r8Statue2 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (227, 280, 20, 20);
				    c.fillRect (222, 300, 30, 60);
				}
				if (r8Statue3 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (361, 280, 20, 20);
				    c.fillRect (356, 300, 30, 60);
				}
				if (r8Statue4 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (629, 280, 20, 20);
				    c.fillRect (624, 300, 30, 60);
				}
				if (r8Statue5 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (763, 280, 20, 20);
				    c.fillRect (758, 300, 30, 60);
				}
				if (r8Statue6 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (897, 280, 20, 20);
				    c.fillRect (892, 300, 30, 60);
				}

				//Draws the message and task for the player
				c.setColor (Color.black);
				c.drawString ("HMM..IT APPEARS YOU CAN SHOOT IN THIS ROOM.", 85, 250);
				c.drawString ("BREAK ALL", 415, 330);
				c.drawString ("STATUES.", 430, 390);

				//Tear(bullet) moving animation
				for (int j = 0 ; j <= 400 ; j++)
				{
				    c.setColor (tears);
				    c.fillOval (r8x, r8y - i, 20, 20);
				}
			    }
			}
			if (r8Start == 1)
			{
			    r8y = 68 + 100;

			    for (int i = 0 ; i <= 100 ; i++)
			    {
				//The background & boundary
				c.setColor (ground);
				c.fillRect (60, 60, 890, 490);
				c.setColor (wall);
				c.fillRect (10, 187, 1000, 20);

				//Draws pink guy
				//Draws the main or basic body
				c.setColor (pinkGuy);
				c.fillRoundRect (x, y, 70, 70, 25, 25);
				c.fillRect (x + 15, y + 70, 40, 30);
				c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
				c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
				c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
				c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

				//Draws the tears
				c.setColor (tears);
				c.fillRect (x + 10, y + 40, 15, 27);
				c.fillRect (x + 45, y + 40, 15, 27);

				//Draws the eyes
				c.setColor (Color.black);
				c.fillOval (x + 5, y + 25, 25, 25);
				c.fillOval (x + 40, y + 25, 25, 25);
				c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
				c.setColor (Color.white);
				c.fillOval (x + 12, y + 30, 8, 8);
				c.fillOval (x + 47, y + 30, 8, 8);

				//Draws the statues if they are intact
				if (r8Statue1 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (93, 280, 20, 20);
				    c.fillRect (88, 300, 30, 60);
				}
				if (r8Statue2 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (227, 280, 20, 20);
				    c.fillRect (222, 300, 30, 60);
				}
				if (r8Statue3 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (361, 280, 20, 20);
				    c.fillRect (356, 300, 30, 60);
				}
				if (r8Statue4 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (629, 280, 20, 20);
				    c.fillRect (624, 300, 30, 60);
				}
				if (r8Statue5 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (763, 280, 20, 20);
				    c.fillRect (758, 300, 30, 60);
				}
				if (r8Statue6 == 0)
				{
				    c.setColor (Color.gray);
				    c.fillOval (897, 280, 20, 20);
				    c.fillRect (892, 300, 30, 60);
				}

				//Draws the message and order for the player.
				c.setColor (Color.black);
				c.drawString ("HMM..IT APPEARS YOU CAN SHOOT IN THIS ROOM.", 85, 250);
				c.drawString ("BREAK ALL", 415, 330);
				c.drawString ("STATUES.", 430, 390);

				//Tear(bullet) animation
				for (int j = 0 ; j <= 400 ; j++)
				{
				    c.setColor (tears);
				    c.fillOval (r8x, r8y + i, 20, 20);
				}
			    }
			}

			//Destroys the statues if the tears(bullets) hit them
			if (x == 68 && (r8y <= 340 || r8y >= 268))
			    r8Statue1 = 1;
			if (x == 202 && (r8y <= 340 || r8y >= 268))
			    r8Statue2 = 1;
			if (x == 336 && (r8y <= 340 || r8y >= 268))
			    r8Statue3 = 1;
			if (x == 604 && (r8y <= 340 || r8y >= 268))
			    r8Statue4 = 1;
			if (x == 738 && (r8y <= 340 || r8y >= 268))
			    r8Statue5 = 1;
			if (x == 872 && (r8y <= 340 || r8y >= 268))
			    r8Statue6 = 1;
		    }
		}

		if (room == 9)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244 && r14Lock == 1 && keyTotal >= 1)
		    {
			keyTotal -= 1;
			r14Lock = 0;
		    }
		    if (x == 1 && y == 244 && r14Lock == 0)
		    {
			room = 14;
			r14Patience += 1;
			x = 872;
		    }
		    if (y == -20 && x == 470)
		    {
			room = 5;
			y = 420;
		    }
		    if (y == 508 && x == 470)
		    {
			room = 13;
			y = 68;
		    }
		}

		if (room == 10)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 6;
			x = 68;
		    }
		    if (x == 1 && y == 244)
		    {
			room = 15;
			x = 872;
		    }
		}

		if (room == 11)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 16;
			x = 68;
			r16Entry = 1;
			//Assigns memory for room 16
			if (r16Num1 == r16N1 && r16Num2 == r16N2 && r16Num3 == r16N3 && r16Num4 == r16N4 && r16Num5 == r16N5)
			{
			    r16Memory = 1;
			}
			else
			{
			    r16Memory = 0;
			}
		    }

		    if (y == 508 && x == 470)
		    {
			room = 6;
			y = 68;
		    }

		    //Pipe interaction when entered, player is shot out of the pipe into death
		    if (y == -20 && x == 470)
		    {
			for (int i = 0 ; i < 650 ; i++)
			{
			    //The background
			    c.fillRect (0, 0, 1000, 10);
			    c.setColor (wall);
			    c.fillRect (10, 10, 990, 590);
			    c.setColor (ground);
			    c.fillRect (60, 60, 890, 490);

			    //Draws the doors
			    c.setColor (door);
			    c.fillRect (950, 244, 50, 120);
			    c.fillRect (470, 550, 70, 50);

			    //Draws the pipe
			    c.setColor (Color.green);
			    c.fillRect (470, 10, 70, 50);
			    c.setColor (leverGreen);
			    c.fillRect (440, 60, 130, 30);

			    for (int j = 0 ; j < 20 ; j++)
			    {
				//Draws pink guy
				//Draws the main or basic body
				c.setColor (pinkGuy);
				c.fillRoundRect (x, y + i, 70, 70, 25, 25);
				c.fillRect (x + 15, y + 70 + i, 40, 30);
				c.fillRoundRect (x + 15, y + 80 + i, 15, 40, 5, 10);
				c.fillRoundRect (x + 40, y + 80 + i, 15, 40, 5, 10);
				c.fillRoundRect (x, y + 75 + i, 15, 20, 5, 10);
				c.fillRoundRect (x + 55, y + 75 + i, 15, 20, 5, 10);

				//Draws the tears
				c.setColor (tears);
				c.fillRect (x + 10, y + 40 + i, 15, 27);
				c.fillRect (x + 45, y + 40 + i, 15, 27);

				//Draws the eyes
				c.setColor (Color.black);
				c.fillOval (x + 5, y + 25 + i, 25, 25);
				c.fillOval (x + 40, y + 25 + i, 25, 25);
				c.drawArc (x + 25, y + 55 + i, 20, 20, 10, 160);
				c.setColor (Color.white);
				c.fillOval (x + 12, y + 30 + i, 8, 8);
				c.fillOval (x + 47, y + 30 + i, 8, 8);
			    }
			}
			//Kills the player
			life = 0;
		    }

		    //Key interactions
		    if (movement == 'e' && x == 135 && y == 156 && r11Key == 1)
		    {
			r11Key = 0;
			keyTotal += 1;
		    }
		}

		if (room == 12)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244)
		    {
			room = 7;
			x = 872;
		    }
		    if (y == -20 && x == 470)
		    {
			room = 18;
			y = 420;
		    }
		    if (y == 508 && x == 470 && keySpecial == 1)
		    {
			room = 17;
			y = 68;
		    }

		    //Checks if room is still 12 before flipping
		    if (room == 12 && (movement == 'a' || movement == 's' || movement == 'w' || movement == 'd'))
		    {
			//Flipping interactions
			if (r12Flip % 2 != 0)
			{
			    r12xCount = (x - 68) / 67;
			    x = 872 - r12xCount * 67;
			    r12Flip += 1;
			}
			else
			{
			    r12yCount = (y - 68) / 88;
			    y = 420 - r12yCount * 88;
			    x += 67;
			    r12Flip += 1;
			}
		    }
		}

		if (room == 13)
		{
		    //Draws the walls of the background
		    c.setColor (wall);
		    c.fillRect (10, 10, 990, 590);

		    //Animation for falling into the abyss/hole
		    for (int i = 0 ; i < 200 ; i++)
		    {
			for (int j = 0 ; j < 40 ; j++)
			{
			    //Draws the abyss/hole
			    c.setColor (Color.black);
			    c.fillRect (60, 60, 890, 490);

			    //Draws pink guy
			    //Draws the main or basic body
			    c.setColor (pinkGuy);
			    c.fillRoundRect (x, y + i, 70, 70, 25, 25);
			    c.fillRect (x + 15, y + i + 70, 40, 30);
			    c.fillRoundRect (x + 15, y + 80 + i, 15, 40, 5, 10);
			    c.fillRoundRect (x + 40, y + 80 + i, 15, 40, 5, 10);
			    c.fillRoundRect (x, y + 75 + i, 15, 20, 5, 10);
			    c.fillRoundRect (x + 55, y + 75 + i, 15, 20, 5, 10);

			    //Draws the tears
			    c.setColor (tears);
			    c.fillRect (x + 10, y + 40 + i, 15, 27);
			    c.fillRect (x + 45, y + 40 + i, 15, 27);

			    //Draws the eyes
			    c.setColor (Color.black);
			    c.fillOval (x + 5, y + 25 + i, 25, 25);
			    c.fillOval (x + 40, y + 25 + i, 25, 25);
			    c.drawArc (x + 25, y + 55 + i, 20, 20, 10, 160);
			    c.setColor (Color.white);
			    c.fillOval (x + 12, y + 30 + i, 8, 8);
			    c.fillOval (x + 47, y + 30 + i, 8, 8);
			}
		    }

		    //Animation for the black covering
		    for (int k = 0 ; k < 401 ; k++)
		    {
			for (int j = 0 ; j < 2000000 ; j++)
			{
			    c.setColor (Color.black);
			    c.drawOval (400, 150, 400 - k, 400 - k);
			}

		    }
		    //Kills the player
		    life = 0;
		}

		if (room == 14)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 9;
			x = 68;
		    }
		}

		if (room == 15)
		{
		    //Checks if the switch is turned on.
		    //Door interactions, checks positioning then assigns room and new position
		    if (r15Switch == 1)
		    {
			if (x == 1 && y == 244)
			{
			    room = 19;
			    x = 872;
			}
			if (y == -20 && x == 470 && r20Lock == 1 && keyTotal >= 1)
			{
			    keyTotal -= 1;
			    r20Lock = 0;
			}
			if (y == -20 && x == 470 && r20Lock == 0)
			{
			    room = 20;
			    y = 420;
			}
			if (y == 508 && x == 470)
			{
			    room = 8;
			    y = 68;
			    r8Start = 1;
			}
			if (x == 939 && y == 244)
			{
			    room = 10;
			    x = 68;
			}
		    }

		    //Switch interaction
		    if (r15Hay1 == 1 && r15Switch == 0 && x == 68 && y == 68 && movement == 'e')
			r15Switch = 1;

		    //Hay interaction that would destroy it
		    if (r15Hay1 == 0 && x == 68 && y == 68 && movement == 'e')
			r15Hay1 = 1;
		    if (r15Hay2 == 0 && x == 872 && y == 68 && movement == 'e')
			r15Hay2 = 1;
		    if (r15Hay3 == 0 && x == 68 && y == 420 && movement == 'e')
			r15Hay3 = 1;
		    if (r15Hay4 == 0 && x == 872 && y == 420 && movement == 'e')
			r15Hay4 = 1;
		}

		if (room == 16)
		{
		    //Removes the numbers to be memorized after a movement
		    r16Memory += 1;

		    //Door interations that would allow the player to exit from the door they entered and refresh the values if needed.
		    if (r16Entry == 1)
		    {
			if (x == 1 && y == 244)
			{
			    room = 11;
			    x = 872;
			}
		    }

		    if (r16Entry == 2)
		    {
			if (x == 939 && y == 244)
			{
			    room = 22;
			    x = 68;
			}
		    }
		    //Checks if all values match.
		    //Door interactions, checks positioning then assigns room and new position
		    if (r16Num1 == r16N1 && r16Num2 == r16N2 && r16Num3 == r16N3 && r16Num4 == r16N4 && r16Num5 == r16N5)
		    {
			if (x == 939 && y == 244)
			{
			    room = 22;
			    x = 68;
			}
			if (x == 1 && y == 244)
			{
			    room = 11;
			    x = 872;
			}
			if (y == -20 && x == 470 && r21Lock == 1 && keyTotal >= 1)
			{
			    keyTotal -= 1;
			    r21Lock = 0;
			}
			if (y == -20 && x == 470 && r21Lock == 0)
			{
			    room = 21;
			    y = 420;
			}
		    }

		    //Button and number interaction that would increase the values
		    if (x == 336 && y == 332 && movement == 'e')
		    {
			r16N1 += 1;
		    }
		    if (x == 403 && y == 332 && movement == 'e')
		    {
			r16N2 += 1;
		    }
		    if (x == 470 && y == 332 && movement == 'e')
		    {
			r16N3 += 1;
		    }
		    if (x == 537 && y == 332 && movement == 'e')
		    {
			r16N4 += 1;
		    }
		    if (x == 604 && y == 332 && movement == 'e')
		    {
			r16N5 += 1;
		    }

		    //Resets values so that they range from 0 to 9.
		    if (r16N1 == 10)
			r16N1 = 0;
		    if (r16N2 == 10)
			r16N2 = 0;
		    if (r16N3 == 10)
			r16N3 = 0;
		    if (r16N4 == 10)
			r16N4 = 0;
		    if (r16N5 == 10)
			r16N5 = 0;
		}

		//Room 17 does not have any interactions

		if (room == 18)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (y == -20 && x == 470)
		    {
			room = 23;
			y = 420;
		    }
		    if (y == 508 && x == 470)
		    {
			room = 12;
			y = 68;
		    }

		    //Fake door interactions
		    if (x == 939 && y == 244)
		    {
			x = 68;
		    }
		    if (x == 1 && y == 244)
		    {
			x = 872;
		    }
		}

		if (room == 19)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 15;
			x = 68;
		    }

		    //Player is always in the middle
		    y = 244;

		    //Portal interactions
		    if (x == 135 && movement == 'e')
		    {
			r19From = 1;
			c.setColor (portal);
			for (int i = 0 ; i < 9001 ; i++)
			{
			    r1925Ani = (int) (Math.random () * 1001) + 1;
			    c.drawLine (r1925Ani, 600, r1925Ani, 0);
			    for (int j = 0 ; j < 500000 ; j++)
			    {
			    }
			}

			//Changes the room and provides information to the player
			room = 25;
			x = 269;
			c.fillRect (0, 0, 1000, 600);
			c.setColor (Color.white);
			if (r1925PFail == 1)
			{
			    c.drawString ("ERROR: PORTAL MALFUNCTION", 200, 110);
			    c.drawString ("CODE 14A3: UNCHARGED X", 200, 185);
			    c.drawString ("YOU MUST BAIT THE GUARDIAN X", 200, 260);
			    c.drawString ("TOWARDS THE GRAY X'S TO CHARGE THEM", 200, 335);
			    c.drawString ("BEWARE NOT TO TOUCH ANY CHARGED X'S", 200, 410);
			    c.drawString ("OR YOU WILL BE SENT BACK TO THE PORTAL", 200, 485);
			    room = 0;
			}
			c.drawString ("PRESS ANY KEY TO CONTINUE", 200, 560);
			c.getChar ();
		    }
		}

		if (room == 20)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (y == 508 && x == 470)
		    {
			room = 15;
			y = 68;
		    }

		    //Always centered
		    x = 470;

		    //Key interaction
		    if (movement == 'e' && x == 470 && y == 68 && keySpecial == 0)
			keySpecial = 1;

		    //Red walls
		    if (r20Crusherx == 500 && room == 20)
		    {
			//Kills the player
			life = 0;
			c.setColor (Color.red);
			c.fillRect (450, 0, 110, 550);
		    }
		}

		if (room == 21)
		{
		    //Draws the background
		    c.setColor (wall);
		    c.fillRect (10, 10, 990, 590);

		    //Animation for falling into the abyss/hole
		    for (int i = 0 ; i < 200 ; i++)
		    {
			for (int j = 0 ; j < 40 ; j++)
			{
			    //Draws the abyss/hole
			    c.setColor (Color.black);
			    c.fillRect (60, 60, 890, 490);

			    //Draws pink guy
			    //Draws the main or basic body
			    c.setColor (pinkGuy);
			    c.fillRoundRect (x, y - i, 70, 70, 25, 25);
			    c.fillRect (x + 15, y - i + 70, 40, 30);
			    c.fillRoundRect (x + 15, y + 80 - i, 15, 40, 5, 10);
			    c.fillRoundRect (x + 40, y + 80 - i, 15, 40, 5, 10);
			    c.fillRoundRect (x, y + 75 - i, 15, 20, 5, 10);
			    c.fillRoundRect (x + 55, y + 75 - i, 15, 20, 5, 10);

			    //Draws the tears
			    c.setColor (tears);
			    c.fillRect (x + 10, y + 40 - i, 15, 27);
			    c.fillRect (x + 45, y + 40 - i, 15, 27);

			    //Draws the eyes
			    c.setColor (Color.black);
			    c.fillOval (x + 5, y + 25 - i, 25, 25);
			    c.fillOval (x + 40, y + 25 - i, 25, 25);
			    c.drawArc (x + 25, y + 55 - i, 20, 20, 10, 160);
			    c.setColor (Color.white);
			    c.fillOval (x + 12, y + 30 - i, 8, 8);
			    c.fillOval (x + 47, y + 30 - i, 8, 8);
			}
		    }

		    //Animation for the black covering
		    for (int k = 0 ; k < 401 ; k++)
		    {
			for (int j = 0 ; j < 2000000 ; j++)
			{
			    c.setColor (Color.black);
			    c.drawOval (400, 80, 400 - k, 400 - k);
			}

		    }
		    //Kills the player
		    life = 0;
		}

		if (room == 22)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (y == 508 && x == 470)
		    {
			room = 24;
			y = 68;
		    }
		    if (x == 1 && y == 244)
		    {
			room = 16;
			x = 872;
			r16Entry = 2;

			//Assigns memory for room 16
			if (r16Num1 == r16N1 && r16Num2 == r16N2 && r16Num3 == r16N3 && r16Num4 == r16N4 && r16Num5 == r16N5)
			{
			    r16Memory = 2;
			}
			else
			{
			    r16Memory = 1;
			}
		    }
		}

		if (room == 23)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 26;
			x = 68;
		    }
		    if (y == -20 && x == 470)
		    {
			room = 24;
			y = 420;
		    }
		    if (y == 508 && x == 470)
		    {
			room = 18;
			y = 68;
		    }

		    //Pitfall
		    if ((y == 332 && x != 68) || (y == 156 && x != 872) || (x < 470 && y == 68) || (x > 470 && y == 420))
		    {
			//The background
			c.setColor (wall);
			c.fillRect (10, 10, 990, 590);
			c.setColor (ground);
			c.fillRect (60, 60, 890, 490);
			//Status bar for key count and respawns
			c.drawString ("KEYS: " + keyTotal, 140, 53);
			c.drawString ("DEATHS: " + deathTotal, 700, 53);
			//Draws the pitfall
			c.setColor (Color.red);
			c.fillRect (60, 60, 410, 184);
			c.fillRect (470, 188, 402, 56);
			c.fillRect (540, 364, 410, 186);
			c.fillRect (138, 364, 402, 56);
			//Kills the player
			life = 0;

			//Draws pink guy
			//Draws the main or basic body
			c.setColor (pinkGuy);
			c.fillRoundRect (x, y, 70, 70, 25, 25);
			c.fillRect (x + 15, y + 70, 40, 30);
			c.fillRoundRect (x + 15, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x + 40, y + 80, 15, 40, 5, 10);
			c.fillRoundRect (x, y + 75, 15, 20, 5, 10);
			c.fillRoundRect (x + 55, y + 75, 15, 20, 5, 10);

			//Draws the tears
			c.setColor (tears);
			c.fillRect (x + 10, y + 40, 15, 27);
			c.fillRect (x + 45, y + 40, 15, 27);

			//Draws the eyes
			c.setColor (Color.black);
			c.fillOval (x + 5, y + 25, 25, 25);
			c.fillOval (x + 40, y + 25, 25, 25);
			c.drawArc (x + 25, y + 55, 20, 20, 10, 160);
			c.setColor (Color.white);
			c.fillOval (x + 12, y + 30, 8, 8);
			c.fillOval (x + 47, y + 30, 8, 8);
			c.setColor (Color.red);

			//For loop for death animation
			for (int i = 0 ; i < 61 ; i++)
			{
			    c.drawRect (x, y, 70, i);
			    c.drawRect (x, y + 120 - i, 70, i);
			    for (int j = 0 ; j < 30000000 ; j++)
			    {
			    }
			}
		    }
		}

		if (room == 24)
		{
		    //Checks if the battery is turned on
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244 && r24Battery == 1)
		    {
			room = 25;
			x = 872;
		    }
		    if (x == 939 && y == 244)
		    {
			room = 28;
			x = 68;
		    }
		    if (y == -20 && x == 470 && r24Battery == 1)
		    {
			room = 22;
			y = 420;
		    }
		    if (y == 508 && x == 470 && r24Battery == 1)
		    {
			room = 23;
			y = 68;
		    }

		    //Switch interactions
		    if (r24Battery == 0)
		    {
			//Activates battery on condition
			if (r24Charge1 == 8 && r24Charge2 == 4 && r24Charge3 == 7 && r24Charge4 == 2 && x == 537 && y == 420 && movement == 'e')
			    r24Battery = 1;
			//Changes charges
			if (x == 269 && y == 420 && movement == 'e')
			    r24Charge1 += 1;
			if (x == 403 && y == 420 && movement == 'e')
			    r24Charge2 += 1;
			if (x == 671 && y == 420 && movement == 'e')
			    r24Charge3 += 1;
			if (x == 805 && y == 420 && movement == 'e')
			    r24Charge4 += 1;
			if (x == 537 && y == 420 && movement == 'e' && r24Battery == 0)
			{
			    r24Charge1 = 0;
			    r24Charge2 = 0;
			    r24Charge3 = 0;
			    r24Charge4 = 0;
			}

			//Resets charges so that the range is from 0 to 9
			if (r24Charge1 == 10)
			    r24Charge1 = 0;
			if (r24Charge2 == 10)
			    r24Charge2 = 0;
			if (r24Charge3 == 10)
			    r24Charge3 = 0;
			if (r24Charge4 == 10)
			    r24Charge4 = 0;
		    }
		}
		
		if (room == 25)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 939 && y == 244)
		    {
			room = 24;
			x = 68;
		    }
		    //Player is always in the middle
		    y = 244;

		    //Portal interactions
		    if (x == 135 && movement == 'e')
		    {
			r25From = 1;
			c.setColor (portal);
			for (int i = 0 ; i < 9001 ; i++)
			{
			    r1925Ani = (int) (Math.random () * 1001) + 1;
			    c.drawLine (r1925Ani, 600, r1925Ani, 0);
			    for (int j = 0 ; j < 500000 ; j++)
			    {
			    }
			}

			//Changes the room and provides information to the player
			room = 19;
			x = 269;
			c.fillRect (0, 0, 1000, 600);
			c.setColor (Color.white);
			if (r1925PFail == 1)
			{
			    c.drawString ("ERROR: PORTAL MALFUNCTION", 200, 110);
			    c.drawString ("CODE 14A3: UNCHARGED X", 200, 185);
			    c.drawString ("YOU MUST BAIT THE GUARDIAN X", 200, 260);
			    c.drawString ("TOWARDS THE GRAY X'S TO CHARGE THEM", 200, 335);
			    c.drawString ("BEWARE NOT TO TOUCH ANY CHARGED X'S", 200, 410);
			    c.drawString ("OR YOU WILL BE SENT BACK TO THE PORTAL", 200, 485);
			    room = 0;
			}
			c.drawString ("PRESS ANY KEY TO CONTINUE", 200, 560);
			c.getChar ();
		    }
		}
		
		if (room == 26)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244)
		    {
			room = 23;
			x = 872;
		    }
		}
		
		//Room 27 does not have any interactions
		
		if (room == 28)
		{
		    //Door interactions, checks positioning then assigns room and new position
		    if (x == 1 && y == 244)
		    {
			room = 24;
			x = 872;
		    }
		}

		//Prevents player from going off-screen(boundaries)
		if (x < 68)
		    x = 68;
		if (x > 872)
		    x = 872;
		if (y < 68)
		    y = 68;
		if (y > 420)
		    y = 420;

		//Creates a delay
		for (int i = 0 ; i < 200000 ; i++)
		{
		}
	    }

	    //Game over/retry screen
	    c.setColor (Color.black);
	    c.fillRect (10, 0, 1000, 1000);

	    //Draws Pink Guy
	    //Draws the main or basic body
	    c.setColor (pinkGuy);
	    c.fillOval (270, 290, 200, 200); //Head
	    c.fillRect (445, 225, 100, 80); //Body
	    c.fillRoundRect (416, 233, 30, 50, 5, 10); //Left hand
	    c.fillRoundRect (544, 233, 30, 50, 5, 10); //Right Hand
	    c.fillRoundRect (446, 290, 40, 50, 5, 10); //Left Leg
	    c.fillRoundRect (504, 290, 40, 50, 5, 10); //Right Leg
	    
	    //Draws the tears
	    c.setColor (tears);
	    c.fillRect (292, 390, 40, 62); //Left
	    c.fillRect (408, 390, 40, 62); //Right
	    
	    //Draws the eyes
	    c.setColor (Color.black);
	    c.fillOval (282, 365, 60, 60); //Left Eye
	    c.fillOval (398, 365, 60, 60); //Right Eye
	    c.drawArc (355, 415, 30, 30, 10, 160); //Mouth
	    c.setColor (Color.white);
	    c.fillOval (288, 372, 30, 30); //Big White Left
	    c.fillOval (404, 372, 30, 30); //Big White Right
	    c.fillOval (325, 408, 10, 10); //Small White Left
	    c.fillOval (440, 408, 10, 10); //Small White Right

	    //GAME OVER!
	    c.setColor (endScreen1);
	    c.setFont (endB);
	    c.drawString ("GAME OVER!", 210, 150);
	    c.setFont (endI);
	    c.drawString ("PRESS ANY KEY TO RETRY", 475, 580);

	    //Draws Satanic Star Left
	    c.setColor (endScreen1);
	    c.drawLine (60, 150, 100, 30); //Line 1
	    c.drawLine (100, 30, 150, 150); //Line 2
	    c.drawLine (150, 150, 40, 80); //Line 3
	    c.drawLine (40, 80, 165, 80); //Line 4
	    c.drawLine (165, 80, 60, 150); //Line 5
	    c.drawOval (35, 31, 135, 137); //Circle

	    //Draws Satanic Star Right
	    c.drawLine (860, 150, 900, 30); //Line 1
	    c.drawLine (900, 30, 950, 150); //Line 2
	    c.drawLine (950, 150, 840, 80); //Line 3
	    c.drawLine (840, 80, 965, 80); //Line 4
	    c.drawLine (965, 80, 860, 150); //Line 5
	    c.drawOval (835, 31, 135, 137); //Circle

	    //Creates a delay to see the endscreen
	    for (int i = 0 ; i < 1200000000 ; i++)
	    {
	    }
	    //Press any key to retry, adds to your deaths
	    c.getChar ();
	    deathTotal += 1;
	}
    } // main method
} // EdwardWayneAndrewGame class
