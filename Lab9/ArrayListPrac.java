import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Vertex> listA = new ArrayList<Vertex>();
        ArrayList<Vertex> listB = new ArrayList<Vertex>();
        ArrayList<Vertex> listC = new ArrayList<Vertex>();

        for (int i = 0; i < 1000; i++) {
            Vertex v1 = new Vertex(random.nextInt(100), random.nextInt(100));
            Vertex v2 = new Vertex(random.nextInt(100), random.nextInt(100));
            Vertex v3 = new Vertex(random.nextInt(100), random.nextInt(100));
            if (random.nextBoolean()) {
                if (random.nextBoolean()) {
                    v1.x = v2.x;
                    v1.y = v2.y;
                } else {
                    v1.x = v3.x;
                    v1.y = v3.y;
                }
            }
            listA.add(v1);
            listB.add(v2);
            listC.add(v3);

        }

        int countRightAngle = 0;
        for (int i = 0; i < listA.size(); i++) {
            Vertex v1 = listA.get(i);
            Vertex v2 = listB.get(i);
            Vertex v3 = listC.get(i);
            double a = length(v1, v2);
            double b = length(v1, v3);
            double c = length(v2, v3);

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                countRightAngle++;
            }
        }
        System.out.println(listA.size() + " triangles are generated");
        System.out.println(countRightAngle + " are right triangles");
        //Law of Complement
        System.out.println(listA.size() - countRightAngle + " are not right triangles");
    }
    public static double length (Vertex a, Vertex b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

class Vertex{
    int x;
    int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
   //didn't override since it didn't need to be used to update count
}

/*
Sample Run:
1000 triangles are generated
515 are right triangles
485 are not right triangles
*/
