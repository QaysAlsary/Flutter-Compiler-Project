package Classes;

public class Navigator {
    public String title;
    public String image;
    public String description;

    public void setDistClass(String distClass) {
        this.distClass = distClass;
    }

    public String distClass;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " Navigator{\n                               " +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", distClass='" + distClass + '\'' +
                "\n                            " + '}';
    }
}
