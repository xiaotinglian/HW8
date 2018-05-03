import java.io.*;
import java.util.*;

class Tree {

    public static void displayAll(File path, int level){
        File files[] = path.listFiles();

        for(int i = 0; i < level - 1; i++){
            System.out.print("    |");
        }

        if (level != 0)
            System.out.print("---");

        System.out.println(path.getName());
        if(!path.isDirectory() || files.length == 0)
            return;

        for(int i = 0; i < files.length; i++){
            System.out.print("|");
            displayAll(files[i], level + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\lian1\\Desktop");
        displayAll(file, 0);
   }
}
