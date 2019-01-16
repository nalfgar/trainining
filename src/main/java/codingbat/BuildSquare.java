package codingbat;

class BuildSquare {
    static String buildSquare(int n) {
        StringBuilder result = new StringBuilder();
        if (n == 0) {
            return "";
        } else if (n == 1){
            return "+";
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append("+");
            }
            result.append("\n");
        }
        return result.substring(0, result.length()-1);
    }
}
