import java.util.Scanner;
public class quiz
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.println("How many questions?");
				int num = userInput.nextInt();
				int score = 0;
				for (int i = 0; i < num; i++)
					{
						boolean right = quiz();
						if (right)
							{
								score++;
							}
					}
				System.out.println("The score is "+score);
			}
		public static boolean quiz()
		{
			int first = (int)(Math.random()*20)+1;
			int second = (int)(Math.random()*first)-3;
			second = Math.max(second, 1);
			int mod = (first % second);
			System.out.println("What is "+ first + " mod "+ second+ "?");
			int answer = userInput.nextInt();
			boolean right = answer==mod;
			return right;
		}
	}
