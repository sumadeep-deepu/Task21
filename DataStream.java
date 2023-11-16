package Task20;

import java.io.DataInputStream;

import java.io.FileInputStream;

public class DataStream {



static void DataInputStreamMethod(String filePath)throws Exception{

FileInputStream fis=new FileInputStream(filePath);
DataInputStream dataIn = new DataInputStream(new FileInputStream(filePath));


int count = fis.available();  
  
    byte[] bs = new byte[count];  
  
    dataIn.read(bs, 0,count);  
  
    for (byte b : bs) {  
      char c = (char) b;     
      System.out.print(c);  
    }

    
/* System.out.println(intValue);
System.out.println(strValue);
System.out.println(boolValue); */    
    
    fis.close();
    dataIn.close();

}  
   public static void main(String[] args)throws Exception {


    DataInputStreamMethod("C:/Users/sumadeep/Desktop/ReadFromFile.txt");
}

    }    

