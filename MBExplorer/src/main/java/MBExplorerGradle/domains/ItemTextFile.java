package MBExplorerGradle.domains;

public class ItemTextFile extends Item{
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ItemTextFile(String title, String text) {
		super(title);
		setType(Type.TEXTFILE);
		this.text = text;
	}
	String text;


}
