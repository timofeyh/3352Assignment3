package Model;

public class Comment {
	private String comment;
	private String Writer;
	
	public String getComment() {// returns the comment 
		return comment;
	}
	
	public void setComment(String comment) {// adding a comment 
		this.comment = comment;
	}
	
	public String getWriter() {// get the writer of the comment 
		return Writer;
	}
	
	public void setWriter(String writer) {// assigns the writer of the comment 
		Writer = writer;
	}
}
