
public enum FemaleStrawhats {
	NAMI, ROBIN, CARROT;

	public static void main(String[] args) {
		FemaleStrawhats fs = FemaleStrawhats.NAMI;
		System.out.println(fs.ordinal() + " " + fs.name());
		System.out.println();
	    for (FemaleStrawhats output : FemaleStrawhats.values())	
		System.out.println(output);
	}

}
