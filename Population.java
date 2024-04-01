import java.io.*;
import java.util.*;
public class Population {

  
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map=new LinkedHashMap<>();//to store the string and the postion number
        ArrayList<String> entireFile=new ArrayList<>();
        ArrayList<Character> mateLab=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the file name:");
        String filename=scanner.nextLine();
        try{
            File file=new File(filename);
            scanner =new Scanner(file);
            while (scanner.hasNextLine()) {
                entireFile.add(scanner.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        int i=0;
        int wordPos=0;
        int matingStartPoint=0;
        // int firstreduce=0;
        // int secondreduce=0;
        for(i=0;i!=1;i++){
            int lengthOfPop=Integer.parseInt(entireFile.get(0));
            //int wordPos=0;
            int j=1;//to start reading the strings after taking the first integer value
            for(j=1;j<lengthOfPop+1;j++){//loop over only the specified length of population
                wordPos++;
                map.put(wordPos, entireFile.get(j));

            }
            int numBreeds=Integer.parseInt(entireFile.get(lengthOfPop+1));//the number after the population the signifies the number of matings to occur
            matingStartPoint=lengthOfPop+2;//the loop for matings starts here
          
           


        }
        int k=matingStartPoint;
        for(k=matingStartPoint;k<entireFile.size();k++){//loop that only goes through the mating pairs
            String[] splitpairs=entireFile.get(k).split(" ");//splits the mating pairs into two by space
            int fistMate=Integer.parseInt(splitpairs[0]);//the first value to mate
            int SecondMate=Integer.parseInt(splitpairs[1]);

            //now to take the vallues from the map, make them chars then conc

            String firstString=map.get(fistMate);//takes the value of mating from the map
            String SecondString=map.get(SecondMate);//takes the 2nd value for mating

            char[] firstChar=firstString.toCharArray();//char value of the first string
            char[] secondChar=SecondString.toCharArray();//char value of the second string
            StringBuilder sb=new StringBuilder();
            int firstreduce=0;
            int secondreduce=0;

            for(int c=0;c<firstChar.length && c<secondChar.length;c++){
                
                sb.append(firstChar[c]);//first adds the char of the first mater
                firstreduce++;//after adding char to sb we subtract from the length of the word
                sb.append(secondChar[c]);// then adds the char of the second mater
                secondreduce++;//subtracst from the maximum length if added
                //String combined=sb.toString();
                //wordPos++; too increment the counter of the word an possibly store in the map
                
                



            }
            //String combinedString=sb.toString();//all the letters combined to a whole letter
            int counterF=0;//counters for the amoubnt of string left to reach 10
            int counterS=0;
            if(sb.length()<10 && firstreduce<firstString.length()){
                
                sb.append(firstString.substring(firstreduce));//if there are still letters remaining for the fir
            

            }
            
            else if(sb.length()<10 && secondreduce<SecondString.length()){
                sb.append(SecondString.substring(secondreduce));

            }
            String combinedString=sb.toString();
            wordPos++;//increments the value for position after creatingb the word
            map.put(wordPos, combinedString);//adds the new position number and the new number into the map
            String purifiedString="";
            if(combinedString.length()>10){
                purifiedString=combinedString.substring(0, 10);//if the new string is longer than it should be , will just clip the values to 10 by using substring
            }
            else if(combinedString.length()<=10){
                purifiedString=combinedString;//if the values are within our range then we are all good print the string like that
            }
           
            System.out.println("["+purifiedString+"]");
        
        }
       

    }
    
}
