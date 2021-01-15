public class Strawhat implements Comparable<Strawhat> {
	private int bounty;
	private double height;
	private String devilFruit;

	public Strawhat(int bounty, double height, String devilFruit) {
		if (bounty < 0 || bounty > Integer.MAX_VALUE) {
			this.bounty = 0;
		}

		if (height < 50.0 || height > 18000.0) {
			this.height = 170.0;
		}

		if (devilFruit.equals("")) {
			this.devilFruit = "No devil fruit";
		}

		this.bounty = bounty;
		this.height = height;
		this.devilFruit = devilFruit;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getDevilFruit() {
		return devilFruit;
	}

	public void setDevilFruit(String devilFruit) {
		this.devilFruit = devilFruit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bounty;
		result = prime * result + ((devilFruit == null) ? 0 : devilFruit.hashCode());
		long temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Strawhat other = (Strawhat) obj;
		if (bounty != other.bounty)
			return false;
		if (devilFruit == null) {
			if (other.devilFruit != null)
				return false;
		} else if (!devilFruit.equals(other.devilFruit))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Strawhat [bounty = " + getBounty() + ", height = " + getHeight() + ", devilFruit = " + getDevilFruit()
				+ "]";
	}

	@Override
	public int compareTo(Strawhat o) {
		return 0;
	}

}
