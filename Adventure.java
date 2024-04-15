package inheritance;

public class Adventure extends Book {
	private String series;
	
	public Adventure(String title, String author, int issueNumber, int month, int day, int year, String series) {
		super(title, author, issueNumber, month, day, year);
		this.series = series;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
}
