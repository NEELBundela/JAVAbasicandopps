package MiniProjects.Bank_Account_System;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        String filename = "D:\\JAVA\\JAVAbasicandopps\\src\\MiniProjects\\Bank_Account_System\\01 - Besabriyaan77.wav";
        File file = new File(filename);

        try ( Scanner sc =new Scanner(System.in);
              AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();

            clip.open(audioInputStream);
            //System.out.println("NO problem");

            String ch = "";
            while(!ch.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");
                ch=sc.next().toUpperCase();

                switch (ch){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Something went wrong");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e)
        {
            System.out.println("Unable to access audio");
        }
        finally {
            System.out.println("By!!!");
        }
    }
}