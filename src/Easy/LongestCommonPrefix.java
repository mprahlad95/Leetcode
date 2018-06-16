package Easy;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String temp = "";
        char ch;
        int flag = 0;
        for (int outerarray = 0; outerarray < strs.length; outerarray++) {
                ch = strs[0].charAt(outerarray);
                for (int traverse = 0; traverse < strs.length; traverse++) {
                    if (strs[traverse].charAt(outerarray) != ch) {
                        flag = 1;
                        break;
                    }
            }
            if (flag == 0 ) temp += ch;
        }
        return temp;
    }
}
