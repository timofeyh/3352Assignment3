public class Page implements Element{
    private String name;
    private Element[] elements;

    public void addElement(Element element) {
        Element[] newElements = new Element[this.elements.length+1];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        newElements[this.elements.length] = element;
        this.elements = newElements;
    }

    public void removeElement(int index) {
        Element[] newElements = new Element[this.elements.length -1];
        for (int i = 0, j = 0; i < this.elements.length; i++) {
            if (i != index) {
                newElements[j] = newElements[i];
                ++j;
            }
        }
        this.elements = newElements;
    }

    public Element[] getElements() {
        return this.elements;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    @Override
    public void display() {

    }
}