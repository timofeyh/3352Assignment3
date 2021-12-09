package Model;

public class EmbededContent {
	private String embededURL;
	private String EmbededFile;
	public String getEmbededURL() {// gets the link in he page
		return embededURL;
	}
	public void setEmbededURL(String embededURL) {// get the link that was added 
		this.embededURL = embededURL;
	}
	public String getEmbededFile() {// gets the file that was added
		return EmbededFile;
	}
	public void setEmbededFile(String embededFile) {// adds a new file 
		EmbededFile = embededFile;
	}
}
