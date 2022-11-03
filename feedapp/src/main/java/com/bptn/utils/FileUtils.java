package com.bptn.utils;
import java.io.File;
import java.nio.file.*;
import java.util.UUID;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
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
    
    public static void readFile() throws FileNotFoundException {
    	
    	Path p = Paths.get(HOME + "/test.txt");
    	if (Files.exists(p)) {
    		Scanner scanner = new Scanner(new File(p.toUri()));
    		while (scanner.hasNextLine()) {
    			String data = scanner.nextLine();
    			System.out.println(data);
    		}
    	}
    }
    
    public static void deleteFile() throws IOException {
    	Path p1 = Paths.get(HOME + "/fake.txt");
    	System.out.println(Files.exists(p1));
    	Files.deleteIfExists(p1);
    }
    
    public static void writeFile() throws IOException {
    	Path p = Paths.get(HOME + "/testWrite.txt");
    	if (!Files.exists(p)) {
    		Files.createFile(p);
    	}
    	FileWriter writer = new FileWriter(new File(p.toUri()));
		writer.write("Yo");
		writer.close();
    }
    
    public static void updateFile() {
    	
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        Logger logger = LoggerFactory.getLogger(FileUtils.class);
        logger.debug("Executing");
      
        FileUtils.isFileExists();
        FileUtils.isFileExistsWithExceptionHandling();
        FileUtils.createFileIfNotExist();
        FileUtils.readFile();
        FileUtils.writeFile();
        FileUtils.deleteFile();
     
    }

}