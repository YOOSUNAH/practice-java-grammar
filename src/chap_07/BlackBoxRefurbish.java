package chap_07;

public class BlackBoxRefurbish {
    public String modelName; // 모델명
    String resoultion; // 해상도  // 아무것도 안 적은 default
    private int price; // 가격
    protected String color; // 색상

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResoultion() {
        if (resoultion == null || resoultion.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resoultion;
    }

    public void setResoultion(String resoultion) {
        this.resoultion = resoultion;
    }

    private int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


