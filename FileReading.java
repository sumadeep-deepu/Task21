package Task20;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileReading {

static void BufferReaderMethod(String FilePath)throws Exception{
    
    FileReader path=new FileReader(FilePath);
    BufferedReader br=new BufferedReader(path);

    StringBuilder content=new StringBuilder();

    String text;
    while((text=br.readLine())!=null){
        content.append(text).append("\n");
    }
    System.out.println(content);
    br.close();
    path.close(); 
}


static void BufferInputStreamMethod(String filePath)throws Exception{

    FileInputStream fis=new FileInputStream(filePath);

    BufferedInputStream bis=new BufferedInputStream(fis);

   String input="";
    int ascii;
    while((ascii=bis.read())!=-1){

    input +=String.valueOf((char)ascii);
    }
    System.out.println(input);
    bis.close();
    fis.close();

}

public static void main(String[] args)throws Exception{

    BufferReaderMethod("C:/Users/sumadeep/Desktop/ReadFromFile.txt");

    System.out.println();

    BufferInputStreamMethod("C:/Users/sumadeep/Desktop/ReadFromFile.txt");

   

    
     
}













    
}
