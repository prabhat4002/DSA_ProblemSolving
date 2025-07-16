class Solution {
    public int numIslands(char[][] grid) {
    int row=grid.length;
    int col=grid[0].length;
    int numOfIsland=0;

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]=='1'){
                islandHelper(i,j,row,col,grid);
                numOfIsland++;
            }
        }
    }
    return numOfIsland;
    }
    public void islandHelper(int x, int y, int row, int col, char[][]grid){
                    if(x<0 || x>=row || y<0 || y>=col || grid[x][y]!='1'){
                        return;
                    }
                    grid[x][y]='0';
                    islandHelper(x+1,y,row,col,grid);
                    islandHelper(x-1,y,row,col,grid);
                    islandHelper(x,y+1,row,col,grid);
                    islandHelper(x,y-1,row,col,grid);
                }

}