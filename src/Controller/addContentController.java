package Controller;

import Model.Element;

public class addContentController {

    private Model.Page page;
    private Model.EmbededContent embededContent;

    private  View.ViewPage pageView;
  

    
    public addContentController(View.ViewPage pageView, Model.Page page, Model.EmbededContent embededContent)
    {
        this.pageView = pageView;
        this.page = page;
        this.embededContent=embededContent;
       
    }

   

    public void addElement(Element e) {// adding an element from the element model 
		this.page.addElement(e);
    }
    public void removeElement(int Index) {// removing an element 
		this.page.removeElement(Index);
    }


    public String getEmbededURL() {// gets the URL 
		return embededContent.getEmbededURL();
	}
	public void setEmbededURL(String embededURL) {//sets the URL 
		embededContent.setEmbededURL(embededURL);
	}
	public String getEmbededFile() {// gets the file from the model 
		return embededContent.getEmbededFile();
	}
	public void setEmbededFile(String embededFile) {// sets the file from the model 
		embededContent.setEmbededFile(embededFile);
	}

	
	
	

    public String getName() {// gets the name of the page from the model 
        return page.getName();
    }

    public void setName(String name) {// sets the name of the page from the model 
        page.setName(name);
    }

}
