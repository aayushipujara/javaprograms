//Write a java program to demonstrate encapsulation.
public class U2_P10{
	private String name;
	public String getName()
	{
	  return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args){
		U2_P10 emp = new U2_P10();
		emp.setName("Diya");
		System.out.println("Employee Name :" + emp.getName());
	}
		
}