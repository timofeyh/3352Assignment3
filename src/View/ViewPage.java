package View;


public class ViewPage {
	 private Model.EmbededContent model; 
	    private Model.Page page;
	    private Controller.addContentController controller; 

	    public ViewPage (Model.Page page ,Model.EmbededContent model) {
	        
	        this.setModel(model);   

	        this.setPageModel(page);

	    }


		/////////////////////////////////

	    public String getName() {// getting the name of the page
			return page.getName();
	    }

	    public void setName(String name) {
	    }
	    public void show() {
	    	this.update();
	    }
	    public void update()//updating the content of the view when a change occurs 
	    {
	    	
	    }
	    
	    public Model.Page getPage() {// gets the page 
	        return page;
	    }

	    public void setPageModel(Model.Page page) {// sets the page model 
	        this.page = page;
	    }

	    public Model.EmbededContent getModel(){
	        return model; 
	    }

	    public void setModel(Model.EmbededContent model) {//sets the page model 
	        this.model = model; 
	    }

	
	    public Controller.addContentController getController() {//adding the appropriate controller 
	        return controller;
	    }

	    public void setController (Controller.addContentController controller) {
	        this.controller = controller; 
	    }

	
}
