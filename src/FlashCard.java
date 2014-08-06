public class FlashCard {

	private String side1;
	private String side2;
	private String title;
	private long cardIDNumber;
	private int subjectID;

	public String getSide1() {
		return side1;
	}

	public void setSide1(String side1) {
		this.side1 = side1;
	}

	public String getSide2() {
		return side2;
	}

	public void setSide2(String side2) {
		this.side2 = side2;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getCardIDNumber() {
		return cardIDNumber;
	}

	public void setCardIDNumber(long cardIDNumber) {
		this.cardIDNumber = cardIDNumber;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	// constructors
	public FlashCard() {
		// TODO Auto-generated constructor stub
	}

	FlashCard(String Title, String Side1, String Side2, long ID, int Subject) {
		title = Title;
		side1 = Side1;
		side2 = Side2;
		cardIDNumber = ID;
		subjectID = Subject;
	
	}
}
