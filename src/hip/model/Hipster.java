package hip.model;

public class Hipster 
{
	
	private String name;
	public Hipster(String name)
	{
		this.name = name;
	}
	public String toString(){
		String description = "This hipster's name is " + name;
		
		return description;
	}
	public void setName(String name){
		this.name = name;
	}

}
