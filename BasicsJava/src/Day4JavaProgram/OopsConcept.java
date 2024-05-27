package Day4JavaProgram;

public class OopsConcept 
{
		private int serialNum;
		private String Name;
		private int age;
		
		public int getSerialNum()
		{
			return serialNum;
		}
		public void setSerialNum (int serialNum)
		{
			this.serialNum= serialNum;
		}
		public String getName()
		{
			return Name;
		}
		public void setName (String name)
		{
			this.Name = name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge (int age)
		{
			this.age= age;
		}
		@Override
		public String toString() {
			return "OopsConcept [serialNumber="  + serialNum + ", name=" + Name + ", age=" + age + "]";
		}
}
