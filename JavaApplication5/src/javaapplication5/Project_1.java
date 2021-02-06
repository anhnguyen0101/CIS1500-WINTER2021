
package javaapplication5;

import java.util.Scanner;

public class Project_1 {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);     
        // as k contractor friend's name
        System.out.println("Hello my Friend! What is your name?");         
        String name = keyboard.nextLine();
        // ask how far apart the post
        System.out.println("Hey " + name + ", How far apart the post do you want?");
        double postDistance = Double.parseDouble(keyboard.nextLine());
        // ask the length of the fence
        System.out.println( name + "," + " What is the length of the fence?");
        double lengthFence = Double.parseDouble(keyboard.nextLine());
        //ask the width of the fence
        System.out.println("Hey " + name + "," + "What is the width of the fence?");
        double wideFence =Double.parseDouble(keyboard.nextLine());
        //ask the size of boards
        System.out.println("Hey" + name + "," + "What is the length of the board "
                + name + " purchased ? ");
        double lengthBoard = Double.parseDouble(keyboard.nextLine());
        // Caculate the perimeter
        double perimeter = 2*(lengthFence + wideFence);
        //Caculate number of board the contractor need 
         int numberPost = (int)Math.ceil(perimeter/postDistance);     
        //Caculate boards between posts             
          int boardsPerPost=(int)Math.ceil(postDistance/lengthBoard);
         
         if(boardsPerPost==0.5) {
             double numberBoards = boardsPerPost*numberPost;
             System.out.println("Number of boards needed to complete the fence : " + numberBoards);
             // There will be no waste for the board
             System.out.println(" You have enough board to use, no wasted.");}
         else {       
         //Calculate the number of boards needed to complete the fence        
            double numberBoards=numberPost;
            System.out.println("Number of boards needed to complete the fence : " + numberBoards);
            
         //Calculate boardlength wasted between posts
           
            double boardWastedPerPost=(int)Math.ceil(boardsPerPost)*lengthBoard-postDistance;       
            
         
                  
          //Calculate the amount of board wasted
            double boardsWasted=boardWastedPerPost*numberPost;
             System.out.println("Board Length Wasted: " + boardsWasted);}        
                          
         }
    }
    
