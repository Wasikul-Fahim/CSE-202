public class trasnpose
{
    public void Transpose (int n[][], int row, int column)
    {
        System.out.println("Matrix Transpose :");
        for (int i = 0; i < column; i++)
        {
            for (int j = 0; j < row; j++)
            {
                System.out.print(n[j][i] + " ");
            }
            System.out.println();
        }
    }

}
