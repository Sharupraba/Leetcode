// Last updated: 2/13/2026, 9:47:29 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {// sr: starting row, sc: starting column, from the test case the color = 2 ,we have to change all the 1's prsent horizontally and vertically to it to 2's  
        int orgcolor=image[sr][sc];
        if(orgcolor ==color){//if color is same there is nothing to change just directly return the image array
            return image ;}
            else{
                dfs(image,sr,sc,orgcolor,color);//initially starting from starting row and starting coloumn 
                return image ;
            }
    }
            public static void dfs(int[][]image, int row, int col, int orgcolor, int color){
                if (row<0|| row>=image.length|| col<0|| col>=image[0].length)//base case:the row and coloumn should not exceed the length of the original array if it exceeds then the program stops 
                return ;
                if (image[row][col]!=orgcolor)
                return;
                else{//we have to check all four sides to exchange the colour
                    image[row][col]=color;
                    dfs(image,row-1,col,orgcolor,color);//the row above it 
                    dfs(image,row+1,col,orgcolor,color);// row below it
                    dfs(image,row,col-1,orgcolor,color);//coloumn before it 
                    dfs(image,row,col+1,orgcolor,color);// coloumn after it 
                    

                }
            }
        }
    
