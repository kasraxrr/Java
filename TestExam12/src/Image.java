public class Image {
    private String description;

    public Image(){
        this.description=null;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String toString(){
        return description;
    }
}
