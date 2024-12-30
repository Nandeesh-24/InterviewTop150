import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Heights {
    public static boolean isLongPressedName(String name, String typed) {

        Queue<String> name1 = getCharCount(name);
        Queue<String> typed1 = getCharCount(typed);

        System.out.println(name1);
        System.out.println(typed1);

        if(name1.size() != typed1.size())
            return false;

        while (!name1.isEmpty()){
            try{
                if (Integer.parseInt(name1.peek()) > Integer.parseInt(typed1.peek())){
                    return false;
                }
                name1.poll();
                typed1.poll();
            }catch (NumberFormatException e){
                if (!Objects.equals(name1.poll(), typed1.poll())){
                    return false;
                }
            }
        }

        return true;
    }

    public static Queue<String> getCharCount(String name){
        Queue<String> s1 = new LinkedList<>();

        int count = 1;

        for(int i = 1; i < name.length(); i++){
            if(name.charAt(i-1) == name.charAt(i)){
                count++;
            }else{
                s1.add(String.valueOf(name.charAt(i-1)));
                s1.add(String.valueOf(count));
                count = 1;
            }
        }

        s1.add(String.valueOf(name.charAt(name.length()-1)));
        s1.add(String.valueOf(count));
        return s1;
    }



    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex","aaleex"));
    }
}
