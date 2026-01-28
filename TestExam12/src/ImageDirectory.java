public class ImageDirectory {
    private Image[] images;
    private int numberOfImages;

    public ImageDirectory(int maxSize){
        this.images=new Image[maxSize];
        this.numberOfImages=0;
    }
    public int getNumberOfImages(){
        return numberOfImages;
    }
    public void addImage(Image image){
        for (int i = 0; i < numberOfImages; i++) {
            if (images[i]==null){
                images[i]=image;
            }
        }numberOfImages++;
    }
    public void addDescription(int index,String description){
    images[index].setDescription(description);
    }
    public void removeImage(int index){
        images[index]=null;
        images[index]=images[numberOfImages-1];
        numberOfImages--;

    }
    public void removeImageWithOrder(int index){
            images[index]=null;
            for(int i = index; i < numberOfImages; i++){
                images[index] = images[index+1];

            } numberOfImages--;


    }
    public Image getImage(int index){
        return images[index];
    }
    public Image getImage(String  description){
        for(int i=0;i<numberOfImages;i++){
            if (images[i].getDescription().equals(description)){
                return images[i];
            }
        }return null;
    }
}
