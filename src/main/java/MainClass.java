import controller.Controller;
import view.Gui;

public class MainClass {
    public static void main(String[] args) {

        Gui g = new Gui();
        Controller controller = new Controller(g);
    }
}
