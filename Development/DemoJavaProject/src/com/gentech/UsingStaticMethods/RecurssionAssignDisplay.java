package com.gentech.UsingStaticMethods;
class OddNum
{
	//Display odd numbers between 20 to 40
		static int x=20;
		static void shownumbers()
		{
			if(x<=40)
			{
				if(x%2==1)
				{
					System.out.println(x);
				}
				x++;
				shownumbers();
			}
		}

		//Display Even number between 20 to 1

		static int a=20;
		static void shownumber()
		{
			if(a>=1)
			{
				if(a%2==0)
				{
					System.out.println(a);
				}
				a--;
				shownumber();
			}
		}

		//Display number divisible by 8
		static int z=1;
		static void shownumberdivisibleby8()
		{
			if(z<=100)
			{
				if(z%8==0)
				{
					System.out.println(z);
				}
				z++;
				shownumberdivisibleby8();
			}
		}
		
		// Display Tenth Table
		static int i=1;
		static void showtentable()
		{
			if(i<=10)
			{
				System.out.println("10*"+i+"="+i*10);

				i++;
				showtentable();
			}
		}
		//Display fiveTable in reverse
		static int p=10;
		static void showfivetable()
		{
			if(p>=1)
			{
				System.out.println("5*"+p+"="+p*5);
				p--;
				showfivetable();

			}
		}

//display count of prime numbers
	
static int count=1;
static int sum=0;
static void display()
{
	if(count<=10)
	{
		sum=sum+count;
		count+=1;
		display();
	}
}
	static void showcount()
	{
		System.out.println(sum);
	}
}
public class RecurssionAssignDisplay {

		public static void main(String[] args) {
			OddNum.shownumbers();
			System.out.println("*******************");
			OddNum.shownumber();
			System.out.println("************");
			OddNum.shownumberdivisibleby8();
			System.out.println("*********************");
			
			OddNum.showtentable();
			System.out.println("*************");
			OddNum.showfivetable();
			System.out.println("***********");
			OddNum.display();
			OddNum.showcount();
		}
		}





