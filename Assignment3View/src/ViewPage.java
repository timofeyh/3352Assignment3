
public class ViewPage {

	    private Model.EmbededContent model; 
	    private Model.Page page;
	    private Controller.addContentController controller; 

	    public ViewPage (models.Page page ,models.EmbededContent model, Controller.addContentController controller ) {
	        
	        this.setModel(model);   

	        this.setModel(page); 
	         
	        this.setController(controller); 

	    }



	    public void addEmbeddedContent() {

	    }
	    public void deleteEmbeddedContent() {

	    }

	    public String getName() {
	    }

	    public void setName(String name) {
	    }
	    public void show() {
	    	this.update();
	    }
	    public void update()
	    {
	    	
	    }
	    
	    public Model.Page getPage() {
	        return page;
	    }

	    public void setPageModel(Page page) {
	        this.page = page;
	    }


	    public models.EmbededContent getModel(){
	        return model; 
	    }

	    public void setModel(models.EmbededContent model) {
	        this.model = model; 
	    }

	
	    public Controller.addContentController getController() {
	        return controller; 

	    }

	    public void setController (Controller.addContentController controller) {
	        this.controller = controller; 
	    }

	
	
	
}
