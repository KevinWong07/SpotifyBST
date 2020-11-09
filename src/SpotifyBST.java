import java.io.*;
import java.util.*;

public class SpotifyBST{
    
    public static void main(String[] args) throws FileNotFoundException {

        String[] filePath = {"\\src\\CSV\\regional-global-weekly-2020-06-26--2020-07-03.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-07-03--2020-07-10.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-07-10--2020-07-17.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-07-17--2020-07-24.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-07-24--2020-07-31.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-07-31--2020-08-07.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-08-07--2020-08-14.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-08-14--2020-08-21.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-08-21--2020-08-28.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-08-28--2020-09-04.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-09-04--2020-09-11.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-09-11--2020-09-18.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-09-18--2020-09-25.csv", 
                             "\\src\\CSV\\regional-global-weekly-2020-09-25--2020-10-02.csv"};

        ArrayList<String> songs = new ArrayList<>();
        ArrayList<String> artists = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        String path = System.getProperty("user.dir");
        System.out.println(path + filePath[0]);

        String[] newFilePaths = new String[filePath.length];

        for (int i = 0; i < filePath.length; i++) {
            newFilePaths[i] = path + filePath[i];
            System.out.println(newFilePaths[i]);
        }

        for (String s : newFilePaths) {
            FileInputStream fis = new FileInputStream(s);
            Scanner sc = new Scanner(fis);
            
            while(sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] arr = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                if (arr.length > 1) {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].charAt(0) == '"') {
                            arr[i] = arr[i].substring(1, arr[i].length() - 1);
                        }
                    }
                    songs.add(arr[1]);
                    artists.add(arr[2]);
                    count.add(Integer.parseInt(arr[3]));
                }
            }
            sc.close();
        }
    }
}