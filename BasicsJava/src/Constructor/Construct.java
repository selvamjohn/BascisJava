package Constructor;

public class Construct 
	{
		private String name;
		private int id;
		private int roll;
		
		public Construct()
		{
			super( );
			//System.out.println("Default Constructor");
			//name = "Nova";
			//id = 24319;
			//roll = 22;
		}
			public Construct (String name, int id)
			{
				super( );
			System.out.println("Parameterized Constructor with 2 arguments : ");
			this.name = name;
			this.id = id;
			}
		    public Construct (String name, int id, int roll)
		    {
			System.out.println("Parameterized Constructor with 3 arguments :  ");
			this.name = name;
			this.id = id;
			this.roll = roll;
		    }
			public String getName( )
			{
				return name;
			}
			public void SetName (String name)
			{
				this.name = name;
			}
			public int getId( )
			{
				return id;
			}
			public void setId (int id)
			{
				this.id = id;
			}
			public int getroll( )
			{
				return roll;
			}
			public void setroll (int roll)
			{
				this.roll = roll;
			}
			@Override
			public String toString( ) 
			{
				return "Construct [name=" + name + ", id=" + id + ", roll=" + roll + "]";
			}
	}