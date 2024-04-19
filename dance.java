import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

public class dance implements ActionListener{
    JButton button1, button2, button3, button4;

    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void PlayMusic(String location){
        try{
            File musicPath = new File ("file:///Users/sebastianvarillas/Desktop/Meme%20stuff/0117/wistle-baby.gif");

            if(musicPath.exists()){
                System.out.println("Yep");
            }else{
                System.out.println("Nop");
            }

            
                AudioInputStream audioInput = AudioSystem.getAudioInputStream (new File(location).getAbsoluteFile());
                Clip clip = AudioSystem.getClip ();
                clip.open (audioInput);
                clip.start();
            // }else{
            //     System.out.println("I cant find the music");
            // }
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }


    dance(){
        JFrame box = new JFrame("Button Example");  
        button1 = new JButton("Click Here"); 
        button1.addActionListener(this); 
        button1.setBounds(40,160,95,30);  

        button2 = new JButton("Click Here"); 
        button2.addActionListener(this); 
        button2.setBounds(260,160,95,30);  

        button3 = new JButton("Click Here"); 
        button3.addActionListener(this); 
        button3.setBounds(150,270,95,30);  

        button4 = new JButton("Virus.exe"); 
        button4.addActionListener(this); 
        button4.setBounds(310,340,95,30); 
        


        final JTextField text1 = new JTextField(); 
        text1.setBounds(35,120, 105,20);   
        text1.setText("Dragon button");  
        text1.setEnabled(false);

        final JTextField text2 = new JTextField(); 
        text2.setBounds(255,120, 105,20);   
        text2.setText("Whistle button"); 
        text2.setEnabled(false);

        final JTextField text3 = new JTextField(); 
        text3.setBounds(157,235, 85,20);   
        text3.setText("Rick button");  
        text3.setEnabled(false);


        box.add(button1); 
        box.add(button2); 
        box.add(button3); 
        box.add(button4);
        
        box.add(text1);
        box.add(text2);
        box.add(text3);


        box.setSize(400,400);  
        box.setLocation(650, 300);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setLayout(null);  
        box.setResizable(false);
        box.setVisible(true);   
    }

    public static void ranimages(String type, String name) throws MalformedURLException{
        URL url = new URL(type);
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame(name);
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocation((int) (Math.random() * 2000), (int) (Math.random() * 1000));
        f.setResizable(false);
        f.setVisible(true);    
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {
            dance box = new dance();            
    }

    public void actionPerformed(ActionEvent eggs) {   
        try {
            if(eggs.getSource() == button1){
                ranimages("file:///Users/sebastianvarillas/Desktop/Meme%20stuff/0117/toothless-dragon.gif", "Dancing dragon");
            }
            if(eggs.getSource() == button2){
                ranimages("file:///Users/sebastianvarillas/Desktop/Meme%20stuff/0117/wistle-baby.gif", "Whistle");
                String filepath = "file:///Users/sebastianvarillas/Desktop/whistlely.wav";
                PlayMusic(filepath);
            }
            if(eggs.getSource() == button3){
                ranimages("file:///Users/sebastianvarillas/Desktop/Meme%20stuff/0117/icegif-162.gif", "Never Gonna");
            }

            if(eggs.getSource() == button4){
                URL idiot = new URL("file:///Users/sebastianvarillas/Desktop/Meme%20stuff/0117/You-are-an-idiot%204.59.24%20PM.gif");
                for (var i = 0; i < 30; i++){
                    Icon icon = new ImageIcon(idiot);
                    JLabel labels = new JLabel(icon);
                    JFrame you = new JFrame();
                    you.getContentPane().add(labels);
                    you.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    you.pack();
                    you.setResizable(false);
                    if(i != 0){
                        you.setLocation(300 + (i*5), 150 + ((i*4)-1));
                        you.setVisible(true);
                    }else{
                        you.setLocation(300, 150);
                        you.setVisible(true);
                        sleep(5000);
                    }
                }
            }
            
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }
    }
}