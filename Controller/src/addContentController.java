
public class addContentController
{
    models.Page page;
    models.EmbededContent embededContent;

    Views.ViewPage pageView;
  

    
    public addContentController(Views.ViewPage pageView, models.Page page, models.EmbededContent embededContent)
    {
        this.pageView = pageView;
        this.page = page;
        this.embededContent=embededContent;
       
    }

   



    public String getEmbededURL() {
		return embededContent.getEmbededURL();
	}
	public void setEmbededURL(String embededURL) {
		embededContent.setEmbededURL(embededURL);
	}
	public String getEmbededFile() {
		return embededContent.EmbededFile();
	}
	public void setEmbededFile(String embededFile) {
		embededContent.setEmbededFile(embededFile);
	}

	
	
	

    public String getName() {
        return page.getName();
    }

    public void setName(String name) {
        page.setName(name);
    }
}
