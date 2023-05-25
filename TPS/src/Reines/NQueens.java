/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reines;

/**
 *
 * @author ABDELLAH DIDI
 */
public class NQueens {

    private int[] queens; // tableau qui stocke la position de chaque reine
    private int n; // taille de l'échiquier

    public NQueens(int n) {
        this.n = n;
        this.queens = new int[n];
    }

    public void solve() {
        placeQueen(0); // commencer avec la première reine
    }

    private boolean placeQueen(int row) {
        if (row == n) { // toutes les reines sont placées
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isValidPosition(row, col)) {
                queens[row] = col; // placer la reine dans cette colonne
                if (placeQueen(row + 1)) {
                    return true;
                }
            }
        }
        return false; // aucune position valide trouvée
    }

    private boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            // vérifier les diagonales et les colonnes
            if (queens[i] == col || queens[i] - i == col - row || queens[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    public void printSolution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

 
}
   

