import java.util.Scanner;

public class Matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row x Column :");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        trasnpose tr = new trasnpose();
        tr.Transpose(matrix, row, column);


    }
}
