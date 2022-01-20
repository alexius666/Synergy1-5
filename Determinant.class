package com.company;

public class Determinant {
    private int summ;

    public Determinant(int[][] matrix) {
        getReduction(matrix, 1);
    }


    public void getValue() {
        System.out.println("Определитель для данной матрицы: "+this.summ);
        System.out.println("");
    }

    private void getReduction(int [][] subMinor, int elemParentMinor) {
        if (subMinor.length > 1){
            int [][] tmpMinor = new int[subMinor.length - 1][subMinor[0].length - 1];
            for (int c = 0; c < subMinor[0].length; c++) {
                for (int i = 1; i < subMinor.length; i++) {
                    for (int j = 0; j < subMinor[0].length; j++) {
                        if (j < c)
                            tmpMinor[i - 1][j] = subMinor[i][j];
                        else if (j > c)
                            tmpMinor[i - 1][j - 1] = subMinor[i][j];
                    }
                }
                int paramForSub = (int)Math.pow(-1,c+2)*subMinor[0][c]*elemParentMinor;
                getReduction(tmpMinor, paramForSub);
            }
        }
        else
            this.summ += elemParentMinor * subMinor[0][0];
    }
}
