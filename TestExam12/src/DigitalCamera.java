import java.util.Date;

public class DigitalCamera extends Camera{
    private double megaPixels;
    private ImageDirectory imageDirectory;

    public DigitalCamera(Manufacturer manufacturer,double megaPixels,int maxNumberOfImages){
        super(manufacturer);
        this.megaPixels=megaPixels;
        this.imageDirectory=new ImageDirectory(maxNumberOfImages);
        if (maxNumberOfImages==0){
            throw new IllegalArgumentException("maxNumberOfImages can nit be null");
        }
    }
    @Override
    public void takeAPicture(){

    }
    public void addDescriptionToLastPicture(String description){
        imageDirectory.getImage(imageDirectory.getNumberOfImages()-1).setDescription(description);
    }
    public ImageDirectory getImageDirectory(){
        return imageDirectory;
    }
}
