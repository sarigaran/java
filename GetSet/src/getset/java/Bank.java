package getset.java;

public class Bank {
	private int minimumbalance=2500;
	
public int getMinimumbalance() {
		return minimumbalance;
	}

	public void setMinimumbalance(int values) {
		if(values>2000)
		this.minimumbalance =values ;
	}

	
}
