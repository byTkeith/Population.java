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
        int firstreduce=0;
        int secondreduce=0;
        for(i=0;i<entireFile.size();i++){
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

            for(int c=0;c<firstChar.length && c<secondChar.length;c++){
                
                sb.append(firstChar[c]);//first adds the char of the first mater
                firstreduce++;//after adding char to sb we subtract from the length of the word
                sb.append(secondChar[c]);// then adds the char of the second mater
                secondreduce++;//subtracst from the maximum length if added
                //String combined=sb.toString();
                //wordPos++; too increment the counter of the word an possibly store in the map
                
                



            }
            //String combinedString=sb.toString();//all the letters combined to a whole letter
            if(sb.length()<10 && firstreduce!=firstString.length()){
                
                sb.append(firstString.substring(firstreduce));//if there are still letters remaining for the fir
            

            }
            else if(sb.length()<10 && secondreduce!=SecondString.length()){
                sb.append(SecondString.substring(secondreduce));
            }
            String combinedString=sb.toString();
           
            System.out.println("the offspring is : "+combinedString);
            //System.out.println("");


            System.out.println("the first mate is: ");
        }
       

    }
    
}
