public class AddBinary {

        public String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0 || carry != 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i) - '0';
                    i--;
                }
                if (j >= 0) {
                    sum += b.charAt(j) - '0';
                    j--;
                }

                carry = sum / 2;
                result.append(sum % 2);
            }

            return result.reverse().toString();
        }

        public static void main(String[] args) {
            AddBinary addB = new AddBinary();
            String a = "1010";
            String b = "1011";
            System.out.println(addB.addBinary(a, b));
        }


}
