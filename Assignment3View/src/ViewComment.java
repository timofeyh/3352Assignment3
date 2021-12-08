
public class ViewComment {
	
	 private Model.Comment comment;

	    Controller.commentController commentController; 

	    public ViewComment(Model.Comment comment,  Controller.commentController commentController) {

	        this.setModel(comment);
	        this.setController(commentController); 
	    }


	    public void addComment() {
	    }



	    public void show() {
	    	this.update();
	    }
	    public void update()
	    {
	    	
	    }

	    public Model.Comment getComment(){
	        return comment; 
	    }

	    public void setComment(Model.Comment comment) {
	        this.comment = comment; 
	    }
	    public Controller.commentController getController() {
	        return commentController; 
	    }

	     public void setController(Controller.commentController commentController) {
	        this.commentController = commentController; 

	    }

	    public void DisplayComments(String comment, String writer) {
	    }
}
