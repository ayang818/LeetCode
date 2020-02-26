class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            if (email.length()==0 || email == null) continue;
            String[] tmp = email.split("@");
            if (tmp.length < 2) continue;
            String prefix = tmp[0];
            String suffix = tmp[1];
            StringBuilder sb = new StringBuilder();
            for (char xhar : prefix.toCharArray()) {
                if (xhar == '+') break;
                if (xhar == '.') continue;
                sb.append(xhar);
            }
            set.add(sb.toString() + "@" + suffix);
        }
        return set.size();
    }
}