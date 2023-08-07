/*Разработать программу, имитирующую поведение коллекции HashSet. 
В программе содать метод add добавляющий элемент, метод toString возвращающий 
строку с элементами множества и метод позволяющий читать элементы по индексу. */





import java.util.HashSet;
import java.util.Set;

public class Programm
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(5);
        
        for(Integer value : set){

            System.out.println(value);


        }
         for(Integer value : set){


            System.out.println(value.toString());

        }

    }
}