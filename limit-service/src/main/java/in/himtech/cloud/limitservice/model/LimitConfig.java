package in.himtech.cloud.limitservice.model;

public class LimitConfig {

	private int maximum;
	
	private int minimum;
	
	public LimitConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LimitConfig(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "LimitConfig [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
}
