package RetosDeProgramacion.konamicode;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KonamiCode {

    private static int keyPosition = 0;

    public static void konamiCode(int[] keyCodeList, int key) {


        if (key == keyCodeList[keyPosition]) {
            keyPosition++;

            System.out.println(">>>> : " + keyPosition);

            if (keyPosition == keyCodeList.length) {
                System.out.println("""
                         ____  __.                           .__                   _________            .___     \s
                        |    |/ _|____   ____ _____    _____ |__|                  \\_   ___ \\  ____   __| _/____ \s
                        |      < /  _ \\ /    \\\\__  \\  /     \\|  |  ______   ______ /    \\  \\/ /  _ \\ / __ |/ __ \\\s
                        |    |  (  <_> )   |  \\/ __ \\|  Y Y  \\  | /_____/  /_____/ \\     \\___(  <_> ) /_/ \\  ___/\s
                        |____|__ \\____/|___|  (____  /__|_|  /__|                   \\______  /\\____/\\____ |\\___  >
                                \\/          \\/     \\/      \\/                              \\/            \\/    \\/\s
                        """);
                keyPosition = 0;
            }
        } else {
            keyPosition = 0;
        }


    }

    public static void onPress(Frame frame) {
        JLabel textLabel = new JLabel("Press a key to display text here");
//        textLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                String text = "";

                int[] konamiCode = {
                        KeyEvent.VK_UP,
                        KeyEvent.VK_UP,
                        KeyEvent.VK_DOWN,
                        KeyEvent.VK_DOWN,
                        KeyEvent.VK_LEFT,
                        KeyEvent.VK_RIGHT,
                        KeyEvent.VK_LEFT,
                        KeyEvent.VK_RIGHT,
                        KeyEvent.VK_B,
                        KeyEvent.VK_A,
                };

                int key = e.getKeyCode();

                konamiCode(konamiCode, key);
            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JLabel textLabel = new JLabel("Press a key to display text here");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 14));


        frame.getContentPane().add(textLabel, BorderLayout.CENTER);


//        int[] konamiCode = {
//                KeyEvent.VK_UP,
//                KeyEvent.VK_UP,
//                KeyEvent.VK_DOWN,
//                KeyEvent.VK_DOWN,
//                KeyEvent.VK_LEFT,
//                KeyEvent.VK_RIGHT,
//                KeyEvent.VK_LEFT,
//                KeyEvent.VK_RIGHT,
//                KeyEvent.VK_B,
//                KeyEvent.VK_A,
//        };


//        frame.addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent e) {
//                String keyText = "";
//
//                int keyCode = e.getKeyCode();
//
//
////                if (keyCode == KeyEvent.VK_A) {
////                    System.out.println("Up Arrrow-Key is pressed!>> ");
////                    keyText = "UP";
////                } else if (keyCode == KeyEvent.VK_DOWN) {
////                    System.out.println("Down Arrrow-Key is pressed!");
////                    keyText = "DOWN";
////                } else if (keyCode == KeyEvent.VK_LEFT) {
////                    System.out.println("Left Arrrow-Key is pressed!");
////                    keyText = "LEFT";
////                } else if (keyCode == KeyEvent.VK_RIGHT) {
////                    System.out.println("Right Arrrow-Key is pressed!");
////                    keyText = "RIGHT";
////                }
//                textLabel.setText(keyText);
//
//            }
//        });
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 400);
        onPress(frame);

    }

}
