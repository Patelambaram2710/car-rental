import java.util.*;
class carrenting1
{
	int date,month,year;
	int date1,month1,year1;
    int days;
	int dt,mt,yr;
	String Ph,Adh;
	static String name;
	String name1,city;
    double DailyFee,Total;
    double deposite=35000;
	double deposit;
    double rent3;
    Scanner sc = new Scanner(System.in);
	
	void cust1()
	{
	System.out.println("Enter Your Name,Phone Number & city");
	System.out.print("Name :");
	name=sc.nextLine();
	do{
		System.out.print("Mobile_No :");
		Ph=sc.nextLine();
		if(Ph.length()==10)
	{
		break;
	}
	else{
		System.out.println("Invalid Input");
	}
	  }while(Ph.length()!=10);
	System.out.print("City :");
	city=sc.nextLine();
	do{
	System.out.print("Aadhar Number :");
	Adh=sc.nextLine();
	if(Adh.length()==12)
	{
		break;
	}
	else{
		System.out.println("Invalid Input");
	}
	} while(Adh.length()!=12);
    }

	void custb()
	{
		System.out.println(" ");
		System.out.println("Enter details of other Member To Contact");
		System.out.println("Enter Name,Phone Number & city");
		System.out.print("Name :");
		name1=sc.nextLine();
		do{
		System.out.print("Mobile_No :");
		Ph=sc.nextLine();
		if(Ph.length()==10)
		{
		break;
		}
		else{
		System.out.println("Invalid Input");
		}
		}while(Ph.length()!=10);
		System.out.print("City :");
		city=sc.nextLine();
		do{
		System.out.print("Aadhar Number :");
		Adh=sc.nextLine();
		if(Adh.length()==12)
		{
		break;
		}
		else{
		System.out.println("Invalid Input");
		}
		} while(Adh.length()!=12);
	}

	void Hatch()
	{
	    System.out.print("Please enter the number of days you want to rent a car : ");
        days = sc.nextInt();
      	System.out.println("---ENTER THE DATE,MONTH & YEAR YOU NEED THE CAR---");
		System.out.print("DATE : ");
		int date=sc.nextInt();
		System.out.print("MONTH : ");
		int month=sc.nextInt();
		System.out.print("YEAR : ");
		int year=sc.nextInt();
		/*System.out.println("---ENTER THE DATE,MONTH & YEAR YOU RETURN THE CAR---");
		System.out.print("DATE : ");
		int date1=sc.nextInt();
		System.out.print("MONTH : ");
		int month1=sc.nextInt();
		System.out.print("YEAR : ");
		int year1=sc.nextInt();*/
		System.out.println();
		System.out.println(" FROM : "+date+"-"+month+"-"+year);
		dt=date;
		mt=month;
		yr=year;
		date+=days;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
		if(date>31)
		{
			month+=1;
			if(month>12)
			{
				month-=12;
				year+=1;
			}
			date-=31;
		}
		}
		else if(month==4||month==6||month==9||month==11)
		{
		if(date>30)
		{
			month+=1;
			date-=30;
		}
		}
		else if(month==2)
		{
			if(date>28)
			{
				month+=1;
				date-=28;
			}
		}
		System.out.println(" TO   "+(date)+"-"+month+"-"+year+"\n");
		System.out.println("Press 1 for AC");
		System.out.println("Press 2 for Non-AC");
		int b=sc.nextInt();
		int rent1=1300*days;
		int rent2=1000*days;

		if(b==1)
		{
			System.out.println("The Rent For "+days+ " days for economy car with AC is "+rent1);
			System.out.println();
            System.out.println("***** Deposit To Pay = $"+(rent1*3)/10+" *****");
			deposit=(rent1*3)/10;
            rent3=(rent1*7)/10;
		}
		else if(b==2)
		{
			System.out.println("The Rent For "+days+ " days for economy car with Non-AC is "+rent2);
			System.out.println();
            System.out.println("/n***** Deposit To Pay = $"+(rent2*3)/10+" *****");
            deposit=(rent2*3)/10;
			rent3=(rent2*7)/10;
		}
	}

	void sedan()
	{
	    System.out.print("Please enter the number of days you want to rent a car : ");
        days = sc.nextInt();
		System.out.println("---ENTER THE DATE,MONTH & YEAR YOU NEED THE CAR---");
		System.out.print("DATE : ");
		int date=sc.nextInt();
		System.out.print("MONTH : ");
		int month=sc.nextInt();
		System.out.print("YEAR : ");
		int year=sc.nextInt();
		System.out.println();
		System.out.println(" FROM "+date+"-"+month+"-"+year);
		
		dt=date;
		mt=month;
		yr=year;
		date+=days;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
		if(date>31)
		{
			month+=1;
			if(month>12)
			{
				month-=12;
				year+=1;
			}
			date-=31;
		}
		}
		else if(month==4||month==6||month==9||month==11)
		{
		if(date>30)
		{
			month+=1;
			date-=30;
		}
		}
		else if(month==2)
		{
			if(date>28)
			{
				month+=1;
				date-=28;
			}
		}
		System.out.println(" TO   "+(date)+"-"+month+"-"+year+"\n");
		System.out.println("Press 1 for AC");
		System.out.println("Press 2 for Non-AC");
		int b=sc.nextInt();
		int rent1=1850*days;
		int rent2=1500*days;
               
		if(b==1)
		{
			System.out.println("The Rent For "+days+ " days for sedan with AC is "+rent1);
			System.out.println();
            System.out.println("***** Deposit To Pay = $"+(rent1*3)/10+" *****");
			deposit=(rent1*3)/10;
            rent3=(rent1*7)/10;
		}
		else if(b==2)
		{
			System.out.println("The Rent For "+days+ " days for sedan with Non-AC is "+rent2); 
			System.out.println();
            System.out.println("***** Deposit To Pay = $"+(rent2*3)/10+" *****");
			deposit=(rent2*3)/10;
            rent3=(rent2*7)/10;
		}
	}

	void suv()
	{
		System.out.print("Please enter the number of days you want to rent a car : ");
		days = sc.nextInt();
		System.out.println("---ENTER THE DATE,MONTH & YEAR YOU NEED THE CAR---");
		System.out.print("DATE : ");
		int date=sc.nextInt();
		System.out.print("MONTH : ");
		int month=sc.nextInt();
		System.out.print("YEAR : ");
		int year=sc.nextInt();
		System.out.println();
		System.out.println(" FROM "+date+"-"+month+"-"+year);
		dt=date;
		mt=month;
		yr=year;
		date1=date;
		month1=month;
		year1=year;
		date+=days;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
		if(date>31)
		{
			month+=1;
			if(month>12)
			{
				month-=12;
				year+=1;
			}
			date-=31;
		}
		}
		else if(month==4||month==6||month==9||month==11)
		{
		if(date>30)
		{
			month+=1;
			date-=30;
		}
		}
		else if(month==2)
		{
			if(date>28)
			{
				month+=1;
				date-=28;
			}
		}
		System.out.println(" TO   "+(date)+"-"+month+"-"+year+"\n");
		System.out.println("Press 1 for AC");
		System.out.println("Press 2 for Non-AC");
		int b=sc.nextInt();	
		int rent1=2500*days;
		int rent2=2000*days;
		
		if(b==1)
		{
			System.out.println("The Rent For "+days+ " days for SUV with AC is "+rent1);
			System.out.println();
			System.out.println("***** Deposit To Pay = $"+(rent1*3)/10+" *****");
			deposit=(rent1*3)/10;
			rent3=(rent1*7)/10;
		}
		else if(b==2)
		{
			System.out.println("The Rent For "+days+ " days for SUV with Non-AC is "+rent2);
			System.out.println();
			System.out.println("***** Deposit To Pay = $"+(rent2*3)/10+" *****");
			deposit=(rent2*3)/10;
			rent3=(rent2*7)/10;
		}
	}
	void receipt(String s)
		{
			System.out.println();
			System.out.println();
			int receiptno=001;
			System.out.println("-------------RECEIPT-------------");
			System.out.println(" Receipt No="+receiptno);
			System.out.println(" Customer Name : "+name+"\n Car Model : "+s+"\n FROM : "+dt+"-"+mt+"-"+yr+"\n Car NumberPlate : GJ01 RC 9955"+" \n Deposited Money : "+deposit+"\n Amount Due : "+rent3);
			System.out.println();
			System.out.println();
		}
	void cancel()
		{
			System.out.println("-------------Enter 1 for Another Booking-------------");
			System.out.println("-------------Enter 2 TO Exit-------------");
			int q=sc.nextInt();
			if(q==1)
			{
				Trip t = new Trip();
				t.trip();
			}
			if(q==2)
				{
					System.out.println("We Wish you a Happy Journey");
				}	
		}

}

class Trip extends carrenting1
{
void trip()
{
	Scanner sc = new Scanner(System.in);
	carrenting1 c=new carrenting1();
	carrenting1 c1=new carrenting1();
	System.out.println("Enter 1 for an Hatchback car");
    System.out.println("Enter 2 for a Sedan car");
    System.out.println("Enter 3 for an SUV");
	
    String m1[]={("Alto"),("Wagonar"),("Swift"),("i10")};
	String m2[]={("Amaze"),("Ciaz"),("Verna"),("Honda City")};
	String m3[]={("Innova"),("XUV700"),("Fortuner"),("Scorpio")};
     
	System.out.println("Which type of vehical would you like to Rent?");
	int CarType=sc.nextInt();
			switch(CarType)
			{
				case 1:
				System.out.println("YOU HAVE SELECTED Hatchback");
				c.Hatch();
				System.out.println("------------AVAILABLE CARS------------");
                System.out.println(" Enter 0:Alto \n Enter 1: Wagonar \n Enter 2:Swift\n Enter 3:i10 ");
                int x=sc.nextInt();
                for(int i=0;i<4;i++)
                { 
                    if(x==i)
                    { 
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{				
                    System.out.println("you select "+m1[i]+" for rent");
                    c.receipt(m1[i]);
					c.cancel();
                    }
					else if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
					}
                }
				break;
				
				case 2:
				System.out.println("YOU HAVE SELECTED SEDAN");
				c.sedan();
				System.out.println("------------AVAILABLE CARS------------");
				System.out.println(" Enter 0:Amaze \n Enter 1: Ciaz \n Enter 2:Verna \n Enter 3:Honda City");
				int y=sc.nextInt();
				for(int i=0;i<4;i++)
				{ 
				if(y==i)
				{  
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{
					System.out.println("YOU HAVE SELECTED "+m2[i]+" for rent");
					c.receipt(m2[i]);
					c.cancel();
					}
					else if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
				}
				}
				break;
				
				case 3:
				System.out.println("YOU HAVE SELECTED SUV"); 
				c.suv();
				System.out.println("------------AVAILABLE CARS------------");
                System.out.println(" Enter 0:Innova \n Enter 1: Xuv700 \n Enter 2:Fortuner \n Enter 3:Scorpio");
                int z=sc.nextInt();
                for(int i=0;i<4;i++)
                { 
				    if(z==i)
					{  
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{
                    System.out.println("you select "+m3[i]+" for rent");
                    c.receipt(m3[i]);
					c.cancel();
					}
					if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
					}
                }
				break;
			}
}
}

class ca2
{

    public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	carrenting1 c=new carrenting1();
	carrenting1 c1=new carrenting1();
	System.out.println("---------------WELCOME TO CAR RENTING PLAZA---------------");
	c1.cust1();
	c1.custb();
			
	System.out.println("Enter 1 for an Hatchback car");
    System.out.println("Enter 2 for a Sedan car");
    System.out.println("Enter 3 for an SUV");
	
    String m1[]={("Alto"),("Wagonar"),("Swift"),("i10")};
	String m2[]={("Amaze"),("Ciaz"),("Verna"),("Honda City")};
	String m3[]={("Innova"),("XUV700"),("Fortuner"),("Scorpio")};
     
	System.out.println("Which type of vehical would you like to Rent?");
	int CarType=sc.nextInt();
			switch(CarType)
			{
				case 1:
				System.out.println("YOU HAVE SELECTED Hatchback");
				c.Hatch();
				System.out.println("------------AVAILABLE CARS------------");
                System.out.println(" Enter 0:Alto \n Enter 1: Wagonar \n Enter 2:Swift\n Enter 3:i10 ");
                int x=sc.nextInt();
                for(int i=0;i<4;i++)
                { 
                    if(x==i)
                    { 
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{				
                    System.out.println("you select "+m1[i]+" for rent");
                    c.receipt(m1[i]);
					c.cancel();
                    }
					else if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
					}
                }
				break;
				
				case 2:
				System.out.println("YOU HAVE SELECTED SEDAN");
				c.sedan();
				System.out.println("------------AVAILABLE CARS------------");
				System.out.println(" Enter 0:Amaze \n Enter 1: Ciaz \n Enter 2:Verna \n Enter 3:Honda City");
				int y=sc.nextInt();
				for(int i=0;i<4;i++)
				{ 
				if(y==i)
				{  
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{
					System.out.println("YOU HAVE SELECTED "+m2[i]+" for rent");
					c.receipt(m2[i]);
					c.cancel();
					}
					else if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
				}
				}
				break;
				
				case 3:
				System.out.println("YOU HAVE SELECTED SUV"); 
				c.suv();
				System.out.println("------------AVAILABLE CARS------------");
                System.out.println(" Enter 0:Innova \n Enter 1: Xuv700 \n Enter 2:Fortuner \n Enter 3:Scorpio");
                int z=sc.nextInt();
                for(int i=0;i<4;i++)
                { 
				    if(z==i)
					{  
					System.out.println("-------------Enter 1 To Confirm Your Trip-------------");
					System.out.println("-------------Enter 2 To Cancel Your Booking-------------");
					int q=sc.nextInt();
					if(q==1)
					{
                    System.out.println("you select "+m3[i]+" for rent");
                    c.receipt(m3[i]);
					c.cancel();
					}
					if(q==2)
					{
						System.out.println("Thank You and Visit Again");
					}
					}
                }
				break;
			}               
	}
}