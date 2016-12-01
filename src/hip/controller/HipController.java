package hip.controller;

import hip.model.Hipster;
import hip.view.HipsterFrame;

public class HipController 
{
	
	private String [] words = {"this","is","the","next","level","of","hipster","the","initalization","sequence"};
	private Hipster [] hipsters;
	private int [] numbers;
	
	public HipController()
	{
		hipsters =  new Hipster [5];
		showHipsterLevelThree();
	}
	public void hipStart()
	{
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + (index+1));
		}
		for(Hipster currentHipster : hipsters){
			System.out.println(currentHipster);
		}
		for(String currentString : words)
		{
			System.out.println(currentString);
		}
		for(int number : numbers)
		{
			System.out.println(number);
		}
		new  HipsterFrame(this);
	}
	private void showHipsterLevelThree()
	{
		numbers = new int[]{1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	public String[] getWords()
	{
		return words;
	}
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	public int[] getNumbers()
	{
		return numbers;
	}

}
