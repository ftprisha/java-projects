// //buffered writer
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// public class MainClass2{
//     public static void main(String[] args){
//         try {
//             FileWriter file = new FileWriter("output1.txt");
//             BufferedWriter bw =new BufferedWriter(file);
//             bw.write("Hello, World!");
//             bw.write("hellewww");
//                 bw.close();
//                 file.close();
//                 System.out.println("File written successfully.");
//         } catch (Exception e) {
//             System.out.println("An error occurred while writing to the file.");
//         }
//     }
// }

import java.io.*;

public class MainClass2 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));
        for (int i = 0; i < 100000; i++) {
            bw.write("Hello\n");
        }
        bw.close();

        long end = System.currentTimeMillis();
        System.out.println("BufferedWriter Time: " + (end - start));
    }
}