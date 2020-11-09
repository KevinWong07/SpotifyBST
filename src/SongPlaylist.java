import java.io.*;
import java.util.*;

public class SongPlaylist {
    ArrayList<Song> BinarySearchTree = new ArrayList<>();
    public Song root;

    public SongPlaylist() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Song obj) {
        if (root == null) {
            root = obj;
        } else {
            Song current = root;
            Song parent;

            while (true) {
                parent = current;

                if (obj.songName.compareToIgnoreCase(current.songName) < 0) {
                    current = current.left;

                    if (current == null) {
                        parent.left = obj;
                    }

                    return;
                } else if (obj.songName.compareToIgnoreCase(current.songName) > 0) {
                    current = current.right;

                    if (current == null) {
                        parent.right = obj;
                    }

                    return;
                } else {
                    current.setArtistAverage(obj);
					return;
                }
            }
        }
    }

    public void inOrder(Song root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        BST.add(root);

    }
    public Song subSet(String start, String end) {
        return subSet(root, start, end);
    }


}