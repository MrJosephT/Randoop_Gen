public class testgen {
    java.util.Random rnd = new java.util.Random(1000);
    public  int[] generateArr(int seed){
        int n = rnd.nextInt(50);
        int[] arr=new int [n];
        for(int x=0 ; x<n ; x++){
            arr[x] = rnd.nextInt(20000) - 10000;
        }
        return arr;
    }

    public  int generateInt(int seed){
        int n = rnd.nextInt(20000) - 10000;
        return n;
    }

    public  String generateStr(int seed){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb=new StringBuffer();
        int length = rnd.nextInt(15) + 5;
        for(int i=0;i<length;i++){
            int number=rnd.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public char generateChar(int seed){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        return str.charAt(rnd.nextInt(62));
    }

    public long generateLong(int seed){
        long rt = rnd.nextLong();
        return rt;
    }
}
