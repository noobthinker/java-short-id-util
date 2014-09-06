java-short-id-util
==================

短id生成,short id tool. example 45236 to bLC  


java code

public class ShortId {  
  
    private final char[] str = { '0', '1', '2', '3', '4', '5', '6', '7', '8',  
            '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',  
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',  
            'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',  
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',  
            'Z' };  
      
    private final String _str=new String(str);  
  
    int len = str.length;   
  
    public String toStr(long num) {  
        if(num<len){  
            return ""+str[(int)num];  
        }  
        int a = (int)num%len;  
        int b = (int)num/len;  
        char e=str[a];  
        if(b>len){  
            return ""+toStr(b)+e;  
        }else{  
            return ""+str[b]+e;  
        }  
    }  
  
    public long toNum(String s) {  
        int a = s.length()-1;  
        long val=0;  
        for(int i=a;i>=0;i--){  
            char c = s.charAt(i);  
            val += (_str.indexOf(c)*Math.pow(len, a-i));  
        }  
        return val;  
    }  
  
    public static void main(String[] args) {  
        ShortId s64 = new ShortId();  
        long num=45236;  
        String enCode=s64.toStr(num);  
        long deCode = s64.toNum(enCode);  
        System.out.println("短Id是："+enCode);  
        System.out.println("Id是："+deCode);  
    }  
  
            
  
}  
  
输出：  
  
短Id是：bLC  
Id是：45236  
