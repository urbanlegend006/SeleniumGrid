interface Reloadable{
    public void reload();
}
class Edit{
    public void edit(){
        System.out.println("Doing edit here");
    }
}

interface Displayable extends Reloadable{
    public void display();
}

public class Sprite{
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int y[] =x;
        System.out.println(y[2]);


    }


}