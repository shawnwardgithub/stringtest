import java.util.HashMap;
import java.util.Map;


public class StringUtils {
    
	
	public static int StringFind(String goal){
	
		Map<Character, Integer> chars=new HashMap<>();
		int result=0;
		int b=0;
		for(int i=0;i<goal.length();i++){
		    char ch= goal.charAt(i);
			if(chars.containsKey(ch)){
				b=Math.max(chars.get(goal.charAt(i))+1,b);
				//System.out.println(result);
				if((i-b+1)>result){
					result=i-b+1;
				}	
			}else{
				if((i-b+1)>result){
					result=i-b+1;
				}
			}
			
			chars.put(ch, i);
		}
		return result;
	}
 
	
}
