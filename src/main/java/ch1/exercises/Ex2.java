package ch1.exercises;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by alexandrubostan on 09.07.2014.
 */
public class Ex2 {

    public static File[] allSubDirs1(File file) {
      return  file.listFiles(pathName -> pathName.isDirectory());
    }

    public static File[] filterByExtension2(File file, String ext) {
        return file.listFiles(pathName -> pathName.getName().contains(ext));
    }

    public static File[] sort4(File file) {
        File[] files = file.listFiles();
        Comparator<File> sorted = (File a, File b) -> Boolean.compare(a.isDirectory(), b.isDirectory());
        Arrays.sort(files, sorted);
        return files;
    }

    public static void main(String[] args) {
        File[] files = sort4(new File("C:\\"));
        System.out.println(files);
    }
}
