package lecturesJava001.lecture2Files;

import java.io.*;

/*стра
                        Что такое API для нас: строки
concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую

trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
compareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках
Ч*/
public class Lec2Files {
    public static void main(String[] args) throws IOException {
//        String[] name = {"z", "f", "l", "M"};
//        System.out.println(String.join("", name));
//        System.out.println(String.join(";", name));
//
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath ());


        String file = "file.txt";
        FileWriter fw = new FileWriter(file, false);
        fw.write("line1\n");
        fw.write("line2\n");
        fw.flush();

        FileReader fr = new FileReader(file);
        int st;
        char ch;
        while ((st = fr.read()) != -1) {
            ch = (char)st;
            System.out.print(ch);
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
/*                      Работа с файловой системой
isHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся
в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог

*/