// //write in txt file
// import java.io.FileWriter;
// public class MainClass{

//     public static void main(String[] args){
//         try {
//             FileWriter writer = new FileWriter("output.txt");
//             writer.write("Hello, World!");
//             writer.write("hellewww");
//             writer.close();
//             System.out.println("File written successfully.");
//         } catch (Exception e) {
//             System.out.println("An error occurred while writing to the file.");
           
//         }
//     }
// }


import java.io.FileWriter;

public class MainClass {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        FileWriter fw = new FileWriter("file1.txt");
        for (int i = 0; i < 100000; i++) {
            fw.write("Hello\n");
        }
        fw.close();

        long end = System.currentTimeMillis();
        System.out.println("FileWriter Time: " + (end - start));
    }
}