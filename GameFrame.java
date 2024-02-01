import javax.swing.JFrame;

public class GameFrame extends JFrame {

    //Create Constructors
    GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //Fits all of the components we add into the frame
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }




}
