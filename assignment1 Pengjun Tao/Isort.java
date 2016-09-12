//Pengjun Tao 800934811

import java.io.*;
import java.util.*;
public class Isort{
    //implement insertion sort
    public static float[] InsertionSort(float[] arr){
        
        float temp;
        //outer loop runs over all the elements except the first one
        for (int i = 1; i < arr.length; i++) {
            //inner loop moves element to correct place
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    //exchange location
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String args[]){
        //use ArrayList to store input numbers
        ArrayList<Float> numbers = new ArrayList<Float>();

        try{
            //I/O operations
            FileReader file = new FileReader(args[0]); 
            FileWriter output = new FileWriter(new File("answer.txt"));
            BufferedReader in = new BufferedReader(file);
            String line;        
            //to split and store the numbers
            while((line = in.readLine()) != null)
            {
                String[] temp = line.split(";");
                for(String s:temp){
                    
                    if(s != null && !"".equals(s)){
                       numbers.add(Float.parseFloat(s)); 
                    }                     
                }
            }
            //read close
            in.close();
            //float arrays
            Float temp1[] = new Float[numbers.size()];  
            float arr[] = new float[numbers.size()];  
            float result[] = new float[numbers.size()]; 
            //to array
            numbers.toArray(temp1);           
            for (int i = 0; i <= temp1.length-1; i++) { 
            //get float number
                arr[i] = temp1[i].floatValue();                  
            }  
            //sort numbers and return
            result = InsertionSort(arr);
            for(float i:result){  
                //To determine whether it is an interger
                if(i == (int)i){
                    output.write((int)i+";");
                } else {
                    output.write(i+";");
                }
                
            }
            //output process close
            output.close();
        }      
        //catch exceptions
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }      
    }
}