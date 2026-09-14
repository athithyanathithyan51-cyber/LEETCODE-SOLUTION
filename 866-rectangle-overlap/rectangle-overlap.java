class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int X1 = rec2[0];
        int y1 = rec1[1];
        int Y1 = rec2[1];
        int x2 = rec1[2];
        int X2 = rec2[2];
        int y2 = rec1[3];
        int Y2 = rec2[3];
        return x1<X2 && X1<x2 && y1<Y2 && Y1<y2;
    }
}