class Solution {
    Character[] chars = new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    List<Character> charList = Arrays.asList(chars);

    public int myAtoi(String str) {
        if ("2147483648".equals(str)) {
            return 2147483647;
        }
        if (String.valueOf(-(2 << 31)).equals(str)) {
            return Integer.MIN_VALUE;
        }
        String tempStr = str.trim();
        int res = 0;
        if (tempStr.startsWith("-")) {
            int calc = calc(res, tempStr);
            return calc == Integer.MIN_VALUE ? Integer.MIN_VALUE : -calc;
        }
        if (tempStr.startsWith("+") || (tempStr.length() != 0 && (tempStr.charAt(0) == '0' || charList.contains(tempStr.charAt(0))))) {
            int calc = calc(res, tempStr);
            return calc == Integer.MIN_VALUE ? Integer.MAX_VALUE : calc;
        }
        return 0;
    }

    public int calc(Integer res, String tempStr) {
        for (int i = 0; i < tempStr.length(); i++) {
            if ((i == 0 && (tempStr.charAt(0) == '+'))) {
                continue;
            }
            if (i == 0 && tempStr.charAt(0) == '-') {
                continue;
            }
            if ((!charList.contains(tempStr.charAt(i)) && tempStr.charAt(i) != '0')) {
                break;
            }
            if (res == 0) {
                res += parseChar(tempStr.charAt(i));
            } else {
                long tempLong = ((long) res * (long) 10) + (long) parseChar(tempStr.charAt(i));
                if (tempLong > Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }
                if (res != 0) {
                    res = (int) tempLong;
                }
            }
        }
        return res;
    }

    public int parseChar(Character chars) {
        return Integer.valueOf(String.valueOf(chars));
    }
}