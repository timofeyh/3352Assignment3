package Controller;

public class commentController {
	 private Model.Comment comment;
	    private View.ViewComment view;
	    
	    public commentController(Model.Comment comment, View.ViewComment view)
	    {
	        this.comment = comment;
	        this.view = view;
	        view.show();//calls the view method to show the content
	    }

	    
	    public void setComment(String comment)// setting a comment 
	    {
	    	this.comment.setComment(comment);
	    }

	    public String getComment()// gets the comment 
	    {
	        return comment.getComment();
	    }

	    public void setWriter(String writer)// sets the writer from the comment model 
	    {
	    	comment.setWriter(writer);
	    }

	    //get the writer from the Model
	    public String getWriter()
	    {
	        return comment.getWriter();
	    }
}
