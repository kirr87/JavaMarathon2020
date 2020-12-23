package BattleSee;

public enum View {

    //Графическое представление матрицы

    SHIP(1, "🚢"),
    DESTROYED(3, "\uD83D\uDCA3"),
    EMPTY(0, "\uD83C\uDF0A"),
    HALO(2, "\uD83C\uDF00"),
    MISSING(4, "❌");

    private double price;
    private String view;

    View(double price, String view) {
        this.price = price;
        this.view = view;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return view;
    }
}
