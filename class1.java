class class1 {
    // Meeting of 2 people with different starting points
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int s1 = 2;
        int s2 = 5;

        if(willMeet(x, y, s1, s2))  System.out.println("Will Meet");
        else System.out.println("Will not meet");

        if(bruteForce(x, y, s1, s2))    System.out.println("YES");
        else    System.out.println("NO");
    }
    
    //  Brute Force Approach O(max(x,y))
    public static boolean bruteForce(int x, int y, int s1, int s2) {
        if(x > y && s1 > s2 || x < y && s1 < s2)    return false;

        while(Math.abs(x-y) >= 0) {
            if(x == y)  return true;
            x += s1;
            y += s2;
        }
        return false;
    }

    // x and y are starting points and s1 and s2 are starting speeds.
    //Optimized Approach
    public static boolean willMeet(int x, int y, int s1, int s2) {
        int netSpeed = Math.abs(s1-s2);
        int netDistance = Math.abs(x-y);

        if(x > y && s1 > s2 || x < y && s1 < s2)    return false;

        if(netDistance % netSpeed == 0)   return true;
        return false;
    }
}