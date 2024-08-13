import java.lang.*;
class GFG {
    String name = "GeeksForGeeks";
 
    public static void main(String[] args)
    {
        try {
            Class cls = Class.forName("GFG");
            GFG obj = (GFG)cls.newInstance();
            System.out.println(obj.name);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}