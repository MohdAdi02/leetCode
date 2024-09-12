import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        int colorToReplace = image[sr][sc];

        // If the new color is the same as the original color, no need to change anything
        if (colorToReplace == newColor) {
            return image;
        }

        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {sr, sc});

        // Directions for moving up, down, left, and right
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            // Change the current pixel to the new color
            image[r][c] = newColor;

            // Explore all 4 directions
            for (int[] direction : directions) {
                int newRow = r + direction[0];
                int newCol = c + direction[1];

                // Check if the neighboring pixel is within bounds and has the same color to replace
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && image[newRow][newCol] == colorToReplace) {
                    queue.offer(new int[] {newRow, newCol});
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {

    }
}
