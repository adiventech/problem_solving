// Write a function to find the longest common prefix string amongst an array of strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
//
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class LongestCommonPrefix
{
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 1)
    {
      return strs[0];
    }
    else{
    String prefix = "";
    List<String> al = new ArrayList<String>();
    al = Arrays.asList(strs);;
    Collections.sort(al);
    String[] str = new String[al.size()];
    str = al.toArray(str);
    int i=0;
    int j=1;
      while(j< str.length && i< str[0].length()){
        if (str[0].substring(i,i+1).equals(str[j].substring(i,i+1))){
          j++;
          if (j == str.length)
          { prefix = str[0].substring(0,i+1);
            j=1;
            i++;
          }
        }
        else {
          break;
        }
      }
    return prefix;
  }
}

  public static void main(String... s)
  {
    String[] strs = {"a"};
    LongestCommonPrefix lcp = new LongestCommonPrefix();
    String prefix= lcp.longestCommonPrefix(strs);
    System.out.println("Prefix:"+prefix);

  }

}
