
public class ViewPage {

	    private Model.EmbededContent model; 
	    private Model.Page page;
	    private Controller.addContentController controller; 

	    public ViewPage (models.Page page ,models.EmbededContent model) {
	        
	        this.setModel(model);   

	        this.setModel(page);

	    }


		// This should be in controller
	    public void addElement(Element e) {
			this.page.addElement(e);
	    }
	    public void removeElement(int Index) {
			this.page.removeElement(Index);
	    }
		/////////////////////////////////

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
