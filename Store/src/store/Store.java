/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
           int val;
        
        
        // importing scanner       
 Scanner input =new Scanner(System.in);
 
 
 CD [] records = new  CD [3]; // Array object named records

 
 
 // object 1////////////////////////////////////////////////////////////
 
  CD recOne = new  CD ();
 System.out.println("Enter artist num 1");
 recOne.setArtist(input.nextLine());

 System.out.println("Enter genre");
 recOne.setGenre(input.nextLine());
 
 System.out.println("Enter Record name");
 recOne.setRecName(input.nextLine());
 
 System.out.println("Enter record id");
 recOne.setCdId(input.nextInt());
        
records[0]= recOne; // sätter in ovanstånde information i plats 1 i arrayn.

 // object 2//////////////////////////////////////////////////////////
input.nextLine();
 
CD recTwo = new CD ();
System.out.println("Enter artist num 2");
recTwo.setArtist(input.nextLine());

System.out.println("Enter genre");
recTwo.setGenre(input.nextLine());

System.out.println("Enter Record name");
recTwo.setRecName(input.nextLine());

System.out.println("Enter record id");
recTwo.setCdId(input.nextInt());
        
records[1]= recTwo;// sätter in ovanstånde information i plats 2 i arrayn.


 // object 3////////////////////////////////////////////////////////
input.nextLine(); 
 
CD recthree = new CD ();
System.out.println("Enter artist num 3");
recthree.setArtist(input.nextLine());

System.out.println("Enter genre");
recthree.setGenre(input.nextLine());

System.out.println("Enter Record name");
recthree.setRecName(input.nextLine());

System.out.println("Enter record id");
recthree.setCdId(input.nextInt());
        
records[2]= recthree;// sätter in ovanstånde information i plats 3 i arrayn.
//////////////////////////////////////////////////////////////////////////////
int w= 0; 

while (w == 0){  

 System.out.println("Choose: 1=artist, 2=genre, 3=remove, 4=change 5=all cds");
val = input.nextInt();
        
 
 // Switch statment///////////////////////////////////////////////////

        switch (val){
            
///////Search for artist with else if statment//////////////////////////////            
           case 1:
   
    
     System.out.println("Enter the artist you whant");
               input.nextLine();

String key;
key = input.nextLine();

        
if(records[0].getArtist().equalsIgnoreCase (key)  && 
        records[1].getArtist().equalsIgnoreCase (key) && 
        records[2].getArtist().equalsIgnoreCase (key)){
            System.out.println(records[0]);
             System.out.println(records[1]);
              System.out.println(records[2]);
            
            } else if (records[0].getArtist().equalsIgnoreCase (key)  && 
        records[1].getArtist().equalsIgnoreCase (key)){
             System.out.println(records[0]);
             System.out.print(records[1]);
             
            } else if (records[1].getArtist().equalsIgnoreCase (key)  && 
        records[2].getArtist().equalsIgnoreCase (key)) {
            System.out.println(records[1]);
            System.out.println(records[2]);
            
            }  else if (records[0].getArtist().equalsIgnoreCase (key) && 
        records[2].getArtist().equalsIgnoreCase (key)){
            System.out.println(records[0]);
            System.out.println(records[2]);
            
            }else if (records[0].getArtist().equalsIgnoreCase (key)){
            System.out.println(records[0]);
            
            } else if (records[1].getArtist().equalsIgnoreCase (key)){
             System.out.println(records[1]);
             
            } else if (records[2].getArtist().equalsIgnoreCase (key)) {
            
            System.out.println(records[2]);
            } else {
            
            System.out.println("we dont have that");
            }
            break;
           case 2:
               
    ///////Search for genre with else if statment//////////////////////////////   
                   System.out.println("Enter the genre you whant");
                   input.nextLine();
String s;
s = input.nextLine();


        
if(records[0].getGenre().equalsIgnoreCase (s)  && 
        records[1].getGenre().equalsIgnoreCase (s) && 
        records[2].getGenre().equalsIgnoreCase (s)){
            System.out.println(records[0]);
             System.out.println(records[1]);
              System.out.println(records[2]);
            
            } else if (records[0].getGenre().equalsIgnoreCase (s)  && 
        records[1].getGenre().equalsIgnoreCase (s)){
             System.out.println(records[0]);
             System.out.print(records[1]);
             
            } else if (records[1].getGenre().equalsIgnoreCase (s)  && 
        records[2].getGenre().equalsIgnoreCase (s)) {
            System.out.println(records[1]);
            System.out.println(records[2]);
            
            }  else if (records[0].getGenre().equalsIgnoreCase (s) && 
        records[2].getGenre().equalsIgnoreCase (s)){
            System.out.println(records[0]);
            System.out.println(records[2]);
            
            }else if (records[0].getGenre().equalsIgnoreCase (s)){
            System.out.println(records[0]);
            
            } else if (records[1].getGenre().equalsIgnoreCase (s)){
             System.out.println(records[1]);
             
            } else if (records[2].getGenre().equalsIgnoreCase (s)) {
            
            System.out.println(records[2]);
            } else {
            
            System.out.println("we dont have that");
            }
                 break;  
                 
                 
           case 3:
  ///////Remove one object//////////////////////////////         

             
               
               
  System.out.println("remove cd" +" "+ " ID: " +""+ records[0].getCdId()+" : "+
        "ID: "+records[1].getCdId()+": "+ ""+"ID: "+ records[2].getCdId()+" "+
        " choose one id and press enter"); 
int a;
a=input.nextInt();
CD [] recordsNew = new CD [records.length -1];

if (records[0].getCdId()==a){
records[0]=records[records.length - 1];


for(int i=0; i < recordsNew.length; i++){
recordsNew[i]= records[i];

}

}else if (records[1].getCdId()==a){
records[0]=records[records.length - 1];


for(int i=0; i < recordsNew.length; i++){
recordsNew[i]= records[i];
}

}else if (records[2].getCdId()==a){
records[0]=records[records.length - 1];


for(int i=0; i < recordsNew.length; i++){
recordsNew[i]= records[i];
}

}else {
System.out.println("Wrong cd id");
}

System.out.println(Arrays.toString(recordsNew));
     break;
     
  case 4:
    
               
 ///////Change info about one object//////////////////////////////              
            
            
         System.out.println("Change info about cd " +" "+ " ID: " +""+ 
        records[0].getCdId()+" : "+
        "ID: "+records[1].getCdId()+": "+ ""+"ID: "+ records[2].getCdId()+" "+
        " choose one id and press enter");
               
               
               
               
 //NewClass recOneNew = new CD ();
               
              int b;
    b= input.nextInt();   
               
       if (records[0].getCdId()== b){
           
 System.out.println("Enter artist num 1");
 recOne.setArtist(input.nextLine());

 System.out.println("Enter genre");
 recOne.setGenre(input.nextLine());
 
 System.out.println("Enter Record name");
 recOne.setRecName(input.nextLine());
 
 System.out.println("Enter record id");
 recOne.setCdId(input.nextInt());
        
records[0]= recOne;
       }else if (records[1].getCdId()== b){
  input.nextLine();   
  
       System.out.println("Enter artist num 2");
recTwo.setArtist(input.nextLine());

System.out.println("Enter genre");
recTwo.setGenre(input.nextLine());

System.out.println("Enter Record name");
recTwo.setRecName(input.nextLine());

System.out.println("Enter record id");
recTwo.setCdId(input.nextInt());
        
records[1]= recTwo;
       
       
       } else if (records[2].getCdId()== b){
       
 input.nextLine();        
 
System.out.println("Enter artist num 3");
recthree.setArtist(input.nextLine());

System.out.println("Enter genre");
recthree.setGenre(input.nextLine());

System.out.println("Enter Record name");
recthree.setRecName(input.nextLine());

System.out.println("Enter record id");
recthree.setCdId(input.nextInt());
        
records[2]= recthree;
       
       
       } else {
           
           
           
           System.out.println("im so sorry");
       
       
       }
            
System.out.println(Arrays.toString(records));
               
               
               
               
               break;
  case 5:
      
  ///////Print All cds//////////////////////////////////////////////////////    
      System.out.println(Arrays.toString(records));
      break;
      
           default: 
            System.out.println("Opps thats noot good");   
            break;
       
 
       
       
       }///End switch
        
           System.out.println("write 0 to continue and 1 to terminate");
        w=input.nextInt();
        }
        input.close();
        System.out.println("Done");
        
    }
   
}
