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

    // actual method to store songs into the Binary Search Tree
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

    public void inOrder() {
        inOrder(root);
    }
    
    public void inOrder(Song root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        BinarySearchTree.add(root);

    }

    // subset methods provided by the professor
    public Song subSet(String first, String next) {
        return subSet(root, first, next);
    }

    public Song subSet(Song root, String first, String next) {
        if (root == null) {
            return root;
        }
        
        if (first.compareToIgnoreCase(root.songName) < 0) {
            subSet(root.left, first, next);
        }

        if (next.compareToIgnoreCase(root.songName) > 0) {
            subSet(root.right, first, next);
        }

        return root;
    }
}