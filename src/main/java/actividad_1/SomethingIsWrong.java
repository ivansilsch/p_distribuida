package actividad_1;

public class SomethingIsWrong {
    public static void main(String[] args) {
        // El error es que la instancia de la clase Rectangle no estaba creada
        MyRectangle myRect = new MyRectangle();
        myRect.width = 40;
        myRect.height = 50;
        // EL otro error es que el metodo area() no existe para la clase Rectangle
        // Por eso cree la clase MyRectangle con el metodo
        System.out.println("My rect's area is " + myRect.area());
    }
}
