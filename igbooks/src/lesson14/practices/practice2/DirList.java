package lesson14.practices.practice2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirList {
  public static void main(String[] args) {
                
    try(Stream<Path> files = Files.list(Paths.get("."))){

        System.out.println("\n=== Dir list ===");
        files.forEach(line -> System.out.println(line));            

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
  } 
}
