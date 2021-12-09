public class OwlEntryPoint
{
    public static void main(String[] args) {
        models.Page p = new models.Page();
        models.EmbededContent e = new models.EmbededContent();
        views.ViewPage v = new views.ViewPage(p, e);

        controllers.addContentController c = new controllers.addContentController(p, e, v);
        v.setController(c);
    }
}
