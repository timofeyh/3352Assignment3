package Model;

public class Page implements Element{
    private String name;
    private Element[] elements;// a page consists of multiple elements 

    public void addElement(Element element) {// adding an element to the page
        Element[] newElements = new Element[this.elements.length+1];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        newElements[this.elements.length] = element;
        this.elements = newElements;
    }

    public void removeElement(int index) {// removing an element from the page 
        Element[] newElements = new Element[this.elements.length -1];
        for (int i = 0, j = 0; i < this.elements.length; i++) {
            if (i != index) {
                newElements[j] = newElements[i];
                ++j;
            }
        }
        this.elements = newElements;
    }

    public Element[] getElements() {// gets the elements
        return this.elements;
    }

    public String getName() {// gets the name of the page
        return this.name;
    }

    public void setName(String name) {// assign a page name
        this.name = name;
    }

 
    @Override
    public void display() {// used to display it 

    }
}