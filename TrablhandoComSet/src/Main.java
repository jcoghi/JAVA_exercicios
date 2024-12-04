import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('a');

        System.out.println(conjunto);
        System.out.println(conjunto.size());

        conjunto.remove(1.2);
        System.out.println(conjunto);
        System.out.println(conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        conjunto.addAll(nums);
        nums.clear();
        System.out.println(nums);
        System.out.println(conjunto);

    }
}