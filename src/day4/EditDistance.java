package day4;

public class EditDistance {
    public int minDistance(String word1, String word2){
        int m = word1.length();
        int n = word2.length();

        int costOfDist[][] = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            costOfDist[i][0]=i;
        }
        for(int i=0;i<=n;i++){
            costOfDist[0][i]=i;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word1.charAt(i)==word2.charAt(j))
                    costOfDist[i+1][j+1] = costOfDist[i][j];

                else{
                    int a = costOfDist[i][j];
                    int b = costOfDist[i][j+1];
                    int c = costOfDist[i+1][j];
                    costOfDist[i+1][j+1] = a < b ? (a < c ? a: c) : (b < c ? b : c);
                    costOfDist[i+1][j+1]++;
                }
            }
        }
        return costOfDist[m][n];
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        EditDistance ed = new EditDistance();
        System.out.println(ed.minDistance(word1, word2));
    }
}
