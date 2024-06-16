package Laba_2.Adapter;

public class SquareStickAdapter extends RoundStick {
    private SquareStick squareStick;

    public SquareStickAdapter(SquareStick squareStick) {
        super(squareStick.getWidth() * Math.sqrt(2) / 2);
        this.squareStick = squareStick;
    }

    @Override
    public double getRadius() {
        // Диагональ квадрата является диаметром вписанной окружности
        return (squareStick.getWidth() * Math.sqrt(2)) / 2;
    }
}
