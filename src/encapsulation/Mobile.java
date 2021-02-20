package encapsulation;

public class Mobile {

    public String mobileName= "iphone";
    private int mobileMemoryGB=32;
    private String color="Black";


    public String getmobileName(){
        return mobileName;
    }

    public void setMobileName(String mobileName){
        this.mobileName=mobileName;

}
    public int getMobileMemoryGB(){
        return mobileMemoryGB;

    }
    public void setMobileMemoryGB(int mobileMemoryGB){
        this.mobileMemoryGB=mobileMemoryGB;

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color=color;

    }




}
