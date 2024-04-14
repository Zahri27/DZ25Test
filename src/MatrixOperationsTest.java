import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixOperationsTest {
    @Test
    public void testIsSquareMatrix_NullMatrix() {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] nullMatrix = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            matrixOperations.isSquareMatrix(nullMatrix);
        });
    }

    @Test
    public void testIsSquareMatrix_EmptyMatrix() {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] emptyMatrix = {};
        Assertions.assertFalse(matrixOperations.isSquareMatrix(emptyMatrix));
    }

    @Test
    public void testIsSquareMatrix_SquareMatrix() {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertTrue(matrixOperations.isSquareMatrix(squareMatrix));
    }

    @Test
    public void testIsSquareMatrix_NonSquareMatrix() {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        Assertions.assertFalse(matrixOperations.isSquareMatrix(nonSquareMatrix));
    }

    @Test
    public void testIsSquareMatrix_JaggedMatrix() {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[][] jaggedMatrix = {{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        Assertions.assertFalse(matrixOperations.isSquareMatrix(jaggedMatrix));
    }
}
