import java.io.*;
import java.util.*;
public class Population {

  
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map=new LinkedHashMap<>();//to store the string and the postion number
        ArrayList<String> entireFile=new ArrayList<>();
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
        int matingStartPoint=0;
        for(i=0;i<entireFile.size();i++){
            int lengthOfPop=Integer.parseInt(entireFile.get(0));
            int wordPos=0;
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
            

            System.out.println("the following are matings to occur"+entireFile.get(k));
        }
       

    }
    
}
