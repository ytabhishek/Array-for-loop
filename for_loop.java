package Array;
class forloop{

    void age (){

        int[] age = new int[3];
        age[0] = 18;
        age[1] = 20;
        age[2] = 30;

        for(int i=0; i< 3; i++){
            System.out.println(age[i]);
        }

    }

}
public class for_loop {
    public static void main(String[] args) {
        forloop obj = new forloop();
        obj.age();
    }
}
