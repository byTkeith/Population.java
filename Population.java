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
        for(i=0;i<entireFile.size()-1;i++){
            int lengthOfPop=Integer.parseInt(entireFile.get(0));
            int wordPos=0;
            int j=1;//to start reading the strings after taking the first integer value
            for(j=1;j<lengthOfPop;j++){//loop over only the specified length of population

            }

        }

    }
    
}
