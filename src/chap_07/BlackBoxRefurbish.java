package chap_07;

public class BlackBoxRefurbish {
    public String modelName; // 모델명  //public 모든 클래스에서 접근 가능
    String resolution; // 해상도  // 아무것도 안 적은 default. 같은 패키지 내에서만 접근 가능
    private int price; // 가격 // private 추가로 붙여줌. BlackboxRefurbish class 내에서만 접근 가능
    protected String color; // 색상 // protected 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
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


