/** Creative Exercise 1b: DrawTriangle */
public class DrawingTriangles {
    public static void drawTriangle(int N) {
        // Draw Triangles
        for (int m = 1; m <= N; m++) {
            for (int n = 1; n <=m; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the function
        drawTriangle(6);
    }
}
