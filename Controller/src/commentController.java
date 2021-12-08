
public class commentController
{
    private Comment model;
    private ViewComment view;
    
    public commentController(Comment model, ViewComment view)
    {
        this.model = model;
        this.view = view;
        view.show()//also have update method in it 
    }

    
    public void setCommentBody(String comment)
    {
        model.setCommentBody(comment);
    }

    public String getCommentBody()
    {
        return model.getCommentBody();
    }

    public void setWriter(String writer)
    {
        model.setWriter(writer);
    }

    //get the author from the model
    public String getWriter()
    {
        return model.getWriter();
    }
}
