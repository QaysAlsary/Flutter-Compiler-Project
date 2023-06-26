package Classes;

public class Image extends Widget {
    public String path;
    public Variable identifier;
    public int width, height;



    public Image(){}
    public Image(String imagePath) {
        this.path = imagePath;
//        this.width = -1;
//        this.height = -1;
    }

    public Image(String path, int width) {
        this.path = path;
        this.width = width;
    }
    public Image(String path, int width, int height) {
        this.path = path;
        this.width = width;
        this.height = height;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public void setIdentifier(Variable identifier) {
        this.identifier = identifier;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
