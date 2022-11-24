import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class introOfGenericTree {
    public static class Node{

        int data;
        ArrayList<Node> children=new ArrayList<>();

        Node(int data){
            this.data=data;
        }

    }
    public static void levelOrder(Node root){

        // we make the queue
        Queue<Node> queue=new ArrayDeque<>();
        Queue<Node> cqueue=new ArrayDeque<>();  // jr line wise kraych asel tr extra child queue chi need ahe so.
        cqueue.add(root);

        // jb tk queue is > 0 tb tk kam hota rhega
        while(queue.size()>0){
            // remove ,print,add children
            Node temp=queue.remove();
            System.out.print(temp.data+" ");
            for (Node child: temp.children){
                queue.add(child);
            }
            // we print the line wise these children then
            if(queue.size()==0){
                queue=cqueue;
                cqueue=new ArrayDeque<>();
                System.out.println(".");
            }

        }


    }

    public static void main(String[] args) {
        Node root=new Node(10);

        Node twenty=new Node(20);
        root.children.add(twenty);

        Node thirty=new Node(30);
        root.children.add(thirty);

        Node forty=new Node(40);
        thirty.children.add(forty);

        levelOrder(root);

    }
}
