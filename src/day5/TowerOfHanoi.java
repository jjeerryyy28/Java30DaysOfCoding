package day5;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int nDisk = 6;
        towerOfHanoi(nDisk, 'A', 'B', 'C');
    }
    public static void towerOfHanoi(int n, char fromPeg, char auxPeg, char toPeg){
        if(n==1){
            System.out.println("Move disk "+n+" from "+fromPeg+" to "+toPeg);
            return;
        }
        towerOfHanoi(n-1, fromPeg, toPeg, auxPeg);
        System.out.println("Move disk "+n+" from "+fromPeg+" to "+toPeg);
        towerOfHanoi(n-1, auxPeg, fromPeg, toPeg);
    }
}
