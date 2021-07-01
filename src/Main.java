public class Main {

    public static void main(String[] args) {

        
        StringBuilder strB = new StringBuilder("_On__my___home_world");

        int count = 0;
        while (count < strB.length()){
            if (Character.toString(strB.charAt(count)).equals("_") ){  // если встретился пробел
                if (count == strB.length()-1){ // один с конца
                    strB.deleteCharAt(count);
                    count--;
                }
                else if (Character.toString(strB.charAt(count+1)).equals("_")){ // два подряд
                    strB.deleteCharAt(count);
                    count--;
                }
                else if (count == 0){ // один с начала
                    strB.deleteCharAt(count);
                    count--;
                }
            }
            count++;
        }

        System.out.println(strB);
    }
}


/*

 */