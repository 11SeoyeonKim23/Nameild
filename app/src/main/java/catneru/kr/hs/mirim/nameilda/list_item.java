package catneru.kr.hs.mirim.nameilda;

public class list_item {

    private int name;
    private int img;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public list_item(int name, int img) {
        this.name = name;
        this.img = img;
    }
}
