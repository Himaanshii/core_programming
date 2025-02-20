import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns ");
        int column = sc.nextInt();

        System.out.println("Addition of Matrices");
        int[][] addMatrix = addmatrix(row, column);
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Subtraction of Matrices");
        int[][] subMatrix = submatrix(row, column);
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                System.out.print(subMatrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of Matrices");
        int[][] mulMatrix = submatrix(row, column);
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                System.out.print(mulMatrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrices");
        int[][] transMatrix = transposematrix(row, column);
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                System.out.print(transMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    // creating random matrix
    public static int[][] randomMatrix(int row , int column){
        Random random = new Random();
        int[][] matrix = new int[row][column];
        for(int i =0; i<row; i++){
            for(int j =0; j<column; j++){
                matrix[i][j] = random.nextInt(10); // take random numbers from 0 to 9 
            }
        }
        return matrix;
    }

    // addition of two matrix
    public static int[][] addmatrix(int row, int column){
        
        int[][] matrix1 = randomMatrix(row, column);
        int[][] matrix2 = randomMatrix(row, column);
        int[][] resultMatrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // subtraction of two matrix
    public static int[][] submatrix(int row, int column){
       
        int[][] matrix1 = randomMatrix(row, column);
        int[][] matrix2 = randomMatrix(row, column);
        int[][] resultMatrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // transpose of two matrix
    public static int[][] transposematrix(int row, int column){
        
        int[][] matrix1 = randomMatrix(row, column);
        int[][] resultMatrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j =0; j<column; j++){
                resultMatrix[i][j] = matrix1[j][i];
            }
        }
        return resultMatrix;
    }

}