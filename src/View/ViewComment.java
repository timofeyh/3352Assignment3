package View;

public class ViewComment {
	 private Model.Comment comment;// reference of comment 

	    Controller.commentController commentController; 

	    public ViewComment(Model.Comment comment,  Controller.commentController commentController) {

	        this.setModel(comment);
	        this.setController(commentController); 
	    }


	    public void addComment() {// used to add a comment 
	    }



	    public void show() {// show the content
	    	this.update();
	    }
	    public void update()// to update the view when a change occurs 
	    {
	    	
	    }

	    public Model.Comment getComment(){// get the comment 
	        return comment; 
	    }
	    public void setModel(Model.Comment model) {// assign the model used 
	        this.comment = model; 
	    }
	    public void setComment(Model.Comment comment) {// set the comment in the view 
	        this.comment = comment; 
	    }
	    public Controller.commentController getController() {
	        return commentController; 
	    }

	     public void setController(Controller.commentController commentController) {// set the appropriate controller 
	        this.commentController = commentController; 

	    }

	    public void DisplayComments(String comment, String writer) {// used to display the comments 
	    }
}
