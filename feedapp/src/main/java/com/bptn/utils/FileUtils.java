package com.bptn.utils;
import java.io.File;
import java.nio.file.*;
import java.util.UUID;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FileUtils {

 private static String HOME = System.getProperty("user.home");
 File file1 = new File("test.txt");
    
    public static void isFileExists() {
        Path p = Paths.get(HOME);
        System.out.println(Files.exists(p));
    }
    
    public static void isFileExistsWithExceptionHandling() throws IOException, FileNotFoundException {
        Path p = Paths.get(HOME);
        System.out.println(Files.exists(p));
        
    }
    
    public static void createFileIfNotExist() throws IOException {
        String fileName = "test" + UUID.randomUUID().toString() + ".txt";
        Path p = Paths.get(HOME + "/" + fileName);
        if(!Files.exists(p)){
            Files.createFile(p);    
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        Logger logger = LoggerFactory.getLogger(FileUtils.class);
        logger.debug("Executing");
        isFileExists();
        isFileExistsWithExceptionHandling();
        createFileIfNotExist();
     
    }

}
