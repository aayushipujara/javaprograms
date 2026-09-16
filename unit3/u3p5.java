import java.io.*;

public class u3p5{
    static void readFile() throws IOException{
        FileReader file =new FileReader("abc.txt");
        BufferedReader br =new BufferedReader(file);
        System.out.println(br.readLine());

    }
public static void main(String args[]){
    try{
        readFile();
    } catch(IOException e){
        System.out.println("Caller handled file error for Vivaan:" + e.getMessage());
    }
}
}