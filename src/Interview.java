public class Interview {
        public static void main(String[] args){
            String c1 = "Pathumi";
            String c2 = "anne";

            System.out.println(isUnique(c1) ? "Unique" : "Not Unique");
            System.out.println(isUnique(c2) ? "Unique" : "Not Unique");

        }

        public static boolean isUnique(String c){
            int length = c.length();

            for(int i = 0; i < length - 1; i++){
                for (int j = i + 1; j < length; j++){
                    if(c.charAt(i) == c.charAt(j)){
                        return false;
                    }
                }
            }
            return true;
        }
}
