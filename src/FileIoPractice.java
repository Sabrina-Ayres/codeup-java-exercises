import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileIoPractice {

    public static void main(String[] args) {

        Path path = Paths.get("src/fileIo/people.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : lines) {
            System.out.println(name + " works at Codeup.");
        }


//        List<String> breakoutRoom = Arrays.asList("Ann", "Emily", "Michael", "Yasin", "Sabrina");
//        try {
//            Files.write(path, breakoutRoom);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        breakoutRoom.add("Ann");
//        breakoutRoom.add("Emily");
//        breakoutRoom.add("Micheal");
//        breakoutRoom.add("Yasin");
//        breakoutRoom.add("Sabrina");


    }


//    static List<String> newList = new ArrayList<>();
//
//    public static Path deleteEntry(lines) {
//        for (String line : lines) {
//            if (line.equals()) {
//                newList.delete();
//            };
//        }
//    }

}
