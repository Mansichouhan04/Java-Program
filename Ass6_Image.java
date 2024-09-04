package _concept.IOASSIGNMENT;

import java.io.File;

 class FileSiz {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Downloads\\lord-3645266_1920.jpg";        
        File file = new File(filePath);
        if (file.exists()) {
            long fileSizeBytes = file.length();
            //long fileSizeBytes = 432017;//file size
            int internetSpeedBps = 256;//Internet speed in bits per second
            long fileSizeBits = fileSizeBytes * 8;//convert bytes to bit
            double uploadTimeSeconds = (double) fileSizeBits / internetSpeedBps;//calculate in seconds 
            System.out.println("File Size (Bytes): " + fileSizeBytes);
            System.out.println("Upload Time (seconds): " + uploadTimeSeconds);
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}


