package lecturesJava001.lecture1;


import java.io.*;

public class Lec1 {
    public static void main(String[] args) {
//                  false = нужно ли дописывать иди перезаписать = new
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line1");
            fw.write('\n');
            fw.write('4');
            fw.write('\n');
            fw.write("line3");
            fw.flush();
        } catch (IOException e) {
            //System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader("file.txt");
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                //if (ch == '\n') {
//                    System.out.print(ch);
//                } else {
                    System.out.print(ch);
                //}
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}